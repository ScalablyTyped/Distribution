package typings.actionsOnGoogle.carouselMod

import typings.actionsOnGoogle.optionOptionMod.OptionItems
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselSelectCarouselItem
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselOptions extends js.Object {
  /**
    * Sets the display options for the images in this carousel.
    * @public
    */
  var display: js.UndefOr[GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions] = js.native
  /**
    * List of 2-20 items to show in this carousel. Required.
    * @public
    */
  var items: OptionItems[CarouselOptionItem] | js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem] = js.native
}

object CarouselOptions {
  @scala.inline
  def apply(
    items: OptionItems[CarouselOptionItem] | js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem]
  ): CarouselOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselOptions]
  }
  @scala.inline
  implicit class CarouselOptionsOps[Self <: CarouselOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemsVarargs(value: GoogleActionsV2UiElementsCarouselSelectCarouselItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(
      value: OptionItems[CarouselOptionItem] | js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem]
    ): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay(value: GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
  }
  
}

