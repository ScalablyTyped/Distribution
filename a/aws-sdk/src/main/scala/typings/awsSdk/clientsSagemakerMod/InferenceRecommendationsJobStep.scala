package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceRecommendationsJobStep extends StObject {
  
  /**
    * The details for a specific benchmark.
    */
  var InferenceBenchmark: js.UndefOr[RecommendationJobInferenceBenchmark] = js.undefined
  
  /**
    * The name of the Inference Recommender job.
    */
  var JobName: RecommendationJobName
  
  /**
    * The current status of the benchmark.
    */
  var Status: RecommendationJobStatus
  
  /**
    * The type of the subtask.  BENCHMARK: Evaluate the performance of your model on different instance types.
    */
  var StepType: RecommendationStepType
}
object InferenceRecommendationsJobStep {
  
  inline def apply(JobName: RecommendationJobName, Status: RecommendationJobStatus, StepType: RecommendationStepType): InferenceRecommendationsJobStep = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StepType = StepType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceRecommendationsJobStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InferenceRecommendationsJobStep] (val x: Self) extends AnyVal {
    
    inline def setInferenceBenchmark(value: RecommendationJobInferenceBenchmark): Self = StObject.set(x, "InferenceBenchmark", value.asInstanceOf[js.Any])
    
    inline def setInferenceBenchmarkUndefined: Self = StObject.set(x, "InferenceBenchmark", js.undefined)
    
    inline def setJobName(value: RecommendationJobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: RecommendationJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStepType(value: RecommendationStepType): Self = StObject.set(x, "StepType", value.asInstanceOf[js.Any])
  }
}
