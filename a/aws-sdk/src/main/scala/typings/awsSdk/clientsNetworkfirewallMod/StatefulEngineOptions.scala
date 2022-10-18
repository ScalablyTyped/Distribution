package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulEngineOptions extends StObject {
  
  /**
    * Indicates how to manage the order of stateful rule evaluation for the policy. DEFAULT_ACTION_ORDER is the default behavior. Stateful rules are provided to the rule engine as Suricata compatible strings, and Suricata evaluates them based on certain settings. For more information, see Evaluation order for stateful rules in the Network Firewall Developer Guide. 
    */
  var RuleOrder: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.RuleOrder] = js.undefined
  
  /**
    * Configures how Network Firewall processes traffic when a network connection breaks midstream. Network connections can break due to disruptions in external networks or within the firewall itself.    DROP - Network Firewall fails closed and drops all subsequent traffic going to the firewall. This is the default behavior.    CONTINUE - Network Firewall continues to apply rules to the subsequent traffic without context from traffic before the break. This impacts the behavior of rules that depend on this context. For example, if you have a stateful rule to drop http traffic, Network Firewall won't match the traffic for this rule because the service won't have the context from session initialization defining the application layer protocol as HTTP. However, this behavior is rule dependent—a TCP-layer rule using a flow:stateless rule would still match, as would the aws:drop_strict default action.  
    */
  var StreamExceptionPolicy: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.StreamExceptionPolicy] = js.undefined
}
object StatefulEngineOptions {
  
  inline def apply(): StatefulEngineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulEngineOptions]
  }
  
  extension [Self <: StatefulEngineOptions](x: Self) {
    
    inline def setRuleOrder(value: RuleOrder): Self = StObject.set(x, "RuleOrder", value.asInstanceOf[js.Any])
    
    inline def setRuleOrderUndefined: Self = StObject.set(x, "RuleOrder", js.undefined)
    
    inline def setStreamExceptionPolicy(value: StreamExceptionPolicy): Self = StObject.set(x, "StreamExceptionPolicy", value.asInstanceOf[js.Any])
    
    inline def setStreamExceptionPolicyUndefined: Self = StObject.set(x, "StreamExceptionPolicy", js.undefined)
  }
}
