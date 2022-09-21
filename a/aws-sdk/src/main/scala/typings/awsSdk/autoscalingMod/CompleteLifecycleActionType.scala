package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteLifecycleActionType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined
  
  /**
    * The action for the group to take. You can specify either CONTINUE or ABANDON.
    */
  var LifecycleActionResult: typings.awsSdk.autoscalingMod.LifecycleActionResult
  
  /**
    * A universally unique identifier (UUID) that identifies a specific lifecycle action associated with an instance. Amazon EC2 Auto Scaling sends this token to the notification target you specified when you created the lifecycle hook.
    */
  var LifecycleActionToken: js.UndefOr[typings.awsSdk.autoscalingMod.LifecycleActionToken] = js.undefined
  
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: AsciiStringMaxLen255
}
object CompleteLifecycleActionType {
  
  inline def apply(
    AutoScalingGroupName: ResourceName,
    LifecycleActionResult: LifecycleActionResult,
    LifecycleHookName: AsciiStringMaxLen255
  ): CompleteLifecycleActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], LifecycleActionResult = LifecycleActionResult.asInstanceOf[js.Any], LifecycleHookName = LifecycleHookName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteLifecycleActionType]
  }
  
  extension [Self <: CompleteLifecycleActionType](x: Self) {
    
    inline def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: XmlStringMaxLen19): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setLifecycleActionResult(value: LifecycleActionResult): Self = StObject.set(x, "LifecycleActionResult", value.asInstanceOf[js.Any])
    
    inline def setLifecycleActionToken(value: LifecycleActionToken): Self = StObject.set(x, "LifecycleActionToken", value.asInstanceOf[js.Any])
    
    inline def setLifecycleActionTokenUndefined: Self = StObject.set(x, "LifecycleActionToken", js.undefined)
    
    inline def setLifecycleHookName(value: AsciiStringMaxLen255): Self = StObject.set(x, "LifecycleHookName", value.asInstanceOf[js.Any])
  }
}
