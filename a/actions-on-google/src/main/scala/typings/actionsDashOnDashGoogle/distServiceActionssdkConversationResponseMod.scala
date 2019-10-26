package typings.actionsDashOnDashGoogle

import typings.actionsDashOnDashGoogle.distCommonMod.JsonObject
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsOrdersV3OrderUpdate
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2OrdersOrderUpdate
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsHtmlResponse
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod._Response
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarouselItemOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarouselOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardBasicMod.BasicCardOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardButtonMod.ButtonOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardTableMod.TableOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseHtmlMod.HtmlResponseOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseImageMod.ImageOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseLinkoutMod.LinkOutSuggestionOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMediaMod.MediaObjectOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMediaMod.MediaObjectString
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMediaMod.MediaResponseOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseRichMod.RichResponseItem
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseRichMod.RichResponseOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseSimpleMod.SimpleResponseOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseUrlMod.OpenUrlActionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationResponseMod extends js.Object {
  @js.native
  class BasicCard protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardMod.BasicCard {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @js.native
  class BrowseCarousel protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarousel {
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
  
  @js.native
  class BrowseCarouselItem protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarouselItem {
    /**
      * @param options BrowseCarouselItem options
      * @public
      */
    def this(options: BrowseCarouselItemOptions) = this()
  }
  
  @js.native
  class Button protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @js.native
  /**
    * @param options Canvas options
    * @public
    */
  class HtmlResponse[TData /* <: JsonObject */] ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseHtmlMod.HtmlResponse[TData] {
    def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
    def this(options: HtmlResponseOptions[TData]) = this()
  }
  
  @js.native
  class Image protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseImageMod.Image
       with _Response {
    /**
      * @param options Image options
      * @public
      */
    def this(option: ImageOptions) = this()
  }
  
  @js.native
  class LinkOutSuggestion protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseLinkoutMod.LinkOutSuggestion {
    /**
      * @param options LinkOutSuggestion options
      * @public
      */
    def this(options: LinkOutSuggestionOptions) = this()
  }
  
  @js.native
  class MediaObject protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMediaMod.MediaObject
       with _Response {
    def this(options: String) = this()
    /**
      * @param options MediaObject options or just a string for the url
      * @public
      */
    def this(options: MediaObjectOptions) = this()
  }
  
  @js.native
  class MediaResponse protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMediaMod.MediaResponse {
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
  
  @js.native
  class OpenUrlAction protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseUrlMod.OpenUrlAction {
    /** @public */
    def this(options: OpenUrlActionOptions) = this()
  }
  
  @js.native
  class OrderUpdate protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseOrderMod.OrderUpdate {
    def this(options: GoogleActionsOrdersV3OrderUpdate) = this()
    /**
      * @param options The raw {@link GoogleActionsV2OrdersOrderUpdate}
      *     or {@link GoogleActionsOrdersV3OrderUpdate}
      *     if using ordersv3
      * @public
      */
    def this(options: GoogleActionsV2OrdersOrderUpdate) = this()
  }
  
  @js.native
  class RichResponse protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseRichMod.RichResponse
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
  
  @js.native
  class SimpleResponse protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseSimpleMod.SimpleResponse {
    def this(options: String) = this()
    /**
      * @param options SimpleResponse options
      * @public
      */
    def this(options: SimpleResponseOptions) = this()
  }
  
  @js.native
  class Suggestions protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseSuggestionMod.Suggestions
       with _Response {
    /**
      * @param suggestions Texts of the suggestions.
      * @public
      */
    def this(suggestions: (js.Array[String] | String)*) = this()
  }
  
  @js.native
  class Table protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardMod.Table {
    /** @public */
    def this(options: TableOptions) = this()
  }
  
}

