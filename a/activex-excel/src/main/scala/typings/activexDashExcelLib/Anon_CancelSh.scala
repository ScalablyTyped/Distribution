package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelSh extends js.Object {
  var Cancel: scala.Boolean
  val Sh: activexDashExcelLib.ExcelNs.Worksheet
  val TargetPivotTable: activexDashExcelLib.ExcelNs.PivotTable
  val ValueChangeEnd: scala.Double
  val ValueChangeStart: scala.Double
}

object Anon_CancelSh {
  @scala.inline
  def apply(
    Cancel: scala.Boolean,
    Sh: activexDashExcelLib.ExcelNs.Worksheet,
    TargetPivotTable: activexDashExcelLib.ExcelNs.PivotTable,
    ValueChangeEnd: scala.Double,
    ValueChangeStart: scala.Double
  ): Anon_CancelSh = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Sh = Sh, TargetPivotTable = TargetPivotTable, ValueChangeEnd = ValueChangeEnd, ValueChangeStart = ValueChangeStart)
  
    __obj.asInstanceOf[Anon_CancelSh]
  }
}

