package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationPurchaseRecommendation extends StObject {
  
  /**
    * The account scope that Amazon Web Services recommends that you purchase this instance for. For example, you can purchase this reservation for an entire organization in Amazon Web Services Organizations.
    */
  var AccountScope: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.AccountScope] = js.undefined
  
  /**
    * How many days of previous usage that Amazon Web Services considers when making this recommendation.
    */
  var LookbackPeriodInDays: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.LookbackPeriodInDays] = js.undefined
  
  /**
    * The payment option for the reservation (for example, AllUpfront or NoUpfront).
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.PaymentOption] = js.undefined
  
  /**
    * Details about the recommended purchases.
    */
  var RecommendationDetails: js.UndefOr[ReservationPurchaseRecommendationDetails] = js.undefined
  
  /**
    * A summary about the recommended purchase.
    */
  var RecommendationSummary: js.UndefOr[ReservationPurchaseRecommendationSummary] = js.undefined
  
  /**
    * Hardware specifications for the service that you want recommendations for.
    */
  var ServiceSpecification: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.ServiceSpecification] = js.undefined
  
  /**
    * The term of the reservation that you want recommendations for, in years.
    */
  var TermInYears: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.TermInYears] = js.undefined
}
object ReservationPurchaseRecommendation {
  
  inline def apply(): ReservationPurchaseRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationPurchaseRecommendation]
  }
  
  extension [Self <: ReservationPurchaseRecommendation](x: Self) {
    
    inline def setAccountScope(value: AccountScope): Self = StObject.set(x, "AccountScope", value.asInstanceOf[js.Any])
    
    inline def setAccountScopeUndefined: Self = StObject.set(x, "AccountScope", js.undefined)
    
    inline def setLookbackPeriodInDays(value: LookbackPeriodInDays): Self = StObject.set(x, "LookbackPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setLookbackPeriodInDaysUndefined: Self = StObject.set(x, "LookbackPeriodInDays", js.undefined)
    
    inline def setPaymentOption(value: PaymentOption): Self = StObject.set(x, "PaymentOption", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionUndefined: Self = StObject.set(x, "PaymentOption", js.undefined)
    
    inline def setRecommendationDetails(value: ReservationPurchaseRecommendationDetails): Self = StObject.set(x, "RecommendationDetails", value.asInstanceOf[js.Any])
    
    inline def setRecommendationDetailsUndefined: Self = StObject.set(x, "RecommendationDetails", js.undefined)
    
    inline def setRecommendationDetailsVarargs(value: ReservationPurchaseRecommendationDetail*): Self = StObject.set(x, "RecommendationDetails", js.Array(value*))
    
    inline def setRecommendationSummary(value: ReservationPurchaseRecommendationSummary): Self = StObject.set(x, "RecommendationSummary", value.asInstanceOf[js.Any])
    
    inline def setRecommendationSummaryUndefined: Self = StObject.set(x, "RecommendationSummary", js.undefined)
    
    inline def setServiceSpecification(value: ServiceSpecification): Self = StObject.set(x, "ServiceSpecification", value.asInstanceOf[js.Any])
    
    inline def setServiceSpecificationUndefined: Self = StObject.set(x, "ServiceSpecification", js.undefined)
    
    inline def setTermInYears(value: TermInYears): Self = StObject.set(x, "TermInYears", value.asInstanceOf[js.Any])
    
    inline def setTermInYearsUndefined: Self = StObject.set(x, "TermInYears", js.undefined)
  }
}
