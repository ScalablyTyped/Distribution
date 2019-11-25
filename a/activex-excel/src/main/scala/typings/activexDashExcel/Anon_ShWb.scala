package typings.activexDashExcel

import typings.activexDashExcel.Excel.Workbook
import typings.activexDashExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShWb extends js.Object {
  val Sh: Worksheet
  val Wb: Workbook
}

object Anon_ShWb {
  @scala.inline
  def apply(Sh: Worksheet, Wb: Workbook): Anon_ShWb = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ShWb]
  }
}

