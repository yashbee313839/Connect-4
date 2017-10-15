import java.util.*;
class prj
{
  double  tim=0.0d;
   String n1="",n2="";
   int mch=0;
   Scanner obj= new Scanner(System.in);
  void game()
   {
   
  
do{
try{
   Scanner obj= new Scanner(System.in);
   System.out.println("                 WELCOME TO CONNECT 4");
   System.out.println("           Your Aim Is To ConnectFour Of Your");
   System.out.println("Pieces Together Either vertically or horizontally Or Diagnally");
   System.out.println("---------------------------");
   System.out.println("|  A |  B |  C |  D  |  E |");
   System.out.println("---------------------------");
   System.out.println("|  F |  G |  H |  I  |  J |");
   System.out.println("---------------------------");
   System.out.println("|  K |  L |  M |  N  |  O |");
   System.out.println("---------------------------");
   System.out.println("|  P |  Q |  R |  S  |  T |");
   System.out.println("---------------------------");
   System.out.println("SELECT YOUR CHOICE");
   System.out.println("1- Single Player");
   System.out.println("2- MultiPlayer");
   System.out.println("Enter Your Choice");
   mch=obj.nextInt();
   
   if(mch==2)
   { 
      System.out.println("PLayer 1 Gets #'s and Player 2 gets 0's ");
     System.out.println("PLAYER 1 ENTER YOUR NAME");
     n1=obj.next();
     System.out.println("PLAYER 2 ENTER YOUR NAME");
     n2=obj.next();
     System.out.println("PLEASE MAKE SURE CAPS LOCK IS ON BEFORE YOU START THE GAME");
    }  
    switch(mch)
    {
        case 1: single();break;
        case 2:multi(); break;
        case 3 : break;
    }
}catch(Exception e)
{
System.out.println("INVALID ENTRY");
}
}while(mch!=3);
}//method


void single()
{
   char a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,ch;
  ch=a=b=c=d=e=f=g=h=i=j=k=l=m=n=o=p=q=r=s=t=' ';  
   int flag,chekd,in,sinfl;
   flag=0;chekd=0;in=2;
    Scanner obj= new Scanner(System.in);
    if(mch==1)
    {
       System.out.println("WELCOME TO SINGLE PLAYER");
       System.out.println("ENTER YOUR NAME");
       n1=obj.next();
       System.out.println("PLEASE MAKE SURE CAPS LOCK IS ON BEFORE YOU START THE GAME");
       for(tim=0.0d;tim<100000.0d;)
      {tim+=0.1d;}
       long ran=0;
       double oran=0.0d,go=0.0d;
        do{
        System.out.println("---------------------------");
        System.out.println("|  A |  B |  C |  D  |  E |");
        System.out.println("---------------------------");
        System.out.println("|  F |  G |  H |  I  |  J |");
        System.out.println("---------------------------");
        System.out.println("|  K |  L |  M |  N  |  O |");
        System.out.println("---------------------------");
        System.out.println("|  P |  Q |  R |  S  |  T |");
      System.out.println("---------------------------");
        if(in%2==0)
         {
            System.out.println("ENTER YOUR ALPHABET CHOICE FROM THE GRID");
             {
              String u=obj.next();
              String c25=u.toUpperCase();
              ch=c25.charAt(0);
               }
        }
            if(ch>='A'&&ch<='T')
               chekd=1;
            else 
            {
               System.out.println("INVALID");
               chekd=0;
               if(chekd-3==0)
                   chekd=0;
            }
            if(chekd==1)
             {
                if(in%2==0)
                 {
                     while(true)
                     {
                     sinfl=0;
                     switch(ch)
                {
                    case 'A':if(a==' '){a='#';
                        sinfl=1;}break;
                    case 'B':if(b==' '){b='#';
                        sinfl=1;}break;
                    case 'C':if(c==' '){c='#';
                          sinfl=1;}break;
                    case 'D':if(d==' '){d='#';
                         sinfl=1;}break;
                    case 'E':if(e==' '){e='#';
                         sinfl=1;}break;
                    case 'F':if(f==' '){f='#';
                         sinfl=1;}break;
                    case 'G':if(g==' '){g='#'; 
                         sinfl=1;}break;
                    case 'H':if(h==' '){h='#';
                         sinfl=1;}break;
                    case 'I':if(i==' '){i='#';
                        sinfl=1;}break;
                    case 'J':if(j==' '){j='#';
                        sinfl=1;}break;
                    case 'K':if(k==' '){k='#';
                        sinfl=1;}break;
                    case 'L':if(l==' '){l='#';
                        sinfl=1;}break;
                    case 'M':if(m==' '){m='#';
                        sinfl=1;}break;
                    case 'N':if(n==' '){n='#';
                        sinfl=1;}break;
                    case 'O':if(o==' '){o='#';
                        sinfl=1;}break;
                    case 'P':if(p==' '){p='#';
                        sinfl=1;}break;
                    case 'Q':if(q==' '){q='#';
                        sinfl=1;}break;
                    case 'R':if(r==' '){r='#';
                        sinfl=1;}break;
                    case 'S':if(s==' '){s='#';
                        sinfl=1;}break;
                    case 'T':if(t==' '){t='#';
                        sinfl=1;}break;
                }//switch
                if(sinfl==1)
                   break;
            }
            }
                else 
                {
                    sinfl=0;
                   while(true)
                   {
                       System.out.println("hello");
                    oran=Math.random();
                    go=oran*100;
                    ran=(int)go;
                   System.out.println("ran="+ran);
                    if(ran<=10)
                    {
                         if(a==' ')
                          {a='0';
                          sinfl=1;
                        }
                    }
                        
                    else if(ran<=30&&ran>10)
                          {
                              if(b==' ')
                          {      b='0';
                          sinfl=1;}
                        }
                    else if(ran<=40&&ran>30)
                             {
                          if(c==' ')
                            { c='0';
                          sinfl=1;}}
                    else if(ran<=50&&ran>40)
                    {
                             if(d==' ')
                               { d='0';
                             sinfl=1;}
                            }
                    else if(ran<=60&&ran>50)
                    {
                             if(e==' ')
                                { e='0';
                          sinfl=1;}
                        }
                    else if(ran<=70&&ran>60)
                    {
                             if(f==' ')
                                  {f='0';
                          sinfl=1;}
                        }
                    else if(ran<=90&&ran>70)
                    {
                             if(g==' ')
                               { g='0';
                          sinfl=1;}
                        }
                    else if(ran<=100&&ran>90)
                    {
                            if(h==' ')
                                  {h='0';
                          sinfl=1; }
                        }
                    else if(ran<=110&&ran>100)
                    {
                            if(i==' ')
                                 {i='0';
                          sinfl=1;}
                        }
                    else if(ran<=120&&ran>110)
                    {
                             if(j==' ')
                              { j='0';
                         sinfl=1;}
                        }
                    else if(ran<=130&&ran>120)
                    {
                             if(k==' ')
                               { k='0';
                         sinfl=1;}
                        }
                    else if(ran<=140&&ran>130)
                    {
                             if(l==' ')
                              { l='0';
                          sinfl=1;}
                        }
                    else if(ran<=160&&ran>140)
                    {
                             if(m==' ')
                               { m='0';
                          sinfl=1;} 
                        }
                    else if(ran<=170&&ran>160)
                    {
                             if(n==' ')
                              {  n='0';
                          sinfl=1;}
                        }
                    else if(ran<=180&&ran>170)
                    {
                             if(o==' ')
                                   {  o='0';
                         sinfl=1;}
                        }
                    else if(ran<=190&&ran>180)
                    {
                             if(p==' ')
                               { p='0';
                         sinfl=1;}
                        }
                    else if(ran<=194&&ran>190)
                    {
                             if(q==' ')
                                 {q='0';
                          sinfl=1;}
                        }
                    else if(ran<=196&&ran>194)
                    {
                             if(r==' ')
                              { r='0';
                          sinfl=1;}}
                    else if(ran<=198&&ran>196)
                    {
                            if(s==' ')
                           {   s='0';
                          sinfl=1;}
                        }
                    else
                    {   if(t==' ')
                         {
                          t='0';
                          sinfl=1;
                        }
                }
                if(sinfl==1)
                   break;
                        }
                        }//else part finished
   System.out.println("----------------------------");
   System.out.println("|  "+a+" |  "+b+" |  "+c+" |  "+d+"  | "+e+"  |");
   System.out.println("----------------------------");
   System.out.println("|  "+f+" |  "+g+" |  "+h+" |  "+i+"  | "+j+"  |");
   System.out.println("----------------------------");
   System.out.println("|  "+k+" |  "+l+" |  "+m+" |  "+n+"  | "+o+"  |");
   System.out.println("----------------------------");
   System.out.println("|  "+p+" |  "+q+" |  "+r+" |  "+s+"  | "+t+"  |");
   System.out.println("----------------------------");
   {
       if( (a=='#'&&b=='#'&&c=='#'&&d=='#')||(a=='0'&&b=='0'&&c=='0'&&d=='0'))
              flag=1;
       else if( (b=='#'&&c=='#'&&d=='#'&&e=='#')||(b=='0'&&c=='0'&&d=='0'&&e=='0'))
              flag=1;
       else if( (f=='#'&&g=='#'&&h=='#'&&i=='#')||(f=='0'&&g=='0'&&h=='0'&&i=='0'))
              flag=1;
       else if( (j=='#'&&g=='#'&&h=='#'&&i=='#')||(j=='0'&&g=='0'&&h=='0'&&i=='0'))
              flag=1;
       else if( (k=='#'&&l=='#'&&m=='#'&&n=='#')||(k=='0'&&l=='0'&&m=='0'&&n=='0'))
              flag=1;
       else if( (o=='#'&&l=='#'&&m=='#'&&n=='#')||(o=='0'&&l=='0'&&m=='0'&&n=='0'))
              flag=1;
       else if( (p=='#'&&q=='#'&&r=='#'&&s=='#')||(p=='0'&&q=='0'&&r=='0'&&s=='0'))
              flag=1; 
       else if( (t=='#'&&q=='#'&&r=='#'&&s=='#')||(t=='0'&&q=='0'&&r=='0'&&s=='0'))
              flag=1;
       else if( (a=='#'&&f=='#'&&k=='#'&&p=='#')||(p=='0'&&a=='0'&&f=='0'&&k=='0'))
              flag=1;
       else if( (b=='#'&&q=='#'&&g=='#'&&l=='#')||(b=='0'&&q=='0'&&g=='0'&&l=='0'))
              flag=1;
       else if( (c=='#'&&h=='#'&&r=='#'&&m=='#')||(c=='0'&&h=='0'&&m=='0'&&r=='0'))
              flag=1; 
       else if( (d=='#'&&i=='#'&&n=='#'&&s=='#')||(d=='0'&&i=='0'&&n=='0'&&s=='0'))
              flag=1;
       else if( (j=='#'&&o=='#'&&t=='#'&&e=='#')||(j=='0'&&o=='0'&&t=='0'&&e=='0'))
              flag=1;
       else if( (a=='#'&&g=='#'&&m=='#'&&s=='#')||(g=='0'&&a=='0'&&m=='0'&&s=='0'))
              flag=1;
       else if( (b=='#'&&h=='#'&&n=='#'&&t=='#')||(b=='0'&&h=='0'&&n=='0'&&t=='0'))
              flag=1;
       else if( (d=='#'&&h=='#'&&p=='#'&&l=='#')||(d=='0'&&h=='0'&&p=='0'&&l=='0'))
              flag=1;
       else if( (e=='#'&&i=='#'&&m=='#'&&q=='#')||(e=='0'&&i=='0'&&m=='0'&&q=='0'))
              flag=1;       
       }
    if(flag==1)
           {
              if(in%2==0)
                    System.out.println("CONGRATULATION ! "+n1+" WINS ");
              else
                    System.out.println("THE COMPUTER WINS ,BETTER LUCK NEXT TIME");
    }
}//EARLIER IF CONDITION CLOSED
in++;
}while(flag!=1);     
}
}

void multi()
{
  char a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,ch;
  ch=a=b=c=d=e=f=g=h=i=j=k=l=m=n=o=p=q=r=s=t=' ';  
   int flag,chekd,in,sinfl;
   flag=0;chekd=0;in=2;
     do{
         if(in%2==0)
            System.out.println("IT IS "+n1+"'S TURN NOW!!!!");
         else
            System.out.println("IT IS "+n2+"'S TURN NOW!!!!");
          Scanner obj= new Scanner(System.in);
   System.out.println("---------------------------");
   System.out.println("|  A |  B |  C |  D  |  E |");
   System.out.println("---------------------------");
   System.out.println("|  F |  G |  H |  I  |  J |");
   System.out.println("---------------------------");
   System.out.println("|  K |  L |  M |  N  |  O |");
   System.out.println("---------------------------");
   System.out.println("|  P |  Q |  R |  S  |  T |");
   System.out.println("---------------------------");
       System.out.println("ENTER YOUR ALPHABET CHOICE FROM THE GRID");
       {
           String u=obj.next();
           String c25=u.toUpperCase();
           ch=c25.charAt(0);
        }
       if(ch>='A'&&ch<='T')
          chekd=1;
        else 
        {
            System.out.println("INVALID");
            chekd=0;
        }
        if(chekd==1)
        {
            if(in%2==0)
            {
                 while(true)
                     {
                         
                  sinfl=655898;   sinfl=0;
                     switch(ch)
                {
                    case 'A':if(a==' '){a='#';
                        sinfl=1;}break;
                    case 'B':if(b==' '){b='#';
                        sinfl=1;}break;
                    case 'C':if(c==' '){c='#';
                          sinfl=1;}break;
                    case 'D':if(d==' '){d='#';
                         sinfl=1;}break;
                    case 'E':if(e==' '){e='#';
                         sinfl=1;}break;
                    case 'F':if(f==' '){f='#';
                         sinfl=1;}break;
                    case 'G':if(g==' '){g='#'; 
                         sinfl=1;}break;
                    case 'H':if(h==' '){h='#';
                         sinfl=1;}break;
                    case 'I':if(i==' '){i='#';
                        sinfl=1;}break;
                    case 'J':if(j==' '){j='#';
                        sinfl=1;}break;
                    case 'K':if(k==' '){k='#';
                        sinfl=1;}break;
                    case 'L':if(l==' '){l='#';
                        sinfl=1;}break;
                    case 'M':if(m==' '){m='#';
                        sinfl=1;}break;
                    case 'N':if(n==' '){n='#';
                        sinfl=1;}break;
                    case 'O':if(o==' '){o='#';
                        sinfl=1;}break;
                    case 'P':if(p==' '){p='#';
                        sinfl=1;}break;
                    case 'Q':if(q==' '){q='#';
                        sinfl=1;}break;
                    case 'R':if(r==' '){r='#';
                        sinfl=1;}break;
                    case 'S':if(s==' '){s='#';
                        sinfl=1;}break;
                    case 'T':if(t==' '){t='#';
                        sinfl=1;}break;
                }//switch
                if(sinfl==1)
                   break;
               else
                 System.out.println("ENTER YOUR ALPHABET CHOICE FROM THE GRID");
       {
           String u=obj.next();
           String c25=u.toUpperCase();
           ch=c25.charAt(0);
        }
            }
            }//if statement
            else 
            {
                 while(true)
                     {
                     sinfl=0;
                     switch(ch)
                {
                    case 'A':if(a==' '){a='0';
                        sinfl=1;}break;
                    case 'B':if(b==' '){b='0';
                        sinfl=1;}break;
                    case 'C':if(c==' '){c='0';
                          sinfl=1;}break;
                    case 'D':if(d==' '){d='0';
                         sinfl=1;}break;
                    case 'E':if(e==' '){e='0';
                         sinfl=1;}break;
                    case 'F':if(f==' '){f='0';
                         sinfl=1;}break;
                    case 'G':if(g==' '){g='0'; 
                         sinfl=1;}break;
                    case 'H':if(h==' '){h='0';
                         sinfl=1;}break;
                    case 'I':if(i==' '){i='0';
                        sinfl=1;}break;
                    case 'J':if(j==' '){j='0';
                        sinfl=1;}break;
                    case 'K':if(k==' '){k='0';
                        sinfl=1;}break;
                    case 'L':if(l==' '){l='0';
                        sinfl=1;}break;
                    case 'M':if(m==' '){m='0';
                        sinfl=1;}break;
                    case 'N':if(n==' '){n='0';
                        sinfl=1;}break;
                    case 'O':if(o==' '){o='0';
                        sinfl=1;}break;
                    case 'P':if(p==' '){p='0';
                        sinfl=1;}break;
                    case 'Q':if(q==' '){q='0';
                        sinfl=1;}break;
                    case 'R':if(r==' '){r='0';
                        sinfl=1;}break;
                    case 'S':if(s==' '){s='0';
                        sinfl=1;}break;
                    case 'T':if(t==' '){t='0';
                        sinfl=1;}break;
                }//switcH
                if(sinfl==1)
                   break;
                else
                 System.out.println("ENTER YOUR ALPHABET CHOICE FROM THE GRID");
       {
           String u=obj.next();
           String c25=u.toUpperCase();
           ch=c25.charAt(0);
        }
            }
                  }
                } //else block ended
   System.out.println("----------------------------");
   System.out.println("|  "+a+" |  "+b+" |  "+c+" |  "+d+"  | "+e+"  |");
   System.out.println("----------------------------");
   System.out.println("|  "+f+" |  "+g+" |  "+h+" |  "+i+"  | "+j+"  |");
   System.out.println("----------------------------");
   System.out.println("|  "+k+" |  "+l+" |  "+m+" |  "+n+"  | "+o+"  |");
   System.out.println("----------------------------");
   System.out.println("|  "+p+" |  "+q+" |  "+r+" |  "+s+"  | "+t+"  |");
   System.out.println("----------------------------");
   if( (a=='#'&&b=='#'&&c=='#'&&d=='#')||(a=='0'&&b=='0'&&c=='0'&&d=='0'))
              flag=1;
       else if( (b=='#'&&c=='#'&&d=='#'&&e=='#')||(b=='0'&&c=='0'&&d=='0'&&e=='0'))
              flag=1;
       else if( (f=='#'&&g=='#'&&h=='#'&&i=='#')||(f=='0'&&g=='0'&&h=='0'&&i=='0'))
              flag=1;
       else if( (j=='#'&&g=='#'&&h=='#'&&i=='#')||(j=='0'&&g=='0'&&h=='0'&&i=='0'))
              flag=1;
       else if( (k=='#'&&l=='#'&&m=='#'&&n=='#')||(k=='0'&&l=='0'&&m=='0'&&n=='0'))
              flag=1;
       else if( (o=='#'&&l=='#'&&m=='#'&&n=='#')||(o=='0'&&l=='0'&&m=='0'&&n=='0'))
              flag=1;
       else if( (p=='#'&&q=='#'&&r=='#'&&s=='#')||(p=='0'&&q=='0'&&r=='0'&&s=='0'))
              flag=1; 
       else if( (t=='#'&&q=='#'&&r=='#'&&s=='#')||(t=='0'&&q=='0'&&r=='0'&&s=='0'))
              flag=1;
       else if( (a=='#'&&f=='#'&&k=='#'&&p=='#')||(p=='0'&&a=='0'&&f=='0'&&k=='0'))
              flag=1;
       else if( (b=='#'&&q=='#'&&g=='#'&&l=='#')||(b=='0'&&q=='0'&&g=='0'&&l=='0'))
              flag=1;
       else if( (c=='#'&&h=='#'&&r=='#'&&m=='#')||(c=='0'&&h=='0'&&m=='0'&&r=='0'))
              flag=1; 
       else if( (d=='#'&&i=='#'&&n=='#'&&s=='#')||(d=='0'&&i=='0'&&n=='0'&&s=='0'))
              flag=1;
       else if( (j=='#'&&o=='#'&&t=='#'&&e=='#')||(j=='0'&&o=='0'&&t=='0'&&e=='0'))
              flag=1;
       else if( (a=='#'&&g=='#'&&m=='#'&&s=='#')||(g=='0'&&a=='0'&&m=='0'&&s=='0'))
              flag=1;
       else if( (b=='#'&&h=='#'&&n=='#'&&t=='#')||(b=='0'&&h=='0'&&n=='0'&&t=='0'))
              flag=1;
       else if( (d=='#'&&h=='#'&&p=='#'&&l=='#')||(d=='0'&&h=='0'&&p=='0'&&l=='0'))
              flag=1;
       else if( (e=='#'&&i=='#'&&m=='#'&&q=='#')||(e=='0'&&i=='0'&&m=='0'&&q=='0'))
              flag=1;
   //if column ended
       if(flag==1)
           {
                if(in%2==0)
                      System.out.println(n1+" is the winner");
                else
                      System.out.println(n2+" is the winner");
    }
   
      in++;
      if(a!=' '&&b!=' '&&c!=' '&&d!=' '&&e!=' '&&f!=' '&&g!=' '&&h!=' '&&i!=' '&&j!=' '&&k!=' '&&l!=' '&&m!=' '&&n!=' '&&o!=' '&&p!=' '&&q!=' '&&r!=' '&&s!=' '&&t!=' ')
           {
               System.out.println(" draw");
               flag=1;
            }
           
  }while(flag!=1);
}//the main choice if statement
  }



public class gmwithmethods

{
void mainmenu()
{
prj obj1=new prj();
obj1.game();
}
}