package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetQueryExecutionOutput extends StObject {
  
  /**
    * Information about the query execution.
    */
  var QueryExecution: js.UndefOr[typings.awsSdk.athenaMod.QueryExecution] = js.native
}
object GetQueryExecutionOutput {
  
  @scala.inline
  def apply(): GetQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueryExecutionOutput]
  }
  
  @scala.inline
  implicit class GetQueryExecutionOutputMutableBuilder[Self <: GetQueryExecutionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryExecution(value: QueryExecution): Self = StObject.set(x, "QueryExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryExecutionUndefined: Self = StObject.set(x, "QueryExecution", js.undefined)
  }
}
