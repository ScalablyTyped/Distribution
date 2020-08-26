package typings.activexLibreoffice.com_.sun.star.mail

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
@js.native
trait SendMailMessageFailedException extends Exception {
  /** The addresses which are invalid because they do not conform to [RFC   822]{@link url="http://www.ietf.org/rfc/rfc822.txt"} . */
  var InvalidAddresses: SafeArray[String] = js.native
  /** The addresses to which the mail message was sent successfully. */
  var ValidSentAddresses: SafeArray[String] = js.native
  /** The addresses which are valid but to which the message was not sent. */
  var ValidUnsentAddresses: SafeArray[String] = js.native
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
  implicit class SendMailMessageFailedExceptionOps[Self <: SendMailMessageFailedException] (val x: Self) extends AnyVal {
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
    def setInvalidAddresses(value: SafeArray[String]): Self = this.set("InvalidAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidSentAddresses(value: SafeArray[String]): Self = this.set("ValidSentAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidUnsentAddresses(value: SafeArray[String]): Self = this.set("ValidUnsentAddresses", value.asInstanceOf[js.Any])
  }
  
}

