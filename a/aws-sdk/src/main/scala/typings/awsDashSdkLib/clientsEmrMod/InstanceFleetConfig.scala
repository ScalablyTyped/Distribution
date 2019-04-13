package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceFleetConfig extends js.Object {
  /**
    * The node type that the instance fleet hosts. Valid values are MASTER,CORE,and TASK.
    */
  var InstanceFleetType: awsDashSdkLib.clientsEmrMod.InstanceFleetType
  /**
    * The instance type configurations that define the EC2 instances in the instance fleet.
    */
  var InstanceTypeConfigs: js.UndefOr[InstanceTypeConfigList] = js.undefined
  /**
    * The launch specification for the instance fleet.
    */
  var LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications] = js.undefined
  /**
    * The friendly name of the instance fleet.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
  /**
    * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When an On-Demand instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units.  If not specified or set to 0, only Spot instances are provisioned for the instance fleet using TargetSpotCapacity. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined
  /**
    * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision. When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When a Spot instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units.  If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
}

object InstanceFleetConfig {
  @scala.inline
  def apply(
    InstanceFleetType: InstanceFleetType,
    InstanceTypeConfigs: InstanceTypeConfigList = null,
    LaunchSpecifications: InstanceFleetProvisioningSpecifications = null,
    Name: XmlStringMaxLen256 = null,
    TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined,
    TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
  ): InstanceFleetConfig = {
    val __obj = js.Dynamic.literal(InstanceFleetType = InstanceFleetType.asInstanceOf[js.Any])
    if (InstanceTypeConfigs != null) __obj.updateDynamic("InstanceTypeConfigs")(InstanceTypeConfigs)
    if (LaunchSpecifications != null) __obj.updateDynamic("LaunchSpecifications")(LaunchSpecifications)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(TargetOnDemandCapacity)) __obj.updateDynamic("TargetOnDemandCapacity")(TargetOnDemandCapacity)
    if (!js.isUndefined(TargetSpotCapacity)) __obj.updateDynamic("TargetSpotCapacity")(TargetSpotCapacity)
    __obj.asInstanceOf[InstanceFleetConfig]
  }
}

