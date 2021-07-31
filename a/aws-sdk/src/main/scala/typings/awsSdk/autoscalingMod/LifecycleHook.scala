package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleHook extends StObject {
  
  /**
    * The name of the Auto Scaling group for the lifecycle hook.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The possible values are CONTINUE and ABANDON.
    */
  var DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined
  
  /**
    * The maximum time, in seconds, that an instance can remain in a Pending:Wait or Terminating:Wait state. The maximum is 172800 seconds (48 hours) or 100 times HeartbeatTimeout, whichever is smaller.
    */
  var GlobalTimeout: js.UndefOr[typings.awsSdk.autoscalingMod.GlobalTimeout] = js.undefined
  
  /**
    * The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the DefaultResult parameter.
    */
  var HeartbeatTimeout: js.UndefOr[typings.awsSdk.autoscalingMod.HeartbeatTimeout] = js.undefined
  
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: js.UndefOr[AsciiStringMaxLen255] = js.undefined
  
  /**
    * The state of the EC2 instance to which to attach the lifecycle hook. The following are possible values:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING  
    */
  var LifecycleTransition: js.UndefOr[typings.awsSdk.autoscalingMod.LifecycleTransition] = js.undefined
  
  /**
    * Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the notification target.
    */
  var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined
  
  /**
    * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the transition state for the lifecycle hook. The notification target can be either an SQS queue or an SNS topic.
    */
  var NotificationTargetARN: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
    */
  var RoleARN: js.UndefOr[ResourceName] = js.undefined
}
object LifecycleHook {
  
  @scala.inline
  def apply(): LifecycleHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleHook]
  }
  
  @scala.inline
  implicit class LifecycleHookMutableBuilder[Self <: LifecycleHook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "AutoScalingGroupName", js.undefined)
    
    @scala.inline
    def setDefaultResult(value: LifecycleActionResult): Self = StObject.set(x, "DefaultResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultResultUndefined: Self = StObject.set(x, "DefaultResult", js.undefined)
    
    @scala.inline
    def setGlobalTimeout(value: GlobalTimeout): Self = StObject.set(x, "GlobalTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTimeoutUndefined: Self = StObject.set(x, "GlobalTimeout", js.undefined)
    
    @scala.inline
    def setHeartbeatTimeout(value: HeartbeatTimeout): Self = StObject.set(x, "HeartbeatTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeatTimeoutUndefined: Self = StObject.set(x, "HeartbeatTimeout", js.undefined)
    
    @scala.inline
    def setLifecycleHookName(value: AsciiStringMaxLen255): Self = StObject.set(x, "LifecycleHookName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleHookNameUndefined: Self = StObject.set(x, "LifecycleHookName", js.undefined)
    
    @scala.inline
    def setLifecycleTransition(value: LifecycleTransition): Self = StObject.set(x, "LifecycleTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleTransitionUndefined: Self = StObject.set(x, "LifecycleTransition", js.undefined)
    
    @scala.inline
    def setNotificationMetadata(value: XmlStringMaxLen1023): Self = StObject.set(x, "NotificationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationMetadataUndefined: Self = StObject.set(x, "NotificationMetadata", js.undefined)
    
    @scala.inline
    def setNotificationTargetARN(value: ResourceName): Self = StObject.set(x, "NotificationTargetARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTargetARNUndefined: Self = StObject.set(x, "NotificationTargetARN", js.undefined)
    
    @scala.inline
    def setRoleARN(value: ResourceName): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
  }
}
