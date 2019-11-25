package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsCarouselSelect extends js.Object {
  /**
    * Type of image display option. Optional.
    */
  var imageDisplayOptions: js.UndefOr[GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions] = js.undefined
  /**
    * min: 2 max: 10
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem]] = js.undefined
  /**
    * Subtitle of the carousel. Optional.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  /**
    * Title of the carousel. Optional.
    */
  var title: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2UiElementsCarouselSelect {
  @scala.inline
  def apply(
    imageDisplayOptions: GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions = null,
    items: js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem] = null,
    subtitle: String = null,
    title: String = null
  ): GoogleActionsV2UiElementsCarouselSelect = {
    val __obj = js.Dynamic.literal()
    if (imageDisplayOptions != null) __obj.updateDynamic("imageDisplayOptions")(imageDisplayOptions.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2UiElementsCarouselSelect]
  }
}

