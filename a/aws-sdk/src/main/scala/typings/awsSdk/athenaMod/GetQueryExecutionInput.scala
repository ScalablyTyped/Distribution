package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueryExecutionInput extends StObject {
  
  /**
    * The unique ID of the query execution.
    */
  var QueryExecutionId: typings.awsSdk.athenaMod.QueryExecutionId
}
object GetQueryExecutionInput {
  
  inline def apply(QueryExecutionId: QueryExecutionId): GetQueryExecutionInput = {
    val __obj = js.Dynamic.literal(QueryExecutionId = QueryExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryExecutionInput]
  }
  
  extension [Self <: GetQueryExecutionInput](x: Self) {
    
    inline def setQueryExecutionId(value: QueryExecutionId): Self = StObject.set(x, "QueryExecutionId", value.asInstanceOf[js.Any])
  }
}
