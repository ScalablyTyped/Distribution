package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecommendationsResponse extends StObject {
  
  /**
    * A string token indicating that there might be additional recommendations available to be listed. Use the token provided in the ListRecommendationsResponse to use in the subsequent call to ListRecommendations with the same parameters to retrieve the next page of recommendations.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSesv2Mod.NextToken] = js.undefined
  
  /**
    * The recommendations applicable to your account.
    */
  var Recommendations: js.UndefOr[RecommendationsList] = js.undefined
}
object ListRecommendationsResponse {
  
  inline def apply(): ListRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecommendationsResponse]
  }
  
  extension [Self <: ListRecommendationsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRecommendations(value: RecommendationsList): Self = StObject.set(x, "Recommendations", value.asInstanceOf[js.Any])
    
    inline def setRecommendationsUndefined: Self = StObject.set(x, "Recommendations", js.undefined)
    
    inline def setRecommendationsVarargs(value: Recommendation*): Self = StObject.set(x, "Recommendations", js.Array(value*))
  }
}
