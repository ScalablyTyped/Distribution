package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserRequest extends StObject {
  
  /**
    * The ARN of the user's enrollment in the organization. Required.
    */
  var EnrollmentId: typings.awsSdk.alexaforbusinessMod.EnrollmentId
  
  /**
    * The ARN of the user to delete in the organization. Required.
    */
  var UserArn: js.UndefOr[Arn] = js.undefined
}
object DeleteUserRequest {
  
  inline def apply(EnrollmentId: EnrollmentId): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(EnrollmentId = EnrollmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserRequest]
  }
  
  extension [Self <: DeleteUserRequest](x: Self) {
    
    inline def setEnrollmentId(value: EnrollmentId): Self = StObject.set(x, "EnrollmentId", value.asInstanceOf[js.Any])
    
    inline def setUserArn(value: Arn): Self = StObject.set(x, "UserArn", value.asInstanceOf[js.Any])
    
    inline def setUserArnUndefined: Self = StObject.set(x, "UserArn", js.undefined)
  }
}
