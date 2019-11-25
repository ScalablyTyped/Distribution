package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardTableMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsTableCardColumnProperties
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableColumn extends GoogleActionsV2UiElementsTableCardColumnProperties {
  /**
    * Alias for `horizontalAlignment`
    *
    * Horizontal alignment of content w.r.t column. If unspecified, content
    * will be aligned to the leading edge.
    * @public
    */
  var align: js.UndefOr[GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment] = js.undefined
}

object TableColumn {
  @scala.inline
  def apply(
    align: GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment = null,
    header: String = null,
    horizontalAlignment: GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment = null
  ): TableColumn = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumn]
  }
}

