package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleDefinition extends StObject {
  
  /**
    * The actions to take on a packet that matches one of the stateless rule definition's match attributes. You must specify a standard action and you can add custom actions.   Network Firewall only forwards a packet for stateful rule inspection if you specify aws:forward_to_sfe for a rule that the packet matches, or if the packet doesn't match any stateless rule and you specify aws:forward_to_sfe for the StatelessDefaultActions setting for the FirewallPolicy.  For every rule, you must specify exactly one of the following standard actions.     aws:pass - Discontinues all inspection of the packet and permits it to go to its intended destination.    aws:drop - Discontinues all inspection of the packet and blocks it from going to its intended destination.    aws:forward_to_sfe - Discontinues stateless inspection of the packet and forwards it to the stateful rule engine for inspection.    Additionally, you can specify a custom action. To do this, you define a custom action by name and type, then provide the name you've assigned to the action in this Actions setting. For information about the options, see CustomAction.  To provide more than one action in this setting, separate the settings with a comma. For example, if you have a custom PublishMetrics action that you've named MyMetricsAction, then you could specify the standard action aws:pass and the custom action with [“aws:pass”, “MyMetricsAction”]. 
    */
  var Actions: StatelessActions
  
  /**
    * Criteria for Network Firewall to use to inspect an individual packet in stateless rule inspection. Each match attributes set can include one or more items such as IP address, CIDR range, port number, protocol, and TCP flags. 
    */
  var MatchAttributes: typings.awsSdk.clientsNetworkfirewallMod.MatchAttributes
}
object RuleDefinition {
  
  inline def apply(Actions: StatelessActions, MatchAttributes: MatchAttributes): RuleDefinition = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], MatchAttributes = MatchAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleDefinition]
  }
  
  extension [Self <: RuleDefinition](x: Self) {
    
    inline def setActions(value: StatelessActions): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: CollectionMemberString*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setMatchAttributes(value: MatchAttributes): Self = StObject.set(x, "MatchAttributes", value.asInstanceOf[js.Any])
  }
}
