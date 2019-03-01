package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelTargetPivotTable extends js.Object {
  var Cancel: scala.Boolean
  val TargetPivotTable: activexDashExcelLib.ExcelNs.PivotTable
  val ValueChangeEnd: scala.Double
  val ValueChangeStart: scala.Double
}

object Anon_CancelTargetPivotTable {
  @scala.inline
  def apply(
    Cancel: scala.Boolean,
    TargetPivotTable: activexDashExcelLib.ExcelNs.PivotTable,
    ValueChangeEnd: scala.Double,
    ValueChangeStart: scala.Double
  ): Anon_CancelTargetPivotTable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("TargetPivotTable")(TargetPivotTable)
    __obj.updateDynamic("ValueChangeEnd")(ValueChangeEnd)
    __obj.updateDynamic("ValueChangeStart")(ValueChangeStart)
    __obj.asInstanceOf[Anon_CancelTargetPivotTable]
  }
}

