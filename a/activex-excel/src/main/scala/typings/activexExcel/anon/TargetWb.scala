package typings.activexExcel.anon

import typings.activexExcel.Excel.PivotTable
import typings.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetWb extends js.Object {
  val Target: PivotTable
  val Wb: Workbook
}

object TargetWb {
  @scala.inline
  def apply(Target: PivotTable, Wb: Workbook): TargetWb = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetWb]
  }
}

