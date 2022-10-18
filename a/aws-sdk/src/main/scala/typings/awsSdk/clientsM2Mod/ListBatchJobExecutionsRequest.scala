package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBatchJobExecutionsRequest extends StObject {
  
  /**
    * The unique identifier of the application.
    */
  var applicationId: Identifier
  
  /**
    * The unique identifier of each batch job execution.
    */
  var executionIds: js.UndefOr[IdentifierList] = js.undefined
  
  /**
    * The name of each batch job execution.
    */
  var jobName: js.UndefOr[String100] = js.undefined
  
  /**
    * The maximum number of batch job executions to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A pagination token to control the number of batch job executions displayed in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The time after which the batch job executions started.
    */
  var startedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time before the batch job executions started.
    */
  var startedBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the batch job executions.
    */
  var status: js.UndefOr[BatchJobExecutionStatus] = js.undefined
}
object ListBatchJobExecutionsRequest {
  
  inline def apply(applicationId: Identifier): ListBatchJobExecutionsRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBatchJobExecutionsRequest]
  }
  
  extension [Self <: ListBatchJobExecutionsRequest](x: Self) {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIds(value: IdentifierList): Self = StObject.set(x, "executionIds", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdsUndefined: Self = StObject.set(x, "executionIds", js.undefined)
    
    inline def setExecutionIdsVarargs(value: Identifier*): Self = StObject.set(x, "executionIds", js.Array(value*))
    
    inline def setJobName(value: String100): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStartedAfter(value: js.Date): Self = StObject.set(x, "startedAfter", value.asInstanceOf[js.Any])
    
    inline def setStartedAfterUndefined: Self = StObject.set(x, "startedAfter", js.undefined)
    
    inline def setStartedBefore(value: js.Date): Self = StObject.set(x, "startedBefore", value.asInstanceOf[js.Any])
    
    inline def setStartedBeforeUndefined: Self = StObject.set(x, "startedBefore", js.undefined)
    
    inline def setStatus(value: BatchJobExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
