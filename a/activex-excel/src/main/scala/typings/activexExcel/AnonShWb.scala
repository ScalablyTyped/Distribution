package typings.activexExcel

import typings.activexExcel.Excel.Workbook
import typings.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShWb extends js.Object {
  val Sh: Worksheet
  val Wb: Workbook
}

object AnonShWb {
  @scala.inline
  def apply(Sh: Worksheet, Wb: Workbook): AnonShWb = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonShWb]
  }
}

