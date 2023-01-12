package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleHookSpecification extends StObject {
  
  /**
    * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an unexpected failure occurs. The default value is ABANDON. Valid values: CONTINUE | ABANDON 
    */
  var DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined
  
  /**
    * The maximum time, in seconds, that can elapse before the lifecycle hook times out. The range is from 30 to 7200 seconds. The default value is 3600 seconds (1 hour).
    */
  var HeartbeatTimeout: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.HeartbeatTimeout] = js.undefined
  
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: AsciiStringMaxLen255
  
  /**
    * The lifecycle transition. For Auto Scaling groups, there are two major lifecycle transitions.   To create a lifecycle hook for scale-out events, specify autoscaling:EC2_INSTANCE_LAUNCHING.   To create a lifecycle hook for scale-in events, specify autoscaling:EC2_INSTANCE_TERMINATING.  
    */
  var LifecycleTransition: typings.awsSdk.clientsAutoscalingMod.LifecycleTransition
  
  /**
    * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a message to the notification target.
    */
  var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the notification target that Amazon EC2 Auto Scaling sends notifications to when an instance is in a wait state for the lifecycle hook. You can specify an Amazon SNS topic or an Amazon SQS queue.
    */
  var NotificationTargetARN: js.UndefOr[NotificationTargetResourceName] = js.undefined
  
  /**
    * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target. For information about creating this role, see Configure a notification target for a lifecycle hook in the Amazon EC2 Auto Scaling User Guide. Valid only if the notification target is an Amazon SNS topic or an Amazon SQS queue.
    */
  var RoleARN: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object LifecycleHookSpecification {
  
  inline def apply(LifecycleHookName: AsciiStringMaxLen255, LifecycleTransition: LifecycleTransition): LifecycleHookSpecification = {
    val __obj = js.Dynamic.literal(LifecycleHookName = LifecycleHookName.asInstanceOf[js.Any], LifecycleTransition = LifecycleTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleHookSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifecycleHookSpecification] (val x: Self) extends AnyVal {
    
    inline def setDefaultResult(value: LifecycleActionResult): Self = StObject.set(x, "DefaultResult", value.asInstanceOf[js.Any])
    
    inline def setDefaultResultUndefined: Self = StObject.set(x, "DefaultResult", js.undefined)
    
    inline def setHeartbeatTimeout(value: HeartbeatTimeout): Self = StObject.set(x, "HeartbeatTimeout", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatTimeoutUndefined: Self = StObject.set(x, "HeartbeatTimeout", js.undefined)
    
    inline def setLifecycleHookName(value: AsciiStringMaxLen255): Self = StObject.set(x, "LifecycleHookName", value.asInstanceOf[js.Any])
    
    inline def setLifecycleTransition(value: LifecycleTransition): Self = StObject.set(x, "LifecycleTransition", value.asInstanceOf[js.Any])
    
    inline def setNotificationMetadata(value: XmlStringMaxLen1023): Self = StObject.set(x, "NotificationMetadata", value.asInstanceOf[js.Any])
    
    inline def setNotificationMetadataUndefined: Self = StObject.set(x, "NotificationMetadata", js.undefined)
    
    inline def setNotificationTargetARN(value: NotificationTargetResourceName): Self = StObject.set(x, "NotificationTargetARN", value.asInstanceOf[js.Any])
    
    inline def setNotificationTargetARNUndefined: Self = StObject.set(x, "NotificationTargetARN", js.undefined)
    
    inline def setRoleARN(value: XmlStringMaxLen255): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
  }
}
