package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateOverrides extends js.Object {
  
  /**
    * The instance type, such as m3.xlarge. You must use an instance type that is supported in your requested Region and Availability Zones. For more information, see Instance types in the Amazon Elastic Compute Cloud User Guide.
    */
  var InstanceType: js.UndefOr[XmlStringMaxLen255] = js.native
  
  /**
    * Provides the launch template to be used when launching the instance type. For example, some instance types might require a launch template with a different AMI. If not provided, Amazon EC2 Auto Scaling uses the launch template that's defined for your mixed instances policy. For more information, see Specifying a different launch template for an instance type in the Amazon EC2 Auto Scaling User Guide. 
    */
  var LaunchTemplateSpecification: js.UndefOr[typings.awsSdk.autoscalingMod.LaunchTemplateSpecification] = js.native
  
  /**
    * The number of capacity units provided by the specified instance type in terms of virtual CPUs, memory, storage, throughput, or other relative performance characteristic. When a Spot or On-Demand Instance is provisioned, the capacity units count toward the desired capacity. Amazon EC2 Auto Scaling provisions instances until the desired capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EC2 Auto Scaling can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the desired capacity is exceeded by 3 units. For more information, see Instance weighting for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide.  Valid Range: Minimum value of 1. Maximum value of 999.
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
    def setLaunchTemplateSpecification(value: LaunchTemplateSpecification): Self = this.set("LaunchTemplateSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplateSpecification: Self = this.set("LaunchTemplateSpecification", js.undefined)
    
    @scala.inline
    def setWeightedCapacity(value: XmlStringMaxLen32): Self = this.set("WeightedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightedCapacity: Self = this.set("WeightedCapacity", js.undefined)
  }
}
