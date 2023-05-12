package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeError extends StObject {
  
  /**
    * The type of code error.  Examples include, but aren't limited to: LINT_ERROR, PARSER_ERROR.
    */
  var errorType: js.UndefOr[String] = js.undefined
  
  /**
    * The line, column, and span location of the error in the code.
    */
  var location: js.UndefOr[CodeErrorLocation] = js.undefined
  
  /**
    * A user presentable error. Examples include, but aren't limited to: Parsing error: Unterminated string literal.
    */
  var value: js.UndefOr[String] = js.undefined
}
object CodeError {
  
  inline def apply(): CodeError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeError] (val x: Self) extends AnyVal {
    
    inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setLocation(value: CodeErrorLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
