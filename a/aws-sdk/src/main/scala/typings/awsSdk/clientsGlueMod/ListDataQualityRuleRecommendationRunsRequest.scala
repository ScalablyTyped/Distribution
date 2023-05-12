package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataQualityRuleRecommendationRunsRequest extends StObject {
  
  /**
    * The filter criteria.
    */
  var Filter: js.UndefOr[DataQualityRuleRecommendationRunFilter] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A paginated token to offset the results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDataQualityRuleRecommendationRunsRequest {
  
  inline def apply(): ListDataQualityRuleRecommendationRunsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataQualityRuleRecommendationRunsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDataQualityRuleRecommendationRunsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: DataQualityRuleRecommendationRunFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
