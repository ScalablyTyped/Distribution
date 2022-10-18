package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecommendersResponse extends StObject {
  
  /**
    * A token for getting the next set of recommenders (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of the recommenders.
    */
  var recommenders: js.UndefOr[Recommenders] = js.undefined
}
object ListRecommendersResponse {
  
  inline def apply(): ListRecommendersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecommendersResponse]
  }
  
  extension [Self <: ListRecommendersResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRecommenders(value: Recommenders): Self = StObject.set(x, "recommenders", value.asInstanceOf[js.Any])
    
    inline def setRecommendersUndefined: Self = StObject.set(x, "recommenders", js.undefined)
    
    inline def setRecommendersVarargs(value: RecommenderSummary*): Self = StObject.set(x, "recommenders", js.Array(value*))
  }
}
