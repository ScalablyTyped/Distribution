package typings.activexDashExcel

import typings.activexDashExcel.Excel.PivotTable
import typings.activexDashExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShTargetPivotTableWorksheet extends js.Object {
  val Sh: Worksheet
  val Target: PivotTable
}

object Anon_ShTargetPivotTableWorksheet {
  @scala.inline
  def apply(Sh: Worksheet, Target: PivotTable): Anon_ShTargetPivotTableWorksheet = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ShTargetPivotTableWorksheet]
  }
}

