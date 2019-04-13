package typings
package awsDashSdkLib.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyDetails extends js.Object {
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
    ResourceTypes: ResourceTypeValuesList = null,
    Schedules: ScheduleList = null,
    TargetTags: TargetTagList = null
  ): PolicyDetails = {
    val __obj = js.Dynamic.literal()
    if (ResourceTypes != null) __obj.updateDynamic("ResourceTypes")(ResourceTypes)
    if (Schedules != null) __obj.updateDynamic("Schedules")(Schedules)
    if (TargetTags != null) __obj.updateDynamic("TargetTags")(TargetTags)
    __obj.asInstanceOf[PolicyDetails]
  }
}

