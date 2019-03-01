package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SendFailedException will be thrown if a mail message could not be sent because the e-mail addresses of some recipients are invalid. E-mail addresses
  * have to conform to [RFC   822]{@link url="http://www.ietf.org/rfc/rfc822.txt"} .
  * @see com.sun.star.mail.XMailService
  * @since OOo 2.0
  */
trait SendMailMessageFailedException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The addresses which are invalid because they do not conform to [RFC   822]{@link url="http://www.ietf.org/rfc/rfc822.txt"} . */
  var InvalidAddresses: activexDashInteropLib.SafeArray[java.lang.String]
  /** The addresses to which the mail message was sent successfully. */
  var ValidSentAddresses: activexDashInteropLib.SafeArray[java.lang.String]
  /** The addresses which are valid but to which the message was not sent. */
  var ValidUnsentAddresses: activexDashInteropLib.SafeArray[java.lang.String]
}

object SendMailMessageFailedException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    InvalidAddresses: activexDashInteropLib.SafeArray[java.lang.String],
    Message: java.lang.String,
    ValidSentAddresses: activexDashInteropLib.SafeArray[java.lang.String],
    ValidUnsentAddresses: activexDashInteropLib.SafeArray[java.lang.String]
  ): SendMailMessageFailedException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("InvalidAddresses")(InvalidAddresses)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("ValidSentAddresses")(ValidSentAddresses)
    __obj.updateDynamic("ValidUnsentAddresses")(ValidUnsentAddresses)
    __obj.asInstanceOf[SendMailMessageFailedException]
  }
}

