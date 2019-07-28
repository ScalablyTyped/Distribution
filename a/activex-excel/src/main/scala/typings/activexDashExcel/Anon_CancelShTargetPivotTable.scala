package typings.activexDashExcel

import typings.activexDashExcel.ExcelNs.PivotTable
import typings.activexDashExcel.ExcelNs.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelShTargetPivotTable extends js.Object {
  var Cancel: Boolean
  val Sh: Worksheet
  val TargetPivotTable: PivotTable
  val ValueChangeEnd: Double
  val ValueChangeStart: Double
}

object Anon_CancelShTargetPivotTable {
  @scala.inline
  def apply(
    Cancel: Boolean,
    Sh: Worksheet,
    TargetPivotTable: PivotTable,
    ValueChangeEnd: Double,
    ValueChangeStart: Double
  ): Anon_CancelShTargetPivotTable = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Sh = Sh, TargetPivotTable = TargetPivotTable, ValueChangeEnd = ValueChangeEnd, ValueChangeStart = ValueChangeStart)
  
    __obj.asInstanceOf[Anon_CancelShTargetPivotTable]
  }
}

