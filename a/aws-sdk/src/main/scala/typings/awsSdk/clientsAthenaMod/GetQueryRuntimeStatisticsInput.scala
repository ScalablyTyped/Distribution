package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueryRuntimeStatisticsInput extends StObject {
  
  /**
    * The unique ID of the query execution.
    */
  var QueryExecutionId: typings.awsSdk.clientsAthenaMod.QueryExecutionId
}
object GetQueryRuntimeStatisticsInput {
  
  inline def apply(QueryExecutionId: QueryExecutionId): GetQueryRuntimeStatisticsInput = {
    val __obj = js.Dynamic.literal(QueryExecutionId = QueryExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryRuntimeStatisticsInput]
  }
  
  extension [Self <: GetQueryRuntimeStatisticsInput](x: Self) {
    
    inline def setQueryExecutionId(value: QueryExecutionId): Self = StObject.set(x, "QueryExecutionId", value.asInstanceOf[js.Any])
  }
}
