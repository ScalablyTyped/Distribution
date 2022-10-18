package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrainingJobsForHyperParameterTuningJobResponse extends StObject {
  
  /**
    * If the result of this ListTrainingJobsForHyperParameterTuningJob request was truncated, the response includes a NextToken. To retrieve the next set of training jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * A list of TrainingJobSummary objects that describe the training jobs that the ListTrainingJobsForHyperParameterTuningJob request returned.
    */
  var TrainingJobSummaries: HyperParameterTrainingJobSummaries
}
object ListTrainingJobsForHyperParameterTuningJobResponse {
  
  inline def apply(TrainingJobSummaries: HyperParameterTrainingJobSummaries): ListTrainingJobsForHyperParameterTuningJobResponse = {
    val __obj = js.Dynamic.literal(TrainingJobSummaries = TrainingJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrainingJobsForHyperParameterTuningJobResponse]
  }
  
  extension [Self <: ListTrainingJobsForHyperParameterTuningJobResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTrainingJobSummaries(value: HyperParameterTrainingJobSummaries): Self = StObject.set(x, "TrainingJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobSummariesVarargs(value: HyperParameterTrainingJobSummary*): Self = StObject.set(x, "TrainingJobSummaries", js.Array(value*))
  }
}
