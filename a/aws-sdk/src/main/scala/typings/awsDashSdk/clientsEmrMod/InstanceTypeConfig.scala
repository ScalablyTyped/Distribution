package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceTypeConfig extends js.Object {
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD. If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%. 
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by InstanceType. Expressed as a number (for example, 20 specifies 20%). If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%.
    */
  var BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble] = js.native
  /**
    * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by InstanceType. 
    */
  var EbsConfiguration: js.UndefOr[typings.awsDashSdk.clientsEmrMod.EbsConfiguration] = js.native
  /**
    * An EC2 instance type, such as m3.xlarge. 
    */
  var InstanceType: typings.awsDashSdk.clientsEmrMod.InstanceType = js.native
  /**
    * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in InstanceFleetConfig. This value is 1 for a master instance fleet, and must be 1 or greater for core and task instance fleets. Defaults to 1 if not specified. 
    */
  var WeightedCapacity: js.UndefOr[WholeNumber] = js.native
}

object InstanceTypeConfig {
  @scala.inline
  def apply(
    InstanceType: InstanceType,
    BidPrice: XmlStringMaxLen256 = null,
    BidPriceAsPercentageOfOnDemandPrice: Int | Double = null,
    Configurations: ConfigurationList = null,
    EbsConfiguration: EbsConfiguration = null,
    WeightedCapacity: Int | Double = null
  ): InstanceTypeConfig = {
    val __obj = js.Dynamic.literal(InstanceType = InstanceType.asInstanceOf[js.Any])
    if (BidPrice != null) __obj.updateDynamic("BidPrice")(BidPrice.asInstanceOf[js.Any])
    if (BidPriceAsPercentageOfOnDemandPrice != null) __obj.updateDynamic("BidPriceAsPercentageOfOnDemandPrice")(BidPriceAsPercentageOfOnDemandPrice.asInstanceOf[js.Any])
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations.asInstanceOf[js.Any])
    if (EbsConfiguration != null) __obj.updateDynamic("EbsConfiguration")(EbsConfiguration.asInstanceOf[js.Any])
    if (WeightedCapacity != null) __obj.updateDynamic("WeightedCapacity")(WeightedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceTypeConfig]
  }
}

