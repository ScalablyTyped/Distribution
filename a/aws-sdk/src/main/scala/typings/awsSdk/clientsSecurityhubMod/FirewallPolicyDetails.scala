package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyDetails extends StObject {
  
  /**
    * The stateful rule groups that are used in the firewall policy.
    */
  var StatefulRuleGroupReferences: js.UndefOr[FirewallPolicyStatefulRuleGroupReferencesList] = js.undefined
  
  /**
    * The custom action definitions that are available to use in the firewall policy's StatelessDefaultActions setting.
    */
  var StatelessCustomActions: js.UndefOr[FirewallPolicyStatelessCustomActionsList] = js.undefined
  
  /**
    * The actions to take on a packet if it doesn't match any of the stateless rules in the policy. You must specify a standard action (aws:pass, aws:drop, aws:forward_to_sfe), and can optionally include a custom action from StatelessCustomActions. 
    */
  var StatelessDefaultActions: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The actions to take on a fragmented UDP packet if it doesn't match any of the stateless rules in the policy. You must specify a standard action (aws:pass, aws:drop, aws:forward_to_sfe), and can optionally include a custom action from StatelessCustomActions. 
    */
  var StatelessFragmentDefaultActions: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The stateless rule groups that are used in the firewall policy.
    */
  var StatelessRuleGroupReferences: js.UndefOr[FirewallPolicyStatelessRuleGroupReferencesList] = js.undefined
}
object FirewallPolicyDetails {
  
  inline def apply(): FirewallPolicyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallPolicyDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirewallPolicyDetails] (val x: Self) extends AnyVal {
    
    inline def setStatefulRuleGroupReferences(value: FirewallPolicyStatefulRuleGroupReferencesList): Self = StObject.set(x, "StatefulRuleGroupReferences", value.asInstanceOf[js.Any])
    
    inline def setStatefulRuleGroupReferencesUndefined: Self = StObject.set(x, "StatefulRuleGroupReferences", js.undefined)
    
    inline def setStatefulRuleGroupReferencesVarargs(value: FirewallPolicyStatefulRuleGroupReferencesDetails*): Self = StObject.set(x, "StatefulRuleGroupReferences", js.Array(value*))
    
    inline def setStatelessCustomActions(value: FirewallPolicyStatelessCustomActionsList): Self = StObject.set(x, "StatelessCustomActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessCustomActionsUndefined: Self = StObject.set(x, "StatelessCustomActions", js.undefined)
    
    inline def setStatelessCustomActionsVarargs(value: FirewallPolicyStatelessCustomActionsDetails*): Self = StObject.set(x, "StatelessCustomActions", js.Array(value*))
    
    inline def setStatelessDefaultActions(value: NonEmptyStringList): Self = StObject.set(x, "StatelessDefaultActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessDefaultActionsUndefined: Self = StObject.set(x, "StatelessDefaultActions", js.undefined)
    
    inline def setStatelessDefaultActionsVarargs(value: NonEmptyString*): Self = StObject.set(x, "StatelessDefaultActions", js.Array(value*))
    
    inline def setStatelessFragmentDefaultActions(value: NonEmptyStringList): Self = StObject.set(x, "StatelessFragmentDefaultActions", value.asInstanceOf[js.Any])
    
    inline def setStatelessFragmentDefaultActionsUndefined: Self = StObject.set(x, "StatelessFragmentDefaultActions", js.undefined)
    
    inline def setStatelessFragmentDefaultActionsVarargs(value: NonEmptyString*): Self = StObject.set(x, "StatelessFragmentDefaultActions", js.Array(value*))
    
    inline def setStatelessRuleGroupReferences(value: FirewallPolicyStatelessRuleGroupReferencesList): Self = StObject.set(x, "StatelessRuleGroupReferences", value.asInstanceOf[js.Any])
    
    inline def setStatelessRuleGroupReferencesUndefined: Self = StObject.set(x, "StatelessRuleGroupReferences", js.undefined)
    
    inline def setStatelessRuleGroupReferencesVarargs(value: FirewallPolicyStatelessRuleGroupReferencesDetails*): Self = StObject.set(x, "StatelessRuleGroupReferences", js.Array(value*))
  }
}
