package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetData extends js.Object {
  /**
    * The progress of the EC2 Fleet. If there is an error, the status is error. After all requests are placed, the status is pending_fulfillment. If the size of the EC2 Fleet is equal to or greater than its target capacity, the status is fulfilled. If the size of the EC2 Fleet is decreased, the status is pending_termination while instances are terminating.
    */
  var ActivityStatus: js.UndefOr[FleetActivityStatus] = js.undefined
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency. Constraints: Maximum 64 ASCII characters
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The creation date and time of the EC2 Fleet.
    */
  var CreateTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Information about the instances that could not be launched by the fleet. Valid only when Type is set to instant.
    */
  var Errors: js.UndefOr[DescribeFleetsErrorSet] = js.undefined
  /**
    * Indicates whether running instances should be terminated if the target capacity of the EC2 Fleet is decreased below the current size of the EC2 Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy] = js.undefined
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[FleetIdentifier] = js.undefined
  /**
    * The state of the EC2 Fleet.
    */
  var FleetState: js.UndefOr[FleetStateCode] = js.undefined
  /**
    * The number of units fulfilled by this request compared to the set target capacity.
    */
  var FulfilledCapacity: js.UndefOr[Double] = js.undefined
  /**
    * The number of units fulfilled by this request compared to the set target On-Demand capacity.
    */
  var FulfilledOnDemandCapacity: js.UndefOr[Double] = js.undefined
  /**
    * Information about the instances that were launched by the fleet. Valid only when Type is set to instant.
    */
  var Instances: js.UndefOr[DescribeFleetsInstancesSet] = js.undefined
  /**
    * The launch template and overrides.
    */
  var LaunchTemplateConfigs: js.UndefOr[FleetLaunchTemplateConfigList] = js.undefined
  /**
    * The allocation strategy of On-Demand Instances in an EC2 Fleet.
    */
  var OnDemandOptions: js.UndefOr[OnDemandOptions] = js.undefined
  /**
    * Indicates whether EC2 Fleet should replace unhealthy instances.
    */
  var ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.undefined
  /**
    * The configuration of Spot Instances in an EC2 Fleet.
    */
  var SpotOptions: js.UndefOr[SpotOptions] = js.undefined
  /**
    * The tags for an EC2 Fleet resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The number of units to request. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is maintain, you can specify a target capacity of 0 and add capacity later.
    */
  var TargetCapacitySpecification: js.UndefOr[TargetCapacitySpecification] = js.undefined
  /**
    * Indicates whether running instances should be terminated when the EC2 Fleet expires. 
    */
  var TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. If you request a certain target capacity, EC2 Fleet only places the required requests; it does not attempt to replenish instances if capacity is diminished, and does not submit requests in alternative capacity pools if capacity is unavailable. To maintain a certain target capacity, EC2 Fleet places the required requests to meet this target capacity. It also automatically replenishes any interrupted Spot Instances. Default: maintain.
    */
  var Type: js.UndefOr[FleetType] = js.undefined
  /**
    * The start date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). The default is to start fulfilling the request immediately. 
    */
  var ValidFrom: js.UndefOr[DateTime] = js.undefined
  /**
    * The end date and time of the request, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). At this point, no new instance requests are placed or able to fulfill the request. The default end date is 7 days from the current date. 
    */
  var ValidUntil: js.UndefOr[DateTime] = js.undefined
}

object FleetData {
  @scala.inline
  def apply(
    ActivityStatus: FleetActivityStatus = null,
    ClientToken: String = null,
    CreateTime: DateTime = null,
    Errors: DescribeFleetsErrorSet = null,
    ExcessCapacityTerminationPolicy: FleetExcessCapacityTerminationPolicy = null,
    FleetId: FleetIdentifier = null,
    FleetState: FleetStateCode = null,
    FulfilledCapacity: js.UndefOr[Double] = js.undefined,
    FulfilledOnDemandCapacity: js.UndefOr[Double] = js.undefined,
    Instances: DescribeFleetsInstancesSet = null,
    LaunchTemplateConfigs: FleetLaunchTemplateConfigList = null,
    OnDemandOptions: OnDemandOptions = null,
    ReplaceUnhealthyInstances: js.UndefOr[Boolean] = js.undefined,
    SpotOptions: SpotOptions = null,
    Tags: TagList = null,
    TargetCapacitySpecification: TargetCapacitySpecification = null,
    TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.undefined,
    Type: FleetType = null,
    ValidFrom: DateTime = null,
    ValidUntil: DateTime = null
  ): FleetData = {
    val __obj = js.Dynamic.literal()
    if (ActivityStatus != null) __obj.updateDynamic("ActivityStatus")(ActivityStatus.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime)
    if (Errors != null) __obj.updateDynamic("Errors")(Errors)
    if (ExcessCapacityTerminationPolicy != null) __obj.updateDynamic("ExcessCapacityTerminationPolicy")(ExcessCapacityTerminationPolicy.asInstanceOf[js.Any])
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    if (FleetState != null) __obj.updateDynamic("FleetState")(FleetState.asInstanceOf[js.Any])
    if (!js.isUndefined(FulfilledCapacity)) __obj.updateDynamic("FulfilledCapacity")(FulfilledCapacity)
    if (!js.isUndefined(FulfilledOnDemandCapacity)) __obj.updateDynamic("FulfilledOnDemandCapacity")(FulfilledOnDemandCapacity)
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    if (LaunchTemplateConfigs != null) __obj.updateDynamic("LaunchTemplateConfigs")(LaunchTemplateConfigs)
    if (OnDemandOptions != null) __obj.updateDynamic("OnDemandOptions")(OnDemandOptions)
    if (!js.isUndefined(ReplaceUnhealthyInstances)) __obj.updateDynamic("ReplaceUnhealthyInstances")(ReplaceUnhealthyInstances)
    if (SpotOptions != null) __obj.updateDynamic("SpotOptions")(SpotOptions)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TargetCapacitySpecification != null) __obj.updateDynamic("TargetCapacitySpecification")(TargetCapacitySpecification)
    if (!js.isUndefined(TerminateInstancesWithExpiration)) __obj.updateDynamic("TerminateInstancesWithExpiration")(TerminateInstancesWithExpiration)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (ValidFrom != null) __obj.updateDynamic("ValidFrom")(ValidFrom)
    if (ValidUntil != null) __obj.updateDynamic("ValidUntil")(ValidUntil)
    __obj.asInstanceOf[FleetData]
  }
}

