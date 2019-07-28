package typings.agDashGrid.distLibEntitiesColDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractColDef extends js.Object {
  /** Whether to show the column when the group is open / closed. */
  var columnGroupShow: js.UndefOr[String] = js.undefined
  /** CSS class for the header */
  var headerClass: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]])
  ] = js.undefined
  /** The name to render in the column header */
  var headerName: js.UndefOr[String] = js.undefined
  /** Tooltip for the column header */
  var headerTooltip: js.UndefOr[String] = js.undefined
  /** Expression or function to get the cells value. */
  var headerValueGetter: js.UndefOr[String | js.Function] = js.undefined
  /** Never set this, it is used internally by grid when doing in-grid pivoting */
  var pivotKeys: js.UndefOr[js.Array[String]] = js.undefined
  /** Set to true to not include this column in the toolpanel */
  var suppressToolPanel: js.UndefOr[Boolean] = js.undefined
  /** CSS class for the header */
  var toolPanelClass: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]])
  ] = js.undefined
}

object AbstractColDef {
  @scala.inline
  def apply(
    columnGroupShow: String = null,
    headerClass: String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]]) = null,
    headerName: String = null,
    headerTooltip: String = null,
    headerValueGetter: String | js.Function = null,
    pivotKeys: js.Array[String] = null,
    suppressToolPanel: js.UndefOr[Boolean] = js.undefined,
    toolPanelClass: String | js.Array[String] | (js.Function1[/* params */ js.Any, String | js.Array[String]]) = null
  ): AbstractColDef = {
    val __obj = js.Dynamic.literal()
    if (columnGroupShow != null) __obj.updateDynamic("columnGroupShow")(columnGroupShow)
    if (headerClass != null) __obj.updateDynamic("headerClass")(headerClass.asInstanceOf[js.Any])
    if (headerName != null) __obj.updateDynamic("headerName")(headerName)
    if (headerTooltip != null) __obj.updateDynamic("headerTooltip")(headerTooltip)
    if (headerValueGetter != null) __obj.updateDynamic("headerValueGetter")(headerValueGetter.asInstanceOf[js.Any])
    if (pivotKeys != null) __obj.updateDynamic("pivotKeys")(pivotKeys)
    if (!js.isUndefined(suppressToolPanel)) __obj.updateDynamic("suppressToolPanel")(suppressToolPanel)
    if (toolPanelClass != null) __obj.updateDynamic("toolPanelClass")(toolPanelClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractColDef]
  }
}

