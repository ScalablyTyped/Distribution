package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindingFilter extends js.Object {
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the agentId property of the Finding data type.
    */
  var agentIds: js.UndefOr[AgentIdList] = js.native
  /**
    * For a record to match a filter, the list of values that are specified for this data type property must be contained in the list of values of the attributes property of the Finding data type.
    */
  var attributes: js.UndefOr[AttributeList] = js.native
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the autoScalingGroup property of the Finding data type.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.native
  /**
    * The time range during which the finding is generated.
    */
  var creationTimeRange: js.UndefOr[TimestampRange] = js.native
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the ruleName property of the Finding data type.
    */
  var ruleNames: js.UndefOr[RuleNameList] = js.native
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the rulesPackageArn property of the Finding data type.
    */
  var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.native
  /**
    * For a record to match a filter, one of the values that is specified for this data type property must be the exact match of the value of the severity property of the Finding data type.
    */
  var severities: js.UndefOr[SeverityList] = js.native
  /**
    * For a record to match a filter, the value that is specified for this data type property must be contained in the list of values of the userAttributes property of the Finding data type.
    */
  var userAttributes: js.UndefOr[AttributeList] = js.native
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
    if (agentIds != null) __obj.updateDynamic("agentIds")(agentIds.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (autoScalingGroups != null) __obj.updateDynamic("autoScalingGroups")(autoScalingGroups.asInstanceOf[js.Any])
    if (creationTimeRange != null) __obj.updateDynamic("creationTimeRange")(creationTimeRange.asInstanceOf[js.Any])
    if (ruleNames != null) __obj.updateDynamic("ruleNames")(ruleNames.asInstanceOf[js.Any])
    if (rulesPackageArns != null) __obj.updateDynamic("rulesPackageArns")(rulesPackageArns.asInstanceOf[js.Any])
    if (severities != null) __obj.updateDynamic("severities")(severities.asInstanceOf[js.Any])
    if (userAttributes != null) __obj.updateDynamic("userAttributes")(userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindingFilter]
  }
}

