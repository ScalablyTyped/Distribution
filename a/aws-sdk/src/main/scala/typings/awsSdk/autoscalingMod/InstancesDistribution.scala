package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesDistribution extends StObject {
  
  /**
    * Indicates how to allocate instance types to fulfill On-Demand capacity. The only valid value is prioritized, which is also the default value. This strategy uses the order of instance types in the overrides to define the launch priority of each instance type. The first instance type in the array is prioritized higher than the last. If all your On-Demand capacity cannot be fulfilled using your highest priority instance, then the Auto Scaling groups launches the remaining capacity using the second priority instance type, and so on.
    */
  var OnDemandAllocationStrategy: js.UndefOr[XmlString] = js.native
  
  /**
    * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base portion is provisioned first as your group scales. Defaults to 0 if not specified. If you specify weights for the instance types in the overrides, set the value of OnDemandBaseCapacity in terms of the number of capacity units, and not the number of instances.
    */
  var OnDemandBaseCapacity: js.UndefOr[typings.awsSdk.autoscalingMod.OnDemandBaseCapacity] = js.native
  
  /**
    * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity. Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80% Spot Instances). Defaults to 100 if not specified. If set to 100, only On-Demand Instances are provisioned.
    */
  var OnDemandPercentageAboveBaseCapacity: js.UndefOr[typings.awsSdk.autoscalingMod.OnDemandPercentageAboveBaseCapacity] = js.native
  
  /**
    * Indicates how to allocate instances across Spot Instance pools. If the allocation strategy is lowest-price, the Auto Scaling group launches instances using the Spot pools with the lowest price, and evenly allocates your instances across the number of Spot pools that you specify. If the allocation strategy is capacity-optimized, the Auto Scaling group launches instances using Spot pools that are optimally chosen based on the available Spot capacity. Defaults to lowest-price if not specified.
    */
  var SpotAllocationStrategy: js.UndefOr[XmlString] = js.native
  
  /**
    * The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are determined from the different instance types in the overrides. Defaults to 2 if not specified. Valid only when the Spot allocation strategy is lowest-price. Valid Range: Minimum value of 1. Maximum value of 20.
    */
  var SpotInstancePools: js.UndefOr[typings.awsSdk.autoscalingMod.SpotInstancePools] = js.native
  
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you leave the value of this parameter blank (which is the default), the maximum Spot price is set at the On-Demand price. To remove a value that you previously set, include the parameter but leave the value blank.
    */
  var SpotMaxPrice: js.UndefOr[MixedInstanceSpotPrice] = js.native
}
object InstancesDistribution {
  
  @scala.inline
  def apply(): InstancesDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesDistribution]
  }
  
  @scala.inline
  implicit class InstancesDistributionMutableBuilder[Self <: InstancesDistribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDemandAllocationStrategy(value: XmlString): Self = StObject.set(x, "OnDemandAllocationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandAllocationStrategyUndefined: Self = StObject.set(x, "OnDemandAllocationStrategy", js.undefined)
    
    @scala.inline
    def setOnDemandBaseCapacity(value: OnDemandBaseCapacity): Self = StObject.set(x, "OnDemandBaseCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandBaseCapacityUndefined: Self = StObject.set(x, "OnDemandBaseCapacity", js.undefined)
    
    @scala.inline
    def setOnDemandPercentageAboveBaseCapacity(value: OnDemandPercentageAboveBaseCapacity): Self = StObject.set(x, "OnDemandPercentageAboveBaseCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandPercentageAboveBaseCapacityUndefined: Self = StObject.set(x, "OnDemandPercentageAboveBaseCapacity", js.undefined)
    
    @scala.inline
    def setSpotAllocationStrategy(value: XmlString): Self = StObject.set(x, "SpotAllocationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotAllocationStrategyUndefined: Self = StObject.set(x, "SpotAllocationStrategy", js.undefined)
    
    @scala.inline
    def setSpotInstancePools(value: SpotInstancePools): Self = StObject.set(x, "SpotInstancePools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotInstancePoolsUndefined: Self = StObject.set(x, "SpotInstancePools", js.undefined)
    
    @scala.inline
    def setSpotMaxPrice(value: MixedInstanceSpotPrice): Self = StObject.set(x, "SpotMaxPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotMaxPriceUndefined: Self = StObject.set(x, "SpotMaxPrice", js.undefined)
  }
}
