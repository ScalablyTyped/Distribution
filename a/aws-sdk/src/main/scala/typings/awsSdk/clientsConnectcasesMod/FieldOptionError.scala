package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldOptionError extends StObject {
  
  /**
    * Error code from creating or updating field option.
    */
  var errorCode: String
  
  /**
    * Error message from creating or updating field option.
    */
  var message: String
  
  /**
    * The field option value that caused the error.
    */
  var value: FieldOptionValue
}
object FieldOptionError {
  
  inline def apply(errorCode: String, message: String, value: FieldOptionValue): FieldOptionError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOptionError]
  }
  
  extension [Self <: FieldOptionError](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FieldOptionValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
