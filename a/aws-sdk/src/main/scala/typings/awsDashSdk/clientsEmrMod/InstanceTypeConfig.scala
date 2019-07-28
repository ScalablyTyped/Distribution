package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceTypeConfig extends js.Object {
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD. If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%. 
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined
  /**
    * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by InstanceType. Expressed as a number (for example, 20 specifies 20%). If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%.
    */
  var BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble] = js.undefined
  /**
    * A configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.undefined
  /**
    * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by InstanceType. 
    */
  var EbsConfiguration: js.UndefOr[typings.awsDashSdk.clientsEmrMod.EbsConfiguration] = js.undefined
  /**
    * An EC2 instance type, such as m3.xlarge. 
    */
  var InstanceType: typings.awsDashSdk.clientsEmrMod.InstanceType
  /**
    * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities defined in InstanceFleetConfig. This value is 1 for a master instance fleet, and must be 1 or greater for core and task instance fleets. Defaults to 1 if not specified. 
    */
  var WeightedCapacity: js.UndefOr[WholeNumber] = js.undefined
}

object InstanceTypeConfig {
  @scala.inline
  def apply(
    InstanceType: InstanceType,
    BidPrice: XmlStringMaxLen256 = null,
    BidPriceAsPercentageOfOnDemandPrice: js.UndefOr[NonNegativeDouble] = js.undefined,
    Configurations: ConfigurationList = null,
    EbsConfiguration: EbsConfiguration = null,
    WeightedCapacity: js.UndefOr[WholeNumber] = js.undefined
  ): InstanceTypeConfig = {
    val __obj = js.Dynamic.literal(InstanceType = InstanceType)
    if (BidPrice != null) __obj.updateDynamic("BidPrice")(BidPrice)
    if (!js.isUndefined(BidPriceAsPercentageOfOnDemandPrice)) __obj.updateDynamic("BidPriceAsPercentageOfOnDemandPrice")(BidPriceAsPercentageOfOnDemandPrice)
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations)
    if (EbsConfiguration != null) __obj.updateDynamic("EbsConfiguration")(EbsConfiguration)
    if (!js.isUndefined(WeightedCapacity)) __obj.updateDynamic("WeightedCapacity")(WeightedCapacity)
    __obj.asInstanceOf[InstanceTypeConfig]
  }
}

