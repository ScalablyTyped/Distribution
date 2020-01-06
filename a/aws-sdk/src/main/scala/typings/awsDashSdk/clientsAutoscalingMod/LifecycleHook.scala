package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleHook extends js.Object {
  /**
    * The name of the Auto Scaling group for the lifecycle hook.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.native
  /**
    * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The possible values are CONTINUE and ABANDON.
    */
  var DefaultResult: js.UndefOr[LifecycleActionResult] = js.native
  /**
    * The maximum time, in seconds, that an instance can remain in a Pending:Wait or Terminating:Wait state. The maximum is 172800 seconds (48 hours) or 100 times HeartbeatTimeout, whichever is smaller.
    */
  var GlobalTimeout: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.GlobalTimeout] = js.native
  /**
    * The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the DefaultResult parameter.
    */
  var HeartbeatTimeout: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.HeartbeatTimeout] = js.native
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: js.UndefOr[AsciiStringMaxLen255] = js.native
  /**
    * The state of the EC2 instance to which to attach the lifecycle hook. The following are possible values:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING  
    */
  var LifecycleTransition: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.LifecycleTransition] = js.native
  /**
    * Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the notification target.
    */
  var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.native
  /**
    * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the transition state for the lifecycle hook. The notification target can be either an SQS queue or an SNS topic.
    */
  var NotificationTargetARN: js.UndefOr[ResourceName] = js.native
  /**
    * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
    */
  var RoleARN: js.UndefOr[ResourceName] = js.native
}

object LifecycleHook {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName = null,
    DefaultResult: LifecycleActionResult = null,
    GlobalTimeout: Int | Double = null,
    HeartbeatTimeout: Int | Double = null,
    LifecycleHookName: AsciiStringMaxLen255 = null,
    LifecycleTransition: LifecycleTransition = null,
    NotificationMetadata: XmlStringMaxLen1023 = null,
    NotificationTargetARN: ResourceName = null,
    RoleARN: ResourceName = null
  ): LifecycleHook = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingGroupName != null) __obj.updateDynamic("AutoScalingGroupName")(AutoScalingGroupName.asInstanceOf[js.Any])
    if (DefaultResult != null) __obj.updateDynamic("DefaultResult")(DefaultResult.asInstanceOf[js.Any])
    if (GlobalTimeout != null) __obj.updateDynamic("GlobalTimeout")(GlobalTimeout.asInstanceOf[js.Any])
    if (HeartbeatTimeout != null) __obj.updateDynamic("HeartbeatTimeout")(HeartbeatTimeout.asInstanceOf[js.Any])
    if (LifecycleHookName != null) __obj.updateDynamic("LifecycleHookName")(LifecycleHookName.asInstanceOf[js.Any])
    if (LifecycleTransition != null) __obj.updateDynamic("LifecycleTransition")(LifecycleTransition.asInstanceOf[js.Any])
    if (NotificationMetadata != null) __obj.updateDynamic("NotificationMetadata")(NotificationMetadata.asInstanceOf[js.Any])
    if (NotificationTargetARN != null) __obj.updateDynamic("NotificationTargetARN")(NotificationTargetARN.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleHook]
  }
}

