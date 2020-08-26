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
    LifecycleHookName: AsciiStringMaxLen255
  ): CompleteLifecycleActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], LifecycleActionResult = LifecycleActionResult.asInstanceOf[js.Any], LifecycleHookName = LifecycleHookName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteLifecycleActionType]
  }
  @scala.inline
  implicit class CompleteLifecycleActionTypeOps[Self <: CompleteLifecycleActionType] (val x: Self) extends AnyVal {
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
    def setLifecycleActionResult(value: LifecycleActionResult): Self = this.set("LifecycleActionResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setLifecycleHookName(value: AsciiStringMaxLen255): Self = this.set("LifecycleHookName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceId(value: XmlStringMaxLen19): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setLifecycleActionToken(value: LifecycleActionToken): Self = this.set("LifecycleActionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycleActionToken: Self = this.set("LifecycleActionToken", js.undefined)
  }
  
}

