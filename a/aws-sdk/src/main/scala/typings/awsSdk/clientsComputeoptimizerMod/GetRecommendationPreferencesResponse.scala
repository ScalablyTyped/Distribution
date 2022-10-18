package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecommendationPreferencesResponse extends StObject {
  
  /**
    * The token to use to advance to the next page of recommendation preferences. This value is null when there are no more pages of recommendation preferences to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of objects that describe recommendation preferences.
    */
  var recommendationPreferencesDetails: js.UndefOr[RecommendationPreferencesDetails] = js.undefined
}
object GetRecommendationPreferencesResponse {
  
  inline def apply(): GetRecommendationPreferencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecommendationPreferencesResponse]
  }
  
  extension [Self <: GetRecommendationPreferencesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRecommendationPreferencesDetails(value: RecommendationPreferencesDetails): Self = StObject.set(x, "recommendationPreferencesDetails", value.asInstanceOf[js.Any])
    
    inline def setRecommendationPreferencesDetailsUndefined: Self = StObject.set(x, "recommendationPreferencesDetails", js.undefined)
    
    inline def setRecommendationPreferencesDetailsVarargs(value: RecommendationPreferencesDetail*): Self = StObject.set(x, "recommendationPreferencesDetails", js.Array(value*))
  }
}
