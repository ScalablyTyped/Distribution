package typings.activexDashExcel

import typings.activexDashExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Success extends js.Object {
  val Success: Boolean
  val Wb: Workbook
}

object Anon_Success {
  @scala.inline
  def apply(Success: Boolean, Wb: Workbook): Anon_Success = {
    val __obj = js.Dynamic.literal(Success = Success.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Success]
  }
}

