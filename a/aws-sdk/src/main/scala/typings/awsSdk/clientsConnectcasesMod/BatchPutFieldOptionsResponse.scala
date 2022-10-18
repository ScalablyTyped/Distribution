package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutFieldOptionsResponse extends StObject {
  
  /**
    * A list of field errors. 
    */
  var errors: js.UndefOr[BatchPutFieldOptionsResponseErrorsList] = js.undefined
}
object BatchPutFieldOptionsResponse {
  
  inline def apply(): BatchPutFieldOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPutFieldOptionsResponse]
  }
  
  extension [Self <: BatchPutFieldOptionsResponse](x: Self) {
    
    inline def setErrors(value: BatchPutFieldOptionsResponseErrorsList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: FieldOptionError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
