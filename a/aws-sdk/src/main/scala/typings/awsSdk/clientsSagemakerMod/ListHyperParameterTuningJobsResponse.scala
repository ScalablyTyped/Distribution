package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHyperParameterTuningJobsResponse extends StObject {
  
  /**
    * A list of HyperParameterTuningJobSummary objects that describe the tuning jobs that the ListHyperParameterTuningJobs request returned.
    */
  var HyperParameterTuningJobSummaries: typings.awsSdk.clientsSagemakerMod.HyperParameterTuningJobSummaries
  
  /**
    * If the result of this ListHyperParameterTuningJobs request was truncated, the response includes a NextToken. To retrieve the next set of tuning jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListHyperParameterTuningJobsResponse {
  
  inline def apply(HyperParameterTuningJobSummaries: HyperParameterTuningJobSummaries): ListHyperParameterTuningJobsResponse = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobSummaries = HyperParameterTuningJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHyperParameterTuningJobsResponse]
  }
  
  extension [Self <: ListHyperParameterTuningJobsResponse](x: Self) {
    
    inline def setHyperParameterTuningJobSummaries(value: HyperParameterTuningJobSummaries): Self = StObject.set(x, "HyperParameterTuningJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningJobSummariesVarargs(value: HyperParameterTuningJobSummary*): Self = StObject.set(x, "HyperParameterTuningJobSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
