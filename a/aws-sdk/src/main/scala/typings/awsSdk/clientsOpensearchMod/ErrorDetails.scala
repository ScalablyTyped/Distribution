package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorDetails extends StObject {
  
  /**
    * A message describing the error.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ErrorMessage] = js.undefined
  
  /**
    * The type of error that occurred.
    */
  var ErrorType: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ErrorType] = js.undefined
}
object ErrorDetails {
  
  inline def apply(): ErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorDetails]
  }
  
  extension [Self <: ErrorDetails](x: Self) {
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setErrorType(value: ErrorType): Self = StObject.set(x, "ErrorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "ErrorType", js.undefined)
  }
}
