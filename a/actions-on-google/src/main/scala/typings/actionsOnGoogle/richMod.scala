package typings.actionsOnGoogle

import typings.actionsOnGoogle.commonMod.JsonObject
import typings.actionsOnGoogle.conversationConversationMod._Response
import typings.actionsOnGoogle.htmlMod.HtmlResponse
import typings.actionsOnGoogle.suggestionMod.Suggestions
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2RichResponse
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsLinkOutSuggestion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object richMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/rich", "RichResponse")
  @js.native
  class RichResponse protected ()
    extends StObject
       with GoogleActionsV2RichResponse {
    /**
      * @param items RichResponse items
      * @public
      */
    def this(items: RichResponseItem*) = this()
    /**
      * @param items RichResponse items
      * @public
      */
    def this(items: js.Array[RichResponseItem]) = this()
    /**
      * @param options RichResponse options
      * @public
      */
    def this(options: RichResponseOptions) = this()
    
    /**
      * Add a RichResponse item
      * @public
      */
    def add(items: RichResponseItem*): this.type = js.native
    
    /**
      * Adds a single suggestion or list of suggestions to list of items.
      * @public
      */
    def addSuggestion(suggestions: (String | Suggestions)*): this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.actionsOnGoogle.simpleMod.SimpleResponse
    - typings.actionsOnGoogle.cardMod.BasicCard
    - typings.actionsOnGoogle.cardMod.Table
    - typings.actionsOnGoogle.browseMod.BrowseCarousel
    - typings.actionsOnGoogle.responseMediaMod.MediaResponse
    - typings.actionsOnGoogle.orderMod.OrderUpdate
    - typings.actionsOnGoogle.linkoutMod.LinkOutSuggestion
    - typings.actionsOnGoogle.htmlMod.HtmlResponse[typings.actionsOnGoogle.commonMod.JsonObject]
    - typings.actionsOnGoogle.v2Mod.GoogleActionsV2RichResponseItem
  */
  type RichResponseItem = _RichResponseItem | HtmlResponse[JsonObject] | String
  
  trait RichResponseOptions extends StObject {
    
    /**
      * Ordered list of either SimpleResponse objects or BasicCard objects.
      * First item must be SimpleResponse. There can be at most one card.
      * @public
      */
    var items: js.UndefOr[js.Array[RichResponseItem]] = js.undefined
    
    /**
      * Link Out Suggestion chip for this rich response. Optional.
      * @public
      */
    var link: js.UndefOr[GoogleActionsV2UiElementsLinkOutSuggestion] = js.undefined
    
    /**
      * Ordered list of text suggestions to display. Optional.
      * @public
      */
    var suggestions: js.UndefOr[js.Array[String] | Suggestions] = js.undefined
  }
  object RichResponseOptions {
    
    @scala.inline
    def apply(): RichResponseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RichResponseOptions]
    }
    
    @scala.inline
    implicit class RichResponseOptionsMutableBuilder[Self <: RichResponseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[RichResponseItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: RichResponseItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLink(value: GoogleActionsV2UiElementsLinkOutSuggestion): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setSuggestions(value: js.Array[String] | Suggestions): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
      
      @scala.inline
      def setSuggestionsVarargs(value: String*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
    }
  }
  
  trait _RichResponseItem
    extends StObject
       with _Response
}
