package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XCurrentContext
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mail {
  
  /**
    * A {@link MailAttachment} specifies a mail message attachment.
    * @see com.sun.star.mail.XMailMessage
    * @since OOo 2.0
    */
  trait MailAttachment extends StObject {
    
    /**
      * The actual data which should be attached to a mail message. It is expected that the transferable delivers the data as sequence of bytes. Although a
      * transferable may support multiple data flavors only the first data flavor supplied will be used to retrieve the data and it is expected that the type
      * of the data is a sequence of bytes.
      * @see com.sun.star.datatransfer.XTransferable
      */
    var Data: XTransferable
    
    /** The name of the attachment as seen by the recipient of the mail message. ReadableName must not be empty. */
    var ReadableName: String
  }
  object MailAttachment {
    
    @scala.inline
    def apply(Data: XTransferable, ReadableName: String): MailAttachment = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], ReadableName = ReadableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailAttachment]
    }
    
    @scala.inline
    implicit class MailAttachmentMutableBuilder[Self <: MailAttachment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: XTransferable): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableName(value: String): Self = StObject.set(x, "ReadableName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An {@link MailException} is the base of all mail related exceptions.
    * @since OOo 2.0
    */
  type MailException = Exception
  
  /** @since OOo 2.0 */
  trait MailMessage
    extends StObject
       with XMailMessage {
    
    /**
      * Constructs an instance of a mail message.
      * @param sTo [in] the e-mail address of the recipient. The e-mail address has to conform to [RFC   822]{@link url="http://www.ietf.org/rfc/rfc822.txt"} .
      * @param sFrom [in] the e-mail address of the sender of this mail message. The e-mail address has to conform to [RFC   822]{@link url="http://www.ietf.org
      * @param sSubject [in] the subject of the mail message.
      * @param xBody [in] the body of the mail message. It is expected that the transferable delivers the data as a string. Although a transferable may support
      * @see com.sun.star.mail.XMailMessage
      * @see com.sun.star.datatransfer.XTransferable
      */
    def create(sTo: String, sFrom: String, sSubject: String, xBody: XTransferable): Unit
    
    /**
      * Constructs an instance of a mail message.
      * @param sTo [in] the e-mail address of the recipient. The e-mail address has to conform to [RFC   822]{@link url="http://www.ietf.org/rfc/rfc822.txt"} .
      * @param sFrom [in] the e-mail address of the sender of this mail message. The e-mail address has to conform to [RFC   822]{@link url="http://www.ietf.org
      * @param sSubject [in] the subject of the mail message.
      * @param xBody [in] the body of the mail message. It is expected that the transferable delivers the data as a string. Although a transferable may support
      * @param aMailAttachment [in] specifies an attachment which should be send with this mail message.
      * @see com.sun.star.mail.XMailMessage
      * @see com.sun.star.datatransfer.XTransferable
      * @see com.sun.star.mail.MailAttachment
      */
    def createWithAttachment(
      sTo: String,
      sFrom: String,
      sSubject: String,
      xBody: XTransferable,
      aMailAttachment: MailAttachment
    ): Unit
  }
  object MailMessage {
    
    @scala.inline
    def apply(
      Attachments: SafeArray[MailAttachment],
      BccRecipients: SafeArray[String],
      Body: XTransferable,
      CcRecipients: SafeArray[String],
      Recipients: SafeArray[String],
      ReplyToAddress: String,
      SenderAddress: String,
      SenderName: String,
      Subject: String,
      acquire: () => Unit,
      addAttachment: MailAttachment => Unit,
      addBccRecipient: String => Unit,
      addCcRecipient: String => Unit,
      addRecipient: String => Unit,
      create: (String, String, String, XTransferable) => Unit,
      createWithAttachment: (String, String, String, XTransferable, MailAttachment) => Unit,
      getAttachments: () => SafeArray[MailAttachment],
      getBccRecipients: () => SafeArray[String],
      getCcRecipients: () => SafeArray[String],
      getRecipients: () => SafeArray[String],
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): MailMessage = {
      val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], BccRecipients = BccRecipients.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], CcRecipients = CcRecipients.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], ReplyToAddress = ReplyToAddress.asInstanceOf[js.Any], SenderAddress = SenderAddress.asInstanceOf[js.Any], SenderName = SenderName.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addAttachment = js.Any.fromFunction1(addAttachment), addBccRecipient = js.Any.fromFunction1(addBccRecipient), addCcRecipient = js.Any.fromFunction1(addCcRecipient), addRecipient = js.Any.fromFunction1(addRecipient), create = js.Any.fromFunction4(create), createWithAttachment = js.Any.fromFunction5(createWithAttachment), getAttachments = js.Any.fromFunction0(getAttachments), getBccRecipients = js.Any.fromFunction0(getBccRecipients), getCcRecipients = js.Any.fromFunction0(getCcRecipients), getRecipients = js.Any.fromFunction0(getRecipients), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[MailMessage]
    }
    
    @scala.inline
    implicit class MailMessageMutableBuilder[Self <: MailMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: (String, String, String, XTransferable) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCreateWithAttachment(value: (String, String, String, XTransferable, MailAttachment) => Unit): Self = StObject.set(x, "createWithAttachment", js.Any.fromFunction5(value))
    }
  }
  
  /** @since OOo 2.0 */
  @js.native
  trait MailServiceProvider
    extends StObject
       with XMailServiceProvider {
    
    /**
      * Creation method.
      * @see com.sun.star.mail.XMailServiceProvider
      */
    def create(): Unit = js.native
  }
  
  /** @since OOo 2.0 */
  /* Rewritten from type alias, can be one of: 
    - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  */
  trait MailServiceType extends StObject
  object MailServiceType {
    
    /** A IMAP service */
    @scala.inline
    def IMAP: `2` = 2.asInstanceOf[`2`]
    
    /** A POP3 service */
    @scala.inline
    def POP3: `1` = 1.asInstanceOf[`1`]
    
    /** A SMTP service */
    @scala.inline
    def SMTP: `0` = 0.asInstanceOf[`0`]
  }
  
  /**
    * A {@link NoMailServiceProviderException} will be thrown if an appropriate provider for requested mail service could not be found or could not be
    * created.
    * @see com.sun.star.mail.MailService
    * @since OOo 2.0
    */
  type NoMailServiceProviderException = MailException
  
  /**
    * A {@link NoMailTransportProviderException} will be thrown if an appropriate provider for sending mail messages could not be found or could not be
    * created.
    * @see com.sun.star.mail.MailServer
    * @since OOo 2.0
    */
  type NoMailTransportProviderException = MailException
  
  /**
    * A SendFailedException will be thrown if a mail message could not be sent because the e-mail addresses of some recipients are invalid. E-mail addresses
    * have to conform to [RFC   822]{@link url="http://www.ietf.org/rfc/rfc822.txt"} .
    * @see com.sun.star.mail.XMailService
    * @since OOo 2.0
    */
  trait SendMailMessageFailedException
    extends StObject
       with Exception {
    
    /** The addresses which are invalid because they do not conform to [RFC   822]{@link url="http://www.ietf.org/rfc/rfc822.txt"} . */
    var InvalidAddresses: SafeArray[String]
    
    /** The addresses to which the mail message was sent successfully. */
    var ValidSentAddresses: SafeArray[String]
    
    /** The addresses which are valid but to which the message was not sent. */
    var ValidUnsentAddresses: SafeArray[String]
  }
  object SendMailMessageFailedException {
    
    @scala.inline
    def apply(
      Context: XInterface,
      InvalidAddresses: SafeArray[String],
      Message: String,
      ValidSentAddresses: SafeArray[String],
      ValidUnsentAddresses: SafeArray[String]
    ): SendMailMessageFailedException = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], InvalidAddresses = InvalidAddresses.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], ValidSentAddresses = ValidSentAddresses.asInstanceOf[js.Any], ValidUnsentAddresses = ValidUnsentAddresses.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendMailMessageFailedException]
    }
    
    @scala.inline
    implicit class SendMailMessageFailedExceptionMutableBuilder[Self <: SendMailMessageFailedException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvalidAddresses(value: SafeArray[String]): Self = StObject.set(x, "InvalidAddresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidSentAddresses(value: SafeArray[String]): Self = StObject.set(x, "ValidSentAddresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUnsentAddresses(value: SafeArray[String]): Self = StObject.set(x, "ValidUnsentAddresses", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents an interface that will be used to query for user information which are necessary to login to a network resource. An implementation of this
    * interface may for instance show a dialog to query the user for the necessary data.
    * @since OOo 2.0
    */
  trait XAuthenticator
    extends StObject
       with XInterface {
    
    /**
      * Will be called when the password of the user is needed.
      * @returns the password of the user.
      */
    val Password: String
    
    /**
      * Will be called when the user name is needed.
      * @returns the user name.
      */
    val UserName: String
    
    /**
      * Will be called when the password of the user is needed.
      * @returns the password of the user.
      */
    def getPassword(): String
    
    /**
      * Will be called when the user name is needed.
      * @returns the user name.
      */
    def getUserName(): String
  }
  object XAuthenticator {
    
    @scala.inline
    def apply(
      Password: String,
      UserName: String,
      acquire: () => Unit,
      getPassword: () => String,
      getUserName: () => String,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XAuthenticator = {
      val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPassword = js.Any.fromFunction0(getPassword), getUserName = js.Any.fromFunction0(getUserName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XAuthenticator]
    }
    
    @scala.inline
    implicit class XAuthenticatorMutableBuilder[Self <: XAuthenticator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPassword(value: () => String): Self = StObject.set(x, "getPassword", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUserName(value: () => String): Self = StObject.set(x, "getUserName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The listener interface for connection events.
    * @see com.sun.star.mail.XMailService
    * @since OOo 2.0
    */
  trait XConnectionListener
    extends StObject
       with XEventListener {
    
    /**
      * Invoked when the connection to the mail server is established.
      * @param aEvent [in] specific information regarding this event.
      * @see com.sun.star.lang.EventObject
      */
    def connected(aEvent: EventObject): Unit
    
    /**
      * Invoked when the connection to the mail server is closed.
      * @param aEvent [in] specific information regarding this event.
      * @see com.sun.star.lang.EventObject
      */
    def disconnected(aEvent: EventObject): Unit
  }
  object XConnectionListener {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      connected: EventObject => Unit,
      disconnected: EventObject => Unit,
      disposing: EventObject => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XConnectionListener = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), connected = js.Any.fromFunction1(connected), disconnected = js.Any.fromFunction1(disconnected), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XConnectionListener]
    }
    
    @scala.inline
    implicit class XConnectionListenerMutableBuilder[Self <: XConnectionListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnected(value: EventObject => Unit): Self = StObject.set(x, "connected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisconnected(value: EventObject => Unit): Self = StObject.set(x, "disconnected", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Represents a mail message.
    * @see com.sun.star.mail.XMailService
    * @since OOo 2.0
    */
  trait XMailMessage
    extends StObject
       with XInterface {
    
    /**
      * Return a sequence of {@link MailAttachment} 's that will be attached to this mail message.
      * @see com.sun.star.mail.MailAttachment
      */
    val Attachments: SafeArray[MailAttachment]
    
    /** Return a sequence of the e-mail addresses of all the BCC recipients of this mail message. */
    val BccRecipients: SafeArray[String]
    
    /**
      * The body of the mail message. It is expected that the transferable delivers the data as a string. Although a transferable may support multiple data
      * flavors only the first data flavor supplied will be used to retrieve the data and it is expected that the data will be provided as a string.
      * @see com.sun.star.datatransfer.XTransferable
      */
    var Body: XTransferable
    
    /** Return a sequence of the e-mail addresses of all the Cc recipients of this mail message. */
    val CcRecipients: SafeArray[String]
    
    /** Return a sequence of the e-mail addresses of all recipients of this mail message. */
    val Recipients: SafeArray[String]
    
    /**
      * The e-mail address where replies on this mail message should be sent to. If the e-mail address doesn't conform to [RFC   822]{@link
      * url="http://www.ietf.org/rfc/rfc822.txt"} sending the mail message later will fail. If no ReplyToAddress is set replies go to the SenderAddress.
      */
    var ReplyToAddress: String
    
    /**
      * The e-mail address of the sender of this mail message. The e-mail address has to conform to [RFC   822]{@link
      * url="http://www.ietf.org/rfc/rfc822.txt"} .
      */
    var SenderAddress: String
    
    /** The display name of the sender of this mail message. */
    var SenderName: String
    
    /** The subject of a mail message. */
    var Subject: String
    
    /**
      * Add a file attachment to a mail message.
      *
      * param aMailAttachment [in] specifies a file which should be attached to this mail message.
      * @see com.sun.star.mail.MailAttachment
      */
    def addAttachment(aMailAttachment: MailAttachment): Unit
    
    /**
      * Add an BCC recipients e-mail address to the list of recipients of this mail message. If the e-mail address doesn't conform to [RFC   822]{@link
      * url="http://www.ietf.org/rfc/rfc822.txt"} sending the mail message will fail.
      * @param sRecipientAddress [in] the e-mail address of the BCC recipient.
      */
    def addBccRecipient(sRecipientAddress: String): Unit
    
    /**
      * Add an Cc recipients e-mail address to the list of recipients of this mail message. If the e-mail address doesn't conform to [RFC   822]{@link
      * url="http://www.ietf.org/rfc/rfc822.txt"} sending the mail message will fail.
      * @param sRecipientAddress [in] the e-mail address of the Cc recipient.
      */
    def addCcRecipient(sRecipientAddress: String): Unit
    
    /**
      * Add an recipients e-mail address to the list of recipients of this mail message. If the e-mail address doesn't conform to [RFC   822]{@link
      * url="http://www.ietf.org/rfc/rfc822.txt"} sending the mail message will fail.
      * @param sRecipientAddress [in] the e-mail address of the recipient.
      */
    def addRecipient(sRecipientAddress: String): Unit
    
    /**
      * Return a sequence of {@link MailAttachment} 's that will be attached to this mail message.
      * @see com.sun.star.mail.MailAttachment
      */
    def getAttachments(): SafeArray[MailAttachment]
    
    /** Return a sequence of the e-mail addresses of all the BCC recipients of this mail message. */
    def getBccRecipients(): SafeArray[String]
    
    /** Return a sequence of the e-mail addresses of all the Cc recipients of this mail message. */
    def getCcRecipients(): SafeArray[String]
    
    /** Return a sequence of the e-mail addresses of all recipients of this mail message. */
    def getRecipients(): SafeArray[String]
  }
  object XMailMessage {
    
    @scala.inline
    def apply(
      Attachments: SafeArray[MailAttachment],
      BccRecipients: SafeArray[String],
      Body: XTransferable,
      CcRecipients: SafeArray[String],
      Recipients: SafeArray[String],
      ReplyToAddress: String,
      SenderAddress: String,
      SenderName: String,
      Subject: String,
      acquire: () => Unit,
      addAttachment: MailAttachment => Unit,
      addBccRecipient: String => Unit,
      addCcRecipient: String => Unit,
      addRecipient: String => Unit,
      getAttachments: () => SafeArray[MailAttachment],
      getBccRecipients: () => SafeArray[String],
      getCcRecipients: () => SafeArray[String],
      getRecipients: () => SafeArray[String],
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XMailMessage = {
      val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], BccRecipients = BccRecipients.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], CcRecipients = CcRecipients.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], ReplyToAddress = ReplyToAddress.asInstanceOf[js.Any], SenderAddress = SenderAddress.asInstanceOf[js.Any], SenderName = SenderName.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addAttachment = js.Any.fromFunction1(addAttachment), addBccRecipient = js.Any.fromFunction1(addBccRecipient), addCcRecipient = js.Any.fromFunction1(addCcRecipient), addRecipient = js.Any.fromFunction1(addRecipient), getAttachments = js.Any.fromFunction0(getAttachments), getBccRecipients = js.Any.fromFunction0(getBccRecipients), getCcRecipients = js.Any.fromFunction0(getCcRecipients), getRecipients = js.Any.fromFunction0(getRecipients), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XMailMessage]
    }
    
    @scala.inline
    implicit class XMailMessageMutableBuilder[Self <: XMailMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddAttachment(value: MailAttachment => Unit): Self = StObject.set(x, "addAttachment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddBccRecipient(value: String => Unit): Self = StObject.set(x, "addBccRecipient", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddCcRecipient(value: String => Unit): Self = StObject.set(x, "addCcRecipient", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddRecipient(value: String => Unit): Self = StObject.set(x, "addRecipient", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttachments(value: SafeArray[MailAttachment]): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBccRecipients(value: SafeArray[String]): Self = StObject.set(x, "BccRecipients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody(value: XTransferable): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcRecipients(value: SafeArray[String]): Self = StObject.set(x, "CcRecipients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAttachments(value: () => SafeArray[MailAttachment]): Self = StObject.set(x, "getAttachments", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBccRecipients(value: () => SafeArray[String]): Self = StObject.set(x, "getBccRecipients", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCcRecipients(value: () => SafeArray[String]): Self = StObject.set(x, "getCcRecipients", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRecipients(value: () => SafeArray[String]): Self = StObject.set(x, "getRecipients", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRecipients(value: SafeArray[String]): Self = StObject.set(x, "Recipients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyToAddress(value: String): Self = StObject.set(x, "ReplyToAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderAddress(value: String): Self = StObject.set(x, "SenderAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderName(value: String): Self = StObject.set(x, "SenderName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents a mail server abstraction.
    * @since OOo 2.0
    */
  trait XMailService
    extends StObject
       with XInterface {
    
    /**
      * Return the context of the current connection. The context contains information like the server name, port, connection type etc.
      *
      *
      *
      * **Precondition**: `isConnected` returns true.
      * @returns the current connection context.
      * @see com.sun.star.mail.connectUser
      * @see com.sun.star.io.NotConnectedException
      * @throws com::sun::star::io::NotConnectedException if no connection is currently established.
      */
    val CurrentConnectionContext: XCurrentContext
    
    /**
      * Returns all connection types which are supported to connect to the mail service. At least support insecure connections must be supported. Currently
      * defined connection types are (the values should be handled case insensitive): "Insecure" - insecure connections "SSL" - Secure Socket Layer 2.0/3.0
      * based connection
      * @returns a sequence of supported connection types.
      */
    val SupportedConnectionTypes: SafeArray[String]
    
    /**
      * Register a connection listener.
      * @param xListener [in] a listener that will be informed about connection events.
      * @see com.sun.star.mail.XConnectionListener
      */
    def addConnectionListener(xListener: XConnectionListener): Unit
    
    /**
      * Connect to a mail service. Only one connection to a mail service can be established at a time.
      * @param xConnectionContext [in] an interface used to query for connection related information. The context must contain the following values: **ServerNam
      * @param xAuthenticator [in] an interface used to query for the necessary user information needed to login to the mail server. If no authentication is req
      * @see com.sun.star.uno.XCurrentContext
      * @see com.sun.star.mail.XAuthenticator
      * @see com.sun.star.lang.IllegalArgumentException
      * @see com.sun.star.io.AlreadyConnectedException
      * @see com.sun.star.io.UnknownHostException
      * @see com.sun.star.io.NoRouteToHostException
      * @see com.sun.star.io.ConnectException
      * @see com.sun.star.auth.AuthenticationException
      * @see com.sun.star.mail.IllegalStateException
      * @see com.sun.star.mail.MailException
      * @throws com::sun::star::lang::IllegalArgumentException if the provided connection context contains invalid values or misses required connection parameters.
      * @throws com::sun::star::io::AlreadyConnectedException on a try to connect to an already connect mail server.
      * @throws com::sun::star::io::UnknownHostException usually if the IP address of the mail server could not be determined. Possible causes are a broken netwo
      * @throws com::sun::star::io::NoRouteToHostException if an error occurred to connect to the remote mail server. Typically the remote mail server cannot be
      * @throws com::sun::star::io::ConnectException if an error occurred while attempting to connect to the remote mail server. Typically the connection was ref
      * @throws com::sun::star::auth::AuthenticationException if the specified user could not be logged in.
      * @throws com::sun::star::mail::MailException for other errors during login.
      */
    def connect(xConnectionContext: XCurrentContext, xAuthenticator: XAuthenticator): Unit
    
    /**
      * Disconnect from a mail service.
      * @throws com::sun::star::mail::MailException if errors occur during disconnecting.
      */
    def disconnect(): Unit
    
    /**
      * Return the context of the current connection. The context contains information like the server name, port, connection type etc.
      *
      *
      *
      * **Precondition**: `isConnected` returns true.
      * @returns the current connection context.
      * @see com.sun.star.mail.connectUser
      * @see com.sun.star.io.NotConnectedException
      * @throws com::sun::star::io::NotConnectedException if no connection is currently established.
      */
    def getCurrentConnectionContext(): XCurrentContext
    
    /**
      * Returns all connection types which are supported to connect to the mail service. At least support insecure connections must be supported. Currently
      * defined connection types are (the values should be handled case insensitive): "Insecure" - insecure connections "SSL" - Secure Socket Layer 2.0/3.0
      * based connection
      * @returns a sequence of supported connection types.
      */
    def getSupportedConnectionTypes(): SafeArray[String]
    
    /**
      * Returns whether a connection to a mail service currently exist or not.
      * @returns `TRUE` if a connection to a mail service is established.
      */
    def isConnected(): Boolean
    
    /**
      * Unregister a connection listener.
      * @param xListener [in] a listener that no longer need to be informed about connection events.
      * @see com.sun.star.mail.XConnectionListener
      */
    def removeConnectionListener(xListener: XConnectionListener): Unit
  }
  object XMailService {
    
    @scala.inline
    def apply(
      CurrentConnectionContext: XCurrentContext,
      SupportedConnectionTypes: SafeArray[String],
      acquire: () => Unit,
      addConnectionListener: XConnectionListener => Unit,
      connect: (XCurrentContext, XAuthenticator) => Unit,
      disconnect: () => Unit,
      getCurrentConnectionContext: () => XCurrentContext,
      getSupportedConnectionTypes: () => SafeArray[String],
      isConnected: () => Boolean,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeConnectionListener: XConnectionListener => Unit
    ): XMailService = {
      val __obj = js.Dynamic.literal(CurrentConnectionContext = CurrentConnectionContext.asInstanceOf[js.Any], SupportedConnectionTypes = SupportedConnectionTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addConnectionListener = js.Any.fromFunction1(addConnectionListener), connect = js.Any.fromFunction2(connect), disconnect = js.Any.fromFunction0(disconnect), getCurrentConnectionContext = js.Any.fromFunction0(getCurrentConnectionContext), getSupportedConnectionTypes = js.Any.fromFunction0(getSupportedConnectionTypes), isConnected = js.Any.fromFunction0(isConnected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeConnectionListener = js.Any.fromFunction1(removeConnectionListener))
      __obj.asInstanceOf[XMailService]
    }
    
    @scala.inline
    implicit class XMailServiceMutableBuilder[Self <: XMailService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddConnectionListener(value: XConnectionListener => Unit): Self = StObject.set(x, "addConnectionListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConnect(value: (XCurrentContext, XAuthenticator) => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCurrentConnectionContext(value: XCurrentContext): Self = StObject.set(x, "CurrentConnectionContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrentConnectionContext(value: () => XCurrentContext): Self = StObject.set(x, "getCurrentConnectionContext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSupportedConnectionTypes(value: () => SafeArray[String]): Self = StObject.set(x, "getSupportedConnectionTypes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConnected(value: () => Boolean): Self = StObject.set(x, "isConnected", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveConnectionListener(value: XConnectionListener => Unit): Self = StObject.set(x, "removeConnectionListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSupportedConnectionTypes(value: SafeArray[String]): Self = StObject.set(x, "SupportedConnectionTypes", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A factory for creating different mail services.
    * @since OOo 2.0
    */
  trait XMailServiceProvider
    extends StObject
       with XInterface {
    
    /**
      * A factory method.
      * @param aType [in] the type of the requested mail service.
      * @returns A {@link XMailService} interface.
      * @see com.sun.star.mail.XMailServiceProvider
      * @see com.sun.star.mail.MailServiceType
      */
    def create(aType: MailServiceType): XMailService
  }
  object XMailServiceProvider {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      create: MailServiceType => XMailService,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XMailServiceProvider = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction1(create), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XMailServiceProvider]
    }
    
    @scala.inline
    implicit class XMailServiceProviderMutableBuilder[Self <: XMailServiceProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: MailServiceType => XMailService): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Represents a SMTP service abstraction.
    * @see com.sun.star.mail.XMailService
    * @see com.sun.star.mail.XMailMessage
    * @since OOo 2.0
    */
  trait XSmtpService
    extends StObject
       with XMailService {
    
    /**
      * Send a mail message to its recipients.
      * @param xMailMessage [in] the mail message to be sent.
      * @see com.sun.star.mail.XMailMessage
      * @see com.sun.star.io.NotConnectedException
      * @see com.sun.star.mail.SendMailMessageFailedException
      * @see com.sun.star.mail.MailException
      * @see com.sun.star.datatransfer.UnsupportedFlavorException
      * @throws com::sun::star::io::NotConnectedException if no user is currently connected to the mail server.
      * @throws com::sun::star::mail::SendMailMessageFailedException if the message could not be sent because of invalid recipient addresses. The e-mail addresse
      * @throws com::sun::star::mail::MailException is thrown on other errors that may happen during sending. A possible reason may be for instance that a file a
      * @throws com::sun::star::datatransfer::UnsupportedFlavorException is thrown when the body of the mail message is provided in an unsupported mime content t
      */
    def sendMailMessage(xMailMessage: XMailMessage): Unit
  }
  object XSmtpService {
    
    @scala.inline
    def apply(
      CurrentConnectionContext: XCurrentContext,
      SupportedConnectionTypes: SafeArray[String],
      acquire: () => Unit,
      addConnectionListener: XConnectionListener => Unit,
      connect: (XCurrentContext, XAuthenticator) => Unit,
      disconnect: () => Unit,
      getCurrentConnectionContext: () => XCurrentContext,
      getSupportedConnectionTypes: () => SafeArray[String],
      isConnected: () => Boolean,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeConnectionListener: XConnectionListener => Unit,
      sendMailMessage: XMailMessage => Unit
    ): XSmtpService = {
      val __obj = js.Dynamic.literal(CurrentConnectionContext = CurrentConnectionContext.asInstanceOf[js.Any], SupportedConnectionTypes = SupportedConnectionTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addConnectionListener = js.Any.fromFunction1(addConnectionListener), connect = js.Any.fromFunction2(connect), disconnect = js.Any.fromFunction0(disconnect), getCurrentConnectionContext = js.Any.fromFunction0(getCurrentConnectionContext), getSupportedConnectionTypes = js.Any.fromFunction0(getSupportedConnectionTypes), isConnected = js.Any.fromFunction0(isConnected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeConnectionListener = js.Any.fromFunction1(removeConnectionListener), sendMailMessage = js.Any.fromFunction1(sendMailMessage))
      __obj.asInstanceOf[XSmtpService]
    }
    
    @scala.inline
    implicit class XSmtpServiceMutableBuilder[Self <: XSmtpService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSendMailMessage(value: XMailMessage => Unit): Self = StObject.set(x, "sendMailMessage", js.Any.fromFunction1(value))
    }
  }
}
