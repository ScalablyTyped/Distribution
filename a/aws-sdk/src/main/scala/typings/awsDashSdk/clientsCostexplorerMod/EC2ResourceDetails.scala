package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC2ResourceDetails extends js.Object {
  /**
    *  Hourly public On Demand rate for the instance type.
    */
  var HourlyOnDemandRate: js.UndefOr[GenericString] = js.undefined
  /**
    *  The type of Amazon Web Services instance.
    */
  var InstanceType: js.UndefOr[GenericString] = js.undefined
  /**
    *  Memory capacity of Amazon Web Services instance.
    */
  var Memory: js.UndefOr[GenericString] = js.undefined
  /**
    *  Network performance capacity of the Amazon Web Services instance.
    */
  var NetworkPerformance: js.UndefOr[GenericString] = js.undefined
  /**
    *  The platform of the Amazon Web Services instance. The platform is the specific combination of operating system, license model, and software on an instance.
    */
  var Platform: js.UndefOr[GenericString] = js.undefined
  /**
    *  The Amazon Web Services Region of the instance.
    */
  var Region: js.UndefOr[GenericString] = js.undefined
  /**
    *  The SKU of the product.
    */
  var Sku: js.UndefOr[GenericString] = js.undefined
  /**
    *  The disk storage of the Amazon Web Services instance (Not EBS storage).
    */
  var Storage: js.UndefOr[GenericString] = js.undefined
  /**
    *  Number of VCPU cores in the Amazon Web Services instance type.
    */
  var Vcpu: js.UndefOr[GenericString] = js.undefined
}

object EC2ResourceDetails {
  @scala.inline
  def apply(
    HourlyOnDemandRate: GenericString = null,
    InstanceType: GenericString = null,
    Memory: GenericString = null,
    NetworkPerformance: GenericString = null,
    Platform: GenericString = null,
    Region: GenericString = null,
    Sku: GenericString = null,
    Storage: GenericString = null,
    Vcpu: GenericString = null
  ): EC2ResourceDetails = {
    val __obj = js.Dynamic.literal()
    if (HourlyOnDemandRate != null) __obj.updateDynamic("HourlyOnDemandRate")(HourlyOnDemandRate)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (Memory != null) __obj.updateDynamic("Memory")(Memory)
    if (NetworkPerformance != null) __obj.updateDynamic("NetworkPerformance")(NetworkPerformance)
    if (Platform != null) __obj.updateDynamic("Platform")(Platform)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (Sku != null) __obj.updateDynamic("Sku")(Sku)
    if (Storage != null) __obj.updateDynamic("Storage")(Storage)
    if (Vcpu != null) __obj.updateDynamic("Vcpu")(Vcpu)
    __obj.asInstanceOf[EC2ResourceDetails]
  }
}

