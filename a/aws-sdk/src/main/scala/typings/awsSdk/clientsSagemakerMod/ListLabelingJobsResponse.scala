package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLabelingJobsResponse extends StObject {
  
  /**
    * An array of LabelingJobSummary objects, each describing a labeling job.
    */
  var LabelingJobSummaryList: js.UndefOr[typings.awsSdk.clientsSagemakerMod.LabelingJobSummaryList] = js.undefined
  
  /**
    * If the response is truncated, SageMaker returns this token. To retrieve the next set of labeling jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListLabelingJobsResponse {
  
  inline def apply(): ListLabelingJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLabelingJobsResponse]
  }
  
  extension [Self <: ListLabelingJobsResponse](x: Self) {
    
    inline def setLabelingJobSummaryList(value: LabelingJobSummaryList): Self = StObject.set(x, "LabelingJobSummaryList", value.asInstanceOf[js.Any])
    
    inline def setLabelingJobSummaryListUndefined: Self = StObject.set(x, "LabelingJobSummaryList", js.undefined)
    
    inline def setLabelingJobSummaryListVarargs(value: LabelingJobSummary*): Self = StObject.set(x, "LabelingJobSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
