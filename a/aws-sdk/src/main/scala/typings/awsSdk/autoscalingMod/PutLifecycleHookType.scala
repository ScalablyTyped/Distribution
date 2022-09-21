package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLifecycleHookType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an unexpected failure occurs. The default value is ABANDON. Valid values: CONTINUE | ABANDON 
    */
  var DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined
  
  /**
    * The maximum time, in seconds, that can elapse before the lifecycle hook times out. The range is from 30 to 7200 seconds. The default value is 3600 seconds (1 hour).
    */
  var HeartbeatTimeout: js.UndefOr[typings.awsSdk.autoscalingMod.HeartbeatTimeout] = js.undefined
  
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: AsciiStringMaxLen255
  
  /**
    * The lifecycle transition. For Auto Scaling groups, there are two major lifecycle transitions.   To create a lifecycle hook for scale-out events, specify autoscaling:EC2_INSTANCE_LAUNCHING.   To create a lifecycle hook for scale-in events, specify autoscaling:EC2_INSTANCE_TERMINATING.   Required for new lifecycle hooks, but optional when updating existing hooks.
    */
  var LifecycleTransition: js.UndefOr[typings.awsSdk.autoscalingMod.LifecycleTransition] = js.undefined
  
  /**
    * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a message to the notification target.
    */
  var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the notification target that Amazon EC2 Auto Scaling uses to notify you when an instance is in a wait state for the lifecycle hook. You can specify either an Amazon SNS topic or an Amazon SQS queue. If you specify an empty string, this overrides the current ARN. This operation uses the JSON format when sending notifications to an Amazon SQS queue, and an email key-value pair format when sending notifications to an Amazon SNS topic. When you specify a notification target, Amazon EC2 Auto Scaling sends it a test message. Test messages contain the following additional key-value pair: "Event": "autoscaling:TEST_NOTIFICATION".
    */
  var NotificationTargetARN: js.UndefOr[NotificationTargetResourceName] = js.undefined
  
  /**
    * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target. Valid only if the notification target is an Amazon SNS topic or an Amazon SQS queue. Required for new lifecycle hooks, but optional when updating existing hooks.
    */
  var RoleARN: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object PutLifecycleHookType {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255, LifecycleHookName: AsciiStringMaxLen255): PutLifecycleHookType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], LifecycleHookName = LifecycleHookName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLifecycleHookType]
  }
  
  extension [Self <: PutLifecycleHookType](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setDefaultResult(value: LifecycleActionResult): Self = StObject.set(x, "DefaultResult", value.asInstanceOf[js.Any])
    
    inline def setDefaultResultUndefined: Self = StObject.set(x, "DefaultResult", js.undefined)
    
    inline def setHeartbeatTimeout(value: HeartbeatTimeout): Self = StObject.set(x, "HeartbeatTimeout", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatTimeoutUndefined: Self = StObject.set(x, "HeartbeatTimeout", js.undefined)
    
    inline def setLifecycleHookName(value: AsciiStringMaxLen255): Self = StObject.set(x, "LifecycleHookName", value.asInstanceOf[js.Any])
    
    inline def setLifecycleTransition(value: LifecycleTransition): Self = StObject.set(x, "LifecycleTransition", value.asInstanceOf[js.Any])
    
    inline def setLifecycleTransitionUndefined: Self = StObject.set(x, "LifecycleTransition", js.undefined)
    
    inline def setNotificationMetadata(value: XmlStringMaxLen1023): Self = StObject.set(x, "NotificationMetadata", value.asInstanceOf[js.Any])
    
    inline def setNotificationMetadataUndefined: Self = StObject.set(x, "NotificationMetadata", js.undefined)
    
    inline def setNotificationTargetARN(value: NotificationTargetResourceName): Self = StObject.set(x, "NotificationTargetARN", value.asInstanceOf[js.Any])
    
    inline def setNotificationTargetARNUndefined: Self = StObject.set(x, "NotificationTargetARN", js.undefined)
    
    inline def setRoleARN(value: XmlStringMaxLen255): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
  }
}
