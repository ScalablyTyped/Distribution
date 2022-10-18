package typings.actionsOnGoogle

import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsLinkOutSuggestion
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsOpenUrlAction
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseRichMod._RichResponseItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationResponseLinkoutMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/linkout", "LinkOutSuggestion")
  @js.native
  open class LinkOutSuggestion protected ()
    extends StObject
       with GoogleActionsV2UiElementsLinkOutSuggestion
       with _RichResponseItem {
    /**
      * @param options LinkOutSuggestion options
      * @public
      */
    def this(options: LinkOutSuggestionOptions) = this()
  }
  
  trait LinkOutSuggestionOptions extends StObject {
    
    /**
      * Text shown on the suggestion chip.
      * @public
      */
    var name: String
    
    /**
      * URL action when clicked.
      * @public
      */
    var openUrlAction: GoogleActionsV2UiElementsOpenUrlAction
  }
  object LinkOutSuggestionOptions {
    
    inline def apply(name: String, openUrlAction: GoogleActionsV2UiElementsOpenUrlAction): LinkOutSuggestionOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], openUrlAction = openUrlAction.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkOutSuggestionOptions]
    }
    
    extension [Self <: LinkOutSuggestionOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOpenUrlAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = StObject.set(x, "openUrlAction", value.asInstanceOf[js.Any])
    }
  }
}
