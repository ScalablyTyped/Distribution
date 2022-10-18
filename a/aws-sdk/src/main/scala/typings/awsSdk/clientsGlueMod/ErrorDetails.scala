package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorDetails extends StObject {
  
  /**
    * The error code for an error.
    */
  var ErrorCode: js.UndefOr[ErrorCodeString] = js.undefined
  
  /**
    * The error message for an error.
    */
  var ErrorMessage: js.UndefOr[ErrorMessageString] = js.undefined
}
object ErrorDetails {
  
  inline def apply(): ErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorDetails]
  }
  
  extension [Self <: ErrorDetails](x: Self) {
    
    inline def setErrorCode(value: ErrorCodeString): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessageString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}
