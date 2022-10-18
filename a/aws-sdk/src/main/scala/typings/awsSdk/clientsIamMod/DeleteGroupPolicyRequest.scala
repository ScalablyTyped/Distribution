package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGroupPolicyRequest extends StObject {
  
  /**
    * The name (friendly name, not ARN) identifying the group that the policy is embedded in. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var GroupName: groupNameType
  
  /**
    * The name identifying the policy document to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var PolicyName: policyNameType
}
object DeleteGroupPolicyRequest {
  
  inline def apply(GroupName: groupNameType, PolicyName: policyNameType): DeleteGroupPolicyRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGroupPolicyRequest]
  }
  
  extension [Self <: DeleteGroupPolicyRequest](x: Self) {
    
    inline def setGroupName(value: groupNameType): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setPolicyName(value: policyNameType): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
  }
}
