package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchPutScheduledUpdateGroupActionType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  
  /**
    * One or more scheduled actions. The maximum number allowed is 50.
    */
  var ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests = js.native
}
object BatchPutScheduledUpdateGroupActionType {
  
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    ScheduledUpdateGroupActions: ScheduledUpdateGroupActionRequests
  ): BatchPutScheduledUpdateGroupActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ScheduledUpdateGroupActions = ScheduledUpdateGroupActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutScheduledUpdateGroupActionType]
  }
  
  @scala.inline
  implicit class BatchPutScheduledUpdateGroupActionTypeMutableBuilder[Self <: BatchPutScheduledUpdateGroupActionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledUpdateGroupActions(value: ScheduledUpdateGroupActionRequests): Self = StObject.set(x, "ScheduledUpdateGroupActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledUpdateGroupActionsVarargs(value: ScheduledUpdateGroupActionRequest*): Self = StObject.set(x, "ScheduledUpdateGroupActions", js.Array(value :_*))
  }
}
