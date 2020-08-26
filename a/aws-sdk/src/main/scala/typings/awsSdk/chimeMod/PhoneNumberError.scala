package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumberError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.chimeMod.ErrorCode] = js.native
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The phone number ID for which the action failed.
    */
  var PhoneNumberId: js.UndefOr[NonEmptyString] = js.native
}

object PhoneNumberError {
  @scala.inline
  def apply(): PhoneNumberError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberError]
  }
  @scala.inline
  implicit class PhoneNumberErrorOps[Self <: PhoneNumberError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setPhoneNumberId(value: NonEmptyString): Self = this.set("PhoneNumberId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumberId: Self = this.set("PhoneNumberId", js.undefined)
  }
  
}

