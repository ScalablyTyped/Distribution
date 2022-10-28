package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulRuleGroup extends StObject {
  
  /**
    * The action that allows the policy owner to override the behavior of the rule group within a policy.
    */
  var Override: js.UndefOr[NetworkFirewallStatefulRuleGroupOverride] = js.undefined
  
  /**
    * An integer setting that indicates the order in which to run the stateful rule groups in a single Network Firewall firewall policy. This setting only applies to firewall policies that specify the STRICT_ORDER rule order in the stateful engine options settings.  Network Firewall evalutes each stateful rule group against a packet starting with the group that has the lowest priority setting. You must ensure that the priority settings are unique within each policy. For information about   You can change the priority settings of your rule groups at any time. To make it easier to insert rule groups later, number them so there's a wide range in between, for example use 100, 200, and so on. 
    */
  var Priority: js.UndefOr[PriorityNumber] = js.undefined
  
  /**
    * The resource ID of the rule group.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.clientsFmsMod.ResourceId] = js.undefined
  
  /**
    * The name of the rule group.
    */
  var RuleGroupName: js.UndefOr[NetworkFirewallResourceName] = js.undefined
}
object StatefulRuleGroup {
  
  inline def apply(): StatefulRuleGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulRuleGroup]
  }
  
  extension [Self <: StatefulRuleGroup](x: Self) {
    
    inline def setOverride(value: NetworkFirewallStatefulRuleGroupOverride): Self = StObject.set(x, "Override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "Override", js.undefined)
    
    inline def setPriority(value: PriorityNumber): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setRuleGroupName(value: NetworkFirewallResourceName): Self = StObject.set(x, "RuleGroupName", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupNameUndefined: Self = StObject.set(x, "RuleGroupName", js.undefined)
  }
}
