package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeAsyncResponse extends StObject {
  
  /**
    * The status code.
    */
  var Status: js.UndefOr[HttpStatus] = js.undefined
}
object InvokeAsyncResponse {
  
  inline def apply(): InvokeAsyncResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeAsyncResponse]
  }
  
  extension [Self <: InvokeAsyncResponse](x: Self) {
    
    inline def setStatus(value: HttpStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
