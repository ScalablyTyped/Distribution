package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInferenceRecommendationsJobsResponse extends StObject {
  
  /**
    * The recommendations created from the Amazon SageMaker Inference Recommender job.
    */
  var InferenceRecommendationsJobs: typings.awsSdk.clientsSagemakerMod.InferenceRecommendationsJobs
  
  /**
    * A token for getting the next set of recommendations, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListInferenceRecommendationsJobsResponse {
  
  inline def apply(InferenceRecommendationsJobs: InferenceRecommendationsJobs): ListInferenceRecommendationsJobsResponse = {
    val __obj = js.Dynamic.literal(InferenceRecommendationsJobs = InferenceRecommendationsJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInferenceRecommendationsJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInferenceRecommendationsJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setInferenceRecommendationsJobs(value: InferenceRecommendationsJobs): Self = StObject.set(x, "InferenceRecommendationsJobs", value.asInstanceOf[js.Any])
    
    inline def setInferenceRecommendationsJobsVarargs(value: InferenceRecommendationsJob*): Self = StObject.set(x, "InferenceRecommendationsJobs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
