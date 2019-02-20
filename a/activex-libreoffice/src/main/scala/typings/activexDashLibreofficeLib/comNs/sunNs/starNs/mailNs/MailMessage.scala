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

