package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.google
import typings.actionsOnGoogle.actionsOnGoogleStrings.suggestion_chips
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1MessageSuggestions
  extends DialogflowV1BaseGoogleMessage[suggestion_chips]
     with DialogflowV1Message {
  
  var suggestions: js.UndefOr[js.Array[DialogflowV1MessageSuggestion]] = js.native
}
object DialogflowV1MessageSuggestions {
  
  @scala.inline
  def apply(platform: google): DialogflowV1MessageSuggestions = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageSuggestions]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageSuggestionsMutableBuilder[Self <: DialogflowV1MessageSuggestions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggestions(value: js.Array[DialogflowV1MessageSuggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: DialogflowV1MessageSuggestion*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
  }
}
