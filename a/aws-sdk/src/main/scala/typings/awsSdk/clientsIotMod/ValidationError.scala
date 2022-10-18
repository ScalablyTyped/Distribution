package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationError extends StObject {
  
  /**
    * The description of an error found in the behaviors.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
}
object ValidationError {
  
  inline def apply(): ValidationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationError]
  }
  
  extension [Self <: ValidationError](x: Self) {
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
