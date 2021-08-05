package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteScheduledActionType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  
  /**
    * The names of the scheduled actions to delete. The maximum number allowed is 50. 
    */
  var ScheduledActionNames: typings.awsSdk.autoscalingMod.ScheduledActionNames
}
object BatchDeleteScheduledActionType {
  
  inline def apply(AutoScalingGroupName: ResourceName, ScheduledActionNames: ScheduledActionNames): BatchDeleteScheduledActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ScheduledActionNames = ScheduledActionNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteScheduledActionType]
  }
  
  extension [Self <: BatchDeleteScheduledActionType](x: Self) {
    
    inline def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionNames(value: ScheduledActionNames): Self = StObject.set(x, "ScheduledActionNames", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionNamesVarargs(value: ResourceName*): Self = StObject.set(x, "ScheduledActionNames", js.Array(value :_*))
  }
}
