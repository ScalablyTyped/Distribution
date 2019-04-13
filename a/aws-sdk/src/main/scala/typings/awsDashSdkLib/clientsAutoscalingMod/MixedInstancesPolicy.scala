package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MixedInstancesPolicy extends js.Object {
  /**
    * The instances distribution to use.  If you leave this parameter unspecified when creating the group, the default values are used.
    */
  var InstancesDistribution: js.UndefOr[InstancesDistribution] = js.undefined
  /**
    * The launch template and overrides. This parameter is required when creating an Auto Scaling group with a mixed instances policy, but is not required when updating the group.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplate] = js.undefined
}

object MixedInstancesPolicy {
  @scala.inline
  def apply(InstancesDistribution: InstancesDistribution = null, LaunchTemplate: LaunchTemplate = null): MixedInstancesPolicy = {
    val __obj = js.Dynamic.literal()
    if (InstancesDistribution != null) __obj.updateDynamic("InstancesDistribution")(InstancesDistribution)
    if (LaunchTemplate != null) __obj.updateDynamic("LaunchTemplate")(LaunchTemplate)
    __obj.asInstanceOf[MixedInstancesPolicy]
  }
}

