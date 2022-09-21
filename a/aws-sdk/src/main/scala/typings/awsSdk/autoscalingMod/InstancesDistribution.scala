package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesDistribution extends StObject {
  
  /**
    * The order of the launch template overrides to use in fulfilling On-Demand capacity.  If you specify lowest-price, Amazon EC2 Auto Scaling uses price to determine the order, launching the lowest price first.  If you specify prioritized, Amazon EC2 Auto Scaling uses the priority that you assigned to each launch template override, launching the highest priority first. If all your On-Demand capacity cannot be fulfilled using your highest priority instance, then Amazon EC2 Auto Scaling launches the remaining capacity using the second priority instance type, and so on. Default: lowest-price for Auto Scaling groups that specify InstanceRequirements in the overrides and prioritized for Auto Scaling groups that don't. Valid values: lowest-price | prioritized 
    */
  var OnDemandAllocationStrategy: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base portion is launched first as your group scales. If you specify weights for the instance types in the overrides, the base capacity is measured in the same unit of measurement as the instance types. If you specify InstanceRequirements in the overrides, the base capacity is measured in the same unit of measurement as your group's desired capacity. Default: 0 
    */
  var OnDemandBaseCapacity: js.UndefOr[typings.awsSdk.autoscalingMod.OnDemandBaseCapacity] = js.undefined
  
  /**
    * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity. Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80% Spot Instances). If set to 100, only On-Demand Instances are used. Default: 100 
    */
  var OnDemandPercentageAboveBaseCapacity: js.UndefOr[typings.awsSdk.autoscalingMod.OnDemandPercentageAboveBaseCapacity] = js.undefined
  
  /**
    * Indicates how to allocate instances across Spot Instance pools.  If the allocation strategy is lowest-price, the Auto Scaling group launches instances using the Spot pools with the lowest price, and evenly allocates your instances across the number of Spot pools that you specify.  If the allocation strategy is capacity-optimized (recommended), the Auto Scaling group launches instances using Spot pools that are optimally chosen based on the available Spot capacity. Alternatively, you can use capacity-optimized-prioritized and set the order of instance types in the list of launch template overrides from highest to lowest priority (from first to last in the list). Amazon EC2 Auto Scaling honors the instance type priorities on a best-effort basis but optimizes for capacity first.  Default: lowest-price  Valid values: lowest-price | capacity-optimized | capacity-optimized-prioritized 
    */
  var SpotAllocationStrategy: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are determined from the different instance types in the overrides. Valid only when the Spot allocation strategy is lowest-price. Value must be in the range of 1–20. Default: 2 
    */
  var SpotInstancePools: js.UndefOr[typings.awsSdk.autoscalingMod.SpotInstancePools] = js.undefined
  
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance. If you keep the value at its default (unspecified), Amazon EC2 Auto Scaling uses the On-Demand price as the maximum Spot price. To remove a value that you previously set, include the property but specify an empty string ("") for the value.  If your maximum price is lower than the Spot price for the instance types that you selected, your Spot Instances are not launched.  Valid Range: Minimum value of 0.001
    */
  var SpotMaxPrice: js.UndefOr[MixedInstanceSpotPrice] = js.undefined
}
object InstancesDistribution {
  
  inline def apply(): InstancesDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesDistribution]
  }
  
  extension [Self <: InstancesDistribution](x: Self) {
    
    inline def setOnDemandAllocationStrategy(value: XmlString): Self = StObject.set(x, "OnDemandAllocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setOnDemandAllocationStrategyUndefined: Self = StObject.set(x, "OnDemandAllocationStrategy", js.undefined)
    
    inline def setOnDemandBaseCapacity(value: OnDemandBaseCapacity): Self = StObject.set(x, "OnDemandBaseCapacity", value.asInstanceOf[js.Any])
    
    inline def setOnDemandBaseCapacityUndefined: Self = StObject.set(x, "OnDemandBaseCapacity", js.undefined)
    
    inline def setOnDemandPercentageAboveBaseCapacity(value: OnDemandPercentageAboveBaseCapacity): Self = StObject.set(x, "OnDemandPercentageAboveBaseCapacity", value.asInstanceOf[js.Any])
    
    inline def setOnDemandPercentageAboveBaseCapacityUndefined: Self = StObject.set(x, "OnDemandPercentageAboveBaseCapacity", js.undefined)
    
    inline def setSpotAllocationStrategy(value: XmlString): Self = StObject.set(x, "SpotAllocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setSpotAllocationStrategyUndefined: Self = StObject.set(x, "SpotAllocationStrategy", js.undefined)
    
    inline def setSpotInstancePools(value: SpotInstancePools): Self = StObject.set(x, "SpotInstancePools", value.asInstanceOf[js.Any])
    
    inline def setSpotInstancePoolsUndefined: Self = StObject.set(x, "SpotInstancePools", js.undefined)
    
    inline def setSpotMaxPrice(value: MixedInstanceSpotPrice): Self = StObject.set(x, "SpotMaxPrice", value.asInstanceOf[js.Any])
    
    inline def setSpotMaxPriceUndefined: Self = StObject.set(x, "SpotMaxPrice", js.undefined)
  }
}
