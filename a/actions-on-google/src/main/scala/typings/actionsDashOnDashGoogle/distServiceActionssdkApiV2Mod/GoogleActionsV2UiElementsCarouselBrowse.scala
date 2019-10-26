package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsCarouselBrowse extends js.Object {
  /**
    * Type of image display option.
    * Optional.
    */
  var imageDisplayOptions: js.UndefOr[GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions] = js.undefined
  /**
    * Min: 2. Max: 10.
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]] = js.undefined
}

object GoogleActionsV2UiElementsCarouselBrowse {
  @scala.inline
  def apply(
    imageDisplayOptions: GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions = null,
    items: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem] = null
  ): GoogleActionsV2UiElementsCarouselBrowse = {
    val __obj = js.Dynamic.literal()
    if (imageDisplayOptions != null) __obj.updateDynamic("imageDisplayOptions")(imageDisplayOptions)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[GoogleActionsV2UiElementsCarouselBrowse]
  }
}

