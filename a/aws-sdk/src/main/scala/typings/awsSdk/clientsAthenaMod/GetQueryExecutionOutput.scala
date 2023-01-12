package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueryExecutionOutput extends StObject {
  
  /**
    * Information about the query execution.
    */
  var QueryExecution: js.UndefOr[typings.awsSdk.clientsAthenaMod.QueryExecution] = js.undefined
}
object GetQueryExecutionOutput {
  
  inline def apply(): GetQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueryExecutionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetQueryExecutionOutput] (val x: Self) extends AnyVal {
    
    inline def setQueryExecution(value: QueryExecution): Self = StObject.set(x, "QueryExecution", value.asInstanceOf[js.Any])
    
    inline def setQueryExecutionUndefined: Self = StObject.set(x, "QueryExecution", js.undefined)
  }
}
