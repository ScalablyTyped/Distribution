package typings.activexDashExcel

import typings.activexDashExcel.ExcelNs.PivotTable
import typings.activexDashExcel.ExcelNs.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_TargetPivotTableTargetRange extends js.Object {
  val TargetPivotTable: PivotTable = js.native
  @JSName("TargetRange")
  val TargetRange_Original: Range = js.native
  def TargetRange(Address: String): Range = js.native
  def TargetRange(RowIndex: Double): Range = js.native
  def TargetRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
}

