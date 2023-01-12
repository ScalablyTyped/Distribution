package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotOptions extends StObject {
  
  /**
    * The strategy that determines how to allocate the target Spot Instance capacity across the Spot Instance pools specified by the EC2 Fleet launch configuration. For more information, see Allocation strategies for Spot Instances in the Amazon EC2 User Guide.  price-capacity-optimized (recommended)  EC2 Fleet identifies the pools with the highest capacity availability for the number of instances that are launching. This means that we will request Spot Instances from the pools that we believe have the lowest chance of interruption in the near term. EC2 Fleet then requests Spot Instances from the lowest priced of these pools.  capacity-optimized  EC2 Fleet identifies the pools with the highest capacity availability for the number of instances that are launching. This means that we will request Spot Instances from the pools that we believe have the lowest chance of interruption in the near term. To give certain instance types a higher chance of launching first, use capacity-optimized-prioritized. Set a priority for each instance type by using the Priority parameter for LaunchTemplateOverrides. You can assign the same priority to different LaunchTemplateOverrides. EC2 implements the priorities on a best-effort basis, but optimizes for capacity first. capacity-optimized-prioritized is supported only if your EC2 Fleet uses a launch template. Note that if the On-Demand AllocationStrategy is set to prioritized, the same priority is applied when fulfilling On-Demand capacity.  diversified  EC2 Fleet requests instances from all of the Spot Instance pools that you specify.  lowest-price  EC2 Fleet requests instances from the lowest priced Spot Instance pool that has available capacity. If the lowest priced pool doesn't have available capacity, the Spot Instances come from the next lowest priced pool that has available capacity. If a pool runs out of capacity before fulfilling your desired capacity, EC2 Fleet will continue to fulfill your request by drawing from the next lowest priced pool. To ensure that your desired capacity is met, you might receive Spot Instances from several pools. Because this strategy only considers instance price and not capacity availability, it might lead to high interruption rates.   Default: lowest-price 
    */
  var AllocationStrategy: js.UndefOr[SpotAllocationStrategy] = js.undefined
  
  /**
    * The behavior when a Spot Instance is interrupted. Default: terminate 
    */
  var InstanceInterruptionBehavior: js.UndefOr[SpotInstanceInterruptionBehavior] = js.undefined
  
  /**
    * The number of Spot pools across which to allocate your target Spot capacity. Supported only when AllocationStrategy is set to lowest-price. EC2 Fleet selects the cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot pools that you specify. Note that EC2 Fleet attempts to draw Spot Instances from the number of pools that you specify on a best effort basis. If a pool runs out of Spot capacity before fulfilling your target capacity, EC2 Fleet will continue to fulfill your request by drawing from the next cheapest pool. To ensure that your target capacity is met, you might receive Spot Instances from more than the number of pools that you specified. Similarly, if most of the pools have no Spot capacity, you might receive your full target capacity from fewer than the number of pools that you specified.
    */
  var InstancePoolsToUseCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The strategies for managing your workloads on your Spot Instances that will be interrupted. Currently only the capacity rebalance strategy is available.
    */
  var MaintenanceStrategies: js.UndefOr[FleetSpotMaintenanceStrategies] = js.undefined
  
  /**
    * The maximum amount per hour for Spot Instances that you're willing to pay. We do not recommend using this parameter because it can lead to increased interruptions. If you do not specify this parameter, you will pay the current Spot price.  If you specify a maximum price, your Spot Instances will be interrupted more frequently than if you do not specify this parameter. 
    */
  var MaxTotalPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum target capacity for Spot Instances in the fleet. If the minimum target capacity is not reached, the fleet launches no instances. Supported only for fleets of type instant. At least one of the following must be specified: SingleAvailabilityZone | SingleInstanceType 
    */
  var MinTargetCapacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates that the fleet launches all Spot Instances into a single Availability Zone. Supported only for fleets of type instant.
    */
  var SingleAvailabilityZone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that the fleet uses a single instance type to launch all Spot Instances in the fleet. Supported only for fleets of type instant.
    */
  var SingleInstanceType: js.UndefOr[Boolean] = js.undefined
}
object SpotOptions {
  
  inline def apply(): SpotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpotOptions] (val x: Self) extends AnyVal {
    
    inline def setAllocationStrategy(value: SpotAllocationStrategy): Self = StObject.set(x, "AllocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAllocationStrategyUndefined: Self = StObject.set(x, "AllocationStrategy", js.undefined)
    
    inline def setInstanceInterruptionBehavior(value: SpotInstanceInterruptionBehavior): Self = StObject.set(x, "InstanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    inline def setInstanceInterruptionBehaviorUndefined: Self = StObject.set(x, "InstanceInterruptionBehavior", js.undefined)
    
    inline def setInstancePoolsToUseCount(value: Integer): Self = StObject.set(x, "InstancePoolsToUseCount", value.asInstanceOf[js.Any])
    
    inline def setInstancePoolsToUseCountUndefined: Self = StObject.set(x, "InstancePoolsToUseCount", js.undefined)
    
    inline def setMaintenanceStrategies(value: FleetSpotMaintenanceStrategies): Self = StObject.set(x, "MaintenanceStrategies", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceStrategiesUndefined: Self = StObject.set(x, "MaintenanceStrategies", js.undefined)
    
    inline def setMaxTotalPrice(value: String): Self = StObject.set(x, "MaxTotalPrice", value.asInstanceOf[js.Any])
    
    inline def setMaxTotalPriceUndefined: Self = StObject.set(x, "MaxTotalPrice", js.undefined)
    
    inline def setMinTargetCapacity(value: Integer): Self = StObject.set(x, "MinTargetCapacity", value.asInstanceOf[js.Any])
    
    inline def setMinTargetCapacityUndefined: Self = StObject.set(x, "MinTargetCapacity", js.undefined)
    
    inline def setSingleAvailabilityZone(value: Boolean): Self = StObject.set(x, "SingleAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setSingleAvailabilityZoneUndefined: Self = StObject.set(x, "SingleAvailabilityZone", js.undefined)
    
    inline def setSingleInstanceType(value: Boolean): Self = StObject.set(x, "SingleInstanceType", value.asInstanceOf[js.Any])
    
    inline def setSingleInstanceTypeUndefined: Self = StObject.set(x, "SingleInstanceType", js.undefined)
  }
}
