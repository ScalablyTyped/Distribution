package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateError extends StObject {
  
  /**
    * Description of the error type.
    */
  var Message: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Type of error.
    */
  var Type: js.UndefOr[TemplateErrorType] = js.undefined
}
object TemplateError {
  
  inline def apply(): TemplateError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateError]
  }
  
  extension [Self <: TemplateError](x: Self) {
    
    inline def setMessage(value: NonEmptyString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setType(value: TemplateErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
