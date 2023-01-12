package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFirewallRuleGroupResponse extends StObject {
  
  /**
    * A collection of rules used to filter DNS network traffic. 
    */
  var FirewallRuleGroup: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.FirewallRuleGroup] = js.undefined
}
object CreateFirewallRuleGroupResponse {
  
  inline def apply(): CreateFirewallRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFirewallRuleGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFirewallRuleGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setFirewallRuleGroup(value: FirewallRuleGroup): Self = StObject.set(x, "FirewallRuleGroup", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupUndefined: Self = StObject.set(x, "FirewallRuleGroup", js.undefined)
  }
}
