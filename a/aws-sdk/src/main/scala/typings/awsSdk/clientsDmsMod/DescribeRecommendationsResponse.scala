package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecommendationsResponse extends StObject {
  
  /**
    * The unique pagination token returned for you to pass to a subsequent request. Fleet Advisor returns this token when the number of records in the response is greater than the MaxRecords value. To retrieve the next page, make the call again using the returned token and keeping all other arguments unchanged.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of recommendations of target engines that Fleet Advisor created for the source database.
    */
  var Recommendations: js.UndefOr[RecommendationList] = js.undefined
}
object DescribeRecommendationsResponse {
  
  inline def apply(): DescribeRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecommendationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRecommendationsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRecommendations(value: RecommendationList): Self = StObject.set(x, "Recommendations", value.asInstanceOf[js.Any])
    
    inline def setRecommendationsUndefined: Self = StObject.set(x, "Recommendations", js.undefined)
    
    inline def setRecommendationsVarargs(value: Recommendation*): Self = StObject.set(x, "Recommendations", js.Array(value*))
  }
}
