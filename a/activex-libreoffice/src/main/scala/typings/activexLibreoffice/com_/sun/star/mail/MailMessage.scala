package typings.activexLibreoffice.com_.sun.star.mail

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since OOo 2.0 */
trait MailMessage extends XMailMessage {
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
}

