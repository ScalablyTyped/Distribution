package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartQueryExecutionOutput extends StObject {
  
  /**
    * The unique ID of the query that ran as a result of this request.
    */
  var QueryExecutionId: js.UndefOr[typings.awsSdk.clientsAthenaMod.QueryExecutionId] = js.undefined
}
object StartQueryExecutionOutput {
  
  inline def apply(): StartQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartQueryExecutionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartQueryExecutionOutput] (val x: Self) extends AnyVal {
    
    inline def setQueryExecutionId(value: QueryExecutionId): Self = StObject.set(x, "QueryExecutionId", value.asInstanceOf[js.Any])
    
    inline def setQueryExecutionIdUndefined: Self = StObject.set(x, "QueryExecutionId", js.undefined)
  }
}
