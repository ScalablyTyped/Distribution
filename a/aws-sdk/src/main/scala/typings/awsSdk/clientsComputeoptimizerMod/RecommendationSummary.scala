package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationSummary extends StObject {
  
  /**
    * The Amazon Web Services account ID of the recommendation summary.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * An object that describes the performance risk ratings for a given resource type.
    */
  var currentPerformanceRiskRatings: js.UndefOr[CurrentPerformanceRiskRatings] = js.undefined
  
  /**
    * The resource type that the recommendation summary applies to.
    */
  var recommendationResourceType: js.UndefOr[RecommendationSourceType] = js.undefined
  
  /**
    * An object that describes the savings opportunity for a given resource type. Savings opportunity includes the estimated monthly savings amount and percentage.
    */
  var savingsOpportunity: js.UndefOr[SavingsOpportunity] = js.undefined
  
  /**
    * An array of objects that describe a recommendation summary.
    */
  var summaries: js.UndefOr[Summaries] = js.undefined
}
object RecommendationSummary {
  
  inline def apply(): RecommendationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationSummary] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCurrentPerformanceRiskRatings(value: CurrentPerformanceRiskRatings): Self = StObject.set(x, "currentPerformanceRiskRatings", value.asInstanceOf[js.Any])
    
    inline def setCurrentPerformanceRiskRatingsUndefined: Self = StObject.set(x, "currentPerformanceRiskRatings", js.undefined)
    
    inline def setRecommendationResourceType(value: RecommendationSourceType): Self = StObject.set(x, "recommendationResourceType", value.asInstanceOf[js.Any])
    
    inline def setRecommendationResourceTypeUndefined: Self = StObject.set(x, "recommendationResourceType", js.undefined)
    
    inline def setSavingsOpportunity(value: SavingsOpportunity): Self = StObject.set(x, "savingsOpportunity", value.asInstanceOf[js.Any])
    
    inline def setSavingsOpportunityUndefined: Self = StObject.set(x, "savingsOpportunity", js.undefined)
    
    inline def setSummaries(value: Summaries): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
    
    inline def setSummariesVarargs(value: Summary*): Self = StObject.set(x, "summaries", js.Array(value*))
  }
}
