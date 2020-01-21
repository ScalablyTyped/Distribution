package typings.actionsOnGoogle.optionOptionMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionItem extends js.Object {
  /**
    * Optional text describing the item.
    * @public
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Square image to show for this item.
    * @public
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * Synonyms that can be used by the user to indicate this option if they do not use the key.
    * @public
    */
  var synonyms: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Name of the item.
    * @public
    */
  var title: String
}

object OptionItem {
  @scala.inline
  def apply(
    title: String,
    description: String = null,
    image: GoogleActionsV2UiElementsImage = null,
    synonyms: js.Array[String] = null
  ): OptionItem = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionItem]
  }
}

