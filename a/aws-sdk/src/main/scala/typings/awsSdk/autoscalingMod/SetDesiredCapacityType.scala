package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetDesiredCapacityType extends js.Object {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  
  /**
    * The desired capacity is the initial capacity of the Auto Scaling group after this operation completes and the capacity it attempts to maintain.
    */
  var DesiredCapacity: AutoScalingGroupDesiredCapacity = js.native
  
  /**
    * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period to complete before initiating a scaling activity to set your Auto Scaling group to its new capacity. By default, Amazon EC2 Auto Scaling does not honor the cooldown period during manual scaling activities.
    */
  var HonorCooldown: js.UndefOr[typings.awsSdk.autoscalingMod.HonorCooldown] = js.native
}
object SetDesiredCapacityType {
  
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, DesiredCapacity: AutoScalingGroupDesiredCapacity): SetDesiredCapacityType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], DesiredCapacity = DesiredCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDesiredCapacityType]
  }
  
  @scala.inline
  implicit class SetDesiredCapacityTypeOps[Self <: SetDesiredCapacityType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = this.set("AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredCapacity(value: AutoScalingGroupDesiredCapacity): Self = this.set("DesiredCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHonorCooldown(value: HonorCooldown): Self = this.set("HonorCooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHonorCooldown: Self = this.set("HonorCooldown", js.undefined)
  }
}
