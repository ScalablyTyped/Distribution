package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppComponentRecommendationsResponse extends StObject {
  
  /**
    * The recommendations for an Resilience Hub application component, returned as an object. This object contains component names, configuration recommendations, and recommendation statuses.
    */
  var componentRecommendations: ComponentRecommendationList
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAppComponentRecommendationsResponse {
  
  inline def apply(componentRecommendations: ComponentRecommendationList): ListAppComponentRecommendationsResponse = {
    val __obj = js.Dynamic.literal(componentRecommendations = componentRecommendations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppComponentRecommendationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAppComponentRecommendationsResponse] (val x: Self) extends AnyVal {
    
    inline def setComponentRecommendations(value: ComponentRecommendationList): Self = StObject.set(x, "componentRecommendations", value.asInstanceOf[js.Any])
    
    inline def setComponentRecommendationsVarargs(value: ComponentRecommendation*): Self = StObject.set(x, "componentRecommendations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
