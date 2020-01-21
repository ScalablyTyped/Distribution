package typings.activexExcel

import typings.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelWb extends js.Object {
  var Cancel: Boolean
  val Wb: Workbook
}

object AnonCancelWb {
  @scala.inline
  def apply(Cancel: Boolean, Wb: Workbook): AnonCancelWb = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelWb]
  }
}

