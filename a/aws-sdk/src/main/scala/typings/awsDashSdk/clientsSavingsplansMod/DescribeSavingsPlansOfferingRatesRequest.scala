package typings.awsDashSdk.clientsSavingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSavingsPlansOfferingRatesRequest extends js.Object {
  /**
    * The filters.
    */
  var filters: js.UndefOr[SavingsPlanOfferingRateFiltersList] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve additional results, make another call with the returned token value.
    */
  var maxResults: js.UndefOr[PageSize] = js.native
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The specific AWS operation for the line item in the billing report.
    */
  var operations: js.UndefOr[SavingsPlanRateOperationList] = js.native
  /**
    * The AWS products.
    */
  var products: js.UndefOr[SavingsPlanProductTypeList] = js.native
  /**
    * The IDs of the offerings.
    */
  var savingsPlanOfferingIds: js.UndefOr[UUIDs] = js.native
  /**
    * The payment options.
    */
  var savingsPlanPaymentOptions: js.UndefOr[SavingsPlanPaymentOptionList] = js.native
  /**
    * The plan types.
    */
  var savingsPlanTypes: js.UndefOr[SavingsPlanTypeList] = js.native
  /**
    * The services.
    */
  var serviceCodes: js.UndefOr[SavingsPlanRateServiceCodeList] = js.native
  /**
    * The usage details of the line item in the billing report.
    */
  var usageTypes: js.UndefOr[SavingsPlanRateUsageTypeList] = js.native
}

object DescribeSavingsPlansOfferingRatesRequest {
  @scala.inline
  def apply(
    filters: SavingsPlanOfferingRateFiltersList = null,
    maxResults: Int | Double = null,
    nextToken: PaginationToken = null,
    operations: SavingsPlanRateOperationList = null,
    products: SavingsPlanProductTypeList = null,
    savingsPlanOfferingIds: UUIDs = null,
    savingsPlanPaymentOptions: SavingsPlanPaymentOptionList = null,
    savingsPlanTypes: SavingsPlanTypeList = null,
    serviceCodes: SavingsPlanRateServiceCodeList = null,
    usageTypes: SavingsPlanRateUsageTypeList = null
  ): DescribeSavingsPlansOfferingRatesRequest = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    if (savingsPlanOfferingIds != null) __obj.updateDynamic("savingsPlanOfferingIds")(savingsPlanOfferingIds.asInstanceOf[js.Any])
    if (savingsPlanPaymentOptions != null) __obj.updateDynamic("savingsPlanPaymentOptions")(savingsPlanPaymentOptions.asInstanceOf[js.Any])
    if (savingsPlanTypes != null) __obj.updateDynamic("savingsPlanTypes")(savingsPlanTypes.asInstanceOf[js.Any])
    if (serviceCodes != null) __obj.updateDynamic("serviceCodes")(serviceCodes.asInstanceOf[js.Any])
    if (usageTypes != null) __obj.updateDynamic("usageTypes")(usageTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSavingsPlansOfferingRatesRequest]
  }
}

