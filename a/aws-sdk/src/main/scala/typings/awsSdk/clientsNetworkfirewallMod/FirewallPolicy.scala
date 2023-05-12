package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicy extends StObject {
  
  /**
    * Contains variables that you can use to override default Suricata settings in your firewall policy.
    */
  var PolicyVariables: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.PolicyVariables] = js.undefined
  
  /**
    * The default actions to take on a packet that doesn't match any stateful rules. The stateful default action is optional, and is only valid when using the strict rule order. Valid values of the stateful default action:   aws:drop_strict   aws:drop_established   aws:alert_strict   aws:alert_established   For more information, see Strict evaluation order in the Network Firewall Developer Guide. 
    */
  var StatefulDefaultActions: js.UndefOr[StatefulActions] = js.undefined
  
  /**
    * Additional options governing how Network Firewall handles stateful rules. The stateful rule groups that you use in your policy must have stateful rule options settings that are compatible with these settings.
    */
  var StatefulEngineOptions: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.StatefulEngineOptions] = js.undefined
  
  /**
    * References to the stateful rule groups that are used in the policy. These define the inspection criteria in stateful rules. 
    */
  var StatefulRuleGroupReferences: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.StatefulRuleGroupReferences] = js.undefined
  
  /**
    * The custom action definitions that are available for use in the firewall policy's StatelessDefaultActions setting. You name each custom action that you define, and then you can use it by name in your default actions specifications.
    */
  var StatelessCustomActions: js.UndefOr[CustomActions] = js.undefined
  
  /**
    * The actions to take on a packet if it doesn't match any of the stateless rules in the policy. If you want non-matching packets to be forwarded for stateful inspection, specify aws:forward_to_sfe.  You must specify one of the standard actions: aws:pass, aws:drop, or aws:forward_to_sfe. In addition, you can specify custom actions that are compatible with your standard section choice. For example, you could specify ["aws:pass"] or you could specify ["aws:pass", “customActionName”]. For information about compatibility, see the custom action descriptions under CustomAction.
    */
  var StatelessDefaultActions: StatelessActions
  
  /**
    * The actions to take on a fragmented UDP packet if it doesn't match any of the stateless rules in the policy. Network Firewall only manages UDP packet fragments and silently drops packet fragments for other protocols. If you want non-matching fragmented UDP packets to be forwarded for stateful inspection, specify aws:forward_to_sfe.  You must specify one of the standard actions: aws:pass, aws:drop, or aws:forward_to_sfe. In addition, you can specify custom actions that are compatible with your standard section choice. For example, you could specify ["aws:pass"] or you could specify ["aws:pass", “customActionName”]. For information about compatibility, see the custom action descriptions under CustomAction.
    */
  var StatelessFragmentDefaultActions: StatelessActions
  
  /**
    * References to the stateless rule groups that are used in the policy. These define the matching criteria in stateless rules. 
    */
  var StatelessRuleGroupReferences: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.StatelessRuleGroupReferences] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the TLS inspection configuration.
    */
  var TLSInspectionConfigurationArn: js.UndefOr[ResourceArn] = js.undefined
}
object FirewallPolicy {
  
  inline def apply(StatelessDefaultActions: StatelessActions, StatelessFragmentDefaultActions: StatelessActions): FirewallPolicy = {
    val __obj = js.Dynamic.literal(StatelessDefaultActions = StatelessDefaultActions.asInstanceOf[js.Any], StatelessFragmentDefaultActions = StatelessFragmentDefaultActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirewallPolicy] (val x: Self) extends AnyVal {
    
    inline def setPolicyVariables(value: PolicyVariables): Self = StObject.set(x, "PolicyVariables", value.asInstanceOf[js.Any])
    
    inline def setPolicyVariablesUndefined: Self = StObject.set(x, "PolicyVariables", js.undefined)
    
    inline def setStatefulDefaultActions(value: StatefulActions): Self = StObject.set(x, "StatefulDefaultActions", value.asInstanceOf[js.Any])
    
    inline def setStatefulDefaultActionsUndefined: Self = StObject.set(x, "StatefulDefaultActions", js.undefined)
    
    inline def setStatefulDefaultActionsVarargs(value: CollectionMemberString*): Self = StObject.set(x, "StatefulDefaultActions", js.Array(value*))
    
    inline def setStatefulEngineOptions(value: StatefulEngineOptions): Self = StObject.set(x, "StatefulEngineOptions", value.asInstanceOf[js.Any])
    
    inline def setStatefulEngineOptionsUndefined: Self = StObject.set(x, "StatefulEngineOptions", js.undefined)
    
    inline def setStatefulRuleGroupReferences(value: StatefulRuleGroupReferences): Self = StObject.set(x, "StatefulRuleGroupReferences", value.asInstanceOf[js.Any])
    
    inline def setStatefulRuleGroupReferencesUndefined: Self = StObject.set(x, "StatefulRuleGroupReferences", js.undefined)
    
    inline def setStatefulRuleGroupReferencesVarargs(value: StatefulRuleGroupReference*): Self = StObject.set(x, "StatefulRuleGroupReferences", js.Array(value*))
    
    inline def setStatelessCustomActions(value: CustomActions): Self = StObject.set(x, "StatelessCustomActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessCustomActionsUndefined: Self = StObject.set(x, "StatelessCustomActions", js.undefined)
    
    inline def setStatelessCustomActionsVarargs(value: CustomAction*): Self = StObject.set(x, "StatelessCustomActions", js.Array(value*))
    
    inline def setStatelessDefaultActions(value: StatelessActions): Self = StObject.set(x, "StatelessDefaultActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessDefaultActionsVarargs(value: CollectionMemberString*): Self = StObject.set(x, "StatelessDefaultActions", js.Array(value*))
    
    inline def setStatelessFragmentDefaultActions(value: StatelessActions): Self = StObject.set(x, "StatelessFragmentDefaultActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessFragmentDefaultActionsVarargs(value: CollectionMemberString*): Self = StObject.set(x, "StatelessFragmentDefaultActions", js.Array(value*))
    
    inline def setStatelessRuleGroupReferences(value: StatelessRuleGroupReferences): Self = StObject.set(x, "StatelessRuleGroupReferences", value.asInstanceOf[js.Any])
    
    inline def setStatelessRuleGroupReferencesUndefined: Self = StObject.set(x, "StatelessRuleGroupReferences", js.undefined)
    
    inline def setStatelessRuleGroupReferencesVarargs(value: StatelessRuleGroupReference*): Self = StObject.set(x, "StatelessRuleGroupReferences", js.Array(value*))
    
    inline def setTLSInspectionConfigurationArn(value: ResourceArn): Self = StObject.set(x, "TLSInspectionConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setTLSInspectionConfigurationArnUndefined: Self = StObject.set(x, "TLSInspectionConfigurationArn", js.undefined)
  }
}
