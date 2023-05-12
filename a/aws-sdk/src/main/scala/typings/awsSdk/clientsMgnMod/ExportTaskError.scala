package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportTaskError extends StObject {
  
  /**
    * Export task error data.
    */
  var errorData: js.UndefOr[ExportErrorData] = js.undefined
  
  /**
    * Export task error datetime.
    */
  var errorDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
}
object ExportTaskError {
  
  inline def apply(): ExportTaskError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTaskError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportTaskError] (val x: Self) extends AnyVal {
    
    inline def setErrorData(value: ExportErrorData): Self = StObject.set(x, "errorData", value.asInstanceOf[js.Any])
    
    inline def setErrorDataUndefined: Self = StObject.set(x, "errorData", js.undefined)
    
    inline def setErrorDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "errorDateTime", value.asInstanceOf[js.Any])
    
    inline def setErrorDateTimeUndefined: Self = StObject.set(x, "errorDateTime", js.undefined)
  }
}
