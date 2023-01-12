package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBatchPredictionJobsRequest extends StObject {
  
  /**
    * The batch prediction job for which to get the details.
    */
  var jobId: js.UndefOr[identifier] = js.undefined
  
  /**
    * The maximum number of objects to return for the request.
    */
  var maxResults: js.UndefOr[batchPredictionsMaxPageSize] = js.undefined
  
  /**
    * The next token from the previous request.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object GetBatchPredictionJobsRequest {
  
  inline def apply(): GetBatchPredictionJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBatchPredictionJobsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBatchPredictionJobsRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: identifier): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setMaxResults(value: batchPredictionsMaxPageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
