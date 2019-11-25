package typings.activexDashExcel

import typings.activexDashExcel.Excel.PivotTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShTargetPivotTableValueChangeEnd extends js.Object {
  val Sh: js.Any
  val TargetPivotTable: PivotTable
  val ValueChangeEnd: Double
  val ValueChangeStart: Double
}

object Anon_ShTargetPivotTableValueChangeEnd {
  @scala.inline
  def apply(Sh: js.Any, TargetPivotTable: PivotTable, ValueChangeEnd: Double, ValueChangeStart: Double): Anon_ShTargetPivotTableValueChangeEnd = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], ValueChangeEnd = ValueChangeEnd.asInstanceOf[js.Any], ValueChangeStart = ValueChangeStart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ShTargetPivotTableValueChangeEnd]
  }
}

