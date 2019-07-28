package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupConfig extends js.Object {
  /**
    * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. See PutAutoScalingPolicy.
    */
  var AutoScalingPolicy: js.UndefOr[typings.awsDashSdk.clientsEmrMod.AutoScalingPolicy] = js.undefined
  /**
    * The maximum Spot price your are willing to pay for EC2 instances. An optional, nullable field that applies if the MarketType for the instance group is specified as SPOT. Specify the maximum spot price in USD. If the value is NULL and SPOT is specified, the maximum Spot price is set equal to the On-Demand price.
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined
  /**
    *  Amazon EMR releases 4.x or later.  The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration for each instance group (master, core, and task).
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.undefined
  /**
    * EBS configurations that will be attached to each EC2 instance in the instance group.
    */
  var EbsConfiguration: js.UndefOr[typings.awsDashSdk.clientsEmrMod.EbsConfiguration] = js.undefined
  /**
    * Target number of instances for the instance group.
    */
  var InstanceCount: Integer
  /**
    * The role of the instance group in the cluster.
    */
  var InstanceRole: InstanceRoleType
  /**
    * The EC2 instance type for all instances in the instance group.
    */
  var InstanceType: typings.awsDashSdk.clientsEmrMod.InstanceType
  /**
    * Market type of the EC2 instances used to create a cluster node.
    */
  var Market: js.UndefOr[MarketType] = js.undefined
  /**
    * Friendly name given to the instance group.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
}

object InstanceGroupConfig {
  @scala.inline
  def apply(
    InstanceCount: Integer,
    InstanceRole: InstanceRoleType,
    InstanceType: InstanceType,
    AutoScalingPolicy: AutoScalingPolicy = null,
    BidPrice: XmlStringMaxLen256 = null,
    Configurations: ConfigurationList = null,
    EbsConfiguration: EbsConfiguration = null,
    Market: MarketType = null,
    Name: XmlStringMaxLen256 = null
  ): InstanceGroupConfig = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount, InstanceRole = InstanceRole.asInstanceOf[js.Any], InstanceType = InstanceType)
    if (AutoScalingPolicy != null) __obj.updateDynamic("AutoScalingPolicy")(AutoScalingPolicy)
    if (BidPrice != null) __obj.updateDynamic("BidPrice")(BidPrice)
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations)
    if (EbsConfiguration != null) __obj.updateDynamic("EbsConfiguration")(EbsConfiguration)
    if (Market != null) __obj.updateDynamic("Market")(Market.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[InstanceGroupConfig]
  }
}

