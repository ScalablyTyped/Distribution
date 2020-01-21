package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserRequest extends js.Object {
  /**
    * The ARN of the user's enrollment in the organization. Required.
    */
  var EnrollmentId: typings.awsSdk.alexaforbusinessMod.EnrollmentId = js.native
  /**
    * The ARN of the user to delete in the organization. Required.
    */
  var UserArn: js.UndefOr[Arn] = js.native
}

object DeleteUserRequest {
  @scala.inline
  def apply(EnrollmentId: EnrollmentId, UserArn: Arn = null): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(EnrollmentId = EnrollmentId.asInstanceOf[js.Any])
    if (UserArn != null) __obj.updateDynamic("UserArn")(UserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserRequest]
  }
}

