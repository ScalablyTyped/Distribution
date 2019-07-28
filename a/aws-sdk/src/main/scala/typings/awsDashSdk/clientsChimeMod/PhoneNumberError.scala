package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneNumberError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[typings.awsDashSdk.clientsChimeMod.ErrorCode] = js.undefined
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * The phone number ID for which the action failed.
    */
  var PhoneNumberId: js.UndefOr[NonEmptyString] = js.undefined
}

object PhoneNumberError {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, ErrorMessage: String = null, PhoneNumberId: NonEmptyString = null): PhoneNumberError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (PhoneNumberId != null) __obj.updateDynamic("PhoneNumberId")(PhoneNumberId)
    __obj.asInstanceOf[PhoneNumberError]
  }
}

