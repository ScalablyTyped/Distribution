package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesDistribution extends js.Object {
  /**
    * Indicates how to allocate instance types to fulfill On-Demand capacity. The only valid value is prioritized, which is also the default value. This strategy uses the order of instance type overrides for the LaunchTemplate to define the launch priority of each instance type. The first instance type in the array is prioritized higher than the last. If all your On-Demand capacity cannot be fulfilled using your highest priority instance, then the Auto Scaling groups launches the remaining capacity using the second priority instance type, and so on.
    */
  var OnDemandAllocationStrategy: js.UndefOr[XmlString] = js.native
  /**
    * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base portion is provisioned first as your group scales. Default if not set is 0. If you leave it set to 0, On-Demand Instances are launched as a percentage of the Auto Scaling group's desired capacity, per the OnDemandPercentageAboveBaseCapacity setting.  An update to this setting means a gradual replacement of instances to maintain the specified number of On-Demand Instances for your base capacity. When replacing instances, Amazon EC2 Auto Scaling launches new instances before terminating the old ones. 
    */
  var OnDemandBaseCapacity: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.OnDemandBaseCapacity] = js.native
  /**
    * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity. Default if not set is 100. If you leave it set to 100, the percentages are 100% for On-Demand Instances and 0% for Spot Instances.  An update to this setting means a gradual replacement of instances to maintain the percentage of On-Demand Instances for your additional capacity above the base capacity. When replacing instances, Amazon EC2 Auto Scaling launches new instances before terminating the old ones.  Valid Range: Minimum value of 0. Maximum value of 100.
    */
  var OnDemandPercentageAboveBaseCapacity: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.OnDemandPercentageAboveBaseCapacity] = js.native
  /**
    * Indicates how to allocate instances across Spot Instance pools. If the allocation strategy is lowest-price, the Auto Scaling group launches instances using the Spot pools with the lowest price, and evenly allocates your instances across the number of Spot pools that you specify. If the allocation strategy is capacity-optimized, the Auto Scaling group launches instances using Spot pools that are optimally chosen based on the available Spot capacity. The default Spot allocation strategy for calls that you make through the API, the AWS CLI, or the AWS SDKs is lowest-price. The default Spot allocation strategy for the AWS Management Console is capacity-optimized. Valid values: lowest-price | capacity-optimized 
    */
  var SpotAllocationStrategy: js.UndefOr[XmlString] = js.native
  /**
    * The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are determined from the different instance types in the Overrides array of LaunchTemplate. Default if not set is 2. Used only when the Spot allocation strategy is lowest-price. Valid Range: Minimum value of 1. Maximum value of 20.
    */
  var SpotInstancePools: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.SpotInstancePools] = js.native
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value of this parameter blank (which is the default), the maximum Spot price is set at the On-Demand price. To remove a value that you previously set, include the parameter but leave the value blank.
    */
  var SpotMaxPrice: js.UndefOr[MixedInstanceSpotPrice] = js.native
}

object InstancesDistribution {
  @scala.inline
  def apply(
    OnDemandAllocationStrategy: XmlString = null,
    OnDemandBaseCapacity: Int | Double = null,
    OnDemandPercentageAboveBaseCapacity: Int | Double = null,
    SpotAllocationStrategy: XmlString = null,
    SpotInstancePools: Int | Double = null,
    SpotMaxPrice: MixedInstanceSpotPrice = null
  ): InstancesDistribution = {
    val __obj = js.Dynamic.literal()
    if (OnDemandAllocationStrategy != null) __obj.updateDynamic("OnDemandAllocationStrategy")(OnDemandAllocationStrategy.asInstanceOf[js.Any])
    if (OnDemandBaseCapacity != null) __obj.updateDynamic("OnDemandBaseCapacity")(OnDemandBaseCapacity.asInstanceOf[js.Any])
    if (OnDemandPercentageAboveBaseCapacity != null) __obj.updateDynamic("OnDemandPercentageAboveBaseCapacity")(OnDemandPercentageAboveBaseCapacity.asInstanceOf[js.Any])
    if (SpotAllocationStrategy != null) __obj.updateDynamic("SpotAllocationStrategy")(SpotAllocationStrategy.asInstanceOf[js.Any])
    if (SpotInstancePools != null) __obj.updateDynamic("SpotInstancePools")(SpotInstancePools.asInstanceOf[js.Any])
    if (SpotMaxPrice != null) __obj.updateDynamic("SpotMaxPrice")(SpotMaxPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancesDistribution]
  }
}

