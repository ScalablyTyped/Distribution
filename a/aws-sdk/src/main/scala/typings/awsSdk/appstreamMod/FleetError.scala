package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetError extends StObject {
  
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[FleetErrorCode] = js.undefined
  
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
}
object FleetError {
  
  inline def apply(): FleetError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetError]
  }
  
  extension [Self <: FleetError](x: Self) {
    
    inline def setErrorCode(value: FleetErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}
