package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFirewallRuleGroupRequest extends StObject {
  
  /**
    * The unique identifier of the firewall rule group. 
    */
  var FirewallRuleGroupId: ResourceId
}
object GetFirewallRuleGroupRequest {
  
  inline def apply(FirewallRuleGroupId: ResourceId): GetFirewallRuleGroupRequest = {
    val __obj = js.Dynamic.literal(FirewallRuleGroupId = FirewallRuleGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFirewallRuleGroupRequest]
  }
  
  extension [Self <: GetFirewallRuleGroupRequest](x: Self) {
    
    inline def setFirewallRuleGroupId(value: ResourceId): Self = StObject.set(x, "FirewallRuleGroupId", value.asInstanceOf[js.Any])
  }
}
