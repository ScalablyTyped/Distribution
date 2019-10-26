package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsTableCard extends js.Object {
  /**
    * Buttons.
    * Currently at most 1 button is supported.
    * Optional.
    */
  var buttons: js.UndefOr[js.Array[GoogleActionsV2UiElementsButton]] = js.undefined
  /**
    * Headers and alignment of columns.
    */
  var columnProperties: js.UndefOr[js.Array[GoogleActionsV2UiElementsTableCardColumnProperties]] = js.undefined
  /**
    * Image associated with the table. Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * Row data of the table. The first 3 rows are guaranteed to be shown but
    * others might be cut on certain surfaces. Please test with the simulator to
    * see which rows will be shown for a given surface. On surfaces that support
    * the WEB_BROWSER capability, you can point the user to
    * a web page with more data.
    */
  var rows: js.UndefOr[js.Array[GoogleActionsV2UiElementsTableCardRow]] = js.undefined
  /**
    * Subtitle for the table. Optional.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  /**
    * Overall title of the table. Optional but must be set if subtitle is set.
    */
  var title: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2UiElementsTableCard {
  @scala.inline
  def apply(
    buttons: js.Array[GoogleActionsV2UiElementsButton] = null,
    columnProperties: js.Array[GoogleActionsV2UiElementsTableCardColumnProperties] = null,
    image: GoogleActionsV2UiElementsImage = null,
    rows: js.Array[GoogleActionsV2UiElementsTableCardRow] = null,
    subtitle: String = null,
    title: String = null
  ): GoogleActionsV2UiElementsTableCard = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (columnProperties != null) __obj.updateDynamic("columnProperties")(columnProperties)
    if (image != null) __obj.updateDynamic("image")(image)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[GoogleActionsV2UiElementsTableCard]
  }
}

