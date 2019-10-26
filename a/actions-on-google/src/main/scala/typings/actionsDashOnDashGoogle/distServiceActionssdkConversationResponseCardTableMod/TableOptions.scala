package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardTableMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsButton
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
  /**
    * Buttons for the Table.
    * Currently at most 1 button is supported.
    * @public
    */
  var buttons: js.UndefOr[GoogleActionsV2UiElementsButton | js.Array[GoogleActionsV2UiElementsButton]] = js.undefined
  /**
    * Headers and alignment of columns.
    *
    * This property or `columns` is required.
    *
    * When provided as string array, just the header field is set per column.
    * @public
    */
  var columnProperties: js.UndefOr[js.Array[TableColumn | String]] = js.undefined
  /**
    * Headers and alignment of columns with shortened name.
    * Alias of `columnProperties` with the additional capability of accepting a number type.
    *
    * This property or `columnProperties` is required.
    *
    * When provided as string array, just the header field is set per column.
    * When provided a number, it represents the number of elements per row.
    * @public
    */
  var columns: js.UndefOr[(js.Array[TableColumn | String]) | Double] = js.undefined
  /**
    * Default dividerAfter for all rows.
    * Individual rows with `dividerAfter` set will override for that specific row.
    * @public
    */
  var dividers: js.UndefOr[Boolean] = js.undefined
  /**
    * Image associated with the table.
    * @public
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * Row data of the table.
    *
    * The first 3 rows are guaranteed to be shown but others might be cut on certain surfaces.
    * Please test with the simulator to see which rows will be shown for a given surface.
    *
    * On surfaces that support the WEB_BROWSER capability, you can point the user to
    * a web page with more data.
    * @public
    */
  var rows: js.Array[TableRow | js.Array[String]]
  /**
    * Subtitle for the table.
    * @public
    */
  var subtitle: js.UndefOr[String] = js.undefined
  /**
    * Overall title of the table.
    *
    * Must be set if subtitle is set.
    * @public
    */
  var title: js.UndefOr[String] = js.undefined
}

object TableOptions {
  @scala.inline
  def apply(
    rows: js.Array[TableRow | js.Array[String]],
    buttons: GoogleActionsV2UiElementsButton | js.Array[GoogleActionsV2UiElementsButton] = null,
    columnProperties: js.Array[TableColumn | String] = null,
    columns: (js.Array[TableColumn | String]) | Double = null,
    dividers: js.UndefOr[Boolean] = js.undefined,
    image: GoogleActionsV2UiElementsImage = null,
    subtitle: String = null,
    title: String = null
  ): TableOptions = {
    val __obj = js.Dynamic.literal(rows = rows)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (columnProperties != null) __obj.updateDynamic("columnProperties")(columnProperties)
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(dividers)) __obj.updateDynamic("dividers")(dividers)
    if (image != null) __obj.updateDynamic("image")(image)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TableOptions]
  }
}

