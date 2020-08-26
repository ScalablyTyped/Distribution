package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import typings.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShWorksheetTargetPivotTable extends js.Object {
  val Sh: Worksheet = js.native
  val Target: PivotTable = js.native
}

object ShWorksheetTargetPivotTable {
  @scala.inline
  def apply(Sh: Worksheet, Target: PivotTable): ShWorksheetTargetPivotTable = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShWorksheetTargetPivotTable]
  }
  @scala.inline
  implicit class ShWorksheetTargetPivotTableOps[Self <: ShWorksheetTargetPivotTable] (val x: Self) extends AnyVal {
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
    def setSh(value: Worksheet): Self = this.set("Sh", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: PivotTable): Self = this.set("Target", value.asInstanceOf[js.Any])
  }
  
}

