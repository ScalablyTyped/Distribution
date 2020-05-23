package typings.activexExcel.anon

import typings.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Success extends js.Object {
  val Success: Boolean
  val Wb: Workbook
}

object Success {
  @scala.inline
  def apply(Success: Boolean, Wb: Workbook): Success = {
    val __obj = js.Dynamic.literal(Success = Success.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Success]
  }
}

