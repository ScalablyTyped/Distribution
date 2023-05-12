package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetECSServiceRecommendationsResponse extends StObject {
  
  /**
    *  An array of objects that describe the Amazon ECS service recommendations. 
    */
  var ecsServiceRecommendations: js.UndefOr[ECSServiceRecommendations] = js.undefined
  
  /**
    *  An array of objects that describe errors of the request. 
    */
  var errors: js.UndefOr[GetRecommendationErrors] = js.undefined
  
  /**
    *  The token to advance to the next page of Amazon ECS service recommendations. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetECSServiceRecommendationsResponse {
  
  inline def apply(): GetECSServiceRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetECSServiceRecommendationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetECSServiceRecommendationsResponse] (val x: Self) extends AnyVal {
    
    inline def setEcsServiceRecommendations(value: ECSServiceRecommendations): Self = StObject.set(x, "ecsServiceRecommendations", value.asInstanceOf[js.Any])
    
    inline def setEcsServiceRecommendationsUndefined: Self = StObject.set(x, "ecsServiceRecommendations", js.undefined)
    
    inline def setEcsServiceRecommendationsVarargs(value: ECSServiceRecommendation*): Self = StObject.set(x, "ecsServiceRecommendations", js.Array(value*))
    
    inline def setErrors(value: GetRecommendationErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: GetRecommendationError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
