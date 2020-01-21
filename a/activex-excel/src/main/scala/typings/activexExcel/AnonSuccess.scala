package typings.activexExcel

import typings.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSuccess extends js.Object {
  val Success: Boolean
  val Wb: Workbook
}

object AnonSuccess {
  @scala.inline
  def apply(Success: Boolean, Wb: Workbook): AnonSuccess = {
    val __obj = js.Dynamic.literal(Success = Success.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSuccess]
  }
}

