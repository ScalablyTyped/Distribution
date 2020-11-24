package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var GlobalTimeout: js.UndefOr[typings.awsSdk.autoscalingMod.GlobalTimeout] = js.native
  
  /**
    * The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the DefaultResult parameter.
    */
  var HeartbeatTimeout: js.UndefOr[typings.awsSdk.autoscalingMod.HeartbeatTimeout] = js.native
  
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: js.UndefOr[AsciiStringMaxLen255] = js.native
  
  /**
    * The state of the EC2 instance to which to attach the lifecycle hook. The following are possible values:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING  
    */
  var LifecycleTransition: js.UndefOr[typings.awsSdk.autoscalingMod.LifecycleTransition] = js.native
  
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
  def apply(): LifecycleHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleHook]
  }
  
  @scala.inline
  implicit class LifecycleHookOps[Self <: LifecycleHook] (val x: Self) extends AnyVal {
    
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
    def deleteAutoScalingGroupName: Self = this.set("AutoScalingGroupName", js.undefined)
    
    @scala.inline
    def setDefaultResult(value: LifecycleActionResult): Self = this.set("DefaultResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultResult: Self = this.set("DefaultResult", js.undefined)
    
    @scala.inline
    def setGlobalTimeout(value: GlobalTimeout): Self = this.set("GlobalTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalTimeout: Self = this.set("GlobalTimeout", js.undefined)
    
    @scala.inline
    def setHeartbeatTimeout(value: HeartbeatTimeout): Self = this.set("HeartbeatTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeatTimeout: Self = this.set("HeartbeatTimeout", js.undefined)
    
    @scala.inline
    def setLifecycleHookName(value: AsciiStringMaxLen255): Self = this.set("LifecycleHookName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycleHookName: Self = this.set("LifecycleHookName", js.undefined)
    
    @scala.inline
    def setLifecycleTransition(value: LifecycleTransition): Self = this.set("LifecycleTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycleTransition: Self = this.set("LifecycleTransition", js.undefined)
    
    @scala.inline
    def setNotificationMetadata(value: XmlStringMaxLen1023): Self = this.set("NotificationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationMetadata: Self = this.set("NotificationMetadata", js.undefined)
    
    @scala.inline
    def setNotificationTargetARN(value: ResourceName): Self = this.set("NotificationTargetARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationTargetARN: Self = this.set("NotificationTargetARN", js.undefined)
    
    @scala.inline
    def setRoleARN(value: ResourceName): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
  }
}
