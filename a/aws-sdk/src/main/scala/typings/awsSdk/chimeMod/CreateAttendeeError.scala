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
  def apply(): CreateAttendeeError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAttendeeError]
  }
  @scala.inline
  implicit class CreateAttendeeErrorOps[Self <: CreateAttendeeError] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: String): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setExternalUserId(value: ExternalUserIdType): Self = this.set("ExternalUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalUserId: Self = this.set("ExternalUserId", js.undefined)
  }
  
}

