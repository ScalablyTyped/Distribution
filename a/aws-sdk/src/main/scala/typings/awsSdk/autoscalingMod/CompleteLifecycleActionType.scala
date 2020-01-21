package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteLifecycleActionType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.native
  /**
    * The action for the group to take. This parameter can be either CONTINUE or ABANDON.
    */
  var LifecycleActionResult: typings.awsSdk.autoscalingMod.LifecycleActionResult = js.native
  /**
    * A universally unique identifier (UUID) that identifies a specific lifecycle action associated with an instance. Amazon EC2 Auto Scaling sends this token to the notification target you specified when you created the lifecycle hook.
    */
  var LifecycleActionToken: js.UndefOr[typings.awsSdk.autoscalingMod.LifecycleActionToken] = js.native
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: AsciiStringMaxLen255 = js.native
}

object CompleteLifecycleActionType {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    LifecycleActionResult: LifecycleActionResult,
    LifecycleHookName: AsciiStringMaxLen255,
    InstanceId: XmlStringMaxLen19 = null,
    LifecycleActionToken: LifecycleActionToken = null
  ): CompleteLifecycleActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], LifecycleActionResult = LifecycleActionResult.asInstanceOf[js.Any], LifecycleHookName = LifecycleHookName.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (LifecycleActionToken != null) __obj.updateDynamic("LifecycleActionToken")(LifecycleActionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteLifecycleActionType]
  }
}

