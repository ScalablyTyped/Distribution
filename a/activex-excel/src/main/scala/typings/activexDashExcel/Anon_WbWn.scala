package typings.activexDashExcel

import typings.activexDashExcel.Excel.Window
import typings.activexDashExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WbWn extends js.Object {
  val Wb: Workbook
  val Wn: Window
}

object Anon_WbWn {
  @scala.inline
  def apply(Wb: Workbook, Wn: Window): Anon_WbWn = {
    val __obj = js.Dynamic.literal(Wb = Wb.asInstanceOf[js.Any], Wn = Wn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_WbWn]
  }
}

