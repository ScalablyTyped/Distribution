package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetPivotTableValueChangeEnd extends js.Object {
  val TargetPivotTable: PivotTable
  val ValueChangeEnd: Double
  val ValueChangeStart: Double
}

object TargetPivotTableValueChangeEnd {
  @scala.inline
  def apply(TargetPivotTable: PivotTable, ValueChangeEnd: Double, ValueChangeStart: Double): TargetPivotTableValueChangeEnd = {
    val __obj = js.Dynamic.literal(TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], ValueChangeEnd = ValueChangeEnd.asInstanceOf[js.Any], ValueChangeStart = ValueChangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetPivotTableValueChangeEnd]
  }
}

