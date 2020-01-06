package typings.awsDashSdk.clientsSavingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanOffering extends js.Object {
  /**
    * The currency.
    */
  var currency: js.UndefOr[CurrencyCode] = js.native
  /**
    * The description.
    */
  var description: js.UndefOr[SavingsPlanDescription] = js.native
  /**
    * The duration, in seconds.
    */
  var durationSeconds: js.UndefOr[SavingsPlansDuration] = js.native
  /**
    * The ID of the offering.
    */
  var offeringId: js.UndefOr[UUID] = js.native
  /**
    * The specific AWS operation for the line item in the billing report.
    */
  var operation: js.UndefOr[SavingsPlanOperation] = js.native
  /**
    * The payment option.
    */
  var paymentOption: js.UndefOr[SavingsPlanPaymentOption] = js.native
  /**
    * The plan type.
    */
  var planType: js.UndefOr[SavingsPlanType] = js.native
  /**
    * The product type.
    */
  var productTypes: js.UndefOr[SavingsPlanProductTypeList] = js.native
  /**
    * The properties.
    */
  var properties: js.UndefOr[SavingsPlanOfferingPropertyList] = js.native
  /**
    * The service.
    */
  var serviceCode: js.UndefOr[SavingsPlanServiceCode] = js.native
  /**
    * The usage details of the line item in the billing report.
    */
  var usageType: js.UndefOr[SavingsPlanUsageType] = js.native
}

object SavingsPlanOffering {
  @scala.inline
  def apply(
    currency: CurrencyCode = null,
    description: SavingsPlanDescription = null,
    durationSeconds: Int | Double = null,
    offeringId: UUID = null,
    operation: SavingsPlanOperation = null,
    paymentOption: SavingsPlanPaymentOption = null,
    planType: SavingsPlanType = null,
    productTypes: SavingsPlanProductTypeList = null,
    properties: SavingsPlanOfferingPropertyList = null,
    serviceCode: SavingsPlanServiceCode = null,
    usageType: SavingsPlanUsageType = null
  ): SavingsPlanOffering = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (durationSeconds != null) __obj.updateDynamic("durationSeconds")(durationSeconds.asInstanceOf[js.Any])
    if (offeringId != null) __obj.updateDynamic("offeringId")(offeringId.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (paymentOption != null) __obj.updateDynamic("paymentOption")(paymentOption.asInstanceOf[js.Any])
    if (planType != null) __obj.updateDynamic("planType")(planType.asInstanceOf[js.Any])
    if (productTypes != null) __obj.updateDynamic("productTypes")(productTypes.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (serviceCode != null) __obj.updateDynamic("serviceCode")(serviceCode.asInstanceOf[js.Any])
    if (usageType != null) __obj.updateDynamic("usageType")(usageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlanOffering]
  }
}

