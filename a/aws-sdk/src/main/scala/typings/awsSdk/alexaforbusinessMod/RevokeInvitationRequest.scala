package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeInvitationRequest extends js.Object {
  /**
    * The ARN of the enrollment invitation to revoke. Required.
    */
  var EnrollmentId: js.UndefOr[typings.awsSdk.alexaforbusinessMod.EnrollmentId] = js.native
  /**
    * The ARN of the user for whom to revoke an enrollment invitation. Required.
    */
  var UserArn: js.UndefOr[Arn] = js.native
}

object RevokeInvitationRequest {
  @scala.inline
  def apply(EnrollmentId: EnrollmentId = null, UserArn: Arn = null): RevokeInvitationRequest = {
    val __obj = js.Dynamic.literal()
    if (EnrollmentId != null) __obj.updateDynamic("EnrollmentId")(EnrollmentId.asInstanceOf[js.Any])
    if (UserArn != null) __obj.updateDynamic("UserArn")(UserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeInvitationRequest]
  }
}

