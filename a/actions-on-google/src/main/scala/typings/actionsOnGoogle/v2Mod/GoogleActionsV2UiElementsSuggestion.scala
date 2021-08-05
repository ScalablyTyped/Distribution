package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UiElementsSuggestion extends StObject {
  
  /**
    * The text shown the in the suggestion chip. When tapped, this text will be
    * posted back to the conversation verbatim as if the user had typed it.
    * Each title must be unique among the set of suggestion chips.
    * Max 25 chars
    * Required
    */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2UiElementsSuggestion {
  
  inline def apply(): GoogleActionsV2UiElementsSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsSuggestion]
  }
  
  extension [Self <: GoogleActionsV2UiElementsSuggestion](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
