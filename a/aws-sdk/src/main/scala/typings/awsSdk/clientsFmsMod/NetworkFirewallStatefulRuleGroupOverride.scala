package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFirewallStatefulRuleGroupOverride extends StObject {
  
  /**
    * The action that changes the rule group from DROP to ALERT. This only applies to managed rule groups.
    */
  var Action: js.UndefOr[NetworkFirewallOverrideAction] = js.undefined
}
object NetworkFirewallStatefulRuleGroupOverride {
  
  inline def apply(): NetworkFirewallStatefulRuleGroupOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirewallStatefulRuleGroupOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkFirewallStatefulRuleGroupOverride] (val x: Self) extends AnyVal {
    
    inline def setAction(value: NetworkFirewallOverrideAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
  }
}
