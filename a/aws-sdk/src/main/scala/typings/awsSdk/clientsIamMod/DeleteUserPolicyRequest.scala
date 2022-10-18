package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserPolicyRequest extends StObject {
  
  /**
    * The name identifying the policy document to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var PolicyName: policyNameType
  
  /**
    * The name (friendly name, not ARN) identifying the user that the policy is embedded in. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType
}
object DeleteUserPolicyRequest {
  
  inline def apply(PolicyName: policyNameType, UserName: existingUserNameType): DeleteUserPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserPolicyRequest]
  }
  
  extension [Self <: DeleteUserPolicyRequest](x: Self) {
    
    inline def setPolicyName(value: policyNameType): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
