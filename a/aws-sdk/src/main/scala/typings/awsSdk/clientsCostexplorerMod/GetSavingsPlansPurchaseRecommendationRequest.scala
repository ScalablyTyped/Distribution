package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavingsPlansPurchaseRecommendationRequest extends StObject {
  
  /**
    * The account scope that you want your recommendations for. Amazon Web Services calculates recommendations including the management account and member accounts if the value is set to PAYER. If the value is LINKED, recommendations are calculated for individual member accounts only.
    */
  var AccountScope: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.AccountScope] = js.undefined
  
  /**
    * You can filter your recommendations by Account ID with the LINKED_ACCOUNT dimension. To filter your recommendations by Account ID, specify Key as LINKED_ACCOUNT and Value as the comma-separated Acount ID(s) that you want to see Savings Plans purchase recommendations for. For GetSavingsPlansPurchaseRecommendation, the Filter doesn't include CostCategories or Tags. It only includes Dimensions. With Dimensions, Key must be LINKED_ACCOUNT and Value can be a single Account ID or multiple comma-separated Account IDs that you want to see Savings Plans Purchase Recommendations for. AND and OR operators are not supported.
    */
  var Filter: js.UndefOr[Expression] = js.undefined
  
  /**
    * The lookback period that's used to generate the recommendation.
    */
  var LookbackPeriodInDays: typings.awsSdk.clientsCostexplorerMod.LookbackPeriodInDays
  
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  
  /**
    * The number of recommendations that you want returned in a single response object.
    */
  var PageSize: js.UndefOr[NonNegativeInteger] = js.undefined
  
  /**
    * The payment option that's used to generate these recommendations.
    */
  var PaymentOption: typings.awsSdk.clientsCostexplorerMod.PaymentOption
  
  /**
    * The Savings Plans recommendation type that's requested.
    */
  var SavingsPlansType: SupportedSavingsPlansType
  
  /**
    * The savings plan recommendation term that's used to generate these recommendations.
    */
  var TermInYears: typings.awsSdk.clientsCostexplorerMod.TermInYears
}
object GetSavingsPlansPurchaseRecommendationRequest {
  
  inline def apply(
    LookbackPeriodInDays: LookbackPeriodInDays,
    PaymentOption: PaymentOption,
    SavingsPlansType: SupportedSavingsPlansType,
    TermInYears: TermInYears
  ): GetSavingsPlansPurchaseRecommendationRequest = {
    val __obj = js.Dynamic.literal(LookbackPeriodInDays = LookbackPeriodInDays.asInstanceOf[js.Any], PaymentOption = PaymentOption.asInstanceOf[js.Any], SavingsPlansType = SavingsPlansType.asInstanceOf[js.Any], TermInYears = TermInYears.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansPurchaseRecommendationRequest]
  }
  
  extension [Self <: GetSavingsPlansPurchaseRecommendationRequest](x: Self) {
    
    inline def setAccountScope(value: AccountScope): Self = StObject.set(x, "AccountScope", value.asInstanceOf[js.Any])
    
    inline def setAccountScopeUndefined: Self = StObject.set(x, "AccountScope", js.undefined)
    
    inline def setFilter(value: Expression): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setLookbackPeriodInDays(value: LookbackPeriodInDays): Self = StObject.set(x, "LookbackPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setPageSize(value: NonNegativeInteger): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setPaymentOption(value: PaymentOption): Self = StObject.set(x, "PaymentOption", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlansType(value: SupportedSavingsPlansType): Self = StObject.set(x, "SavingsPlansType", value.asInstanceOf[js.Any])
    
    inline def setTermInYears(value: TermInYears): Self = StObject.set(x, "TermInYears", value.asInstanceOf[js.Any])
  }
}
