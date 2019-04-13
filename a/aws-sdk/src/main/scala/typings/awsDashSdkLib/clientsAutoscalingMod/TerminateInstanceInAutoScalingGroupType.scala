package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateInstanceInAutoScalingGroupType extends js.Object {
  /**
    * The ID of the instance.
    */
  var InstanceId: XmlStringMaxLen19
  /**
    * Indicates whether terminating the instance also decrements the size of the Auto Scaling group.
    */
  var ShouldDecrementDesiredCapacity: awsDashSdkLib.clientsAutoscalingMod.ShouldDecrementDesiredCapacity
}

object TerminateInstanceInAutoScalingGroupType {
  @scala.inline
  def apply(InstanceId: XmlStringMaxLen19, ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity): TerminateInstanceInAutoScalingGroupType = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId, ShouldDecrementDesiredCapacity = ShouldDecrementDesiredCapacity)
  
    __obj.asInstanceOf[TerminateInstanceInAutoScalingGroupType]
  }
}

