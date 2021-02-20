package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteScheduledActionType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  
  /**
    * The names of the scheduled actions to delete. The maximum number allowed is 50. 
    */
  var ScheduledActionNames: typings.awsSdk.autoscalingMod.ScheduledActionNames = js.native
}
object BatchDeleteScheduledActionType {
  
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, ScheduledActionNames: ScheduledActionNames): BatchDeleteScheduledActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ScheduledActionNames = ScheduledActionNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteScheduledActionType]
  }
  
  @scala.inline
  implicit class BatchDeleteScheduledActionTypeMutableBuilder[Self <: BatchDeleteScheduledActionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledActionNames(value: ScheduledActionNames): Self = StObject.set(x, "ScheduledActionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledActionNamesVarargs(value: ResourceName*): Self = StObject.set(x, "ScheduledActionNames", js.Array(value :_*))
  }
}
