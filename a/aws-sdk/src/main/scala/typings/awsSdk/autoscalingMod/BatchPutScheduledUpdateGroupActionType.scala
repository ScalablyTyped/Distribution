package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutScheduledUpdateGroupActionType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  
  /**
    * One or more scheduled actions. The maximum number allowed is 50.
    */
  var ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests
}
object BatchPutScheduledUpdateGroupActionType {
  
  inline def apply(
    AutoScalingGroupName: ResourceName,
    ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests
  ): BatchPutScheduledUpdateGroupActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ScheduledUpdateGroupActions = ScheduledUpdateGroupActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutScheduledUpdateGroupActionType]
  }
  
  extension [Self <: BatchPutScheduledUpdateGroupActionType](x: Self) {
    
    inline def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setScheduledUpdateGroupActions(value: ScheduledUpdateGroupActionRequests): Self = StObject.set(x, "ScheduledUpdateGroupActions", value.asInstanceOf[js.Any])
    
    inline def setScheduledUpdateGroupActionsVarargs(value: ScheduledUpdateGroupActionRequest*): Self = StObject.set(x, "ScheduledUpdateGroupActions", js.Array(value :_*))
  }
}
