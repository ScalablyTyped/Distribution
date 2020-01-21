package typings.activexExcel

import typings.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWb extends js.Object {
  val Wb: Workbook
}

object AnonWb {
  @scala.inline
  def apply(Wb: Workbook): AnonWb = {
    val __obj = js.Dynamic.literal(Wb = Wb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWb]
  }
}

