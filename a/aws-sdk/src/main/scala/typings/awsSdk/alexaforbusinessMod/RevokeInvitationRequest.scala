package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): RevokeInvitationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeInvitationRequest]
  }
  
  @scala.inline
  implicit class RevokeInvitationRequestOps[Self <: RevokeInvitationRequest] (val x: Self) extends AnyVal {
    
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
    def deleteEnrollmentId: Self = this.set("EnrollmentId", js.undefined)
    
    @scala.inline
    def setUserArn(value: Arn): Self = this.set("UserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserArn: Self = this.set("UserArn", js.undefined)
  }
}
