package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLambdaFunctionRecommendationsResponse extends StObject {
  
  /**
    * An array of objects that describe function recommendations.
    */
  var lambdaFunctionRecommendations: js.UndefOr[LambdaFunctionRecommendations] = js.undefined
  
  /**
    * The token to use to advance to the next page of function recommendations. This value is null when there are no more pages of function recommendations to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetLambdaFunctionRecommendationsResponse {
  
  inline def apply(): GetLambdaFunctionRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLambdaFunctionRecommendationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLambdaFunctionRecommendationsResponse] (val x: Self) extends AnyVal {
    
    inline def setLambdaFunctionRecommendations(value: LambdaFunctionRecommendations): Self = StObject.set(x, "lambdaFunctionRecommendations", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionRecommendationsUndefined: Self = StObject.set(x, "lambdaFunctionRecommendations", js.undefined)
    
    inline def setLambdaFunctionRecommendationsVarargs(value: LambdaFunctionRecommendation*): Self = StObject.set(x, "lambdaFunctionRecommendations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
