package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetQueryExecutionOutput extends StObject {
  
  /**
    * Information about a query execution.
    */
  var QueryExecutions: js.UndefOr[QueryExecutionList] = js.undefined
  
  /**
    * Information about the query executions that failed to run.
    */
  var UnprocessedQueryExecutionIds: js.UndefOr[UnprocessedQueryExecutionIdList] = js.undefined
}
object BatchGetQueryExecutionOutput {
  
  inline def apply(): BatchGetQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetQueryExecutionOutput]
  }
  
  extension [Self <: BatchGetQueryExecutionOutput](x: Self) {
    
    inline def setQueryExecutions(value: QueryExecutionList): Self = StObject.set(x, "QueryExecutions", value.asInstanceOf[js.Any])
    
    inline def setQueryExecutionsUndefined: Self = StObject.set(x, "QueryExecutions", js.undefined)
    
    inline def setQueryExecutionsVarargs(value: QueryExecution*): Self = StObject.set(x, "QueryExecutions", js.Array(value :_*))
    
    inline def setUnprocessedQueryExecutionIds(value: UnprocessedQueryExecutionIdList): Self = StObject.set(x, "UnprocessedQueryExecutionIds", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedQueryExecutionIdsUndefined: Self = StObject.set(x, "UnprocessedQueryExecutionIds", js.undefined)
    
    inline def setUnprocessedQueryExecutionIdsVarargs(value: UnprocessedQueryExecutionId*): Self = StObject.set(x, "UnprocessedQueryExecutionIds", js.Array(value :_*))
  }
}
