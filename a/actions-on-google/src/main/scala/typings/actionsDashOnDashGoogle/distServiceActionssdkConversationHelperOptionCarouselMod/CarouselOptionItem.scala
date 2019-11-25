package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionCarouselMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsImage
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselOptionItem extends OptionItem {
  /**
    * Description text of the item.
    * @public
    */
  @JSName("description")
  var description_CarouselOptionItem: String
}

object CarouselOptionItem {
  @scala.inline
  def apply(
    description: String,
    title: String,
    image: GoogleActionsV2UiElementsImage = null,
    synonyms: js.Array[String] = null
  ): CarouselOptionItem = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselOptionItem]
  }
}

