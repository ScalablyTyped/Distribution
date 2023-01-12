package typings.awsSdk.clientsSavingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSavingsPlansOfferingsRequest extends StObject {
  
  /**
    * The currencies.
    */
  var currencies: js.UndefOr[CurrencyList] = js.undefined
  
  /**
    * The descriptions.
    */
  var descriptions: js.UndefOr[SavingsPlanDescriptionsList] = js.undefined
  
  /**
    * The durations, in seconds.
    */
  var durations: js.UndefOr[DurationsList] = js.undefined
  
  /**
    * The filters.
    */
  var filters: js.UndefOr[SavingsPlanOfferingFiltersList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve additional results, make another call with the returned token value.
    */
  var maxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The IDs of the offerings.
    */
  var offeringIds: js.UndefOr[UUIDs] = js.undefined
  
  /**
    * The specific AWS operation for the line item in the billing report.
    */
  var operations: js.UndefOr[SavingsPlanOperationList] = js.undefined
  
  /**
    * The payment options.
    */
  var paymentOptions: js.UndefOr[SavingsPlanPaymentOptionList] = js.undefined
  
  /**
    * The plan type.
    */
  var planTypes: js.UndefOr[SavingsPlanTypeList] = js.undefined
  
  /**
    * The product type.
    */
  var productType: js.UndefOr[SavingsPlanProductType] = js.undefined
  
  /**
    * The services.
    */
  var serviceCodes: js.UndefOr[SavingsPlanServiceCodeList] = js.undefined
  
  /**
    * The usage details of the line item in the billing report.
    */
  var usageTypes: js.UndefOr[SavingsPlanUsageTypeList] = js.undefined
}
object DescribeSavingsPlansOfferingsRequest {
  
  inline def apply(): DescribeSavingsPlansOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlansOfferingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSavingsPlansOfferingsRequest] (val x: Self) extends AnyVal {
    
    inline def setCurrencies(value: CurrencyList): Self = StObject.set(x, "currencies", value.asInstanceOf[js.Any])
    
    inline def setCurrenciesUndefined: Self = StObject.set(x, "currencies", js.undefined)
    
    inline def setCurrenciesVarargs(value: CurrencyCode*): Self = StObject.set(x, "currencies", js.Array(value*))
    
    inline def setDescriptions(value: SavingsPlanDescriptionsList): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    inline def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
    
    inline def setDescriptionsVarargs(value: SavingsPlanDescription*): Self = StObject.set(x, "descriptions", js.Array(value*))
    
    inline def setDurations(value: DurationsList): Self = StObject.set(x, "durations", value.asInstanceOf[js.Any])
    
    inline def setDurationsUndefined: Self = StObject.set(x, "durations", js.undefined)
    
    inline def setDurationsVarargs(value: SavingsPlansDuration*): Self = StObject.set(x, "durations", js.Array(value*))
    
    inline def setFilters(value: SavingsPlanOfferingFiltersList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: SavingsPlanOfferingFilterElement*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOfferingIds(value: UUIDs): Self = StObject.set(x, "offeringIds", value.asInstanceOf[js.Any])
    
    inline def setOfferingIdsUndefined: Self = StObject.set(x, "offeringIds", js.undefined)
    
    inline def setOfferingIdsVarargs(value: UUID*): Self = StObject.set(x, "offeringIds", js.Array(value*))
    
    inline def setOperations(value: SavingsPlanOperationList): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: SavingsPlanOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setPaymentOptions(value: SavingsPlanPaymentOptionList): Self = StObject.set(x, "paymentOptions", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionsUndefined: Self = StObject.set(x, "paymentOptions", js.undefined)
    
    inline def setPaymentOptionsVarargs(value: SavingsPlanPaymentOption*): Self = StObject.set(x, "paymentOptions", js.Array(value*))
    
    inline def setPlanTypes(value: SavingsPlanTypeList): Self = StObject.set(x, "planTypes", value.asInstanceOf[js.Any])
    
    inline def setPlanTypesUndefined: Self = StObject.set(x, "planTypes", js.undefined)
    
    inline def setPlanTypesVarargs(value: SavingsPlanType*): Self = StObject.set(x, "planTypes", js.Array(value*))
    
    inline def setProductType(value: SavingsPlanProductType): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
    
    inline def setProductTypeUndefined: Self = StObject.set(x, "productType", js.undefined)
    
    inline def setServiceCodes(value: SavingsPlanServiceCodeList): Self = StObject.set(x, "serviceCodes", value.asInstanceOf[js.Any])
    
    inline def setServiceCodesUndefined: Self = StObject.set(x, "serviceCodes", js.undefined)
    
    inline def setServiceCodesVarargs(value: SavingsPlanServiceCode*): Self = StObject.set(x, "serviceCodes", js.Array(value*))
    
    inline def setUsageTypes(value: SavingsPlanUsageTypeList): Self = StObject.set(x, "usageTypes", value.asInstanceOf[js.Any])
    
    inline def setUsageTypesUndefined: Self = StObject.set(x, "usageTypes", js.undefined)
    
    inline def setUsageTypesVarargs(value: SavingsPlanUsageType*): Self = StObject.set(x, "usageTypes", js.Array(value*))
  }
}
