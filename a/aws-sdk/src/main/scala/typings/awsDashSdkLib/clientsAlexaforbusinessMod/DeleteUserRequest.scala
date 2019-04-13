package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserRequest extends js.Object {
  /**
    * The ARN of the user's enrollment in the organization. Required.
    */
  var EnrollmentId: awsDashSdkLib.clientsAlexaforbusinessMod.EnrollmentId
  /**
    * The ARN of the user to delete in the organization. Required.
    */
  var UserArn: js.UndefOr[Arn] = js.undefined
}

object DeleteUserRequest {
  @scala.inline
  def apply(EnrollmentId: EnrollmentId, UserArn: Arn = null): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(EnrollmentId = EnrollmentId)
    if (UserArn != null) __obj.updateDynamic("UserArn")(UserArn)
    __obj.asInstanceOf[DeleteUserRequest]
  }
}

