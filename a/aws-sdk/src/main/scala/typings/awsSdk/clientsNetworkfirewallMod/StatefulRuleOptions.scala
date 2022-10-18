package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulRuleOptions extends StObject {
  
  /**
    * Indicates how to manage the order of the rule evaluation for the rule group. DEFAULT_ACTION_ORDER is the default behavior. Stateful rules are provided to the rule engine as Suricata compatible strings, and Suricata evaluates them based on certain settings. For more information, see Evaluation order for stateful rules in the Network Firewall Developer Guide. 
    */
  var RuleOrder: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.RuleOrder] = js.undefined
}
object StatefulRuleOptions {
  
  inline def apply(): StatefulRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulRuleOptions]
  }
  
  extension [Self <: StatefulRuleOptions](x: Self) {
    
    inline def setRuleOrder(value: RuleOrder): Self = StObject.set(x, "RuleOrder", value.asInstanceOf[js.Any])
    
    inline def setRuleOrderUndefined: Self = StObject.set(x, "RuleOrder", js.undefined)
  }
}
