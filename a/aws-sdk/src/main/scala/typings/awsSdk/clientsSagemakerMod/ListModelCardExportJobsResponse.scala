package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelCardExportJobsResponse extends StObject {
  
  /**
    * The summaries of the listed model card export jobs.
    */
  var ModelCardExportJobSummaries: ModelCardExportJobSummaryList
  
  /**
    * If the response is truncated, SageMaker returns this token. To retrieve the next set of model card export jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListModelCardExportJobsResponse {
  
  inline def apply(ModelCardExportJobSummaries: ModelCardExportJobSummaryList): ListModelCardExportJobsResponse = {
    val __obj = js.Dynamic.literal(ModelCardExportJobSummaries = ModelCardExportJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelCardExportJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListModelCardExportJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setModelCardExportJobSummaries(value: ModelCardExportJobSummaryList): Self = StObject.set(x, "ModelCardExportJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setModelCardExportJobSummariesVarargs(value: ModelCardExportJobSummary*): Self = StObject.set(x, "ModelCardExportJobSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
