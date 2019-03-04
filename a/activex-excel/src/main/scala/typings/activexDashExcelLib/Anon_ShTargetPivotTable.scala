package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShTargetPivotTable extends js.Object {
  val Sh: js.Any
  val TargetPivotTable: activexDashExcelLib.ExcelNs.PivotTable
  val ValueChangeEnd: scala.Double
  val ValueChangeStart: scala.Double
}

object Anon_ShTargetPivotTable {
  @scala.inline
  def apply(
    Sh: js.Any,
    TargetPivotTable: activexDashExcelLib.ExcelNs.PivotTable,
    ValueChangeEnd: scala.Double,
    ValueChangeStart: scala.Double
  ): Anon_ShTargetPivotTable = {
    val __obj = js.Dynamic.literal(Sh = Sh, TargetPivotTable = TargetPivotTable, ValueChangeEnd = ValueChangeEnd, ValueChangeStart = ValueChangeStart)
  
    __obj.asInstanceOf[Anon_ShTargetPivotTable]
  }
}

