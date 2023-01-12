package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFirewallRuleGroupResponse extends StObject {
  
  /**
    * A collection of rules used to filter DNS network traffic. 
    */
  var FirewallRuleGroup: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.FirewallRuleGroup] = js.undefined
}
object DeleteFirewallRuleGroupResponse {
  
  inline def apply(): DeleteFirewallRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFirewallRuleGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFirewallRuleGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setFirewallRuleGroup(value: FirewallRuleGroup): Self = StObject.set(x, "FirewallRuleGroup", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupUndefined: Self = StObject.set(x, "FirewallRuleGroup", js.undefined)
  }
}
