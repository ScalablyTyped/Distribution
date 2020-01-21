package typings.actionsOnGoogle.carouselMod

import typings.actionsOnGoogle.optionOptionMod.OptionItems
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselSelectCarouselItem
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselOptions extends js.Object {
  /**
    * Sets the display options for the images in this carousel.
    * @public
    */
  var display: js.UndefOr[GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions] = js.undefined
  /**
    * List of 2-20 items to show in this carousel. Required.
    * @public
    */
  var items: OptionItems[CarouselOptionItem] | js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem]
}

object CarouselOptions {
  @scala.inline
  def apply(
    items: OptionItems[CarouselOptionItem] | js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem],
    display: GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions = null
  ): CarouselOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselOptions]
  }
}

