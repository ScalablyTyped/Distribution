package typings.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageSuggestions extends StObject {
  
  var suggestions: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageSuggestion]] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageSuggestions {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessageSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSuggestions]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentMessageSuggestions](x: Self) {
    
    inline def setSuggestions(value: js.Array[GoogleCloudDialogflowV2IntentMessageSuggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    inline def setSuggestionsVarargs(value: GoogleCloudDialogflowV2IntentMessageSuggestion*): Self = StObject.set(x, "suggestions", js.Array(value*))
  }
}
