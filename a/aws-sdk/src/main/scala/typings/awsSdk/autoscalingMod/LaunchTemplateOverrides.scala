package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateOverrides extends js.Object {
  /**
    * The instance type. You must use an instance type that is supported in your requested Region and Availability Zones.  For information about available instance types, see Available Instance Types in the Amazon Elastic Compute Cloud User Guide. 
    */
  var InstanceType: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The number of capacity units, which gives the instance type a proportional weight to other instance types. For example, larger instance types are generally weighted more than smaller instance types. These are the same units that you chose to set the desired capacity in terms of instances, or a performance attribute such as vCPUs, memory, or I/O. For more information, see Instance Weighting for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide. Valid Range: Minimum value of 1. Maximum value of 999.
    */
  var WeightedCapacity: js.UndefOr[XmlStringMaxLen32] = js.native
}

object LaunchTemplateOverrides {
  @scala.inline
  def apply(): LaunchTemplateOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateOverrides]
  }
  @scala.inline
  implicit class LaunchTemplateOverridesOps[Self <: LaunchTemplateOverrides] (val x: Self) extends AnyVal {
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
    def setInstanceType(value: XmlStringMaxLen255): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setWeightedCapacity(value: XmlStringMaxLen32): Self = this.set("WeightedCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeightedCapacity: Self = this.set("WeightedCapacity", js.undefined)
  }
  
}

