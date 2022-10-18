package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachRolePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM policy you want to attach. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var PolicyArn: arnType
  
  /**
    * The name (friendly name, not ARN) of the role to attach the policy to. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var RoleName: roleNameType
}
object AttachRolePolicyRequest {
  
  inline def apply(PolicyArn: arnType, RoleName: roleNameType): AttachRolePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn.asInstanceOf[js.Any], RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachRolePolicyRequest]
  }
  
  extension [Self <: AttachRolePolicyRequest](x: Self) {
    
    inline def setPolicyArn(value: arnType): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    inline def setRoleName(value: roleNameType): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
  }
}
