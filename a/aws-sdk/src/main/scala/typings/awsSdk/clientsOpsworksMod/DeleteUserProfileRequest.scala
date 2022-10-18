package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserProfileRequest extends StObject {
  
  /**
    * The user's IAM ARN. This can also be a federated user's ARN.
    */
  var IamUserArn: String
}
object DeleteUserProfileRequest {
  
  inline def apply(IamUserArn: String): DeleteUserProfileRequest = {
    val __obj = js.Dynamic.literal(IamUserArn = IamUserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserProfileRequest]
  }
  
  extension [Self <: DeleteUserProfileRequest](x: Self) {
    
    inline def setIamUserArn(value: String): Self = StObject.set(x, "IamUserArn", value.asInstanceOf[js.Any])
  }
}
