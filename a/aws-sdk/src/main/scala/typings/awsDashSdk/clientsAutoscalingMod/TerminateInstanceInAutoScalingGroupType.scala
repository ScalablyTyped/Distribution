package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateInstanceInAutoScalingGroupType extends js.Object {
  /**
    * The ID of the instance.
    */
  var InstanceId: XmlStringMaxLen19 = js.native
  /**
    * Indicates whether terminating the instance also decrements the size of the Auto Scaling group.
    */
  var ShouldDecrementDesiredCapacity: typings.awsDashSdk.clientsAutoscalingMod.ShouldDecrementDesiredCapacity = js.native
}

object TerminateInstanceInAutoScalingGroupType {
  @scala.inline
  def apply(InstanceId: XmlStringMaxLen19, ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity): TerminateInstanceInAutoScalingGroupType = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], ShouldDecrementDesiredCapacity = ShouldDecrementDesiredCapacity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TerminateInstanceInAutoScalingGroupType]
  }
}

