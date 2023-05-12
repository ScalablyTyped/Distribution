package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteReadSetResponse extends StObject {
  
  /**
    * Errors returned by individual delete operations.
    */
  var errors: js.UndefOr[ReadSetBatchErrorList] = js.undefined
}
object BatchDeleteReadSetResponse {
  
  inline def apply(): BatchDeleteReadSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteReadSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteReadSetResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: ReadSetBatchErrorList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ReadSetBatchError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
