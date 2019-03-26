package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShTargetPivotTableValueChangeEnd extends js.Object {
  val Sh: js.Any
  val TargetPivotTable: activexDashExcelLib.ExcelNs.PivotTable
  val ValueChangeEnd: scala.Double
  val ValueChangeStart: scala.Double
}

object Anon_ShTargetPivotTableValueChangeEnd {
  @scala.inline
  def apply(
    Sh: js.Any,
    TargetPivotTable: activexDashExcelLib.ExcelNs.PivotTable,
    ValueChangeEnd: scala.Double,
    ValueChangeStart: scala.Double
  ): Anon_ShTargetPivotTableValueChangeEnd = {
    val __obj = js.Dynamic.literal(Sh = Sh, TargetPivotTable = TargetPivotTable, ValueChangeEnd = ValueChangeEnd, ValueChangeStart = ValueChangeStart)
  
    __obj.asInstanceOf[Anon_ShTargetPivotTableValueChangeEnd]
  }
}

