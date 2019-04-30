package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotFleetRequestConfigData extends js.Object {
  /**
    * Indicates how to allocate the target capacity across the Spot pools specified by the Spot Fleet request. The default is lowestPrice.
    */
  var AllocationStrategy: js.UndefOr[AllocationStrategy] = js.undefined
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of your listings. This helps to avoid duplicate listings. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is decreased below the current size of the Spot Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[ExcessCapacityTerminationPolicy] = js.undefined
  /**
    * The number of units fulfilled by this request compared to the set target capacity. You cannot set this value.
    */
  var FulfilledCapacity: js.UndefOr[Double] = js.undefined
  /**
    * Grants the Spot Fleet permission to terminate Spot Instances on your behalf when you cancel its Spot Fleet request using CancelSpotFleetRequests or when the Spot Fleet request expires, if you set terminateInstancesWithExpiration.
    */
  var IamFleetRole: String
  /**
    * The behavior when a Spot Instance is interrupted. The default is terminate.
    */
  var InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior] = js.undefined
  /**
    * The number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot AllocationStrategy is set to lowest-price. Spot Fleet selects the cheapest Spot pools and evenly allocates your target Spot capacity across the number of Spot pools that you specify.
    */
  var InstancePoolsToUseCount: js.UndefOr[Integer] = js.undefined
  /**
    * The launch specifications for the Spot Fleet request. If you specify LaunchSpecifications, you can't specify LaunchTemplateConfigs.
    */
  var LaunchSpecifications: js.UndefOr[LaunchSpecsList] = js.undefined
  /**
    * The launch template and overrides. If you specify LaunchTemplateConfigs, you can't specify LaunchSpecifications.
    */
  var LaunchTemplateConfigs: js.UndefOr[LaunchTemplateConfigList] = js.undefined
  /**
    * One or more Classic Load Balancers and target groups to attach to the Spot Fleet request. Spot Fleet registers the running Spot Instances with the specified Classic Load Balancers and target groups. With Network Load Balancers, Spot Fleet cannot register instances that have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1.
    */
  var LoadBalancersConfig: js.UndefOr[LoadBalancersConfig] = js.undefined
  /**
    * The order of the launch template overrides to use in fulfilling On-Demand capacity. If you specify lowestPrice, Spot Fleet uses price to determine the order, launching the lowest price first. If you specify prioritized, Spot Fleet uses the priority that you assign to each Spot Fleet launch template override, launching the highest priority first. If you do not specify a value, Spot Fleet defaults to lowestPrice.
    */
  var OnDemandAllocationStrategy: js.UndefOr[OnDemandAllocationStrategy] = js.undefined
  /**
    * The number of On-Demand units fulfilled by this request compared to the set target On-Demand capacity.
    */
  var OnDemandFulfilledCapacity: js.UndefOr[Double] = js.undefined
  /**
    * The number of On-Demand units to request. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is maintain, you can specify a target capacity of 0 and add capacity later.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.undefined
  /**
    * Indicates whether Spot Fleet should replace unhealthy instances.
    */
  var ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum price per unit hour that you are willing to pay for a Spot Instance. The default is the On-Demand price.
    */
  var SpotPrice: js.UndefOr[String] = js.undefined
  /**
    * The number of units to request. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is maintain, you can specify a target capacity of 0 and add capacity later.
    */
  var TargetCapacity: Integer
  /**
    * Indicates whether running Spot Instances should be terminated when the Spot Fleet request expires.
    */
  var TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of request. Indicates whether the Spot Fleet only requests the target capacity or also attempts to maintain it. When this value is request, the Spot Fleet only places the required requests. It does not attempt to replenish Spot Instances if capacity is diminished, nor does it submit requests in alternative Spot pools if capacity is not available. When this value is maintain, the Spot Fleet maintains the target capacity. The Spot Fleet places the required requests to meet capacity and automatically replenishes any interrupted instances. Default: maintain. instant is listed but is not used by Spot Fleet.
    */
  var Type: js.UndefOr[FleetType] = js.undefined
  /**
    * The start date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately.
    */
  var ValidFrom: js.UndefOr[DateTime] = js.undefined
  /**
    * The end date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new Spot Instance requests are placed or able to fulfill the request. If no value is specified, the Spot Fleet request remains until you cancel it.
    */
  var ValidUntil: js.UndefOr[DateTime] = js.undefined
}

object SpotFleetRequestConfigData {
  @scala.inline
  def apply(
    IamFleetRole: String,
    TargetCapacity: Integer,
    AllocationStrategy: AllocationStrategy = null,
    ClientToken: String = null,
    ExcessCapacityTerminationPolicy: ExcessCapacityTerminationPolicy = null,
    FulfilledCapacity: js.UndefOr[Double] = js.undefined,
    InstanceInterruptionBehavior: InstanceInterruptionBehavior = null,
    InstancePoolsToUseCount: js.UndefOr[Integer] = js.undefined,
    LaunchSpecifications: LaunchSpecsList = null,
    LaunchTemplateConfigs: LaunchTemplateConfigList = null,
    LoadBalancersConfig: LoadBalancersConfig = null,
    OnDemandAllocationStrategy: OnDemandAllocationStrategy = null,
    OnDemandFulfilledCapacity: js.UndefOr[Double] = js.undefined,
    OnDemandTargetCapacity: js.UndefOr[Integer] = js.undefined,
    ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.undefined,
    SpotPrice: String = null,
    TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.undefined,
    Type: FleetType = null,
    ValidFrom: DateTime = null,
    ValidUntil: DateTime = null
  ): SpotFleetRequestConfigData = {
    val __obj = js.Dynamic.literal(IamFleetRole = IamFleetRole, TargetCapacity = TargetCapacity)
    if (AllocationStrategy != null) __obj.updateDynamic("AllocationStrategy")(AllocationStrategy.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (ExcessCapacityTerminationPolicy != null) __obj.updateDynamic("ExcessCapacityTerminationPolicy")(ExcessCapacityTerminationPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(FulfilledCapacity)) __obj.updateDynamic("FulfilledCapacity")(FulfilledCapacity)
    if (InstanceInterruptionBehavior != null) __obj.updateDynamic("InstanceInterruptionBehavior")(InstanceInterruptionBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(InstancePoolsToUseCount)) __obj.updateDynamic("InstancePoolsToUseCount")(InstancePoolsToUseCount)
    if (LaunchSpecifications != null) __obj.updateDynamic("LaunchSpecifications")(LaunchSpecifications)
    if (LaunchTemplateConfigs != null) __obj.updateDynamic("LaunchTemplateConfigs")(LaunchTemplateConfigs)
    if (LoadBalancersConfig != null) __obj.updateDynamic("LoadBalancersConfig")(LoadBalancersConfig)
    if (OnDemandAllocationStrategy != null) __obj.updateDynamic("OnDemandAllocationStrategy")(OnDemandAllocationStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(OnDemandFulfilledCapacity)) __obj.updateDynamic("OnDemandFulfilledCapacity")(OnDemandFulfilledCapacity)
    if (!js.isUndefined(OnDemandTargetCapacity)) __obj.updateDynamic("OnDemandTargetCapacity")(OnDemandTargetCapacity)
    if (!js.isUndefined(ReplaceUnhealthyInstances)) __obj.updateDynamic("ReplaceUnhealthyInstances")(ReplaceUnhealthyInstances)
    if (SpotPrice != null) __obj.updateDynamic("SpotPrice")(SpotPrice)
    if (!js.isUndefined(TerminateInstancesWithExpiration)) __obj.updateDynamic("TerminateInstancesWithExpiration")(TerminateInstancesWithExpiration)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (ValidFrom != null) __obj.updateDynamic("ValidFrom")(ValidFrom)
    if (ValidUntil != null) __obj.updateDynamic("ValidUntil")(ValidUntil)
    __obj.asInstanceOf[SpotFleetRequestConfigData]
  }
}

