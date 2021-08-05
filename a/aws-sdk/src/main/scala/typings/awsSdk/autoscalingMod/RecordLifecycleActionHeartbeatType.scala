package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordLifecycleActionHeartbeatType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined
  
  /**
    * A token that uniquely identifies a specific lifecycle action associated with an instance. Amazon EC2 Auto Scaling sends this token to the notification target that you specified when you created the lifecycle hook.
    */
  var LifecycleActionToken: js.UndefOr[typings.awsSdk.autoscalingMod.LifecycleActionToken] = js.undefined
  
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: AsciiStringMaxLen255
}
object RecordLifecycleActionHeartbeatType {
  
  inline def apply(AutoScalingGroupName: ResourceName, LifecycleHookName: AsciiStringMaxLen255): RecordLifecycleActionHeartbeatType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], LifecycleHookName = LifecycleHookName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordLifecycleActionHeartbeatType]
  }
  
  extension [Self <: RecordLifecycleActionHeartbeatType](x: Self) {
    
    inline def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: XmlStringMaxLen19): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setLifecycleActionToken(value: LifecycleActionToken): Self = StObject.set(x, "LifecycleActionToken", value.asInstanceOf[js.Any])
    
    inline def setLifecycleActionTokenUndefined: Self = StObject.set(x, "LifecycleActionToken", js.undefined)
    
    inline def setLifecycleHookName(value: AsciiStringMaxLen255): Self = StObject.set(x, "LifecycleHookName", value.asInstanceOf[js.Any])
  }
}
