package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePoliciesType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The maximum number of items to be returned with each call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.MaxRecords] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  /**
    * The names of one or more policies. If you omit this parameter, all policies are described. If a group name is provided, the results are limited to that group. This list is limited to 50 items. If you specify an unknown policy name, it is ignored with no error.
    */
  var PolicyNames: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.PolicyNames] = js.undefined
  /**
    * One or more policy types. The valid values are SimpleScaling, StepScaling, and TargetTrackingScaling.
    */
  var PolicyTypes: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.PolicyTypes] = js.undefined
}

object DescribePoliciesType {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName = null,
    MaxRecords: Int | Double = null,
    NextToken: XmlString = null,
    PolicyNames: PolicyNames = null,
    PolicyTypes: PolicyTypes = null
  ): DescribePoliciesType = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingGroupName != null) __obj.updateDynamic("AutoScalingGroupName")(AutoScalingGroupName)
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PolicyNames != null) __obj.updateDynamic("PolicyNames")(PolicyNames)
    if (PolicyTypes != null) __obj.updateDynamic("PolicyTypes")(PolicyTypes)
    __obj.asInstanceOf[DescribePoliciesType]
  }
}

