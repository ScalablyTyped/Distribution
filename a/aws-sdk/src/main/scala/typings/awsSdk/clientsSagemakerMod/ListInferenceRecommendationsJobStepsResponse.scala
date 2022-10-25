package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInferenceRecommendationsJobStepsResponse extends StObject {
  
  /**
    * A token that you can specify in your next request to return more results from the list.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * A list of all subtask details in Inference Recommender.
    */
  var Steps: js.UndefOr[InferenceRecommendationsJobSteps] = js.undefined
}
object ListInferenceRecommendationsJobStepsResponse {
  
  inline def apply(): ListInferenceRecommendationsJobStepsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInferenceRecommendationsJobStepsResponse]
  }
  
  extension [Self <: ListInferenceRecommendationsJobStepsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSteps(value: InferenceRecommendationsJobSteps): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "Steps", js.undefined)
    
    inline def setStepsVarargs(value: InferenceRecommendationsJobStep*): Self = StObject.set(x, "Steps", js.Array(value*))
  }
}
