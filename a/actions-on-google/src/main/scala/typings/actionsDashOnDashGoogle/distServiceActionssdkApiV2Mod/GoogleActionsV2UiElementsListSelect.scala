package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsListSelect extends js.Object {
  /**
    * min: 2 max: 30
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2UiElementsListSelectListItem]] = js.undefined
  /**
    * Subtitle of the list.
    * Optional.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  /**
    * Overall title of the list.
    * Optional.
    */
  var title: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2UiElementsListSelect {
  @scala.inline
  def apply(
    items: js.Array[GoogleActionsV2UiElementsListSelectListItem] = null,
    subtitle: String = null,
    title: String = null
  ): GoogleActionsV2UiElementsListSelect = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2UiElementsListSelect]
  }
}

