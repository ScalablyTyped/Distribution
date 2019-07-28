package typings.activexDashLibreoffice.comNs.sunNs.starNs.mailNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SendFailedException will be thrown if a mail message could not be sent because the e-mail addresses of some recipients are invalid. E-mail addresses
  * have to conform to [RFC   822]{@link url="http://www.ietf.org/rfc/rfc822.txt"} .
  * @see com.sun.star.mail.XMailService
  * @since OOo 2.0
  */
trait SendMailMessageFailedException extends Exception {
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
    val __obj = js.Dynamic.literal(Context = Context, InvalidAddresses = InvalidAddresses, Message = Message, ValidSentAddresses = ValidSentAddresses, ValidUnsentAddresses = ValidUnsentAddresses)
  
    __obj.asInstanceOf[SendMailMessageFailedException]
  }
}

