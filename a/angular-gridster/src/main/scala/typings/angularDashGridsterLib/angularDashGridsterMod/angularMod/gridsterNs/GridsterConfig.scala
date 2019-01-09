package typings
package angularDashGridsterLib.angularDashGridsterMod.angularMod.gridsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridsterConfig extends js.Object {
  // width of grid columns. "auto" will divide the width of the grid evenly among the columns
  var colWidth: js.UndefOr[java.lang.String] = js.undefined
  // number of columns in the grid
  var columns: js.UndefOr[scala.Double] = js.undefined
  // default width of an item in columns
  var defaultSizeX: js.UndefOr[scala.Double] = js.undefined
  // default height of an item in rows
  var defaultSizeY: js.UndefOr[scala.Double] = js.undefined
  // options to pass to draggable handler
  var draggable: js.UndefOr[angularDashGridsterLib.Anon_Drag] = js.undefined
  // whether to automatically float items up so they stack
  var floating: js.UndefOr[scala.Boolean] = js.undefined
  // toggle mobile view
  var isMobile: js.UndefOr[scala.Boolean] = js.undefined
  // margins in between grid items
  var margins: js.UndefOr[js.Array[scala.Double]] = js.undefined
  // maximum amount of rows in the grid
  var maxRows: js.UndefOr[scala.Double] = js.undefined
  // maximum column width of an item
  var maxSizeX: js.UndefOr[scala.Double] = js.undefined
  // maximum row height of an item
  var maxSizeY: js.UndefOr[scala.Double] = js.undefined
  // minimum amount of columns the grid can scale down to
  var minColumns: js.UndefOr[scala.Double] = js.undefined
  // minimum amount of rows to show if the grid is empty
  var minRows: js.UndefOr[scala.Double] = js.undefined
  // minimum column width of an item
  var minSizeX: js.UndefOr[scala.Double] = js.undefined
  // minumum row height of an item
  var minSizeY: js.UndefOr[scala.Double] = js.undefined
  // width threshold to toggle mobile mode
  var mobileBreakPoint: js.UndefOr[scala.Double] = js.undefined
  // whether or not to toggle mobile mode when screen width is less than mobileBreakPoint
  var mobileModeEnabled: js.UndefOr[scala.Boolean] = js.undefined
  // whether to set the outer margin
  var outerMargin: js.UndefOr[scala.Boolean] = js.undefined
  // whether to push other items out of the way
  // whether to push other items out of the way
  var pushing: js.UndefOr[scala.Boolean] = js.undefined
  // grid item height in mobile display. true- to use the calculated height by sizeY given
  // options to pass to resizable handler
  var resizable: js.UndefOr[angularDashGridsterLib.Anon_Element] = js.undefined
  // height of grid rows. 'match' will make it the same as the column width, a numeric value will be interpreted as pixels,
  // '/2' is half the column width, '*5' is five times the column width, etc.
  var rowHeight: js.UndefOr[java.lang.String] = js.undefined
  var saveGridItemCalculatedHeightInMobile: js.UndefOr[scala.Boolean] = js.undefined
  // whether or not to have items switch places instead of push down if they are the same size
  var swapping: js.UndefOr[scala.Boolean] = js.undefined
  // width of the grid. "auto" will expand the grid to its parent container
  var width: js.UndefOr[java.lang.String] = js.undefined
}

