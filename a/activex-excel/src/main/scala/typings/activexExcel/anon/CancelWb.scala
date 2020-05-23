package typings.activexExcel.anon

import typings.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelWb extends js.Object {
  var Cancel: Boolean
  val Wb: Workbook
}

object CancelWb {
  @scala.inline
  def apply(Cancel: Boolean, Wb: Workbook): CancelWb = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelWb]
  }
}

