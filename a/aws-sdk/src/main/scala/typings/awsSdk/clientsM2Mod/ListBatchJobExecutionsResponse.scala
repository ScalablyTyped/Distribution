package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBatchJobExecutionsResponse extends StObject {
  
  /**
    * Returns a list of batch job executions for an application.
    */
  var batchJobExecutions: BatchJobExecutionSummaryList
  
  /**
    * A pagination token that's returned when the response doesn't contain all batch job executions.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBatchJobExecutionsResponse {
  
  inline def apply(batchJobExecutions: BatchJobExecutionSummaryList): ListBatchJobExecutionsResponse = {
    val __obj = js.Dynamic.literal(batchJobExecutions = batchJobExecutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBatchJobExecutionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBatchJobExecutionsResponse] (val x: Self) extends AnyVal {
    
    inline def setBatchJobExecutions(value: BatchJobExecutionSummaryList): Self = StObject.set(x, "batchJobExecutions", value.asInstanceOf[js.Any])
    
    inline def setBatchJobExecutionsVarargs(value: BatchJobExecutionSummary*): Self = StObject.set(x, "batchJobExecutions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
