package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordLifecycleActionHeartbeatType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.native
  /**
    * A token that uniquely identifies a specific lifecycle action associated with an instance. Amazon EC2 Auto Scaling sends this token to the notification target that you specified when you created the lifecycle hook.
    */
  var LifecycleActionToken: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.LifecycleActionToken] = js.native
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: AsciiStringMaxLen255 = js.native
}

object RecordLifecycleActionHeartbeatType {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    LifecycleHookName: AsciiStringMaxLen255,
    InstanceId: XmlStringMaxLen19 = null,
    LifecycleActionToken: LifecycleActionToken = null
  ): RecordLifecycleActionHeartbeatType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], LifecycleHookName = LifecycleHookName.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (LifecycleActionToken != null) __obj.updateDynamic("LifecycleActionToken")(LifecycleActionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordLifecycleActionHeartbeatType]
  }
}

