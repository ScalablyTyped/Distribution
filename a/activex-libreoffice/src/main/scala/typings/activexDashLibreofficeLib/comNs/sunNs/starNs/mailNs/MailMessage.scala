package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs

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
  def create(
    sTo: java.lang.String,
    sFrom: java.lang.String,
    sSubject: java.lang.String,
    xBody: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable
  ): scala.Unit
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
    sTo: java.lang.String,
    sFrom: java.lang.String,
    sSubject: java.lang.String,
    xBody: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    aMailAttachment: MailAttachment
  ): scala.Unit
}

object MailMessage {
  @scala.inline
  def apply(
    Attachments: stdLib.SafeArray[MailAttachment],
    BccRecipients: stdLib.SafeArray[java.lang.String],
    Body: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    CcRecipients: stdLib.SafeArray[java.lang.String],
    Recipients: stdLib.SafeArray[java.lang.String],
    ReplyToAddress: java.lang.String,
    SenderAddress: java.lang.String,
    SenderName: java.lang.String,
    Subject: java.lang.String,
    acquire: () => scala.Unit,
    addAttachment: MailAttachment => scala.Unit,
    addBccRecipient: java.lang.String => scala.Unit,
    addCcRecipient: java.lang.String => scala.Unit,
    addRecipient: java.lang.String => scala.Unit,
    create: (java.lang.String, java.lang.String, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable) => scala.Unit,
    createWithAttachment: (java.lang.String, java.lang.String, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable, MailAttachment) => scala.Unit,
    getAttachments: () => stdLib.SafeArray[MailAttachment],
    getBccRecipients: () => stdLib.SafeArray[java.lang.String],
    getCcRecipients: () => stdLib.SafeArray[java.lang.String],
    getRecipients: () => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): MailMessage = {
    val __obj = js.Dynamic.literal(Attachments = Attachments, BccRecipients = BccRecipients, Body = Body, CcRecipients = CcRecipients, Recipients = Recipients, ReplyToAddress = ReplyToAddress, SenderAddress = SenderAddress, SenderName = SenderName, Subject = Subject, acquire = js.Any.fromFunction0(acquire), addAttachment = js.Any.fromFunction1(addAttachment), addBccRecipient = js.Any.fromFunction1(addBccRecipient), addCcRecipient = js.Any.fromFunction1(addCcRecipient), addRecipient = js.Any.fromFunction1(addRecipient), create = js.Any.fromFunction4(create), createWithAttachment = js.Any.fromFunction5(createWithAttachment), getAttachments = js.Any.fromFunction0(getAttachments), getBccRecipients = js.Any.fromFunction0(getBccRecipients), getCcRecipients = js.Any.fromFunction0(getCcRecipients), getRecipients = js.Any.fromFunction0(getRecipients), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[MailMessage]
  }
}

