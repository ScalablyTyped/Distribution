package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminateInstanceInAutoScalingGroupType extends js.Object {
  
  /**
    * The ID of the instance.
    */
  var InstanceId: XmlStringMaxLen19 = js.native
  
  /**
    * Indicates whether terminating the instance also decrements the size of the Auto Scaling group.
    */
  var ShouldDecrementDesiredCapacity: typings.awsSdk.autoscalingMod.ShouldDecrementDesiredCapacity = js.native
}
object TerminateInstanceInAutoScalingGroupType {
  
  @scala.inline
  def apply(InstanceId: XmlStringMaxLen19, ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity): TerminateInstanceInAutoScalingGroupType = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], ShouldDecrementDesiredCapacity = ShouldDecrementDesiredCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateInstanceInAutoScalingGroupType]
  }
  
  @scala.inline
  implicit class TerminateInstanceInAutoScalingGroupTypeOps[Self <: TerminateInstanceInAutoScalingGroupType] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: XmlStringMaxLen19): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldDecrementDesiredCapacity(value: ShouldDecrementDesiredCapacity): Self = this.set("ShouldDecrementDesiredCapacity", value.asInstanceOf[js.Any])
  }
}
