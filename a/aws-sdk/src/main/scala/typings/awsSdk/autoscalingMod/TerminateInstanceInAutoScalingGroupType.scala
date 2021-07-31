package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateInstanceInAutoScalingGroupType extends StObject {
  
  /**
    * The ID of the instance.
    */
  var InstanceId: XmlStringMaxLen19
  
  /**
    * Indicates whether terminating the instance also decrements the size of the Auto Scaling group.
    */
  var ShouldDecrementDesiredCapacity: typings.awsSdk.autoscalingMod.ShouldDecrementDesiredCapacity
}
object TerminateInstanceInAutoScalingGroupType {
  
  @scala.inline
  def apply(InstanceId: XmlStringMaxLen19, ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity): TerminateInstanceInAutoScalingGroupType = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], ShouldDecrementDesiredCapacity = ShouldDecrementDesiredCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateInstanceInAutoScalingGroupType]
  }
  
  @scala.inline
  implicit class TerminateInstanceInAutoScalingGroupTypeMutableBuilder[Self <: TerminateInstanceInAutoScalingGroupType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: XmlStringMaxLen19): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldDecrementDesiredCapacity(value: ShouldDecrementDesiredCapacity): Self = StObject.set(x, "ShouldDecrementDesiredCapacity", value.asInstanceOf[js.Any])
  }
}
