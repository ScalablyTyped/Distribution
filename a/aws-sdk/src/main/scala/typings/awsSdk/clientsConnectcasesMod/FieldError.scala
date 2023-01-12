package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldError extends StObject {
  
  /**
    * The error code from getting a field.
    */
  var errorCode: String
  
  /**
    * The field identifier that caused the error.
    */
  var id: FieldId
  
  /**
    * The error message from getting a field.
    */
  var message: js.UndefOr[String] = js.undefined
}
object FieldError {
  
  inline def apply(errorCode: String, id: FieldId): FieldError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldError] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: FieldId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
