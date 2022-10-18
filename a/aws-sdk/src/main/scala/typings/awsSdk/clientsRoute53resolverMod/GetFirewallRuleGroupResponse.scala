package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFirewallRuleGroupResponse extends StObject {
  
  /**
    * A collection of rules used to filter DNS network traffic. 
    */
  var FirewallRuleGroup: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.FirewallRuleGroup] = js.undefined
}
object GetFirewallRuleGroupResponse {
  
  inline def apply(): GetFirewallRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFirewallRuleGroupResponse]
  }
  
  extension [Self <: GetFirewallRuleGroupResponse](x: Self) {
    
    inline def setFirewallRuleGroup(value: FirewallRuleGroup): Self = StObject.set(x, "FirewallRuleGroup", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupUndefined: Self = StObject.set(x, "FirewallRuleGroup", js.undefined)
  }
}
