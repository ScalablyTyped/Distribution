package typings.activexDashExcel

import typings.activexDashExcel.ExcelNs.Window
import typings.activexDashExcel.ExcelNs.Workbook
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
    val __obj = js.Dynamic.literal(Wb = Wb, Wn = Wn)
  
    __obj.asInstanceOf[Anon_WbWn]
  }
}

