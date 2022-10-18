package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLabelingJobsForWorkteamResponse extends StObject {
  
  /**
    * An array of LabelingJobSummary objects, each describing a labeling job.
    */
  var LabelingJobSummaryList: LabelingJobForWorkteamSummaryList
  
  /**
    * If the response is truncated, SageMaker returns this token. To retrieve the next set of labeling jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListLabelingJobsForWorkteamResponse {
  
  inline def apply(LabelingJobSummaryList: LabelingJobForWorkteamSummaryList): ListLabelingJobsForWorkteamResponse = {
    val __obj = js.Dynamic.literal(LabelingJobSummaryList = LabelingJobSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLabelingJobsForWorkteamResponse]
  }
  
  extension [Self <: ListLabelingJobsForWorkteamResponse](x: Self) {
    
    inline def setLabelingJobSummaryList(value: LabelingJobForWorkteamSummaryList): Self = StObject.set(x, "LabelingJobSummaryList", value.asInstanceOf[js.Any])
    
    inline def setLabelingJobSummaryListVarargs(value: LabelingJobForWorkteamSummary*): Self = StObject.set(x, "LabelingJobSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
