package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceFleet extends js.Object {
  /**
    * The unique identifier of the instance fleet.
    */
  var Id: js.UndefOr[InstanceFleetId] = js.undefined
  /**
    * The node type that the instance fleet hosts. Valid values are MASTER, CORE, or TASK. 
    */
  var InstanceFleetType: js.UndefOr[InstanceFleetType] = js.undefined
  /**
    * The specification for the instance types that comprise an instance fleet. Up to five unique instance specifications may be defined for each instance fleet. 
    */
  var InstanceTypeSpecifications: js.UndefOr[InstanceTypeSpecificationList] = js.undefined
  /**
    * Describes the launch specification for an instance fleet. 
    */
  var LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications] = js.undefined
  /**
    * A friendly name for the instance fleet.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
  /**
    * The number of On-Demand units that have been provisioned for the instance fleet to fulfill TargetOnDemandCapacity. This provisioned capacity might be less than or greater than TargetOnDemandCapacity.
    */
  var ProvisionedOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined
  /**
    * The number of Spot units that have been provisioned for this instance fleet to fulfill TargetSpotCapacity. This provisioned capacity might be less than or greater than TargetSpotCapacity.
    */
  var ProvisionedSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
  /**
    * The current status of the instance fleet. 
    */
  var Status: js.UndefOr[InstanceFleetStatus] = js.undefined
  /**
    * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When an On-Demand instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units. You can use InstanceFleet$ProvisionedOnDemandCapacity to determine the Spot capacity units that have been provisioned for the instance fleet.  If not specified or set to 0, only Spot instances are provisioned for the instance fleet using TargetSpotCapacity. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined
  /**
    * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision. When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When a Spot instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units. You can use InstanceFleet$ProvisionedSpotCapacity to determine the Spot capacity units that have been provisioned for the instance fleet.  If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
}

object InstanceFleet {
  @scala.inline
  def apply(
    Id: InstanceFleetId = null,
    InstanceFleetType: InstanceFleetType = null,
    InstanceTypeSpecifications: InstanceTypeSpecificationList = null,
    LaunchSpecifications: InstanceFleetProvisioningSpecifications = null,
    Name: XmlStringMaxLen256 = null,
    ProvisionedOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined,
    ProvisionedSpotCapacity: js.UndefOr[WholeNumber] = js.undefined,
    Status: InstanceFleetStatus = null,
    TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined,
    TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
  ): InstanceFleet = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (InstanceFleetType != null) __obj.updateDynamic("InstanceFleetType")(InstanceFleetType.asInstanceOf[js.Any])
    if (InstanceTypeSpecifications != null) __obj.updateDynamic("InstanceTypeSpecifications")(InstanceTypeSpecifications)
    if (LaunchSpecifications != null) __obj.updateDynamic("LaunchSpecifications")(LaunchSpecifications)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(ProvisionedOnDemandCapacity)) __obj.updateDynamic("ProvisionedOnDemandCapacity")(ProvisionedOnDemandCapacity)
    if (!js.isUndefined(ProvisionedSpotCapacity)) __obj.updateDynamic("ProvisionedSpotCapacity")(ProvisionedSpotCapacity)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (!js.isUndefined(TargetOnDemandCapacity)) __obj.updateDynamic("TargetOnDemandCapacity")(TargetOnDemandCapacity)
    if (!js.isUndefined(TargetSpotCapacity)) __obj.updateDynamic("TargetSpotCapacity")(TargetSpotCapacity)
    __obj.asInstanceOf[InstanceFleet]
  }
}

