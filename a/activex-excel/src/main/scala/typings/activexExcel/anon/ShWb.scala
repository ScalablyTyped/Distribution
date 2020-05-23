package typings.activexExcel.anon

import typings.activexExcel.Excel.Workbook
import typings.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShWb extends js.Object {
  val Sh: Worksheet
  val Wb: Workbook
}

object ShWb {
  @scala.inline
  def apply(Sh: Worksheet, Wb: Workbook): ShWb = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShWb]
  }
}

