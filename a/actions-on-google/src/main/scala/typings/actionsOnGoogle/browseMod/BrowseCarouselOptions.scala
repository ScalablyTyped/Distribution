package typings.actionsOnGoogle.browseMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowseCarouselOptions extends js.Object {
  /**
    * Sets the display options for the images in this carousel.
    * @public
    */
  var display: js.UndefOr[GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions] = js.undefined
  /**
    * List of 2-20 items to show in this carousel.
    * @public
    */
  var items: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]
}

object BrowseCarouselOptions {
  @scala.inline
  def apply(
    items: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem],
    display: GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions = null
  ): BrowseCarouselOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowseCarouselOptions]
  }
}

