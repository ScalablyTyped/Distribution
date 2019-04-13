package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeInvitationRequest extends js.Object {
  /**
    * The ARN of the enrollment invitation to revoke. Required.
    */
  var EnrollmentId: js.UndefOr[EnrollmentId] = js.undefined
  /**
    * The ARN of the user for whom to revoke an enrollment invitation. Required.
    */
  var UserArn: js.UndefOr[Arn] = js.undefined
}

object RevokeInvitationRequest {
  @scala.inline
  def apply(EnrollmentId: EnrollmentId = null, UserArn: Arn = null): RevokeInvitationRequest = {
    val __obj = js.Dynamic.literal()
    if (EnrollmentId != null) __obj.updateDynamic("EnrollmentId")(EnrollmentId)
    if (UserArn != null) __obj.updateDynamic("UserArn")(UserArn)
    __obj.asInstanceOf[RevokeInvitationRequest]
  }
}

