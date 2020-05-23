package typings.angularGridster.mod.angularAugmentingMod.gridster

import typings.angularGridster.anon.Drag
import typings.angularGridster.anon.Enabled
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
  var draggable: js.UndefOr[Drag] = js.undefined
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
  var resizable: js.UndefOr[Enabled] = js.undefined
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
    columns: js.UndefOr[Double] = js.undefined,
    defaultSizeX: js.UndefOr[Double] = js.undefined,
    defaultSizeY: js.UndefOr[Double] = js.undefined,
    draggable: Drag = null,
    floating: js.UndefOr[Boolean] = js.undefined,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    margins: js.Array[Double] = null,
    maxRows: js.UndefOr[Double] = js.undefined,
    maxSizeX: js.UndefOr[Double] = js.undefined,
    maxSizeY: js.UndefOr[Double] = js.undefined,
    minColumns: js.UndefOr[Double] = js.undefined,
    minRows: js.UndefOr[Double] = js.undefined,
    minSizeX: js.UndefOr[Double] = js.undefined,
    minSizeY: js.UndefOr[Double] = js.undefined,
    mobileBreakPoint: js.UndefOr[Double] = js.undefined,
    mobileModeEnabled: js.UndefOr[Boolean] = js.undefined,
    outerMargin: js.UndefOr[Boolean] = js.undefined,
    pushing: js.UndefOr[Boolean] = js.undefined,
    resizable: Enabled = null,
    rowHeight: String = null,
    saveGridItemCalculatedHeightInMobile: js.UndefOr[Boolean] = js.undefined,
    swapping: js.UndefOr[Boolean] = js.undefined,
    width: String = null
  ): GridsterConfig = {
    val __obj = js.Dynamic.literal()
    if (colWidth != null) __obj.updateDynamic("colWidth")(colWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultSizeX)) __obj.updateDynamic("defaultSizeX")(defaultSizeX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultSizeY)) __obj.updateDynamic("defaultSizeY")(defaultSizeY.get.asInstanceOf[js.Any])
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.get.asInstanceOf[js.Any])
    if (margins != null) __obj.updateDynamic("margins")(margins.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRows)) __obj.updateDynamic("maxRows")(maxRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSizeX)) __obj.updateDynamic("maxSizeX")(maxSizeX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSizeY)) __obj.updateDynamic("maxSizeY")(maxSizeY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minColumns)) __obj.updateDynamic("minColumns")(minColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minRows)) __obj.updateDynamic("minRows")(minRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSizeX)) __obj.updateDynamic("minSizeX")(minSizeX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSizeY)) __obj.updateDynamic("minSizeY")(minSizeY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mobileBreakPoint)) __obj.updateDynamic("mobileBreakPoint")(mobileBreakPoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mobileModeEnabled)) __obj.updateDynamic("mobileModeEnabled")(mobileModeEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outerMargin)) __obj.updateDynamic("outerMargin")(outerMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pushing)) __obj.updateDynamic("pushing")(pushing.get.asInstanceOf[js.Any])
    if (resizable != null) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(saveGridItemCalculatedHeightInMobile)) __obj.updateDynamic("saveGridItemCalculatedHeightInMobile")(saveGridItemCalculatedHeightInMobile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swapping)) __obj.updateDynamic("swapping")(swapping.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridsterConfig]
  }
}

