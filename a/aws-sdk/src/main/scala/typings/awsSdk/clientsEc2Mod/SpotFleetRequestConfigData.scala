package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotFleetRequestConfigData extends StObject {
  
  /**
    * The strategy that determines how to allocate the target Spot Instance capacity across the Spot Instance pools specified by the Spot Fleet launch configuration. For more information, see Allocation strategies for Spot Instances in the Amazon EC2 User Guide for Linux Instances.  lowestPrice - Spot Fleet launches instances from the lowest-price Spot Instance pool that has available capacity. If the cheapest pool doesn't have available capacity, the Spot Instances come from the next cheapest pool that has available capacity. If a pool runs out of capacity before fulfilling your desired capacity, Spot Fleet will continue to fulfill your request by drawing from the next cheapest pool. To ensure that your desired capacity is met, you might receive Spot Instances from several pools.  diversified - Spot Fleet launches instances from all of the Spot Instance pools that you specify.  capacityOptimized (recommended) - Spot Fleet launches instances from Spot Instance pools with optimal capacity for the number of instances that are launching. To give certain instance types a higher chance of launching first, use capacityOptimizedPrioritized. Set a priority for each instance type by using the Priority parameter for LaunchTemplateOverrides. You can assign the same priority to different LaunchTemplateOverrides. EC2 implements the priorities on a best-effort basis, but optimizes for capacity first. capacityOptimizedPrioritized is supported only if your Spot Fleet uses a launch template. Note that if the OnDemandAllocationStrategy is set to prioritized, the same priority is applied when fulfilling On-Demand capacity. Default: lowestPrice 
    */
  var AllocationStrategy: js.UndefOr[typings.awsSdk.clientsEc2Mod.AllocationStrategy] = js.undefined
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of your listings. This helps to avoid duplicate listings. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved.
    */
  var Context: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether running Spot Instances should be terminated if you decrease the target capacity of the Spot Fleet request below the current size of the Spot Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[typings.awsSdk.clientsEc2Mod.ExcessCapacityTerminationPolicy] = js.undefined
  
  /**
    * The number of units fulfilled by this request compared to the set target capacity. You cannot set this value.
    */
  var FulfilledCapacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that grants the Spot Fleet the permission to request, launch, terminate, and tag instances on your behalf. For more information, see Spot Fleet prerequisites in the Amazon EC2 User Guide for Linux Instances. Spot Fleet can terminate Spot Instances on your behalf when you cancel its Spot Fleet request using CancelSpotFleetRequests or when the Spot Fleet request expires, if you set TerminateInstancesWithExpiration.
    */
  var IamFleetRole: String
  
  /**
    * The behavior when a Spot Instance is interrupted. The default is terminate.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceInterruptionBehavior] = js.undefined
  
  /**
    * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot AllocationStrategy is set to lowest-price. Spot Fleet selects the cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot pools that you specify. Note that Spot Fleet attempts to draw Spot Instances from the number of pools that you specify on a best effort basis. If a pool runs out of Spot capacity before fulfilling your target capacity, Spot Fleet will continue to fulfill your request by drawing from the next cheapest pool. To ensure that your target capacity is met, you might receive Spot Instances from more than the number of pools that you specified. Similarly, if most of the pools have no Spot capacity, you might receive your full target capacity from fewer than the number of pools that you specified.
    */
  var InstancePoolsToUseCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The launch specifications for the Spot Fleet request. If you specify LaunchSpecifications, you can't specify LaunchTemplateConfigs. If you include On-Demand capacity in your request, you must use LaunchTemplateConfigs.
    */
  var LaunchSpecifications: js.UndefOr[LaunchSpecsList] = js.undefined
  
  /**
    * The launch template and overrides. If you specify LaunchTemplateConfigs, you can't specify LaunchSpecifications. If you include On-Demand capacity in your request, you must use LaunchTemplateConfigs.
    */
  var LaunchTemplateConfigs: js.UndefOr[LaunchTemplateConfigList] = js.undefined
  
  /**
    * One or more Classic Load Balancers and target groups to attach to the Spot Fleet request. Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers and target groups. With Network Load Balancers, Spot Fleet cannot register instances that have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
    */
  var LoadBalancersConfig: js.UndefOr[typings.awsSdk.clientsEc2Mod.LoadBalancersConfig] = js.undefined
  
  /**
    * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify lowestPrice, Spot Fleet uses price to determine the order, launching the lowest price first. If you specify prioritized, Spot Fleet uses the priority that you assign to each Spot Fleet launch template override, launching the highest priority first. If you do not specify a value, Spot Fleet defaults to lowestPrice.
    */
  var OnDemandAllocationStrategy: js.UndefOr[typings.awsSdk.clientsEc2Mod.OnDemandAllocationStrategy] = js.undefined
  
  /**
    * The number of On-Demand units fulfilled by this request compared to the set target On-Demand capacity.
    */
  var OnDemandFulfilledCapacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum amount per hour for On-Demand Instances that you're willing to pay. You can use the onDemandMaxTotalPrice parameter, the spotMaxTotalPrice parameter, or both parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot Fleet will launch instances until it reaches the maximum amount you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
    */
  var OnDemandMaxTotalPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The number of On-Demand units to request. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is maintain, you can specify a target capacity of 0 and add capacity later.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates whether Spot Fleet should replace unhealthy instances.
    */
  var ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The strategies for managing your Spot Instances that are at an elevated risk of being interrupted.
    */
  var SpotMaintenanceStrategies: js.UndefOr[typings.awsSdk.clientsEc2Mod.SpotMaintenanceStrategies] = js.undefined
  
  /**
    * The maximum amount per hour for Spot Instances that you're willing to pay. You can use the spotdMaxTotalPrice parameter, the onDemandMaxTotalPrice parameter, or both parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum price per hour for the On-Demand Instances and Spot Instances in your request, Spot Fleet will launch instances until it reaches the maximum amount you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity.
    */
  var SpotMaxTotalPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance. We do not recommend using this parameter because it can lead to increased interruptions. If you do not specify this parameter, you will pay the current Spot price.  If you specify a maximum price, your instances will be interrupted more frequently than if you do not specify this parameter. 
    */
  var SpotPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The key-value pair for tagging the Spot Fleet request on creation. The value for ResourceType must be spot-fleet-request, otherwise the Spot Fleet request fails. To tag instances at launch, specify the tags in the launch template (valid only if you use LaunchTemplateConfigs) or in the  SpotFleetTagSpecification  (valid only if you use LaunchSpecifications). For information about tagging after launch, see Tagging Your Resources.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The number of units to request for the Spot Fleet. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is maintain, you can specify a target capacity of 0 and add capacity later.
    */
  var TargetCapacity: Integer
  
  /**
    * The unit for the target capacity. Default: units (translates to number of instances)
    */
  var TargetCapacityUnitType: js.UndefOr[typings.awsSdk.clientsEc2Mod.TargetCapacityUnitType] = js.undefined
  
  /**
    * Indicates whether running Spot Instances are terminated when the Spot Fleet request expires.
    */
  var TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts to maintain it. When this value is request, the Spot Fleet only places the required requests. It does not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in alternative Spot pools if capacity is not available. When this value is maintain, the Spot Fleet maintains the target capacity. The Spot Fleet places the required requests to meet capacity and automatically replenishes any interrupted instances. Default: maintain. instant is listed but is not used by Spot Fleet.
    */
  var Type: js.UndefOr[FleetType] = js.undefined
  
  /**
    * The start date and time of the request, in UTC format (YYYY-MM-DDTHH:MM:SSZ). By default, Amazon EC2 starts fulfilling the request immediately.
    */
  var ValidFrom: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The end date and time of the request, in UTC format (YYYY-MM-DDTHH:MM:SSZ). After the end date and time, no new Spot Instance requests are placed or able to fulfill the request. If no value is specified, the Spot Fleet request remains until you cancel it.
    */
  var ValidUntil: js.UndefOr[js.Date] = js.undefined
}
object SpotFleetRequestConfigData {
  
  inline def apply(IamFleetRole: String, TargetCapacity: Integer): SpotFleetRequestConfigData = {
    val __obj = js.Dynamic.literal(IamFleetRole = IamFleetRole.asInstanceOf[js.Any], TargetCapacity = TargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestConfigData]
  }
  
  extension [Self <: SpotFleetRequestConfigData](x: Self) {
    
    inline def setAllocationStrategy(value: AllocationStrategy): Self = StObject.set(x, "AllocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAllocationStrategyUndefined: Self = StObject.set(x, "AllocationStrategy", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
    
    inline def setExcessCapacityTerminationPolicy(value: ExcessCapacityTerminationPolicy): Self = StObject.set(x, "ExcessCapacityTerminationPolicy", value.asInstanceOf[js.Any])
    
    inline def setExcessCapacityTerminationPolicyUndefined: Self = StObject.set(x, "ExcessCapacityTerminationPolicy", js.undefined)
    
    inline def setFulfilledCapacity(value: Double): Self = StObject.set(x, "FulfilledCapacity", value.asInstanceOf[js.Any])
    
    inline def setFulfilledCapacityUndefined: Self = StObject.set(x, "FulfilledCapacity", js.undefined)
    
    inline def setIamFleetRole(value: String): Self = StObject.set(x, "IamFleetRole", value.asInstanceOf[js.Any])
    
    inline def setInstanceInterruptionBehavior(value: InstanceInterruptionBehavior): Self = StObject.set(x, "InstanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    inline def setInstanceInterruptionBehaviorUndefined: Self = StObject.set(x, "InstanceInterruptionBehavior", js.undefined)
    
    inline def setInstancePoolsToUseCount(value: Integer): Self = StObject.set(x, "InstancePoolsToUseCount", value.asInstanceOf[js.Any])
    
    inline def setInstancePoolsToUseCountUndefined: Self = StObject.set(x, "InstancePoolsToUseCount", js.undefined)
    
    inline def setLaunchSpecifications(value: LaunchSpecsList): Self = StObject.set(x, "LaunchSpecifications", value.asInstanceOf[js.Any])
    
    inline def setLaunchSpecificationsUndefined: Self = StObject.set(x, "LaunchSpecifications", js.undefined)
    
    inline def setLaunchSpecificationsVarargs(value: SpotFleetLaunchSpecification*): Self = StObject.set(x, "LaunchSpecifications", js.Array(value*))
    
    inline def setLaunchTemplateConfigs(value: LaunchTemplateConfigList): Self = StObject.set(x, "LaunchTemplateConfigs", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateConfigsUndefined: Self = StObject.set(x, "LaunchTemplateConfigs", js.undefined)
    
    inline def setLaunchTemplateConfigsVarargs(value: LaunchTemplateConfig*): Self = StObject.set(x, "LaunchTemplateConfigs", js.Array(value*))
    
    inline def setLoadBalancersConfig(value: LoadBalancersConfig): Self = StObject.set(x, "LoadBalancersConfig", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancersConfigUndefined: Self = StObject.set(x, "LoadBalancersConfig", js.undefined)
    
    inline def setOnDemandAllocationStrategy(value: OnDemandAllocationStrategy): Self = StObject.set(x, "OnDemandAllocationStrategy", value.asInstanceOf[js.Any])
    
    inline def setOnDemandAllocationStrategyUndefined: Self = StObject.set(x, "OnDemandAllocationStrategy", js.undefined)
    
    inline def setOnDemandFulfilledCapacity(value: Double): Self = StObject.set(x, "OnDemandFulfilledCapacity", value.asInstanceOf[js.Any])
    
    inline def setOnDemandFulfilledCapacityUndefined: Self = StObject.set(x, "OnDemandFulfilledCapacity", js.undefined)
    
    inline def setOnDemandMaxTotalPrice(value: String): Self = StObject.set(x, "OnDemandMaxTotalPrice", value.asInstanceOf[js.Any])
    
    inline def setOnDemandMaxTotalPriceUndefined: Self = StObject.set(x, "OnDemandMaxTotalPrice", js.undefined)
    
    inline def setOnDemandTargetCapacity(value: Integer): Self = StObject.set(x, "OnDemandTargetCapacity", value.asInstanceOf[js.Any])
    
    inline def setOnDemandTargetCapacityUndefined: Self = StObject.set(x, "OnDemandTargetCapacity", js.undefined)
    
    inline def setReplaceUnhealthyInstances(value: Boolean): Self = StObject.set(x, "ReplaceUnhealthyInstances", value.asInstanceOf[js.Any])
    
    inline def setReplaceUnhealthyInstancesUndefined: Self = StObject.set(x, "ReplaceUnhealthyInstances", js.undefined)
    
    inline def setSpotMaintenanceStrategies(value: SpotMaintenanceStrategies): Self = StObject.set(x, "SpotMaintenanceStrategies", value.asInstanceOf[js.Any])
    
    inline def setSpotMaintenanceStrategiesUndefined: Self = StObject.set(x, "SpotMaintenanceStrategies", js.undefined)
    
    inline def setSpotMaxTotalPrice(value: String): Self = StObject.set(x, "SpotMaxTotalPrice", value.asInstanceOf[js.Any])
    
    inline def setSpotMaxTotalPriceUndefined: Self = StObject.set(x, "SpotMaxTotalPrice", js.undefined)
    
    inline def setSpotPrice(value: String): Self = StObject.set(x, "SpotPrice", value.asInstanceOf[js.Any])
    
    inline def setSpotPriceUndefined: Self = StObject.set(x, "SpotPrice", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
    
    inline def setTargetCapacity(value: Integer): Self = StObject.set(x, "TargetCapacity", value.asInstanceOf[js.Any])
    
    inline def setTargetCapacityUnitType(value: TargetCapacityUnitType): Self = StObject.set(x, "TargetCapacityUnitType", value.asInstanceOf[js.Any])
    
    inline def setTargetCapacityUnitTypeUndefined: Self = StObject.set(x, "TargetCapacityUnitType", js.undefined)
    
    inline def setTerminateInstancesWithExpiration(value: Boolean): Self = StObject.set(x, "TerminateInstancesWithExpiration", value.asInstanceOf[js.Any])
    
    inline def setTerminateInstancesWithExpirationUndefined: Self = StObject.set(x, "TerminateInstancesWithExpiration", js.undefined)
    
    inline def setType(value: FleetType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValidFrom(value: js.Date): Self = StObject.set(x, "ValidFrom", value.asInstanceOf[js.Any])
    
    inline def setValidFromUndefined: Self = StObject.set(x, "ValidFrom", js.undefined)
    
    inline def setValidUntil(value: js.Date): Self = StObject.set(x, "ValidUntil", value.asInstanceOf[js.Any])
    
    inline def setValidUntilUndefined: Self = StObject.set(x, "ValidUntil", js.undefined)
  }
}
