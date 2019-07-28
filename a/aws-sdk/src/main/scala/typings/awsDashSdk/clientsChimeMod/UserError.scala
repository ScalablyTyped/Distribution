package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[typings.awsDashSdk.clientsChimeMod.ErrorCode] = js.undefined
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * The user ID for which the action failed.
    */
  var UserId: js.UndefOr[NonEmptyString] = js.undefined
}

object UserError {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, ErrorMessage: String = null, UserId: NonEmptyString = null): UserError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (UserId != null) __obj.updateDynamic("UserId")(UserId)
    __obj.asInstanceOf[UserError]
  }
}

