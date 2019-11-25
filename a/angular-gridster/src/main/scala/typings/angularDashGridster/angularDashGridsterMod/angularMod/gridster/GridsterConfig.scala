package typings.angularDashGridster.angularDashGridsterMod.angularMod.gridster

import typings.angularDashGridster.Anon_Drag
import typings.angularDashGridster.Anon_Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridsterConfig extends js.Object {
  // width of grid columns. "auto" will divide the width of the grid evenly among the columns
  var colWidth: js.UndefOr[String] = js.undefined
  // number of columns in the grid
  var columns: js.UndefOr[Double] = js.undefined
  // default width of an item in columns
  var defaultSizeX: js.UndefOr[Double] = js.undefined
  // default height of an item in rows
  var defaultSizeY: js.UndefOr[Double] = js.undefined
  // options to pass to draggable handler
  var draggable: js.UndefOr[Anon_Drag] = js.undefined
  // whether to automatically float items up so they stack
  var floating: js.UndefOr[Boolean] = js.undefined
  // toggle mobile view
  var isMobile: js.UndefOr[Boolean] = js.undefined
  // margins in between grid items
  var margins: js.UndefOr[js.Array[Double]] = js.undefined
  // maximum amount of rows in the grid
  var maxRows: js.UndefOr[Double] = js.undefined
  // maximum column width of an item
  var maxSizeX: js.UndefOr[Double] = js.undefined
  // maximum row height of an item
  var maxSizeY: js.UndefOr[Double] = js.undefined
  // minimum amount of columns the grid can scale down to
  var minColumns: js.UndefOr[Double] = js.undefined
  // minimum amount of rows to show if the grid is empty
  var minRows: js.UndefOr[Double] = js.undefined
  // minimum column width of an item
  var minSizeX: js.UndefOr[Double] = js.undefined
  // minumum row height of an item
  var minSizeY: js.UndefOr[Double] = js.undefined
  // width threshold to toggle mobile mode
  var mobileBreakPoint: js.UndefOr[Double] = js.undefined
  // whether or not to toggle mobile mode when screen width is less than mobileBreakPoint
  var mobileModeEnabled: js.UndefOr[Boolean] = js.undefined
  // whether to set the outer margin
  var outerMargin: js.UndefOr[Boolean] = js.undefined
  // whether to push other items out of the way
  // whether to push other items out of the way
  var pushing: js.UndefOr[Boolean] = js.undefined
  // grid item height in mobile display. true- to use the calculated height by sizeY given
  // options to pass to resizable handler
  var resizable: js.UndefOr[Anon_Element] = js.undefined
  // height of grid rows. 'match' will make it the same as the column width, a numeric value will be interpreted as pixels,
  // '/2' is half the column width, '*5' is five times the column width, etc.
  var rowHeight: js.UndefOr[String] = js.undefined
  var saveGridItemCalculatedHeightInMobile: js.UndefOr[Boolean] = js.undefined
  // whether or not to have items switch places instead of push down if they are the same size
  var swapping: js.UndefOr[Boolean] = js.undefined
  // width of the grid. "auto" will expand the grid to its parent container
  var width: js.UndefOr[String] = js.undefined
}

object GridsterConfig {
  @scala.inline
  def apply(
    colWidth: String = null,
    columns: Int | Double = null,
    defaultSizeX: Int | Double = null,
    defaultSizeY: Int | Double = null,
    draggable: Anon_Drag = null,
    floating: js.UndefOr[Boolean] = js.undefined,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    margins: js.Array[Double] = null,
    maxRows: Int | Double = null,
    maxSizeX: Int | Double = null,
    maxSizeY: Int | Double = null,
    minColumns: Int | Double = null,
    minRows: Int | Double = null,
    minSizeX: Int | Double = null,
    minSizeY: Int | Double = null,
    mobileBreakPoint: Int | Double = null,
    mobileModeEnabled: js.UndefOr[Boolean] = js.undefined,
    outerMargin: js.UndefOr[Boolean] = js.undefined,
    pushing: js.UndefOr[Boolean] = js.undefined,
    resizable: Anon_Element = null,
    rowHeight: String = null,
    saveGridItemCalculatedHeightInMobile: js.UndefOr[Boolean] = js.undefined,
    swapping: js.UndefOr[Boolean] = js.undefined,
    width: String = null
  ): GridsterConfig = {
    val __obj = js.Dynamic.literal()
    if (colWidth != null) __obj.updateDynamic("colWidth")(colWidth.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (defaultSizeX != null) __obj.updateDynamic("defaultSizeX")(defaultSizeX.asInstanceOf[js.Any])
    if (defaultSizeY != null) __obj.updateDynamic("defaultSizeY")(defaultSizeY.asInstanceOf[js.Any])
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.asInstanceOf[js.Any])
    if (margins != null) __obj.updateDynamic("margins")(margins.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (maxSizeX != null) __obj.updateDynamic("maxSizeX")(maxSizeX.asInstanceOf[js.Any])
    if (maxSizeY != null) __obj.updateDynamic("maxSizeY")(maxSizeY.asInstanceOf[js.Any])
    if (minColumns != null) __obj.updateDynamic("minColumns")(minColumns.asInstanceOf[js.Any])
    if (minRows != null) __obj.updateDynamic("minRows")(minRows.asInstanceOf[js.Any])
    if (minSizeX != null) __obj.updateDynamic("minSizeX")(minSizeX.asInstanceOf[js.Any])
    if (minSizeY != null) __obj.updateDynamic("minSizeY")(minSizeY.asInstanceOf[js.Any])
    if (mobileBreakPoint != null) __obj.updateDynamic("mobileBreakPoint")(mobileBreakPoint.asInstanceOf[js.Any])
    if (!js.isUndefined(mobileModeEnabled)) __obj.updateDynamic("mobileModeEnabled")(mobileModeEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(outerMargin)) __obj.updateDynamic("outerMargin")(outerMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(pushing)) __obj.updateDynamic("pushing")(pushing.asInstanceOf[js.Any])
    if (resizable != null) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(saveGridItemCalculatedHeightInMobile)) __obj.updateDynamic("saveGridItemCalculatedHeightInMobile")(saveGridItemCalculatedHeightInMobile.asInstanceOf[js.Any])
    if (!js.isUndefined(swapping)) __obj.updateDynamic("swapping")(swapping.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridsterConfig]
  }
}

