package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[typings.awsDashSdk.clientsChimeMod.ErrorCode] = js.native
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The member ID.
    */
  var MemberId: js.UndefOr[NonEmptyString] = js.native
}

object MemberError {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, ErrorMessage: String = null, MemberId: NonEmptyString = null): MemberError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (MemberId != null) __obj.updateDynamic("MemberId")(MemberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberError]
  }
}

