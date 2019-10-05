package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroup extends js.Object {
  /**
    * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
    */
  var AutoScalingPolicy: js.UndefOr[AutoScalingPolicyDescription] = js.undefined
  /**
    * The maximum Spot price your are willing to pay for EC2 instances. An optional, nullable field that applies if the MarketType for the instance group is specified as SPOT. Specify the maximum spot price in USD. If the value is NULL and SPOT is specified, the maximum Spot price is set equal to the On-Demand price.
    */
  var BidPrice: js.UndefOr[String] = js.undefined
  /**
    *  Amazon EMR releases 4.x or later.  The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration for each instance group (master, core, and task).
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.undefined
  /**
    * The version number of the requested configuration specification for this instance group.
    */
  var ConfigurationsVersion: js.UndefOr[Long] = js.undefined
  /**
    * The EBS block devices that are mapped to this instance group.
    */
  var EbsBlockDevices: js.UndefOr[EbsBlockDeviceList] = js.undefined
  /**
    * If the instance group is EBS-optimized. An Amazon EBS-optimized instance uses an optimized configuration stack and provides additional, dedicated capacity for Amazon EBS I/O.
    */
  var EbsOptimized: js.UndefOr[BooleanObject] = js.undefined
  /**
    * The identifier of the instance group.
    */
  var Id: js.UndefOr[InstanceGroupId] = js.undefined
  /**
    * The type of the instance group. Valid values are MASTER, CORE or TASK.
    */
  var InstanceGroupType: js.UndefOr[typings.awsDashSdk.clientsEmrMod.InstanceGroupType] = js.undefined
  /**
    * The EC2 instance type for all instances in the instance group.
    */
  var InstanceType: js.UndefOr[typings.awsDashSdk.clientsEmrMod.InstanceType] = js.undefined
  /**
    * A list of configurations that were successfully applied for an instance group last time.
    */
  var LastSuccessfullyAppliedConfigurations: js.UndefOr[ConfigurationList] = js.undefined
  /**
    * The version number of a configuration specification that was successfully applied for an instance group last time. 
    */
  var LastSuccessfullyAppliedConfigurationsVersion: js.UndefOr[Long] = js.undefined
  /**
    * The marketplace to provision instances for this group. Valid values are ON_DEMAND or SPOT.
    */
  var Market: js.UndefOr[MarketType] = js.undefined
  /**
    * The name of the instance group.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The target number of instances for the instance group.
    */
  var RequestedInstanceCount: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances currently running in this instance group.
    */
  var RunningInstanceCount: js.UndefOr[Integer] = js.undefined
  /**
    * Policy for customizing shrink operations.
    */
  var ShrinkPolicy: js.UndefOr[typings.awsDashSdk.clientsEmrMod.ShrinkPolicy] = js.undefined
  /**
    * The current status of the instance group.
    */
  var Status: js.UndefOr[InstanceGroupStatus] = js.undefined
}

object InstanceGroup {
  @scala.inline
  def apply(
    AutoScalingPolicy: AutoScalingPolicyDescription = null,
    BidPrice: String = null,
    Configurations: ConfigurationList = null,
    ConfigurationsVersion: Int | Double = null,
    EbsBlockDevices: EbsBlockDeviceList = null,
    EbsOptimized: js.UndefOr[scala.Boolean] = js.undefined,
    Id: InstanceGroupId = null,
    InstanceGroupType: InstanceGroupType = null,
    InstanceType: InstanceType = null,
    LastSuccessfullyAppliedConfigurations: ConfigurationList = null,
    LastSuccessfullyAppliedConfigurationsVersion: Int | Double = null,
    Market: MarketType = null,
    Name: String = null,
    RequestedInstanceCount: Int | Double = null,
    RunningInstanceCount: Int | Double = null,
    ShrinkPolicy: ShrinkPolicy = null,
    Status: InstanceGroupStatus = null
  ): InstanceGroup = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingPolicy != null) __obj.updateDynamic("AutoScalingPolicy")(AutoScalingPolicy)
    if (BidPrice != null) __obj.updateDynamic("BidPrice")(BidPrice)
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations)
    if (ConfigurationsVersion != null) __obj.updateDynamic("ConfigurationsVersion")(ConfigurationsVersion.asInstanceOf[js.Any])
    if (EbsBlockDevices != null) __obj.updateDynamic("EbsBlockDevices")(EbsBlockDevices)
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (InstanceGroupType != null) __obj.updateDynamic("InstanceGroupType")(InstanceGroupType.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (LastSuccessfullyAppliedConfigurations != null) __obj.updateDynamic("LastSuccessfullyAppliedConfigurations")(LastSuccessfullyAppliedConfigurations)
    if (LastSuccessfullyAppliedConfigurationsVersion != null) __obj.updateDynamic("LastSuccessfullyAppliedConfigurationsVersion")(LastSuccessfullyAppliedConfigurationsVersion.asInstanceOf[js.Any])
    if (Market != null) __obj.updateDynamic("Market")(Market.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (RequestedInstanceCount != null) __obj.updateDynamic("RequestedInstanceCount")(RequestedInstanceCount.asInstanceOf[js.Any])
    if (RunningInstanceCount != null) __obj.updateDynamic("RunningInstanceCount")(RunningInstanceCount.asInstanceOf[js.Any])
    if (ShrinkPolicy != null) __obj.updateDynamic("ShrinkPolicy")(ShrinkPolicy)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[InstanceGroup]
  }
}

