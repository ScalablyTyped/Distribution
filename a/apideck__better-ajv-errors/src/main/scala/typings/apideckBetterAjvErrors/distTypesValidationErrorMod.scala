package typings.apideckBetterAjvErrors

import typings.apideckBetterAjvErrors.anon.DictadditionalContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesValidationErrorMod {
  
  trait ValidationError extends StObject {
    
    var context: DictadditionalContext
    
    var message: String
    
    var path: String
    
    var suggestion: js.UndefOr[String] = js.undefined
  }
  object ValidationError {
    
    inline def apply(context: DictadditionalContext, message: String, path: String): ValidationError = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
      
      inline def setContext(value: DictadditionalContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSuggestion(value: String): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
      
      inline def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
    }
  }
}
