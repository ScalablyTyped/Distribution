package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteLifecycleActionType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined
  /**
    * The action for the group to take. This parameter can be either CONTINUE or ABANDON.
    */
  var LifecycleActionResult: awsDashSdkLib.clientsAutoscalingMod.LifecycleActionResult
  /**
    * A universally unique identifier (UUID) that identifies a specific lifecycle action associated with an instance. Amazon EC2 Auto Scaling sends this token to the notification target you specified when you created the lifecycle hook.
    */
  var LifecycleActionToken: js.UndefOr[LifecycleActionToken] = js.undefined
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: AsciiStringMaxLen255
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
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName, LifecycleActionResult = LifecycleActionResult, LifecycleHookName = LifecycleHookName)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (LifecycleActionToken != null) __obj.updateDynamic("LifecycleActionToken")(LifecycleActionToken)
    __obj.asInstanceOf[CompleteLifecycleActionType]
  }
}

