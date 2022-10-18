package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleHook extends StObject {
  
  /**
    * The name of the Auto Scaling group for the lifecycle hook.
    */
  var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an unexpected failure occurs. Valid values: CONTINUE | ABANDON 
    */
  var DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined
  
  /**
    * The maximum time, in seconds, that an instance can remain in a wait state. The maximum is 172800 seconds (48 hours) or 100 times HeartbeatTimeout, whichever is smaller.
    */
  var GlobalTimeout: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.GlobalTimeout] = js.undefined
  
  /**
    * The maximum time, in seconds, that can elapse before the lifecycle hook times out. If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the DefaultResult property.
    */
  var HeartbeatTimeout: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.HeartbeatTimeout] = js.undefined
  
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: js.UndefOr[AsciiStringMaxLen255] = js.undefined
  
  /**
    * The lifecycle transition. Valid values: autoscaling:EC2_INSTANCE_LAUNCHING | autoscaling:EC2_INSTANCE_TERMINATING 
    */
  var LifecycleTransition: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.LifecycleTransition] = js.undefined
  
  /**
    * Additional information that is included any time Amazon EC2 Auto Scaling sends a message to the notification target.
    */
  var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined
  
  /**
    * The ARN of the target that Amazon EC2 Auto Scaling sends notifications to when an instance is in a wait state for the lifecycle hook.
    */
  var NotificationTargetARN: js.UndefOr[NotificationTargetResourceName] = js.undefined
  
  /**
    * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target (an Amazon SNS topic or an Amazon SQS queue).
    */
  var RoleARN: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object LifecycleHook {
  
  inline def apply(): LifecycleHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleHook]
  }
  
  extension [Self <: LifecycleHook](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "AutoScalingGroupName", js.undefined)
    
    inline def setDefaultResult(value: LifecycleActionResult): Self = StObject.set(x, "DefaultResult", value.asInstanceOf[js.Any])
    
    inline def setDefaultResultUndefined: Self = StObject.set(x, "DefaultResult", js.undefined)
    
    inline def setGlobalTimeout(value: GlobalTimeout): Self = StObject.set(x, "GlobalTimeout", value.asInstanceOf[js.Any])
    
    inline def setGlobalTimeoutUndefined: Self = StObject.set(x, "GlobalTimeout", js.undefined)
    
    inline def setHeartbeatTimeout(value: HeartbeatTimeout): Self = StObject.set(x, "HeartbeatTimeout", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatTimeoutUndefined: Self = StObject.set(x, "HeartbeatTimeout", js.undefined)
    
    inline def setLifecycleHookName(value: AsciiStringMaxLen255): Self = StObject.set(x, "LifecycleHookName", value.asInstanceOf[js.Any])
    
    inline def setLifecycleHookNameUndefined: Self = StObject.set(x, "LifecycleHookName", js.undefined)
    
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
