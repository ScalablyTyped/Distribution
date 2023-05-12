package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportTaskError extends StObject {
  
  /**
    * Import task error data.
    */
  var errorData: js.UndefOr[ImportErrorData] = js.undefined
  
  /**
    * Import task error datetime.
    */
  var errorDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Import task error type.
    */
  var errorType: js.UndefOr[ImportErrorType] = js.undefined
}
object ImportTaskError {
  
  inline def apply(): ImportTaskError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportTaskError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportTaskError] (val x: Self) extends AnyVal {
    
    inline def setErrorData(value: ImportErrorData): Self = StObject.set(x, "errorData", value.asInstanceOf[js.Any])
    
    inline def setErrorDataUndefined: Self = StObject.set(x, "errorData", js.undefined)
    
    inline def setErrorDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "errorDateTime", value.asInstanceOf[js.Any])
    
    inline def setErrorDateTimeUndefined: Self = StObject.set(x, "errorDateTime", js.undefined)
    
    inline def setErrorType(value: ImportErrorType): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
  }
}
