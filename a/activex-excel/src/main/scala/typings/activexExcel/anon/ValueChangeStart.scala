package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueChangeStart extends js.Object {
  val Sh: js.Any
  val TargetPivotTable: PivotTable
  val ValueChangeEnd: Double
  val ValueChangeStart: Double
}

object ValueChangeStart {
  @scala.inline
  def apply(Sh: js.Any, TargetPivotTable: PivotTable, ValueChangeEnd: Double, ValueChangeStart: Double): ValueChangeStart = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], ValueChangeEnd = ValueChangeEnd.asInstanceOf[js.Any], ValueChangeStart = ValueChangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueChangeStart]
  }
}

