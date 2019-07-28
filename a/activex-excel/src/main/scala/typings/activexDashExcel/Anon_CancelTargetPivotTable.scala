package typings.activexDashExcel

import typings.activexDashExcel.ExcelNs.PivotTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelTargetPivotTable extends js.Object {
  var Cancel: Boolean
  val TargetPivotTable: PivotTable
  val ValueChangeEnd: Double
  val ValueChangeStart: Double
}

object Anon_CancelTargetPivotTable {
  @scala.inline
  def apply(Cancel: Boolean, TargetPivotTable: PivotTable, ValueChangeEnd: Double, ValueChangeStart: Double): Anon_CancelTargetPivotTable = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, TargetPivotTable = TargetPivotTable, ValueChangeEnd = ValueChangeEnd, ValueChangeStart = ValueChangeStart)
  
    __obj.asInstanceOf[Anon_CancelTargetPivotTable]
  }
}

