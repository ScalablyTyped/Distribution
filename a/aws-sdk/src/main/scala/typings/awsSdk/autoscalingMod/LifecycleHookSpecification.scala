package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleHookSpecification extends StObject {
  
  /**
    * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The valid values are CONTINUE and ABANDON. The default value is ABANDON.
    */
  var DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined
  
  /**
    * The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the DefaultResult parameter. You can prevent the lifecycle hook from timing out by calling RecordLifecycleActionHeartbeat.
    */
  var HeartbeatTimeout: js.UndefOr[typings.awsSdk.autoscalingMod.HeartbeatTimeout] = js.undefined
  
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: AsciiStringMaxLen255
  
  /**
    * The state of the EC2 instance to which you want to attach the lifecycle hook. The valid values are:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING  
    */
  var LifecycleTransition: typings.awsSdk.autoscalingMod.LifecycleTransition
  
  /**
    * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a message to the notification target.
    */
  var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined
  
  /**
    * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in the transition state for the lifecycle hook. The notification target can be either an SQS queue or an SNS topic.
    */
  var NotificationTargetARN: js.UndefOr[NotificationTargetResourceName] = js.undefined
  
  /**
    * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target, for example, an Amazon SNS topic or an Amazon SQS queue.
    */
  var RoleARN: js.UndefOr[ResourceName] = js.undefined
}
object LifecycleHookSpecification {
  
  @scala.inline
  def apply(LifecycleHookName: AsciiStringMaxLen255, LifecycleTransition: LifecycleTransition): LifecycleHookSpecification = {
    val __obj = js.Dynamic.literal(LifecycleHookName = LifecycleHookName.asInstanceOf[js.Any], LifecycleTransition = LifecycleTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleHookSpecification]
  }
  
  @scala.inline
  implicit class LifecycleHookSpecificationMutableBuilder[Self <: LifecycleHookSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultResult(value: LifecycleActionResult): Self = StObject.set(x, "DefaultResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultResultUndefined: Self = StObject.set(x, "DefaultResult", js.undefined)
    
    @scala.inline
    def setHeartbeatTimeout(value: HeartbeatTimeout): Self = StObject.set(x, "HeartbeatTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeatTimeoutUndefined: Self = StObject.set(x, "HeartbeatTimeout", js.undefined)
    
    @scala.inline
    def setLifecycleHookName(value: AsciiStringMaxLen255): Self = StObject.set(x, "LifecycleHookName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleTransition(value: LifecycleTransition): Self = StObject.set(x, "LifecycleTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationMetadata(value: XmlStringMaxLen1023): Self = StObject.set(x, "NotificationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationMetadataUndefined: Self = StObject.set(x, "NotificationMetadata", js.undefined)
    
    @scala.inline
    def setNotificationTargetARN(value: NotificationTargetResourceName): Self = StObject.set(x, "NotificationTargetARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTargetARNUndefined: Self = StObject.set(x, "NotificationTargetARN", js.undefined)
    
    @scala.inline
    def setRoleARN(value: ResourceName): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
  }
}
