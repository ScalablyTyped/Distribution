package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeError extends StObject {
  
  /**
    * The error message.
    */
  var Message: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of error.
    */
  var Type: js.UndefOr[ThemeErrorType] = js.undefined
}
object ThemeError {
  
  inline def apply(): ThemeError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeError]
  }
  
  extension [Self <: ThemeError](x: Self) {
    
    inline def setMessage(value: NonEmptyString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setType(value: ThemeErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
