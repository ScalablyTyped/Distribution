package typings.authorizenet.anon

import typings.authorizenet.mod.APIContracts.ANetApiResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorResponse extends StObject {
  
  var ErrorResponse: ANetApiResponse
}
object ErrorResponse {
  
  inline def apply(ErrorResponse: ANetApiResponse): ErrorResponse = {
    val __obj = js.Dynamic.literal(ErrorResponse = ErrorResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResponse]
  }
  
  extension [Self <: ErrorResponse](x: Self) {
    
    inline def setErrorResponse(value: ANetApiResponse): Self = StObject.set(x, "ErrorResponse", value.asInstanceOf[js.Any])
  }
}
