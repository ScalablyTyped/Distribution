package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulRuleGroupReference extends StObject {
  
  /**
    * The action that allows the policy owner to override the behavior of the rule group within a policy.
    */
  var Override: js.UndefOr[StatefulRuleGroupOverride] = js.undefined
  
  /**
    * An integer setting that indicates the order in which to run the stateful rule groups in a single FirewallPolicy. This setting only applies to firewall policies that specify the STRICT_ORDER rule order in the stateful engine options settings. Network Firewall evalutes each stateful rule group against a packet starting with the group that has the lowest priority setting. You must ensure that the priority settings are unique within each policy. You can change the priority settings of your rule groups at any time. To make it easier to insert rule groups later, number them so there's a wide range in between, for example use 100, 200, and so on. 
    */
  var Priority: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.Priority] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the stateful rule group.
    */
  var ResourceArn: typings.awsSdk.clientsNetworkfirewallMod.ResourceArn
}
object StatefulRuleGroupReference {
  
  inline def apply(ResourceArn: ResourceArn): StatefulRuleGroupReference = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulRuleGroupReference]
  }
  
  extension [Self <: StatefulRuleGroupReference](x: Self) {
    
    inline def setOverride(value: StatefulRuleGroupOverride): Self = StObject.set(x, "Override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "Override", js.undefined)
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
