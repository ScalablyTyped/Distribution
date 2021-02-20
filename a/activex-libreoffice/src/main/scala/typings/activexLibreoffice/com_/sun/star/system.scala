package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object system {
  
  /**
    * Specifies a {@link SimpleCommandMail} service. Implementations of such a service, do implement an interface to send mail messages via the current
    * configured command line mail application.
    * @see com.sun.star.system.XSimpleMailClient
    */
  type SimpleCommandMail = XSimpleMailClientSupplier
  
  object SimpleMailClientFlags {
    
    /* Rewritten from type alias, can be one of: 
      - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
    */
    trait Constants extends StObject
    object Constants {
      
      @scala.inline
      def DEFAULTS: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def NO_LOGON_DIALOG: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def NO_USER_INTERFACE: `1` = 1.asInstanceOf[`1`]
    }
  }
  
  /**
    * Specifies a {@link SimpleSystemMail} service. Implementations of such a service implement an interface to send mail messages via the currently
    * configured system mail client.
    * @see com.sun.star.system.XSimpleMailClient
    */
  type SimpleSystemMail = XSimpleMailClientSupplier
  
  /**
    * Specifies a system executer service. Such a service makes it possible to execute an arbitrary system command.
    * @see com.sun.star.system.XSystemShellExecute
    */
  type SystemShellExecute = XSystemShellExecute
  
  /**
    * May be thrown in cases of errors executing a command using the {@link SystemShellExecute} service. {@link com.sun.star.uno.Exception.Message} may
    * contain a system error message, but it is not mandatory. The member PosixError specifies a POSIX conforming error code or -1 for unknown errors.
    */
  @js.native
  trait SystemShellExecuteException extends Exception {
    
    /** A POSIX conforming error code or -1 for unknown errors. */
    var PosixError: Double = js.native
  }
  object SystemShellExecuteException {
    
    @scala.inline
    def apply(Context: XInterface, Message: String, PosixError: Double): SystemShellExecuteException = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], PosixError = PosixError.asInstanceOf[js.Any])
      __obj.asInstanceOf[SystemShellExecuteException]
    }
    
    @scala.inline
    implicit class SystemShellExecuteExceptionMutableBuilder[Self <: SystemShellExecuteException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosixError(value: Double): Self = StObject.set(x, "PosixError", value.asInstanceOf[js.Any])
    }
  }
  
  object SystemShellExecuteFlags {
    
    /* Rewritten from type alias, can be one of: 
      - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
    */
    trait Constants extends StObject
    object Constants {
      
      @scala.inline
      def DEFAULTS: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def NO_SYSTEM_ERROR_MESSAGE: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def URIS_ONLY: `2` = 2.asInstanceOf[`2`]
    }
  }
  
  /** Specifies an interface for creating and sending email messages. */
  @js.native
  trait XSimpleMailClient extends XInterface {
    
    /**
      * Create a simple mail message object that implements the interface {@link XSimpleMailMessage} .
      * @returns An object that implements the {@link XSimpleMailMessage} interface.
      */
    def createSimpleMailMessage(): XSimpleMailMessage = js.native
    
    /**
      * Sends a given simple mail message object that implements the interface {@link XSimpleMailMessage} .
      * @param xSimpleMailMessage Specifies a configured mail object to be sent.
      * @param aFlag Specifies different flags that control the send process if the flag NO_USER_INTERFACE is specified. A recipient address must have been spec
      * @see com.sun.star.system.XSimpleMailMessage
      * @see com.sun.star.system.SimpleMailClientFlags
      * @throws com::sun::star::lang::IllegalArgumentException If invalid or excluding flags have been specified.The flag NO_USER_INTERFACE is specified and no r
      * @throws com::sun::star::uno::Exception if an error occurs while sending the mail. The Message member of the exception may contain an error description.
      */
    def sendSimpleMailMessage(xSimpleMailMessage: XSimpleMailMessage, aFlag: Double): Unit = js.native
  }
  object XSimpleMailClient {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      createSimpleMailMessage: () => XSimpleMailMessage,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      sendSimpleMailMessage: (XSimpleMailMessage, Double) => Unit
    ): XSimpleMailClient = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createSimpleMailMessage = js.Any.fromFunction0(createSimpleMailMessage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), sendSimpleMailMessage = js.Any.fromFunction2(sendSimpleMailMessage))
      __obj.asInstanceOf[XSimpleMailClient]
    }
    
    @scala.inline
    implicit class XSimpleMailClientMutableBuilder[Self <: XSimpleMailClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateSimpleMailMessage(value: () => XSimpleMailMessage): Self = StObject.set(x, "createSimpleMailMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSendSimpleMailMessage(value: (XSimpleMailMessage, Double) => Unit): Self = StObject.set(x, "sendSimpleMailMessage", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * Implementations of this interface do provide access to a simple mail client if there is one available
    * @see com.sun.star.system.XSimpleMailClient
    */
  @js.native
  trait XSimpleMailClientSupplier extends XInterface {
    
    /**
      * Allows a client to query for an object that implements {@link XSimpleMailClient} .
      * @returns An interface to a simple mail client if there is one available on the system or an empty reference else.
      * @see com.sun.star.system.XSimpleMailClient
      */
    def querySimpleMailClient(): XSimpleMailClient = js.native
  }
  object XSimpleMailClientSupplier {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      queryInterface: `type` => js.Any,
      querySimpleMailClient: () => XSimpleMailClient,
      release: () => Unit
    ): XSimpleMailClientSupplier = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), querySimpleMailClient = js.Any.fromFunction0(querySimpleMailClient), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XSimpleMailClientSupplier]
    }
    
    @scala.inline
    implicit class XSimpleMailClientSupplierMutableBuilder[Self <: XSimpleMailClientSupplier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuerySimpleMailClient(value: () => XSimpleMailClient): Self = StObject.set(x, "querySimpleMailClient", js.Any.fromFunction0(value))
    }
  }
  
  /** This interface lets a client set or get the information of a simple mail message. */
  @js.native
  trait XSimpleMailMessage extends XInterface {
    
    /**
      * To get the attachment of a simple mail message.
      * @returns A sequence of file URLs specifying the files that should be attached to the mail or an empty sequence if no attachments have been specified. The
      */
    var Attachement: SafeArray[String] = js.native
    
    /**
      * To get the BCC recipients of a simple mail message.
      * @returns A sequence with the email addresses of one or more BCC recipients. If no BCC recipients have been specified an empty sequence will be returned.
      */
    var BccRecipient: SafeArray[String] = js.native
    
    /**
      * To get the cc recipients of a simple mail message.
      * @returns A sequence with the email addresses of one or more cc recipients. If no cc recipients have been specified an empty sequence will be returned.
      */
    var CcRecipient: SafeArray[String] = js.native
    
    /**
      * To get the email address of the originator of a simple mail message.
      * @returns The email address of the originator of the mail. If no originator has been specified an empty string will be returned.
      */
    var Originator: String = js.native
    
    /**
      * To get the recipient of the simple mail message.
      * @returns The specified email address of a recipient if any has been specified or an empty string.
      */
    var Recipient: String = js.native
    
    /**
      * To get the subject of a simple mail message.
      * @returns The subject of the simple mail message. If no subject has been specified an empty string will be returned.
      */
    var Subject: String = js.native
    
    /**
      * To get the attachment of a simple mail message.
      * @returns A sequence of file URLs specifying the files that should be attached to the mail or an empty sequence if no attachments have been specified. The
      */
    def getAttachement(): SafeArray[String] = js.native
    
    /**
      * To get the BCC recipients of a simple mail message.
      * @returns A sequence with the email addresses of one or more BCC recipients. If no BCC recipients have been specified an empty sequence will be returned.
      */
    def getBccRecipient(): SafeArray[String] = js.native
    
    /**
      * To get the cc recipients of a simple mail message.
      * @returns A sequence with the email addresses of one or more cc recipients. If no cc recipients have been specified an empty sequence will be returned.
      */
    def getCcRecipient(): SafeArray[String] = js.native
    
    /**
      * To get the email address of the originator of a simple mail message.
      * @returns The email address of the originator of the mail. If no originator has been specified an empty string will be returned.
      */
    def getOriginator(): String = js.native
    
    /**
      * To get the recipient of the simple mail message.
      * @returns The specified email address of a recipient if any has been specified or an empty string.
      */
    def getRecipient(): String = js.native
    
    /**
      * To get the subject of a simple mail message.
      * @returns The subject of the simple mail message. If no subject has been specified an empty string will be returned.
      */
    def getSubject(): String = js.native
    
    /**
      * To set an attachment of a simple mail message.
      * @param aAttachement Sets a sequence of file URLs specifying the files that should be attached to the mail. The given file URLs must conform to [Rfc1738]
      * @throws com::sun::star::lang::IllegalArgumentException if at least one of the given file URLs is invalid (doesn't conform to [Rfc1738]{@link url="http://
      */
    def setAttachement(aAttachement: SeqEquiv[String]): Unit = js.native
    
    /**
      * To set the BCC recipient of a simple mail message.
      * @param aBccRecipient A sequence with the email addresses of one or more BCC recipients. An empty sequence means there are no BCC recipients.
      */
    def setBccRecipient(aBccRecipient: SeqEquiv[String]): Unit = js.native
    
    /**
      * To set the cc recipients of a simple mail message.
      * @param aCcRecipient Sets a sequence with the email addresses of one or more cc recipients. The method does not check if the given addresses are valid. A
      */
    def setCcRecipient(aCcRecipient: SeqEquiv[String]): Unit = js.native
    
    /**
      * To set the email address of the originator of a simple mail message.
      * @param aOriginator Sets the email address of the originator of the mail.
      */
    def setOriginator(aOriginator: String): Unit = js.native
    
    /**
      * To set the recipient of the simple mail message.
      * @param aRecipient The email address of a recipient. The method doesn't check if the given email address is valid.
      */
    def setRecipient(aRecipient: String): Unit = js.native
    
    /**
      * To set the subject of a simple mail message.
      * @param aSubject Sets the subject of the simple mail message.
      */
    def setSubject(aSubject: String): Unit = js.native
  }
  object XSimpleMailMessage {
    
    @scala.inline
    def apply(
      Attachement: SafeArray[String],
      BccRecipient: SafeArray[String],
      CcRecipient: SafeArray[String],
      Originator: String,
      Recipient: String,
      Subject: String,
      acquire: () => Unit,
      getAttachement: () => SafeArray[String],
      getBccRecipient: () => SafeArray[String],
      getCcRecipient: () => SafeArray[String],
      getOriginator: () => String,
      getRecipient: () => String,
      getSubject: () => String,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      setAttachement: SeqEquiv[String] => Unit,
      setBccRecipient: SeqEquiv[String] => Unit,
      setCcRecipient: SeqEquiv[String] => Unit,
      setOriginator: String => Unit,
      setRecipient: String => Unit,
      setSubject: String => Unit
    ): XSimpleMailMessage = {
      val __obj = js.Dynamic.literal(Attachement = Attachement.asInstanceOf[js.Any], BccRecipient = BccRecipient.asInstanceOf[js.Any], CcRecipient = CcRecipient.asInstanceOf[js.Any], Originator = Originator.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAttachement = js.Any.fromFunction0(getAttachement), getBccRecipient = js.Any.fromFunction0(getBccRecipient), getCcRecipient = js.Any.fromFunction0(getCcRecipient), getOriginator = js.Any.fromFunction0(getOriginator), getRecipient = js.Any.fromFunction0(getRecipient), getSubject = js.Any.fromFunction0(getSubject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAttachement = js.Any.fromFunction1(setAttachement), setBccRecipient = js.Any.fromFunction1(setBccRecipient), setCcRecipient = js.Any.fromFunction1(setCcRecipient), setOriginator = js.Any.fromFunction1(setOriginator), setRecipient = js.Any.fromFunction1(setRecipient), setSubject = js.Any.fromFunction1(setSubject))
      __obj.asInstanceOf[XSimpleMailMessage]
    }
    
    @scala.inline
    implicit class XSimpleMailMessageMutableBuilder[Self <: XSimpleMailMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachement(value: SafeArray[String]): Self = StObject.set(x, "Attachement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBccRecipient(value: SafeArray[String]): Self = StObject.set(x, "BccRecipient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcRecipient(value: SafeArray[String]): Self = StObject.set(x, "CcRecipient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAttachement(value: () => SafeArray[String]): Self = StObject.set(x, "getAttachement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBccRecipient(value: () => SafeArray[String]): Self = StObject.set(x, "getBccRecipient", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCcRecipient(value: () => SafeArray[String]): Self = StObject.set(x, "getCcRecipient", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOriginator(value: () => String): Self = StObject.set(x, "getOriginator", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRecipient(value: () => String): Self = StObject.set(x, "getRecipient", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSubject(value: () => String): Self = StObject.set(x, "getSubject", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOriginator(value: String): Self = StObject.set(x, "Originator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipient(value: String): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAttachement(value: SeqEquiv[String] => Unit): Self = StObject.set(x, "setAttachement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBccRecipient(value: SeqEquiv[String] => Unit): Self = StObject.set(x, "setBccRecipient", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCcRecipient(value: SeqEquiv[String] => Unit): Self = StObject.set(x, "setCcRecipient", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetOriginator(value: String => Unit): Self = StObject.set(x, "setOriginator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRecipient(value: String => Unit): Self = StObject.set(x, "setRecipient", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSubject(value: String => Unit): Self = StObject.set(x, "setSubject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * This interface extends {@link XSimpleMailMessage}
    * @since LibreOffice 4.2
    */
  @js.native
  trait XSimpleMailMessage2 extends XSimpleMailMessage {
    
    var Body: String = js.native
  }
  object XSimpleMailMessage2 {
    
    @scala.inline
    def apply(
      Attachement: SafeArray[String],
      BccRecipient: SafeArray[String],
      Body: String,
      CcRecipient: SafeArray[String],
      Originator: String,
      Recipient: String,
      Subject: String,
      acquire: () => Unit,
      getAttachement: () => SafeArray[String],
      getBccRecipient: () => SafeArray[String],
      getCcRecipient: () => SafeArray[String],
      getOriginator: () => String,
      getRecipient: () => String,
      getSubject: () => String,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      setAttachement: SeqEquiv[String] => Unit,
      setBccRecipient: SeqEquiv[String] => Unit,
      setCcRecipient: SeqEquiv[String] => Unit,
      setOriginator: String => Unit,
      setRecipient: String => Unit,
      setSubject: String => Unit
    ): XSimpleMailMessage2 = {
      val __obj = js.Dynamic.literal(Attachement = Attachement.asInstanceOf[js.Any], BccRecipient = BccRecipient.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], CcRecipient = CcRecipient.asInstanceOf[js.Any], Originator = Originator.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAttachement = js.Any.fromFunction0(getAttachement), getBccRecipient = js.Any.fromFunction0(getBccRecipient), getCcRecipient = js.Any.fromFunction0(getCcRecipient), getOriginator = js.Any.fromFunction0(getOriginator), getRecipient = js.Any.fromFunction0(getRecipient), getSubject = js.Any.fromFunction0(getSubject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAttachement = js.Any.fromFunction1(setAttachement), setBccRecipient = js.Any.fromFunction1(setBccRecipient), setCcRecipient = js.Any.fromFunction1(setCcRecipient), setOriginator = js.Any.fromFunction1(setOriginator), setRecipient = js.Any.fromFunction1(setRecipient), setSubject = js.Any.fromFunction1(setSubject))
      __obj.asInstanceOf[XSimpleMailMessage2]
    }
    
    @scala.inline
    implicit class XSimpleMailMessage2MutableBuilder[Self <: XSimpleMailMessage2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    }
  }
  
  /** Specifies an interface for executing a system command. */
  @js.native
  trait XSystemShellExecute extends XInterface {
    
    /**
      * Executes an arbitrary system command.
      * @param aCommand Specifies the command to execute. This may be an executable file or a document which is registered with an application on a specific pla
      * @param aParameter Specifies a list of space separated parameters. The method does not validate the given parameters, but only passes it as a parameter t
      * @param nFlags Specifies different flags to control the execution of this method, for example, avoid showing system error messages, in case of failures, etc.
      * @see com.sun.star.system.SystemShellExecuteFlags
      * @throws com::sun::star::lang::IllegalArgumentException when the specified flags are wrong or exclude each other; also thrown, with an ArgumentPosition of
      * @throws com::sun::star::system::SystemShellExecuteException in the case of errors when trying to executed the specified command.
      */
    def execute(aCommand: String, aParameter: String, nFlags: Double): Unit = js.native
  }
  object XSystemShellExecute {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      execute: (String, String, Double) => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XSystemShellExecute = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), execute = js.Any.fromFunction3(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XSystemShellExecute]
    }
    
    @scala.inline
    implicit class XSystemShellExecuteMutableBuilder[Self <: XSystemShellExecute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecute(value: (String, String, Double) => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction3(value))
    }
  }
}
