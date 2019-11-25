package typings.activexDashExcel

import typings.activexDashExcel.Excel.PivotTable
import typings.activexDashExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Target extends js.Object {
  val Target: PivotTable
  val Wb: Workbook
}

object Anon_Target {
  @scala.inline
  def apply(Target: PivotTable, Wb: Workbook): Anon_Target = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Target]
  }
}

