package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateOverrides extends js.Object {
  /**
    * The instance type. For information about available instance types, see Available Instance Types in the Amazon Elastic Compute Cloud User Guide. 
    */
  var InstanceType: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The number of capacity units, which gives the instance type a proportional weight to other instance types. For example, larger instance types are generally weighted more than smaller instance types. These are the same units that you chose to set the desired capacity in terms of instances, or a performance attribute such as vCPUs, memory, or I/O. Valid Range: Minimum value of 1. Maximum value of 999.
    */
  var WeightedCapacity: js.UndefOr[XmlStringMaxLen32] = js.native
}

object LaunchTemplateOverrides {
  @scala.inline
  def apply(InstanceType: XmlStringMaxLen255 = null, WeightedCapacity: XmlStringMaxLen32 = null): LaunchTemplateOverrides = {
    val __obj = js.Dynamic.literal()
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (WeightedCapacity != null) __obj.updateDynamic("WeightedCapacity")(WeightedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateOverrides]
  }
}

