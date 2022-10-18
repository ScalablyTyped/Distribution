package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifySecurityGroupRulesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the security group.
    */
  var GroupId: SecurityGroupId
  
  /**
    * Information about the security group properties to update.
    */
  var SecurityGroupRules: SecurityGroupRuleUpdateList
}
object ModifySecurityGroupRulesRequest {
  
  inline def apply(GroupId: SecurityGroupId, SecurityGroupRules: SecurityGroupRuleUpdateList): ModifySecurityGroupRulesRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], SecurityGroupRules = SecurityGroupRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySecurityGroupRulesRequest]
  }
  
  extension [Self <: ModifySecurityGroupRulesRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setGroupId(value: SecurityGroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRules(value: SecurityGroupRuleUpdateList): Self = StObject.set(x, "SecurityGroupRules", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRulesVarargs(value: SecurityGroupRuleUpdate*): Self = StObject.set(x, "SecurityGroupRules", js.Array(value*))
  }
}
