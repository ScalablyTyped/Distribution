package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDesiredCapacityType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  
  /**
    * The desired capacity is the initial capacity of the Auto Scaling group after this operation completes and the capacity it attempts to maintain.
    */
  var DesiredCapacity: AutoScalingGroupDesiredCapacity
  
  /**
    * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before initiating a scaling activity to set your Auto Scaling group to its new capacity. By default, Amazon EC2 Auto Scaling does not honor the cooldown period during manual scaling activities.
    */
  var HonorCooldown: js.UndefOr[typings.awsSdk.autoscalingMod.HonorCooldown] = js.undefined
}
object SetDesiredCapacityType {
  
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, DesiredCapacity: AutoScalingGroupDesiredCapacity): SetDesiredCapacityType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], DesiredCapacity = DesiredCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDesiredCapacityType]
  }
  
  @scala.inline
  implicit class SetDesiredCapacityTypeMutableBuilder[Self <: SetDesiredCapacityType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredCapacity(value: AutoScalingGroupDesiredCapacity): Self = StObject.set(x, "DesiredCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHonorCooldown(value: HonorCooldown): Self = StObject.set(x, "HonorCooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHonorCooldownUndefined: Self = StObject.set(x, "HonorCooldown", js.undefined)
  }
}
