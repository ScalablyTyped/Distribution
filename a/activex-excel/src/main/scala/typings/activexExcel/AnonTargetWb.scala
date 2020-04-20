package typings.activexExcel

import typings.activexExcel.Excel.PivotTable
import typings.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTargetWb extends js.Object {
  val Target: PivotTable
  val Wb: Workbook
}

object AnonTargetWb {
  @scala.inline
  def apply(Target: PivotTable, Wb: Workbook): AnonTargetWb = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTargetWb]
  }
}

