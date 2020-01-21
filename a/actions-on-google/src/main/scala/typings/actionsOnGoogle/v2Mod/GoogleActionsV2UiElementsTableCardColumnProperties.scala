package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsTableCardColumnProperties extends js.Object {
  /**
    * Header text for the column.
    */
  var header: js.UndefOr[String] = js.undefined
  /**
    * Horizontal alignment of content w.r.t column. If unspecified, content
    * will be aligned to the leading edge.
    */
  var horizontalAlignment: js.UndefOr[GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment] = js.undefined
}

object GoogleActionsV2UiElementsTableCardColumnProperties {
  @scala.inline
  def apply(
    header: String = null,
    horizontalAlignment: GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment = null
  ): GoogleActionsV2UiElementsTableCardColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2UiElementsTableCardColumnProperties]
  }
}

