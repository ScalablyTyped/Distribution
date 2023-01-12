package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBatchImportJobsRequest extends StObject {
  
  /**
    * The ID of the batch import job to get.
    */
  var jobId: js.UndefOr[identifier] = js.undefined
  
  /**
    * The maximum number of objects to return for request.
    */
  var maxResults: js.UndefOr[batchImportsMaxPageSize] = js.undefined
  
  /**
    * The next token from the previous request.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object GetBatchImportJobsRequest {
  
  inline def apply(): GetBatchImportJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBatchImportJobsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBatchImportJobsRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: identifier): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setMaxResults(value: batchImportsMaxPageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
