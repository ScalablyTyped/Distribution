package typings.activexExcel

import typings.activexExcel.Excel.PivotTable
import typings.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTarget extends js.Object {
  val Target: PivotTable
  val Wb: Workbook
}

object AnonTarget {
  @scala.inline
  def apply(Target: PivotTable, Wb: Workbook): AnonTarget = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTarget]
  }
}

