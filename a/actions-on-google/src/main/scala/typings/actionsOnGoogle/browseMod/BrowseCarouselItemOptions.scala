package typings.actionsOnGoogle.browseMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowseCarouselItemOptions extends js.Object {
  /**
    * Description text of the item.
    * @public
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Footer text of the item.
    * @public
    */
  var footer: js.UndefOr[String] = js.undefined
  /**
    * Image to show on item.
    * @public
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * Title of the option item.
    * @public
    */
  var title: String
  /**
    * The URL of the link opened by clicking the BrowseCarouselItem.
    * @public
    */
  var url: String
}

object BrowseCarouselItemOptions {
  @scala.inline
  def apply(
    title: String,
    url: String,
    description: String = null,
    footer: String = null,
    image: GoogleActionsV2UiElementsImage = null
  ): BrowseCarouselItemOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowseCarouselItemOptions]
  }
}

