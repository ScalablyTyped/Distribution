package typings.awsDashSdk.clientsSavingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanOfferingRate extends js.Object {
  /**
    * The specific AWS operation for the line item in the billing report.
    */
  var operation: js.UndefOr[SavingsPlanRateOperation] = js.native
  /**
    * The product type.
    */
  var productType: js.UndefOr[SavingsPlanProductType] = js.native
  /**
    * The properties.
    */
  var properties: js.UndefOr[SavingsPlanOfferingRatePropertyList] = js.native
  /**
    * The Savings Plan rate.
    */
  var rate: js.UndefOr[SavingsPlanRatePricePerUnit] = js.native
  /**
    * The Savings Plan offering.
    */
  var savingsPlanOffering: js.UndefOr[ParentSavingsPlanOffering] = js.native
  /**
    * The service.
    */
  var serviceCode: js.UndefOr[SavingsPlanRateServiceCode] = js.native
  /**
    * The unit.
    */
  var unit: js.UndefOr[SavingsPlanRateUnit] = js.native
  /**
    * The usage details of the line item in the billing report.
    */
  var usageType: js.UndefOr[SavingsPlanRateUsageType] = js.native
}

object SavingsPlanOfferingRate {
  @scala.inline
  def apply(
    operation: SavingsPlanRateOperation = null,
    productType: SavingsPlanProductType = null,
    properties: SavingsPlanOfferingRatePropertyList = null,
    rate: SavingsPlanRatePricePerUnit = null,
    savingsPlanOffering: ParentSavingsPlanOffering = null,
    serviceCode: SavingsPlanRateServiceCode = null,
    unit: SavingsPlanRateUnit = null,
    usageType: SavingsPlanRateUsageType = null
  ): SavingsPlanOfferingRate = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (productType != null) __obj.updateDynamic("productType")(productType.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (savingsPlanOffering != null) __obj.updateDynamic("savingsPlanOffering")(savingsPlanOffering.asInstanceOf[js.Any])
    if (serviceCode != null) __obj.updateDynamic("serviceCode")(serviceCode.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (usageType != null) __obj.updateDynamic("usageType")(usageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlanOfferingRate]
  }
}

