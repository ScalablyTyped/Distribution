package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataQualityRuleRecommendationRunsResponse extends StObject {
  
  /**
    * A pagination token, if more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A list of DataQualityRuleRecommendationRunDescription objects.
    */
  var Runs: js.UndefOr[DataQualityRuleRecommendationRunList] = js.undefined
}
object ListDataQualityRuleRecommendationRunsResponse {
  
  inline def apply(): ListDataQualityRuleRecommendationRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataQualityRuleRecommendationRunsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDataQualityRuleRecommendationRunsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRuns(value: DataQualityRuleRecommendationRunList): Self = StObject.set(x, "Runs", value.asInstanceOf[js.Any])
    
    inline def setRunsUndefined: Self = StObject.set(x, "Runs", js.undefined)
    
    inline def setRunsVarargs(value: DataQualityRuleRecommendationRunDescription*): Self = StObject.set(x, "Runs", js.Array(value*))
  }
}
