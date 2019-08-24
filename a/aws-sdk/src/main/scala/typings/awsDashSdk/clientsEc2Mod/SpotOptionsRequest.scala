package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotOptionsRequest extends js.Object {
  /**
    * Indicates how to allocate the target Spot Instance capacity across the Spot Instance pools specified by the EC2 Fleet. If the allocation strategy is lowestPrice, EC2 Fleet launches instances from the Spot Instance pools with the lowest price. This is the default allocation strategy. If the allocation strategy is diversified, EC2 Fleet launches instances from all the Spot Instance pools that you specify. If the allocation strategy is capacityOptimized, EC2 Fleet launches instances from Spot Instance pools with optimal capacity for the number of instances that are launching.
    */
  var AllocationStrategy: js.UndefOr[SpotAllocationStrategy] = js.undefined
  /**
    * The behavior when a Spot Instance is interrupted. The default is terminate.
    */
  var InstanceInterruptionBehavior: js.UndefOr[SpotInstanceInterruptionBehavior] = js.undefined
  /**
    * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot AllocationStrategy is set to lowest-price. EC2 Fleet selects the cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
    */
  var InstancePoolsToUseCount: js.UndefOr[Integer] = js.undefined
  /**
    * The maximum amount per hour for Spot Instances that you're willing to pay.
    */
  var MaxTotalPrice: js.UndefOr[String] = js.undefined
  /**
    * The minimum target capacity for Spot Instances in the fleet. If the minimum target capacity is not reached, the fleet launches no instances.
    */
  var MinTargetCapacity: js.UndefOr[Integer] = js.undefined
  /**
    * Indicates that the fleet launches all Spot Instances into a single Availability Zone.
    */
  var SingleAvailabilityZone: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates that the fleet uses a single instance type to launch all Spot Instances in the fleet.
    */
  var SingleInstanceType: js.UndefOr[Boolean] = js.undefined
}

object SpotOptionsRequest {
  @scala.inline
  def apply(
    AllocationStrategy: SpotAllocationStrategy = null,
    InstanceInterruptionBehavior: SpotInstanceInterruptionBehavior = null,
    InstancePoolsToUseCount: js.UndefOr[Integer] = js.undefined,
    MaxTotalPrice: String = null,
    MinTargetCapacity: js.UndefOr[Integer] = js.undefined,
    SingleAvailabilityZone: js.UndefOr[Boolean] = js.undefined,
    SingleInstanceType: js.UndefOr[Boolean] = js.undefined
  ): SpotOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (AllocationStrategy != null) __obj.updateDynamic("AllocationStrategy")(AllocationStrategy.asInstanceOf[js.Any])
    if (InstanceInterruptionBehavior != null) __obj.updateDynamic("InstanceInterruptionBehavior")(InstanceInterruptionBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(InstancePoolsToUseCount)) __obj.updateDynamic("InstancePoolsToUseCount")(InstancePoolsToUseCount)
    if (MaxTotalPrice != null) __obj.updateDynamic("MaxTotalPrice")(MaxTotalPrice)
    if (!js.isUndefined(MinTargetCapacity)) __obj.updateDynamic("MinTargetCapacity")(MinTargetCapacity)
    if (!js.isUndefined(SingleAvailabilityZone)) __obj.updateDynamic("SingleAvailabilityZone")(SingleAvailabilityZone)
    if (!js.isUndefined(SingleInstanceType)) __obj.updateDynamic("SingleInstanceType")(SingleInstanceType)
    __obj.asInstanceOf[SpotOptionsRequest]
  }
}

