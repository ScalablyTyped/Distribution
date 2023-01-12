package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecommendationsResponse extends StObject {
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.NextToken] = js.undefined
  
  /**
    * List of recommendations for the requested code review.
    */
  var RecommendationSummaries: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.RecommendationSummaries] = js.undefined
}
object ListRecommendationsResponse {
  
  inline def apply(): ListRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecommendationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRecommendationsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRecommendationSummaries(value: RecommendationSummaries): Self = StObject.set(x, "RecommendationSummaries", value.asInstanceOf[js.Any])
    
    inline def setRecommendationSummariesUndefined: Self = StObject.set(x, "RecommendationSummaries", js.undefined)
    
    inline def setRecommendationSummariesVarargs(value: RecommendationSummary*): Self = StObject.set(x, "RecommendationSummaries", js.Array(value*))
  }
}
