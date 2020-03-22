package typings.activexExcel

import typings.activexExcel.Excel.PivotTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueChangeStart extends js.Object {
  val Sh: js.Any
  val TargetPivotTable: PivotTable
  val ValueChangeEnd: Double
  val ValueChangeStart: Double
}

object AnonValueChangeStart {
  @scala.inline
  def apply(Sh: js.Any, TargetPivotTable: PivotTable, ValueChangeEnd: Double, ValueChangeStart: Double): AnonValueChangeStart = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], ValueChangeEnd = ValueChangeEnd.asInstanceOf[js.Any], ValueChangeStart = ValueChangeStart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValueChangeStart]
  }
}

