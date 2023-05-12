package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGroupRuleUpdate extends StObject {
  
  /**
    * Information about the security group rule.
    */
  var SecurityGroupRule: js.UndefOr[SecurityGroupRuleRequest] = js.undefined
  
  /**
    * The ID of the security group rule.
    */
  var SecurityGroupRuleId: typings.awsSdk.clientsEc2Mod.SecurityGroupRuleId
}
object SecurityGroupRuleUpdate {
  
  inline def apply(SecurityGroupRuleId: SecurityGroupRuleId): SecurityGroupRuleUpdate = {
    val __obj = js.Dynamic.literal(SecurityGroupRuleId = SecurityGroupRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupRuleUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGroupRuleUpdate] (val x: Self) extends AnyVal {
    
    inline def setSecurityGroupRule(value: SecurityGroupRuleRequest): Self = StObject.set(x, "SecurityGroupRule", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRuleId(value: SecurityGroupRuleId): Self = StObject.set(x, "SecurityGroupRuleId", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRuleUndefined: Self = StObject.set(x, "SecurityGroupRule", js.undefined)
  }
}
