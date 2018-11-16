package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Protection")
@js.native
class Protection protected () extends js.Object {
  val AllowDeletingColumns: scala.Boolean = js.native
  val AllowDeletingRows: scala.Boolean = js.native
  @JSName("AllowEditRanges")
  val AllowEditRanges_Original: AllowEditRanges = js.native
  val AllowFiltering: scala.Boolean = js.native
  val AllowFormattingCells: scala.Boolean = js.native
  val AllowFormattingColumns: scala.Boolean = js.native
  val AllowFormattingRows: scala.Boolean = js.native
  val AllowInsertingColumns: scala.Boolean = js.native
  val AllowInsertingHyperlinks: scala.Boolean = js.native
  val AllowInsertingRows: scala.Boolean = js.native
  val AllowSorting: scala.Boolean = js.native
  val AllowUsingPivotTables: scala.Boolean = js.native
  var `Excel.Protection_typekey`: Protection = js.native
  def AllowEditRanges(Index: java.lang.String): AllowEditRange = js.native
  def AllowEditRanges(Index: scala.Double): AllowEditRange = js.native
}

