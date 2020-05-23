package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelTargetPivotTable extends js.Object {
  var Cancel: Boolean
  val TargetPivotTable: PivotTable
  val ValueChangeEnd: Double
  val ValueChangeStart: Double
}

object CancelTargetPivotTable {
  @scala.inline
  def apply(Cancel: Boolean, TargetPivotTable: PivotTable, ValueChangeEnd: Double, ValueChangeStart: Double): CancelTargetPivotTable = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], ValueChangeEnd = ValueChangeEnd.asInstanceOf[js.Any], ValueChangeStart = ValueChangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTargetPivotTable]
  }
}

