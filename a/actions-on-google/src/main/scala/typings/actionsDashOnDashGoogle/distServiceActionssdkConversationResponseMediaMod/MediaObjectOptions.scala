package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMediaMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaObjectOptions extends js.Object {
  /** @public */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Icon image.
    * @public
    */
  var icon: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * Large image.
    * @public
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * Name of the MediaObject.
    * @public
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * MediaObject URL.
    * @public
    */
  var url: String
}

object MediaObjectOptions {
  @scala.inline
  def apply(
    url: String,
    description: String = null,
    icon: GoogleActionsV2UiElementsImage = null,
    image: GoogleActionsV2UiElementsImage = null,
    name: String = null
  ): MediaObjectOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaObjectOptions]
  }
}

