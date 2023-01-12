package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.suggestion_chips
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageSuggestions
  extends StObject
     with DialogflowV1BaseGoogleMessage[suggestion_chips]
     with DialogflowV1Message {
  
  var suggestions: js.UndefOr[js.Array[DialogflowV1MessageSuggestion]] = js.undefined
}
object DialogflowV1MessageSuggestions {
  
  inline def apply(): DialogflowV1MessageSuggestions = {
    val __obj = js.Dynamic.literal(platform = "google")
    __obj.asInstanceOf[DialogflowV1MessageSuggestions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogflowV1MessageSuggestions] (val x: Self) extends AnyVal {
    
    inline def setSuggestions(value: js.Array[DialogflowV1MessageSuggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    inline def setSuggestionsVarargs(value: DialogflowV1MessageSuggestion*): Self = StObject.set(x, "suggestions", js.Array(value*))
  }
}
