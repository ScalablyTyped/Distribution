package typings.actionsOnGoogle.browseMod

import typings.actionsOnGoogle.richMod._RichResponseItem
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowse
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response/browse", "BrowseCarousel")
@js.native
class BrowseCarousel protected ()
  extends _RichResponseItem
     with GoogleActionsV2UiElementsCarouselBrowse {
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

