package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesDistribution extends js.Object {
  /**
    * Indicates how to allocate instance types to fulfill On-Demand capacity.  The only valid value is prioritized, which is also the default value. This strategy uses the order of instance type overrides for the LaunchTemplate to define the launch priority of each instance type. The first instance type in the array is prioritized higher than the last. If all your On-Demand capacity cannot be fulfilled using your highest priority instance, then the Auto Scaling groups launches the remaining capacity using the second priority instance type, and so on. 
    */
  var OnDemandAllocationStrategy: js.UndefOr[XmlString] = js.undefined
  /**
    * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base portion is provisioned first as your group scales. The default value is 0. If you leave this parameter set to 0, On-Demand Instances are launched as a percentage of the Auto Scaling group's desired capacity, per the OnDemandPercentageAboveBaseCapacity setting.
    */
  var OnDemandBaseCapacity: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.OnDemandBaseCapacity] = js.undefined
  /**
    * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity. The range is 0–100. The default value is 100. If you leave this parameter set to 100, the percentages are 100% for On-Demand Instances and 0% for Spot Instances. 
    */
  var OnDemandPercentageAboveBaseCapacity: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.OnDemandPercentageAboveBaseCapacity] = js.undefined
  /**
    * Indicates how to allocate Spot capacity across Spot pools. The only valid value is lowest-price, which is also the default value. The Auto Scaling group selects the cheapest Spot pools and evenly allocates your Spot capacity across the number of Spot pools that you specify. 
    */
  var SpotAllocationStrategy: js.UndefOr[XmlString] = js.undefined
  /**
    * The number of Spot pools to use to allocate your Spot capacity. The Spot pools are determined from the different instance types in the Overrides array of LaunchTemplate. The range is 1–20. The default value is 2.
    */
  var SpotInstancePools: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.SpotInstancePools] = js.undefined
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value of this parameter blank (which is the default), the maximum Spot price is set at the On-Demand price. To remove a value that you previously set, include the parameter but leave the value blank.
    */
  var SpotMaxPrice: js.UndefOr[MixedInstanceSpotPrice] = js.undefined
}

object InstancesDistribution {
  @scala.inline
  def apply(
    OnDemandAllocationStrategy: XmlString = null,
    OnDemandBaseCapacity: js.UndefOr[OnDemandBaseCapacity] = js.undefined,
    OnDemandPercentageAboveBaseCapacity: js.UndefOr[OnDemandPercentageAboveBaseCapacity] = js.undefined,
    SpotAllocationStrategy: XmlString = null,
    SpotInstancePools: js.UndefOr[SpotInstancePools] = js.undefined,
    SpotMaxPrice: MixedInstanceSpotPrice = null
  ): InstancesDistribution = {
    val __obj = js.Dynamic.literal()
    if (OnDemandAllocationStrategy != null) __obj.updateDynamic("OnDemandAllocationStrategy")(OnDemandAllocationStrategy)
    if (!js.isUndefined(OnDemandBaseCapacity)) __obj.updateDynamic("OnDemandBaseCapacity")(OnDemandBaseCapacity)
    if (!js.isUndefined(OnDemandPercentageAboveBaseCapacity)) __obj.updateDynamic("OnDemandPercentageAboveBaseCapacity")(OnDemandPercentageAboveBaseCapacity)
    if (SpotAllocationStrategy != null) __obj.updateDynamic("SpotAllocationStrategy")(SpotAllocationStrategy)
    if (!js.isUndefined(SpotInstancePools)) __obj.updateDynamic("SpotInstancePools")(SpotInstancePools)
    if (SpotMaxPrice != null) __obj.updateDynamic("SpotMaxPrice")(SpotMaxPrice)
    __obj.asInstanceOf[InstancesDistribution]
  }
}

