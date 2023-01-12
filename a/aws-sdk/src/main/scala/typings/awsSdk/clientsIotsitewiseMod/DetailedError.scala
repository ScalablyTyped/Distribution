package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailedError extends StObject {
  
  /**
    * The error code. 
    */
  var code: DetailedErrorCode
  
  /**
    * The error message. 
    */
  var message: DetailedErrorMessage
}
object DetailedError {
  
  inline def apply(code: DetailedErrorCode, message: DetailedErrorMessage): DetailedError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetailedError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: DetailedErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: DetailedErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
