package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsListSelectListItem extends js.Object {
  /**
    * Main text describing the item.
    * Optional.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Square image.
    * Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * Information about this option. See google.actions.v2.OptionInfo
    * for details.
    * Required.
    */
  var optionInfo: js.UndefOr[GoogleActionsV2OptionInfo] = js.undefined
  /**
    * Title of the list item. When tapped, this text will be
    * posted back to the conversation verbatim as if the user had typed it.
    * Each title must be unique among the set of list items.
    * Required.
    */
  var title: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2UiElementsListSelectListItem {
  @scala.inline
  def apply(
    description: String = null,
    image: GoogleActionsV2UiElementsImage = null,
    optionInfo: GoogleActionsV2OptionInfo = null,
    title: String = null
  ): GoogleActionsV2UiElementsListSelectListItem = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (image != null) __obj.updateDynamic("image")(image)
    if (optionInfo != null) __obj.updateDynamic("optionInfo")(optionInfo)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[GoogleActionsV2UiElementsListSelectListItem]
  }
}

