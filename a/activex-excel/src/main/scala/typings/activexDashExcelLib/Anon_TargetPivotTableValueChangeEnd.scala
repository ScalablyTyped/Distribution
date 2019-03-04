package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TargetPivotTableValueChangeEnd extends js.Object {
  val TargetPivotTable: activexDashExcelLib.ExcelNs.PivotTable
  val ValueChangeEnd: scala.Double
  val ValueChangeStart: scala.Double
}

object Anon_TargetPivotTableValueChangeEnd {
  @scala.inline
  def apply(
    TargetPivotTable: activexDashExcelLib.ExcelNs.PivotTable,
    ValueChangeEnd: scala.Double,
    ValueChangeStart: scala.Double
  ): Anon_TargetPivotTableValueChangeEnd = {
    val __obj = js.Dynamic.literal(TargetPivotTable = TargetPivotTable, ValueChangeEnd = ValueChangeEnd, ValueChangeStart = ValueChangeStart)
  
    __obj.asInstanceOf[Anon_TargetPivotTableValueChangeEnd]
  }
}

