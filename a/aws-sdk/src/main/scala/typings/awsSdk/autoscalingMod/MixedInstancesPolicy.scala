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
  def apply(): MixedInstancesPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixedInstancesPolicy]
  }
  @scala.inline
  implicit class MixedInstancesPolicyOps[Self <: MixedInstancesPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstancesDistribution(value: InstancesDistribution): Self = this.set("InstancesDistribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancesDistribution: Self = this.set("InstancesDistribution", js.undefined)
    @scala.inline
    def setLaunchTemplate(value: LaunchTemplate): Self = this.set("LaunchTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplate: Self = this.set("LaunchTemplate", js.undefined)
  }
  
}

