package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchItemError extends StObject {
  
  /**
    * The numeric error code of the error.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * A text description of the error.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.undefined
}
object BatchItemError {
  
  inline def apply(): BatchItemError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchItemError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchItemError] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setIndex(value: Integer): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
  }
}
