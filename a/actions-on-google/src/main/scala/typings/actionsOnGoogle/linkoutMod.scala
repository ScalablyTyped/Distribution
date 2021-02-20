package typings.actionsOnGoogle

import typings.actionsOnGoogle.richMod._RichResponseItem
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsLinkOutSuggestion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkoutMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/linkout", "LinkOutSuggestion")
  @js.native
  class LinkOutSuggestion protected ()
    extends _RichResponseItem
       with GoogleActionsV2UiElementsLinkOutSuggestion {
    /**
      * @param options LinkOutSuggestion options
      * @public
      */
    def this(options: LinkOutSuggestionOptions) = this()
  }
  
  @js.native
  trait LinkOutSuggestionOptions extends StObject {
    
    /**
      * Text shown on the suggestion chip.
      * @public
      */
    var name: String = js.native
    
    /**
      * String URL to open.
      * @public
      */
    var url: String = js.native
  }
  object LinkOutSuggestionOptions {
    
    @scala.inline
    def apply(name: String, url: String): LinkOutSuggestionOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkOutSuggestionOptions]
    }
    
    @scala.inline
    implicit class LinkOutSuggestionOptionsMutableBuilder[Self <: LinkOutSuggestionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
