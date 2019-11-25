package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardBasicMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsBasicCardImageDisplayOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsButton
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicCardOptions extends js.Object {
  /** @public */
  var buttons: js.UndefOr[GoogleActionsV2UiElementsButton | js.Array[GoogleActionsV2UiElementsButton]] = js.undefined
  /** @public */
  var display: js.UndefOr[GoogleActionsV2UiElementsBasicCardImageDisplayOptions] = js.undefined
  /** @public */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /** @public */
  var subtitle: js.UndefOr[String] = js.undefined
  /** @public */
  var text: js.UndefOr[String] = js.undefined
  /** @public */
  var title: js.UndefOr[String] = js.undefined
}

object BasicCardOptions {
  @scala.inline
  def apply(
    buttons: GoogleActionsV2UiElementsButton | js.Array[GoogleActionsV2UiElementsButton] = null,
    display: GoogleActionsV2UiElementsBasicCardImageDisplayOptions = null,
    image: GoogleActionsV2UiElementsImage = null,
    subtitle: String = null,
    text: String = null,
    title: String = null
  ): BasicCardOptions = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicCardOptions]
  }
}

