package typings.activexLibreoffice.com_.sun.star.mail

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a mail message.
  * @see com.sun.star.mail.XMailService
  * @since OOo 2.0
  */
@js.native
trait XMailMessage extends XInterface {
  
  /**
    * Return a sequence of {@link MailAttachment} 's that will be attached to this mail message.
    * @see com.sun.star.mail.MailAttachment
    */
  val Attachments: SafeArray[MailAttachment] = js.native
  
  /** Return a sequence of the e-mail addresses of all the BCC recipients of this mail message. */
  val BccRecipients: SafeArray[String] = js.native
  
  /**
    * The body of the mail message. It is expected that the transferable delivers the data as a string. Although a transferable may support multiple data
    * flavors only the first data flavor supplied will be used to retrieve the data and it is expected that the data will be provided as a string.
    * @see com.sun.star.datatransfer.XTransferable
    */
  var Body: XTransferable = js.native
  
  /** Return a sequence of the e-mail addresses of all the Cc recipients of this mail message. */
  val CcRecipients: SafeArray[String] = js.native
  
  /** Return a sequence of the e-mail addresses of all recipients of this mail message. */
  val Recipients: SafeArray[String] = js.native
  
  /**
    * The e-mail address where replies on this mail message should be sent to. If the e-mail address doesn't conform to [RFC   822]{@link
    * url="http://www.ietf.org/rfc/rfc822.txt"} sending the mail message later will fail. If no ReplyToAddress is set replies go to the SenderAddress.
    */
  var ReplyToAddress: String = js.native
  
  /**
    * The e-mail address of the sender of this mail message. The e-mail address has to conform to [RFC   822]{@link
    * url="http://www.ietf.org/rfc/rfc822.txt"} .
    */
  var SenderAddress: String = js.native
  
  /** The display name of the sender of this mail message. */
  var SenderName: String = js.native
  
  /** The subject of a mail message. */
  var Subject: String = js.native
  
  /**
    * Add a file attachment to a mail message.
    *
    * param aMailAttachment [in] specifies a file which should be attached to this mail message.
    * @see com.sun.star.mail.MailAttachment
    */
  def addAttachment(aMailAttachment: MailAttachment): Unit = js.native
  
  /**
    * Add an BCC recipients e-mail address to the list of recipients of this mail message. If the e-mail address doesn't conform to [RFC   822]{@link
    * url="http://www.ietf.org/rfc/rfc822.txt"} sending the mail message will fail.
    * @param sRecipientAddress [in] the e-mail address of the BCC recipient.
    */
  def addBccRecipient(sRecipientAddress: String): Unit = js.native
  
  /**
    * Add an Cc recipients e-mail address to the list of recipients of this mail message. If the e-mail address doesn't conform to [RFC   822]{@link
    * url="http://www.ietf.org/rfc/rfc822.txt"} sending the mail message will fail.
    * @param sRecipientAddress [in] the e-mail address of the Cc recipient.
    */
  def addCcRecipient(sRecipientAddress: String): Unit = js.native
  
  /**
    * Add an recipients e-mail address to the list of recipients of this mail message. If the e-mail address doesn't conform to [RFC   822]{@link
    * url="http://www.ietf.org/rfc/rfc822.txt"} sending the mail message will fail.
    * @param sRecipientAddress [in] the e-mail address of the recipient.
    */
  def addRecipient(sRecipientAddress: String): Unit = js.native
  
  /**
    * Return a sequence of {@link MailAttachment} 's that will be attached to this mail message.
    * @see com.sun.star.mail.MailAttachment
    */
  def getAttachments(): SafeArray[MailAttachment] = js.native
  
  /** Return a sequence of the e-mail addresses of all the BCC recipients of this mail message. */
  def getBccRecipients(): SafeArray[String] = js.native
  
  /** Return a sequence of the e-mail addresses of all the Cc recipients of this mail message. */
  def getCcRecipients(): SafeArray[String] = js.native
  
  /** Return a sequence of the e-mail addresses of all recipients of this mail message. */
  def getRecipients(): SafeArray[String] = js.native
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
  implicit class XMailMessageOps[Self <: XMailMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachments(value: SafeArray[MailAttachment]): Self = this.set("Attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBccRecipients(value: SafeArray[String]): Self = this.set("BccRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: XTransferable): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcRecipients(value: SafeArray[String]): Self = this.set("CcRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipients(value: SafeArray[String]): Self = this.set("Recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToAddress(value: String): Self = this.set("ReplyToAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderAddress(value: String): Self = this.set("SenderAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderName(value: String): Self = this.set("SenderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAttachment(value: MailAttachment => Unit): Self = this.set("addAttachment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddBccRecipient(value: String => Unit): Self = this.set("addBccRecipient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddCcRecipient(value: String => Unit): Self = this.set("addCcRecipient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddRecipient(value: String => Unit): Self = this.set("addRecipient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttachments(value: () => SafeArray[MailAttachment]): Self = this.set("getAttachments", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBccRecipients(value: () => SafeArray[String]): Self = this.set("getBccRecipients", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCcRecipients(value: () => SafeArray[String]): Self = this.set("getCcRecipients", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecipients(value: () => SafeArray[String]): Self = this.set("getRecipients", js.Any.fromFunction0(value))
  }
}
