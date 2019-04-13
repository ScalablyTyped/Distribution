package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachInstancesQuery extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * The IDs of the instances. You can specify up to 20 instances.
    */
  var InstanceIds: js.UndefOr[InstanceIds] = js.undefined
}

object AttachInstancesQuery {
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, InstanceIds: InstanceIds = null): AttachInstancesQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName)
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds)
    __obj.asInstanceOf[AttachInstancesQuery]
  }
}

