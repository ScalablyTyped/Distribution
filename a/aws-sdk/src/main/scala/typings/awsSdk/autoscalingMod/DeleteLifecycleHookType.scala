package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLifecycleHookType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: AsciiStringMaxLen255 = js.native
}

object DeleteLifecycleHookType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, LifecycleHookName: AsciiStringMaxLen255): DeleteLifecycleHookType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], LifecycleHookName = LifecycleHookName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLifecycleHookType]
  }
  @scala.inline
  implicit class DeleteLifecycleHookTypeOps[Self <: DeleteLifecycleHookType] (val x: Self) extends AnyVal {
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
    def setAutoScalingGroupName(value: ResourceName): Self = this.set("AutoScalingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLifecycleHookName(value: AsciiStringMaxLen255): Self = this.set("LifecycleHookName", value.asInstanceOf[js.Any])
  }
  
}

