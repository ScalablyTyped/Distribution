package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSopRecommendationsResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The standard operating procedure (SOP) recommendations for the Resilience Hub applications.
    */
  var sopRecommendations: SopRecommendationList
}
object ListSopRecommendationsResponse {
  
  inline def apply(sopRecommendations: SopRecommendationList): ListSopRecommendationsResponse = {
    val __obj = js.Dynamic.literal(sopRecommendations = sopRecommendations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSopRecommendationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSopRecommendationsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSopRecommendations(value: SopRecommendationList): Self = StObject.set(x, "sopRecommendations", value.asInstanceOf[js.Any])
    
    inline def setSopRecommendationsVarargs(value: SopRecommendation*): Self = StObject.set(x, "sopRecommendations", js.Array(value*))
  }
}
