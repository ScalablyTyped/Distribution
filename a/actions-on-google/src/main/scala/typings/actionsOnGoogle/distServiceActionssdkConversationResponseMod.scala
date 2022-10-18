package typings.actionsOnGoogle

import typings.actionsOnGoogle.distCommonMod.JsonObject
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsOrdersV3OrderUpdate
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2OrdersOrderUpdate
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsHtmlResponse
import typings.actionsOnGoogle.distServiceActionssdkConversationConversationMod._Response
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarouselItemOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarouselOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseCardBasicMod.BasicCardOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseCardButtonMod.ButtonOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseCardTableMod.TableOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseHtmlMod.HtmlResponseOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseImageMod.ImageOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseLinkoutMod.LinkOutSuggestionOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseMediaMod.MediaObjectOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseMediaMod.MediaObjectString
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseMediaMod.MediaResponseOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseRichMod.RichResponseItem
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseRichMod.RichResponseOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseSimpleMod.SimpleResponseOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseUrlMod.OpenUrlActionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationResponseMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "BasicCard")
  @js.native
  open class BasicCard protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseCardMod.BasicCard {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "BrowseCarousel")
  @js.native
  open class BrowseCarousel protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarousel {
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
  open class BrowseCarouselItem protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarouselItem {
    /**
      * @param options BrowseCarouselItem options
      * @public
      */
    def this(options: BrowseCarouselItemOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "Button")
  @js.native
  open class Button protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseCardMod.Button {
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
  open class HtmlResponse[TData /* <: JsonObject */] ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseHtmlMod.HtmlResponse[TData] {
    def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
    def this(options: HtmlResponseOptions[TData]) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "Image")
  @js.native
  open class Image protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseImageMod.Image
       with _Response {
    /**
      * @param options Image options
      * @public
      */
    def this(option: ImageOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "LinkOutSuggestion")
  @js.native
  open class LinkOutSuggestion protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseLinkoutMod.LinkOutSuggestion {
    /**
      * @param options LinkOutSuggestion options
      * @public
      */
    def this(options: LinkOutSuggestionOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "MediaObject")
  @js.native
  open class MediaObject protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseMediaMod.MediaObject
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
  open class MediaResponse protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseMediaMod.MediaResponse {
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
  open class OpenUrlAction protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseUrlMod.OpenUrlAction {
    /** @public */
    def this(options: OpenUrlActionOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "OrderUpdate")
  @js.native
  open class OrderUpdate protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseOrderMod.OrderUpdate {
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
  open class RichResponse protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseRichMod.RichResponse
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
  open class SimpleResponse protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseSimpleMod.SimpleResponse {
    def this(options: String) = this()
    /**
      * @param options SimpleResponse options
      * @public
      */
    def this(options: SimpleResponseOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "Suggestions")
  @js.native
  open class Suggestions protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseSuggestionMod.Suggestions
       with _Response {
    /**
      * @param suggestions Texts of the suggestions.
      * @public
      */
    def this(suggestions: (js.Array[String] | String)*) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response", "Table")
  @js.native
  open class Table protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseCardMod.Table {
    /** @public */
    def this(options: TableOptions) = this()
  }
}
