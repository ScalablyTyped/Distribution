package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageConfigError extends StObject {
  
  /**
    * Error code.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * Error message.
    */
  var Message: js.UndefOr[SensitiveString] = js.undefined
}
object ImageConfigError {
  
  inline def apply(): ImageConfigError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageConfigError]
  }
  
  extension [Self <: ImageConfigError](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setMessage(value: SensitiveString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
