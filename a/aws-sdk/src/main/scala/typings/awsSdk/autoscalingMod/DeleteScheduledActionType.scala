package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteScheduledActionType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  
  /**
    * The name of the action to delete.
    */
  var ScheduledActionName: ResourceName
}
object DeleteScheduledActionType {
  
  inline def apply(AutoScalingGroupName: ResourceName, ScheduledActionName: ResourceName): DeleteScheduledActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduledActionType]
  }
  
  extension [Self <: DeleteScheduledActionType](x: Self) {
    
    inline def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionName(value: ResourceName): Self = StObject.set(x, "ScheduledActionName", value.asInstanceOf[js.Any])
  }
}
