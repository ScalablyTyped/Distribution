package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MixedInstancesPolicy extends js.Object {
  /**
    * The instances distribution to use. If you leave this parameter unspecified, the value for each parameter in InstancesDistribution uses a default value.
    */
  var InstancesDistribution: js.UndefOr[typings.awsSdk.autoscalingMod.InstancesDistribution] = js.native
  /**
    * The launch template and instance types (overrides). Required when creating a mixed instances policy.
    */
  var LaunchTemplate: js.UndefOr[typings.awsSdk.autoscalingMod.LaunchTemplate] = js.native
}

object MixedInstancesPolicy {
  @scala.inline
  def apply(InstancesDistribution: InstancesDistribution = null, LaunchTemplate: LaunchTemplate = null): MixedInstancesPolicy = {
    val __obj = js.Dynamic.literal()
    if (InstancesDistribution != null) __obj.updateDynamic("InstancesDistribution")(InstancesDistribution.asInstanceOf[js.Any])
    if (LaunchTemplate != null) __obj.updateDynamic("LaunchTemplate")(LaunchTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixedInstancesPolicy]
  }
}

