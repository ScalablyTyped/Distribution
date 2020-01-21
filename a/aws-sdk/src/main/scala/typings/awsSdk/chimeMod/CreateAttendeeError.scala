package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAttendeeError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
    */
  var ExternalUserId: js.UndefOr[ExternalUserIdType] = js.native
}

object CreateAttendeeError {
  @scala.inline
  def apply(ErrorCode: String = null, ErrorMessage: String = null, ExternalUserId: ExternalUserIdType = null): CreateAttendeeError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (ExternalUserId != null) __obj.updateDynamic("ExternalUserId")(ExternalUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAttendeeError]
  }
}

