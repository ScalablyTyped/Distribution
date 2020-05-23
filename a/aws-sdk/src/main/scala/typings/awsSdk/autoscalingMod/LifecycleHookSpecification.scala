package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleHookSpecification extends js.Object {
  /**
    * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The valid values are CONTINUE and ABANDON. The default value is ABANDON.
    */
  var DefaultResult: js.UndefOr[LifecycleActionResult] = js.native
  /**
    * The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the DefaultResult parameter. You can prevent the lifecycle hook from timing out by calling RecordLifecycleActionHeartbeat.
    */
  var HeartbeatTimeout: js.UndefOr[typings.awsSdk.autoscalingMod.HeartbeatTimeout] = js.native
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: AsciiStringMaxLen255 = js.native
  /**
    * The state of the EC2 instance to which you want to attach the lifecycle hook. The valid values are:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING  
    */
  var LifecycleTransition: typings.awsSdk.autoscalingMod.LifecycleTransition = js.native
  /**
    * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a message to the notification target.
    */
  var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.native
  /**
    * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the transition state for the lifecycle hook. The notification target can be either an SQS queue or an SNS topic.
    */
  var NotificationTargetARN: js.UndefOr[NotificationTargetResourceName] = js.native
  /**
    * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target, for example, an Amazon SNS topic or an Amazon SQS queue.
    */
  var RoleARN: js.UndefOr[ResourceName] = js.native
}

object LifecycleHookSpecification {
  @scala.inline
  def apply(
    LifecycleHookName: AsciiStringMaxLen255,
    LifecycleTransition: LifecycleTransition,
    DefaultResult: LifecycleActionResult = null,
    HeartbeatTimeout: js.UndefOr[HeartbeatTimeout] = js.undefined,
    NotificationMetadata: XmlStringMaxLen1023 = null,
    NotificationTargetARN: NotificationTargetResourceName = null,
    RoleARN: ResourceName = null
  ): LifecycleHookSpecification = {
    val __obj = js.Dynamic.literal(LifecycleHookName = LifecycleHookName.asInstanceOf[js.Any], LifecycleTransition = LifecycleTransition.asInstanceOf[js.Any])
    if (DefaultResult != null) __obj.updateDynamic("DefaultResult")(DefaultResult.asInstanceOf[js.Any])
    if (!js.isUndefined(HeartbeatTimeout)) __obj.updateDynamic("HeartbeatTimeout")(HeartbeatTimeout.get.asInstanceOf[js.Any])
    if (NotificationMetadata != null) __obj.updateDynamic("NotificationMetadata")(NotificationMetadata.asInstanceOf[js.Any])
    if (NotificationTargetARN != null) __obj.updateDynamic("NotificationTargetARN")(NotificationTargetARN.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleHookSpecification]
  }
}

