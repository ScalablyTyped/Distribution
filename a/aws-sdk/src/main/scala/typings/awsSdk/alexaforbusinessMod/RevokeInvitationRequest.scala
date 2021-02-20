package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeInvitationRequest extends StObject {
  
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
  implicit class RevokeInvitationRequestMutableBuilder[Self <: RevokeInvitationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnrollmentId(value: EnrollmentId): Self = StObject.set(x, "EnrollmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrollmentIdUndefined: Self = StObject.set(x, "EnrollmentId", js.undefined)
    
    @scala.inline
    def setUserArn(value: Arn): Self = StObject.set(x, "UserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserArnUndefined: Self = StObject.set(x, "UserArn", js.undefined)
  }
}
