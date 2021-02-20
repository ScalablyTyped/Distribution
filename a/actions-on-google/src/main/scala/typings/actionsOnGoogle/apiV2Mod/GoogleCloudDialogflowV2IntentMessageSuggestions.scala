package typings.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageSuggestions extends StObject {
  
  var suggestions: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageSuggestion]] = js.native
}
object GoogleCloudDialogflowV2IntentMessageSuggestions {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSuggestions]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageSuggestionsMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageSuggestions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggestions(value: js.Array[GoogleCloudDialogflowV2IntentMessageSuggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: GoogleCloudDialogflowV2IntentMessageSuggestion*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
  }
}
