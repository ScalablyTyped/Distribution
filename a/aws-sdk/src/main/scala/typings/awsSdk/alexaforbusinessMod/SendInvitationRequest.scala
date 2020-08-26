package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendInvitationRequest extends js.Object {
  /**
    * The ARN of the user to whom to send an invitation. Required.
    */
  var UserArn: js.UndefOr[Arn] = js.native
}

object SendInvitationRequest {
  @scala.inline
  def apply(): SendInvitationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendInvitationRequest]
  }
  @scala.inline
  implicit class SendInvitationRequestOps[Self <: SendInvitationRequest] (val x: Self) extends AnyVal {
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
    def setUserArn(value: Arn): Self = this.set("UserArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserArn: Self = this.set("UserArn", js.undefined)
  }
  
}

