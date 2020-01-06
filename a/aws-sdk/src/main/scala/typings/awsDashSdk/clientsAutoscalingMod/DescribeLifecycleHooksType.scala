package typings.awsDashSdk.clientsAutoscalingMod

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
  var LifecycleHookNames: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.LifecycleHookNames] = js.native
}

object DescribeLifecycleHooksType {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, LifecycleHookNames: LifecycleHookNames = null): DescribeLifecycleHooksType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    if (LifecycleHookNames != null) __obj.updateDynamic("LifecycleHookNames")(LifecycleHookNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLifecycleHooksType]
  }
}

