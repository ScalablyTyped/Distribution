package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsCollectionSelect extends js.Object {
  /**
    * Type of image display option. Optional.
    */
  var imageDisplayOptions: js.UndefOr[GoogleActionsV2UiElementsCollectionSelectImageDisplayOptions] = js.undefined
  /**
    * min: 2 max: 10
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2UiElementsCollectionSelectCollectionItem]] = js.undefined
  /**
    * Subtitle of the collection. Optional.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  /**
    * Title of the collection. Optional.
    */
  var title: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2UiElementsCollectionSelect {
  @scala.inline
  def apply(
    imageDisplayOptions: GoogleActionsV2UiElementsCollectionSelectImageDisplayOptions = null,
    items: js.Array[GoogleActionsV2UiElementsCollectionSelectCollectionItem] = null,
    subtitle: String = null,
    title: String = null
  ): GoogleActionsV2UiElementsCollectionSelect = {
    val __obj = js.Dynamic.literal()
    if (imageDisplayOptions != null) __obj.updateDynamic("imageDisplayOptions")(imageDisplayOptions.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2UiElementsCollectionSelect]
  }
}

