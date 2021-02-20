package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAutoScalingGroupType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  
  /**
    * Specifies that the group is to be deleted along with all instances associated with the group, without waiting for all instances to be terminated. This parameter also deletes any lifecycle actions associated with the group.
    */
  var ForceDelete: js.UndefOr[typings.awsSdk.autoscalingMod.ForceDelete] = js.native
}
object DeleteAutoScalingGroupType {
  
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName): DeleteAutoScalingGroupType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAutoScalingGroupType]
  }
  
  @scala.inline
  implicit class DeleteAutoScalingGroupTypeMutableBuilder[Self <: DeleteAutoScalingGroupType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDelete(value: ForceDelete): Self = StObject.set(x, "ForceDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDeleteUndefined: Self = StObject.set(x, "ForceDelete", js.undefined)
  }
}
