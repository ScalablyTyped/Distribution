package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFirewallRuleResponse extends StObject {
  
  /**
    * The firewall rule that you just updated. 
    */
  var FirewallRule: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.FirewallRule] = js.undefined
}
object UpdateFirewallRuleResponse {
  
  inline def apply(): UpdateFirewallRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFirewallRuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFirewallRuleResponse] (val x: Self) extends AnyVal {
    
    inline def setFirewallRule(value: FirewallRule): Self = StObject.set(x, "FirewallRule", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleUndefined: Self = StObject.set(x, "FirewallRule", js.undefined)
  }
}
