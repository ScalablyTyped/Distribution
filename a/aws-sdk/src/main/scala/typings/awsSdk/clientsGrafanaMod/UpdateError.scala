package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateError extends StObject {
  
  /**
    * Specifies which permission update caused the error.
    */
  var causedBy: UpdateInstruction
  
  /**
    * The error code.
    */
  var code: UpdateErrorCodeInteger
  
  /**
    * The message for this error.
    */
  var message: String
}
object UpdateError {
  
  inline def apply(causedBy: UpdateInstruction, code: UpdateErrorCodeInteger, message: String): UpdateError = {
    val __obj = js.Dynamic.literal(causedBy = causedBy.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateError]
  }
  
  extension [Self <: UpdateError](x: Self) {
    
    inline def setCausedBy(value: UpdateInstruction): Self = StObject.set(x, "causedBy", value.asInstanceOf[js.Any])
    
    inline def setCode(value: UpdateErrorCodeInteger): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
