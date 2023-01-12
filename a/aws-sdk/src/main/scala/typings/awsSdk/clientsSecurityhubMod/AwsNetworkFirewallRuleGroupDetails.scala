package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsNetworkFirewallRuleGroupDetails extends StObject {
  
  /**
    * The maximum number of operating resources that this rule group can use.
    */
  var Capacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * A description of the rule group.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Details about the rule group.
    */
  var RuleGroup: js.UndefOr[RuleGroupDetails] = js.undefined
  
  /**
    * The ARN of the rule group.
    */
  var RuleGroupArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the rule group.
    */
  var RuleGroupId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The descriptive name of the rule group.
    */
  var RuleGroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of rule group. A rule group can be stateful or stateless.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsNetworkFirewallRuleGroupDetails {
  
  inline def apply(): AwsNetworkFirewallRuleGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsNetworkFirewallRuleGroupDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsNetworkFirewallRuleGroupDetails] (val x: Self) extends AnyVal {
    
    inline def setCapacity(value: Integer): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setRuleGroup(value: RuleGroupDetails): Self = StObject.set(x, "RuleGroup", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupArn(value: NonEmptyString): Self = StObject.set(x, "RuleGroupArn", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupArnUndefined: Self = StObject.set(x, "RuleGroupArn", js.undefined)
    
    inline def setRuleGroupId(value: NonEmptyString): Self = StObject.set(x, "RuleGroupId", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupIdUndefined: Self = StObject.set(x, "RuleGroupId", js.undefined)
    
    inline def setRuleGroupName(value: NonEmptyString): Self = StObject.set(x, "RuleGroupName", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupNameUndefined: Self = StObject.set(x, "RuleGroupName", js.undefined)
    
    inline def setRuleGroupUndefined: Self = StObject.set(x, "RuleGroup", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
