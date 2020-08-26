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
  def apply(EnrollmentId: EnrollmentId): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(EnrollmentId = EnrollmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserRequest]
  }
  @scala.inline
  implicit class DeleteUserRequestOps[Self <: DeleteUserRequest] (val x: Self) extends AnyVal {
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
    def setEnrollmentId(value: EnrollmentId): Self = this.set("EnrollmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserArn(value: Arn): Self = this.set("UserArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserArn: Self = this.set("UserArn", js.undefined)
  }
  
}

