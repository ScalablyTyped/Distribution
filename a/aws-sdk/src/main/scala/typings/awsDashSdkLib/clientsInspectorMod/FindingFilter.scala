package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindingFilter extends js.Object {
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
  @scala.inline
  def apply(
    agentIds: AgentIdList = null,
    attributes: AttributeList = null,
    autoScalingGroups: AutoScalingGroupList = null,
    creationTimeRange: TimestampRange = null,
    ruleNames: RuleNameList = null,
    rulesPackageArns: FilterRulesPackageArnList = null,
    severities: SeverityList = null,
    userAttributes: AttributeList = null
  ): FindingFilter = {
    val __obj = js.Dynamic.literal()
    if (agentIds != null) __obj.updateDynamic("agentIds")(agentIds)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (autoScalingGroups != null) __obj.updateDynamic("autoScalingGroups")(autoScalingGroups)
    if (creationTimeRange != null) __obj.updateDynamic("creationTimeRange")(creationTimeRange)
    if (ruleNames != null) __obj.updateDynamic("ruleNames")(ruleNames)
    if (rulesPackageArns != null) __obj.updateDynamic("rulesPackageArns")(rulesPackageArns)
    if (severities != null) __obj.updateDynamic("severities")(severities)
    if (userAttributes != null) __obj.updateDynamic("userAttributes")(userAttributes)
    __obj.asInstanceOf[FindingFilter]
  }
}

