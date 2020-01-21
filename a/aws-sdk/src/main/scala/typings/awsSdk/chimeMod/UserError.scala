package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.chimeMod.ErrorCode] = js.native
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The user ID for which the action failed.
    */
  var UserId: js.UndefOr[NonEmptyString] = js.native
}

object UserError {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, ErrorMessage: String = null, UserId: NonEmptyString = null): UserError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserError]
  }
}

