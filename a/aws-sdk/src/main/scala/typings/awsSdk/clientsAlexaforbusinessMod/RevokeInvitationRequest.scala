package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeInvitationRequest extends StObject {
  
  /**
    * The ARN of the enrollment invitation to revoke. Required.
    */
  var EnrollmentId: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.EnrollmentId] = js.undefined
  
  /**
    * The ARN of the user for whom to revoke an enrollment invitation. Required.
    */
  var UserArn: js.UndefOr[Arn] = js.undefined
}
object RevokeInvitationRequest {
  
  inline def apply(): RevokeInvitationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeInvitationRequest]
  }
  
  extension [Self <: RevokeInvitationRequest](x: Self) {
    
    inline def setEnrollmentId(value: EnrollmentId): Self = StObject.set(x, "EnrollmentId", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentIdUndefined: Self = StObject.set(x, "EnrollmentId", js.undefined)
    
    inline def setUserArn(value: Arn): Self = StObject.set(x, "UserArn", value.asInstanceOf[js.Any])
    
    inline def setUserArnUndefined: Self = StObject.set(x, "UserArn", js.undefined)
  }
}
