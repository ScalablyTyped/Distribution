package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInferenceRecommendationsJobStepsRequest extends StObject {
  
  /**
    * The name for the Inference Recommender job.
    */
  var JobName: RecommendationJobName
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * A token that you can specify to return more results from the list. Specify this field if you have a token that was returned from a previous request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * A filter to return benchmarks of a specified status. If this field is left empty, then all benchmarks are returned.
    */
  var Status: js.UndefOr[RecommendationJobStatus] = js.undefined
  
  /**
    * A filter to return details about the specified type of subtask.  BENCHMARK: Evaluate the performance of your model on different instance types.
    */
  var StepType: js.UndefOr[RecommendationStepType] = js.undefined
}
object ListInferenceRecommendationsJobStepsRequest {
  
  inline def apply(JobName: RecommendationJobName): ListInferenceRecommendationsJobStepsRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInferenceRecommendationsJobStepsRequest]
  }
  
  extension [Self <: ListInferenceRecommendationsJobStepsRequest](x: Self) {
    
    inline def setJobName(value: RecommendationJobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: RecommendationJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStepType(value: RecommendationStepType): Self = StObject.set(x, "StepType", value.asInstanceOf[js.Any])
    
    inline def setStepTypeUndefined: Self = StObject.set(x, "StepType", js.undefined)
  }
}
