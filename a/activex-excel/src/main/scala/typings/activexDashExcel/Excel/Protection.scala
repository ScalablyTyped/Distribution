package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Protection")
@js.native
class Protection protected () extends js.Object {
  val AllowDeletingColumns: Boolean = js.native
  val AllowDeletingRows: Boolean = js.native
  @JSName("AllowEditRanges")
  val AllowEditRanges_Original: AllowEditRanges = js.native
  val AllowFiltering: Boolean = js.native
  val AllowFormattingCells: Boolean = js.native
  val AllowFormattingColumns: Boolean = js.native
  val AllowFormattingRows: Boolean = js.native
  val AllowInsertingColumns: Boolean = js.native
  val AllowInsertingHyperlinks: Boolean = js.native
  val AllowInsertingRows: Boolean = js.native
  val AllowSorting: Boolean = js.native
  val AllowUsingPivotTables: Boolean = js.native
  var `Excel.Protection_typekey`: Protection = js.native
  def AllowEditRanges(Index: String): AllowEditRange = js.native
  def AllowEditRanges(Index: Double): AllowEditRange = js.native
}

