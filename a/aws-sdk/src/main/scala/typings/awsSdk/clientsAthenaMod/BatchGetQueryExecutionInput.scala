package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetQueryExecutionInput extends StObject {
  
  /**
    * An array of query execution IDs.
    */
  var QueryExecutionIds: QueryExecutionIdList
}
object BatchGetQueryExecutionInput {
  
  inline def apply(QueryExecutionIds: QueryExecutionIdList): BatchGetQueryExecutionInput = {
    val __obj = js.Dynamic.literal(QueryExecutionIds = QueryExecutionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetQueryExecutionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetQueryExecutionInput] (val x: Self) extends AnyVal {
    
    inline def setQueryExecutionIds(value: QueryExecutionIdList): Self = StObject.set(x, "QueryExecutionIds", value.asInstanceOf[js.Any])
    
    inline def setQueryExecutionIdsVarargs(value: QueryExecutionId*): Self = StObject.set(x, "QueryExecutionIds", js.Array(value*))
  }
}
