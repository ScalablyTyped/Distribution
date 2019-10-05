package typings.activexDashExcel

import typings.activexDashExcel.Excel.PivotTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TargetPivotTableValueChangeEnd extends js.Object {
  val TargetPivotTable: PivotTable
  val ValueChangeEnd: Double
  val ValueChangeStart: Double
}

object Anon_TargetPivotTableValueChangeEnd {
  @scala.inline
  def apply(TargetPivotTable: PivotTable, ValueChangeEnd: Double, ValueChangeStart: Double): Anon_TargetPivotTableValueChangeEnd = {
    val __obj = js.Dynamic.literal(TargetPivotTable = TargetPivotTable, ValueChangeEnd = ValueChangeEnd, ValueChangeStart = ValueChangeStart)
  
    __obj.asInstanceOf[Anon_TargetPivotTableValueChangeEnd]
  }
}

