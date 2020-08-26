package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLifecycleHooksType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The names of one or more lifecycle hooks. If you omit this parameter, all lifecycle hooks are described.
    */
  var LifecycleHookNames: js.UndefOr[typings.awsSdk.autoscalingMod.LifecycleHookNames] = js.native
}

object DescribeLifecycleHooksType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName): DescribeLifecycleHooksType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLifecycleHooksType]
  }
  @scala.inline
  implicit class DescribeLifecycleHooksTypeOps[Self <: DescribeLifecycleHooksType] (val x: Self) extends AnyVal {
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
    def setLifecycleHookNamesVarargs(value: AsciiStringMaxLen255*): Self = this.set("LifecycleHookNames", js.Array(value :_*))
    @scala.inline
    def setLifecycleHookNames(value: LifecycleHookNames): Self = this.set("LifecycleHookNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycleHookNames: Self = this.set("LifecycleHookNames", js.undefined)
  }
  
}

