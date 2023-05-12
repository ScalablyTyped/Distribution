package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorDetail extends StObject {
  
  /**
    * The name or code associated with the error.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * A list of key value pairs that provides contextual information about why an error occured.
    */
  var ErrorData: js.UndefOr[typings.awsSdk.clientsEmrMod.ErrorData] = js.undefined
  
  /**
    * A message that describes the error.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
}
object ErrorDetail {
  
  inline def apply(): ErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorDetail] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorData(value: ErrorData): Self = StObject.set(x, "ErrorData", value.asInstanceOf[js.Any])
    
    inline def setErrorDataUndefined: Self = StObject.set(x, "ErrorData", js.undefined)
    
    inline def setErrorDataVarargs(value: StringMap*): Self = StObject.set(x, "ErrorData", js.Array(value*))
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}
