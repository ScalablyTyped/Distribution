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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("TargetPivotTable")(TargetPivotTable)
    __obj.updateDynamic("ValueChangeEnd")(ValueChangeEnd)
    __obj.updateDynamic("ValueChangeStart")(ValueChangeStart)
    __obj.asInstanceOf[Anon_TargetPivotTableValueChangeEnd]
  }
}

