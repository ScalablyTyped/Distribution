package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetPivotTableValueChangeEnd extends js.Object {
  val TargetPivotTable: PivotTable = js.native
  val ValueChangeEnd: Double = js.native
  val ValueChangeStart: Double = js.native
}

object TargetPivotTableValueChangeEnd {
  @scala.inline
  def apply(TargetPivotTable: PivotTable, ValueChangeEnd: Double, ValueChangeStart: Double): TargetPivotTableValueChangeEnd = {
    val __obj = js.Dynamic.literal(TargetPivotTable = TargetPivotTable.asInstanceOf[js.Any], ValueChangeEnd = ValueChangeEnd.asInstanceOf[js.Any], ValueChangeStart = ValueChangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetPivotTableValueChangeEnd]
  }
  @scala.inline
  implicit class TargetPivotTableValueChangeEndOps[Self <: TargetPivotTableValueChangeEnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTargetPivotTable(value: PivotTable): Self = this.set("TargetPivotTable", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueChangeEnd(value: Double): Self = this.set("ValueChangeEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueChangeStart(value: Double): Self = this.set("ValueChangeStart", value.asInstanceOf[js.Any])
  }
  
}

