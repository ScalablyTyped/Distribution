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
  def apply(UserArn: Arn = null): SendInvitationRequest = {
    val __obj = js.Dynamic.literal()
    if (UserArn != null) __obj.updateDynamic("UserArn")(UserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendInvitationRequest]
  }
}

