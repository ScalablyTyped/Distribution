package typings.agGrid.mod

import typings.agGrid.colDefMod.ColDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "Column")
@js.native
class Column protected ()
  extends typings.agGrid.columnMod.Column {
  def this(colDef: ColDef, colId: String, primary: Boolean) = this()
}

/* static members */
@JSImport("ag-grid", "Column")
@js.native
object Column extends js.Object {
  var EVENT_FILTER_ACTIVE_CHANGED: String = js.native
  var EVENT_FILTER_CHANGED: String = js.native
  var EVENT_FIRST_RIGHT_PINNED_CHANGED: String = js.native
  var EVENT_LAST_LEFT_PINNED_CHANGED: String = js.native
  var EVENT_LEFT_CHANGED: String = js.native
  var EVENT_MENU_VISIBLE_CHANGED: String = js.native
  var EVENT_MOVING_CHANGED: String = js.native
  var EVENT_PIVOT_CHANGED: String = js.native
  var EVENT_ROW_GROUP_CHANGED: String = js.native
  var EVENT_SORT_CHANGED: String = js.native
  var EVENT_VALUE_CHANGED: String = js.native
  var EVENT_VISIBLE_CHANGED: String = js.native
  var EVENT_WIDTH_CHANGED: String = js.native
  var PINNED_LEFT: String = js.native
  var PINNED_RIGHT: String = js.native
  var SORT_ASC: String = js.native
  var SORT_DESC: String = js.native
}

