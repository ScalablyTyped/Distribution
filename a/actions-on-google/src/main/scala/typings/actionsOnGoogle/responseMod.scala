package typings.actionsOnGoogle

import typings.actionsOnGoogle.basicMod.BasicCardOptions
import typings.actionsOnGoogle.browseMod.BrowseCarouselItemOptions
import typings.actionsOnGoogle.browseMod.BrowseCarouselOptions
import typings.actionsOnGoogle.buttonMod.ButtonOptions
import typings.actionsOnGoogle.commonMod.JsonObject
import typings.actionsOnGoogle.conversationConversationMod._Response
import typings.actionsOnGoogle.htmlMod.HtmlResponseOptions
import typings.actionsOnGoogle.imageMod.ImageOptions
import typings.actionsOnGoogle.linkoutMod.LinkOutSuggestionOptions
import typings.actionsOnGoogle.responseMediaMod.MediaObjectOptions
import typings.actionsOnGoogle.responseMediaMod.MediaObjectString
import typings.actionsOnGoogle.responseMediaMod.MediaResponseOptions
import typings.actionsOnGoogle.richMod.RichResponseItem
import typings.actionsOnGoogle.richMod.RichResponseOptions
import typings.actionsOnGoogle.simpleMod.SimpleResponseOptions
import typings.actionsOnGoogle.tableMod.TableOptions
import typings.actionsOnGoogle.urlMod.OpenUrlActionOptions
import typings.actionsOnGoogle.v2Mod.GoogleActionsOrdersV3OrderUpdate
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2OrdersOrderUpdate
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsHtmlResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responseMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "BasicCard")
  @js.native
  class BasicCard protected ()
    extends typings.actionsOnGoogle.cardMod.BasicCard {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "BrowseCarousel")
  @js.native
  class BrowseCarousel protected ()
    extends typings.actionsOnGoogle.browseMod.BrowseCarousel {
    /**
      * @param items BrowseCarousel items
      * @public
      */
    def this(items: GoogleActionsV2UiElementsCarouselBrowseItem*) = this()
    /**
      * @param items BrowseCarousel items
      * @public
      */
    def this(items: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]) = this()
    /**
      * @param options BrowseCarousel options
      * @public
      */
    def this(options: BrowseCarouselOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "BrowseCarouselItem")
  @js.native
  class BrowseCarouselItem protected ()
    extends typings.actionsOnGoogle.browseMod.BrowseCarouselItem {
    /**
      * @param options BrowseCarouselItem options
      * @public
      */
    def this(options: BrowseCarouselItemOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "Button")
  @js.native
  class Button protected ()
    extends typings.actionsOnGoogle.cardMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "HtmlResponse")
  @js.native
  /**
    * @param options Canvas options
    * @public
    */
  class HtmlResponse[TData /* <: JsonObject */] ()
    extends typings.actionsOnGoogle.htmlMod.HtmlResponse[TData] {
    def this(options: HtmlResponseOptions[TData]) = this()
    def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "Image")
  @js.native
  class Image protected ()
    extends typings.actionsOnGoogle.imageMod.Image
       with _Response {
    /**
      * @param options Image options
      * @public
      */
    def this(option: ImageOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "LinkOutSuggestion")
  @js.native
  class LinkOutSuggestion protected ()
    extends typings.actionsOnGoogle.linkoutMod.LinkOutSuggestion {
    /**
      * @param options LinkOutSuggestion options
      * @public
      */
    def this(options: LinkOutSuggestionOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "MediaObject")
  @js.native
  class MediaObject protected ()
    extends typings.actionsOnGoogle.responseMediaMod.MediaObject
       with _Response {
    def this(options: String) = this()
    /**
      * @param options MediaObject options or just a string for the url
      * @public
      */
    def this(options: MediaObjectOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "MediaResponse")
  @js.native
  class MediaResponse protected ()
    extends typings.actionsOnGoogle.responseMediaMod.MediaResponse {
    /**
      * @param objects MediaObjects
      * @public
      */
    def this(objects: MediaObjectString*) = this()
    /**
      * @param objects MediaObjects
      * @public
      */
    def this(objects: js.Array[MediaObjectString]) = this()
    /**
      * @param options MediaResponse options
      * @public
      */
    def this(options: MediaResponseOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "OpenUrlAction")
  @js.native
  class OpenUrlAction protected ()
    extends typings.actionsOnGoogle.urlMod.OpenUrlAction {
    /** @public */
    def this(options: OpenUrlActionOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "OrderUpdate")
  @js.native
  class OrderUpdate protected ()
    extends typings.actionsOnGoogle.orderMod.OrderUpdate {
    def this(options: GoogleActionsOrdersV3OrderUpdate) = this()
    /**
      * @param options The raw {@link GoogleActionsV2OrdersOrderUpdate}
      *     or {@link GoogleActionsOrdersV3OrderUpdate}
      *     if using ordersv3
      * @public
      */
    def this(options: GoogleActionsV2OrdersOrderUpdate) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "RichResponse")
  @js.native
  class RichResponse protected ()
    extends typings.actionsOnGoogle.richMod.RichResponse
       with _Response {
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
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "SimpleResponse")
  @js.native
  class SimpleResponse protected ()
    extends typings.actionsOnGoogle.simpleMod.SimpleResponse {
    def this(options: String) = this()
    /**
      * @param options SimpleResponse options
      * @public
      */
    def this(options: SimpleResponseOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "Suggestions")
  @js.native
  class Suggestions protected ()
    extends typings.actionsOnGoogle.suggestionMod.Suggestions
       with _Response {
    /**
      * @param suggestions Texts of the suggestions.
      * @public
      */
    def this(suggestions: (js.Array[String] | String)*) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "Table")
  @js.native
  class Table protected ()
    extends typings.actionsOnGoogle.cardMod.Table {
    /** @public */
    def this(options: TableOptions) = this()
  }
}
