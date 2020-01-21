package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsBasicCard extends js.Object {
  /**
    * Buttons.
    * Currently at most 1 button is supported.
    * Optional.
    */
  var buttons: js.UndefOr[js.Array[GoogleActionsV2UiElementsButton]] = js.undefined
  /**
    * Body text of the card.
    * Supports a limited set of markdown syntax for formatting.
    * Required, unless image is present.
    */
  var formattedText: js.UndefOr[String] = js.undefined
  /**
    * A hero image for the card. The height is fixed to 192dp.
    * Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * Type of image display option. Optional.
    */
  var imageDisplayOptions: js.UndefOr[GoogleActionsV2UiElementsBasicCardImageDisplayOptions] = js.undefined
  /**
    * Optional.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  /**
    * Overall title of the card.
    * Optional.
    */
  var title: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2UiElementsBasicCard {
  @scala.inline
  def apply(
    buttons: js.Array[GoogleActionsV2UiElementsButton] = null,
    formattedText: String = null,
    image: GoogleActionsV2UiElementsImage = null,
    imageDisplayOptions: GoogleActionsV2UiElementsBasicCardImageDisplayOptions = null,
    subtitle: String = null,
    title: String = null
  ): GoogleActionsV2UiElementsBasicCard = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (formattedText != null) __obj.updateDynamic("formattedText")(formattedText.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageDisplayOptions != null) __obj.updateDynamic("imageDisplayOptions")(imageDisplayOptions.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2UiElementsBasicCard]
  }
}

