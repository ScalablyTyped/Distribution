package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingFilter extends StObject {
  
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the agentId property of the Finding data type.
    */
  var agentIds: js.UndefOr[AgentIdList] = js.undefined
  
  /**
    * For a record to match a filter, the list of values that are specified for this data type property must be contained in the list of values of the attributes property of the Finding data type.
    */
  var attributes: js.UndefOr[AttributeList] = js.undefined
  
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the autoScalingGroup property of the Finding data type.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined
  
  /**
    * The time range during which the finding is generated.
    */
  var creationTimeRange: js.UndefOr[TimestampRange] = js.undefined
  
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the ruleName property of the Finding data type.
    */
  var ruleNames: js.UndefOr[RuleNameList] = js.undefined
  
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the rulesPackageArn property of the Finding data type.
    */
  var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.undefined
  
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the severity property of the Finding data type.
    */
  var severities: js.UndefOr[SeverityList] = js.undefined
  
  /**
    * For a record to match a filter, the value that is specified for this data type property must be contained in the list of values of the userAttributes property of the Finding data type.
    */
  var userAttributes: js.UndefOr[AttributeList] = js.undefined
}
object FindingFilter {
  
  inline def apply(): FindingFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FindingFilter] (val x: Self) extends AnyVal {
    
    inline def setAgentIds(value: AgentIdList): Self = StObject.set(x, "agentIds", value.asInstanceOf[js.Any])
    
    inline def setAgentIdsUndefined: Self = StObject.set(x, "agentIds", js.undefined)
    
    inline def setAgentIdsVarargs(value: AgentId*): Self = StObject.set(x, "agentIds", js.Array(value*))
    
    inline def setAttributes(value: AttributeList): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setAutoScalingGroups(value: AutoScalingGroupList): Self = StObject.set(x, "autoScalingGroups", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupsUndefined: Self = StObject.set(x, "autoScalingGroups", js.undefined)
    
    inline def setAutoScalingGroupsVarargs(value: AutoScalingGroup*): Self = StObject.set(x, "autoScalingGroups", js.Array(value*))
    
    inline def setCreationTimeRange(value: TimestampRange): Self = StObject.set(x, "creationTimeRange", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeRangeUndefined: Self = StObject.set(x, "creationTimeRange", js.undefined)
    
    inline def setRuleNames(value: RuleNameList): Self = StObject.set(x, "ruleNames", value.asInstanceOf[js.Any])
    
    inline def setRuleNamesUndefined: Self = StObject.set(x, "ruleNames", js.undefined)
    
    inline def setRuleNamesVarargs(value: RuleName*): Self = StObject.set(x, "ruleNames", js.Array(value*))
    
    inline def setRulesPackageArns(value: FilterRulesPackageArnList): Self = StObject.set(x, "rulesPackageArns", value.asInstanceOf[js.Any])
    
    inline def setRulesPackageArnsUndefined: Self = StObject.set(x, "rulesPackageArns", js.undefined)
    
    inline def setRulesPackageArnsVarargs(value: Arn*): Self = StObject.set(x, "rulesPackageArns", js.Array(value*))
    
    inline def setSeverities(value: SeverityList): Self = StObject.set(x, "severities", value.asInstanceOf[js.Any])
    
    inline def setSeveritiesUndefined: Self = StObject.set(x, "severities", js.undefined)
    
    inline def setSeveritiesVarargs(value: Severity*): Self = StObject.set(x, "severities", js.Array(value*))
    
    inline def setUserAttributes(value: AttributeList): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    inline def setUserAttributesUndefined: Self = StObject.set(x, "userAttributes", js.undefined)
    
    inline def setUserAttributesVarargs(value: Attribute*): Self = StObject.set(x, "userAttributes", js.Array(value*))
  }
}
