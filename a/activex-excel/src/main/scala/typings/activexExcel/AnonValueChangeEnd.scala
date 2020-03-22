package typings.activexExcel

import typings.activexExcel.Excel.PivotTable
import typings.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueChangeEnd extends js.Object {
  var Cancel: Boolean
  val Sh: Worksheet
  val TargetPivotTable: PivotTable
  val ValueChangeEnd: Double
  val ValueChangeStart: Double
}

object AnonValueChangeEnd {
  @scala.inline
  def apply(
    Cancel: Boolean,
    Sh: Worksheet,
    TargetPivotTable: PivotTable,
    ValueChangeEnd: Double,
    ValueChangeStart: Double
  ): AnonValueChangeEnd = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Sh = Sh.asInstanceOf[js.Any], TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], ValueChangeEnd = ValueChangeEnd.asInstanceOf[js.Any], ValueChangeStart = ValueChangeStart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValueChangeEnd]
  }
}

