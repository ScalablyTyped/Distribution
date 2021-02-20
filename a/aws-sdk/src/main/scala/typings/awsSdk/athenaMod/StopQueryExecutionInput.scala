package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopQueryExecutionInput extends StObject {
  
  /**
    * The unique ID of the query execution to stop.
    */
  var QueryExecutionId: typings.awsSdk.athenaMod.QueryExecutionId = js.native
}
object StopQueryExecutionInput {
  
  @scala.inline
  def apply(QueryExecutionId: QueryExecutionId): StopQueryExecutionInput = {
    val __obj = js.Dynamic.literal(QueryExecutionId = QueryExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopQueryExecutionInput]
  }
  
  @scala.inline
  implicit class StopQueryExecutionInputMutableBuilder[Self <: StopQueryExecutionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryExecutionId(value: QueryExecutionId): Self = StObject.set(x, "QueryExecutionId", value.asInstanceOf[js.Any])
  }
}
