package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2MediaObject extends js.Object {
  /**
    * The url pointing to the media content.
    */
  var contentUrl: js.UndefOr[String] = js.undefined
  /**
    * Description of this media object.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * A small image icon displayed on the right from the title.
    * It's resized to 36x36 dp.
    */
  var icon: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * A large image, such as the cover of the album, etc.
    */
  var largeImage: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * Name of this media object.
    */
  var name: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2MediaObject {
  @scala.inline
  def apply(
    contentUrl: String = null,
    description: String = null,
    icon: GoogleActionsV2UiElementsImage = null,
    largeImage: GoogleActionsV2UiElementsImage = null,
    name: String = null
  ): GoogleActionsV2MediaObject = {
    val __obj = js.Dynamic.literal()
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (largeImage != null) __obj.updateDynamic("largeImage")(largeImage.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2MediaObject]
  }
}

