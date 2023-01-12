package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunStatementResponse extends StObject {
  
  /**
    * Returns the Id of the statement that was run.
    */
  var Id: js.UndefOr[IntegerValue] = js.undefined
}
object RunStatementResponse {
  
  inline def apply(): RunStatementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunStatementResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunStatementResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: IntegerValue): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
