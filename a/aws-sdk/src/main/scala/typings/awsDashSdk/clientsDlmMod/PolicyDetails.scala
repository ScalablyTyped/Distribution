package typings.awsDashSdk.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyDetails extends js.Object {
  /**
    * A set of optional parameters that can be provided by the policy. 
    */
  var Parameters: js.UndefOr[typings.awsDashSdk.clientsDlmMod.Parameters] = js.undefined
  /**
    * This field determines the valid target resource types and actions a policy can manage. This field defaults to EBS_SNAPSHOT_MANAGEMENT if not present.
    */
  var PolicyType: js.UndefOr[PolicyTypeValues] = js.undefined
  /**
    * The resource type.
    */
  var ResourceTypes: js.UndefOr[ResourceTypeValuesList] = js.undefined
  /**
    * The schedule of policy-defined actions.
    */
  var Schedules: js.UndefOr[ScheduleList] = js.undefined
  /**
    * The single tag that identifies targeted resources for this policy.
    */
  var TargetTags: js.UndefOr[TargetTagList] = js.undefined
}

object PolicyDetails {
  @scala.inline
  def apply(
    Parameters: Parameters = null,
    PolicyType: PolicyTypeValues = null,
    ResourceTypes: ResourceTypeValuesList = null,
    Schedules: ScheduleList = null,
    TargetTags: TargetTagList = null
  ): PolicyDetails = {
    val __obj = js.Dynamic.literal()
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (PolicyType != null) __obj.updateDynamic("PolicyType")(PolicyType.asInstanceOf[js.Any])
    if (ResourceTypes != null) __obj.updateDynamic("ResourceTypes")(ResourceTypes)
    if (Schedules != null) __obj.updateDynamic("Schedules")(Schedules)
    if (TargetTags != null) __obj.updateDynamic("TargetTags")(TargetTags)
    __obj.asInstanceOf[PolicyDetails]
  }
}

