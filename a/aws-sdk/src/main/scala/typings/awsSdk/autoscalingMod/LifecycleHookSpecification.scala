package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(LifecycleHookName: AsciiStringMaxLen255, LifecycleTransition: LifecycleTransition): LifecycleHookSpecification = {
    val __obj = js.Dynamic.literal(LifecycleHookName = LifecycleHookName.asInstanceOf[js.Any], LifecycleTransition = LifecycleTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleHookSpecification]
  }
  
  @scala.inline
  implicit class LifecycleHookSpecificationOps[Self <: LifecycleHookSpecification] (val x: Self) extends AnyVal {
    
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
    def setLifecycleHookName(value: AsciiStringMaxLen255): Self = this.set("LifecycleHookName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleTransition(value: LifecycleTransition): Self = this.set("LifecycleTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultResult(value: LifecycleActionResult): Self = this.set("DefaultResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultResult: Self = this.set("DefaultResult", js.undefined)
    
    @scala.inline
    def setHeartbeatTimeout(value: HeartbeatTimeout): Self = this.set("HeartbeatTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeatTimeout: Self = this.set("HeartbeatTimeout", js.undefined)
    
    @scala.inline
    def setNotificationMetadata(value: XmlStringMaxLen1023): Self = this.set("NotificationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationMetadata: Self = this.set("NotificationMetadata", js.undefined)
    
    @scala.inline
    def setNotificationTargetARN(value: NotificationTargetResourceName): Self = this.set("NotificationTargetARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationTargetARN: Self = this.set("NotificationTargetARN", js.undefined)
    
    @scala.inline
    def setRoleARN(value: ResourceName): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
  }
}
