package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetQueryExecutionOutput extends StObject {
  
  /**
    * Information about a query execution.
    */
  var QueryExecutions: js.UndefOr[QueryExecutionList] = js.native
  
  /**
    * Information about the query executions that failed to run.
    */
  var UnprocessedQueryExecutionIds: js.UndefOr[UnprocessedQueryExecutionIdList] = js.native
}
object BatchGetQueryExecutionOutput {
  
  @scala.inline
  def apply(): BatchGetQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetQueryExecutionOutput]
  }
  
  @scala.inline
  implicit class BatchGetQueryExecutionOutputMutableBuilder[Self <: BatchGetQueryExecutionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryExecutions(value: QueryExecutionList): Self = StObject.set(x, "QueryExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryExecutionsUndefined: Self = StObject.set(x, "QueryExecutions", js.undefined)
    
    @scala.inline
    def setQueryExecutionsVarargs(value: QueryExecution*): Self = StObject.set(x, "QueryExecutions", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedQueryExecutionIds(value: UnprocessedQueryExecutionIdList): Self = StObject.set(x, "UnprocessedQueryExecutionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedQueryExecutionIdsUndefined: Self = StObject.set(x, "UnprocessedQueryExecutionIds", js.undefined)
    
    @scala.inline
    def setUnprocessedQueryExecutionIdsVarargs(value: UnprocessedQueryExecutionId*): Self = StObject.set(x, "UnprocessedQueryExecutionIds", js.Array(value :_*))
  }
}
