package typings.actionsOnGoogle

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsSuggestion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suggestionMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/suggestion", "Suggestions")
  @js.native
  open class Suggestions protected () extends StObject {
    /**
      * @param suggestions Texts of the suggestions.
      * @public
      */
    def this(suggestions: (js.Array[String] | String)*) = this()
    
    /** @public */
    def add(suggestions: String*): this.type = js.native
    
    /** @public */
    var suggestions: js.Array[GoogleActionsV2UiElementsSuggestion] = js.native
  }
}
