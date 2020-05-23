package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import typings.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShWorksheetTargetPivotTable extends js.Object {
  val Sh: Worksheet
  val Target: PivotTable
}

object ShWorksheetTargetPivotTable {
  @scala.inline
  def apply(Sh: Worksheet, Target: PivotTable): ShWorksheetTargetPivotTable = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShWorksheetTargetPivotTable]
  }
}

