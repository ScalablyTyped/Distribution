package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesDistribution extends StObject {
  
  /**
    * The allocation strategy to apply to your On-Demand Instances when they are launched. Possible instance types are determined by the launch template overrides that you specify. The following lists the valid values:  lowest-price  Uses price to determine which instance types are the highest priority, launching the lowest priced instance types within an Availability Zone first. This is the default value for Auto Scaling groups that specify InstanceRequirements.   prioritized  You set the order of instance types for the launch template overrides from highest to lowest priority (from first to last in the list). Amazon EC2 Auto Scaling launches your highest priority instance types first. If all your On-Demand capacity cannot be fulfilled using your highest priority instance type, then Amazon EC2 Auto Scaling launches the remaining capacity using the second priority instance type, and so on. This is the default value for Auto Scaling groups that don't specify InstanceRequirements and cannot be used for groups that do.  
    */
  var OnDemandAllocationStrategy: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base portion is launched first as your group scales. This number has the same unit of measurement as the group's desired capacity. If you change the default unit of measurement (number of instances) by specifying weighted capacity values in your launch template overrides list, or by changing the default desired capacity type setting of the group, you must specify this number using the same unit of measurement. Default: 0
    */
  var OnDemandBaseCapacity: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.OnDemandBaseCapacity] = js.undefined
  
  /**
    * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity. Expressed as a number (for example, 20 specifies 20% On-Demand Instances, 80% Spot Instances). If set to 100, only On-Demand Instances are used. Default: 100
    */
  var OnDemandPercentageAboveBaseCapacity: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.OnDemandPercentageAboveBaseCapacity] = js.undefined
  
  /**
    * The allocation strategy to apply to your Spot Instances when they are launched. Possible instance types are determined by the launch template overrides that you specify. The following lists the valid values:  capacity-optimized  Requests Spot Instances using pools that are optimally chosen based on the available Spot capacity. This strategy has the lowest risk of interruption. To give certain instance types a higher chance of launching first, use capacity-optimized-prioritized.  capacity-optimized-prioritized  You set the order of instance types for the launch template overrides from highest to lowest priority (from first to last in the list). Amazon EC2 Auto Scaling honors the instance type priorities on a best effort basis but optimizes for capacity first. Note that if the On-Demand allocation strategy is set to prioritized, the same priority is applied when fulfilling On-Demand capacity. This is not a valid value for Auto Scaling groups that specify InstanceRequirements.  lowest-price  Requests Spot Instances using the lowest priced pools within an Availability Zone, across the number of Spot pools that you specify for the SpotInstancePools property. To ensure that your desired capacity is met, you might receive Spot Instances from several pools. This is the default value, but it might lead to high interruption rates because this strategy only considers instance price and not available capacity.  price-capacity-optimized (recommended)  Amazon EC2 Auto Scaling identifies the pools with the highest capacity availability for the number of instances that are launching. This means that we will request Spot Instances from the pools that we believe have the lowest chance of interruption in the near term. Amazon EC2 Auto Scaling then requests Spot Instances from the lowest priced of these pools.  
    */
  var SpotAllocationStrategy: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The number of Spot Instance pools across which to allocate your Spot Instances. The Spot pools are determined from the different instance types in the overrides. Valid only when the SpotAllocationStrategy is lowest-price. Value must be in the range of 1–20. Default: 2
    */
  var SpotInstancePools: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.SpotInstancePools] = js.undefined
  
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance. If your maximum price is lower than the Spot price for the instance types that you selected, your Spot Instances are not launched. We do not recommend specifying a maximum price because it can lead to increased interruptions. When Spot Instances launch, you pay the current Spot price. To remove a maximum price that you previously set, include the property but specify an empty string ("") for the value.  If you specify a maximum price, your instances will be interrupted more frequently than if you do not specify one.  Valid Range: Minimum value of 0.001
    */
  var SpotMaxPrice: js.UndefOr[MixedInstanceSpotPrice] = js.undefined
}
object InstancesDistribution {
  
  inline def apply(): InstancesDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesDistribution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstancesDistribution] (val x: Self) extends AnyVal {
    
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
