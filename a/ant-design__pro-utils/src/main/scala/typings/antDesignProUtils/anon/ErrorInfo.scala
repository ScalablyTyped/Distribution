package typings.antDesignProUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorInfo extends StObject {
  
  var errorInfo: String
  
  var hasError: Boolean
}
object ErrorInfo {
  
  inline def apply(errorInfo: String, hasError: Boolean): ErrorInfo = {
    val __obj = js.Dynamic.literal(errorInfo = errorInfo.asInstanceOf[js.Any], hasError = hasError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorInfo]
  }
  
  extension [Self <: ErrorInfo](x: Self) {
    
    inline def setErrorInfo(value: String): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    
    inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
  }
}
