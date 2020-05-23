package typings.activexExcel.anon

import typings.activexExcel.Excel.Window
import typings.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wn extends js.Object {
  val Wb: Workbook
  val Wn: Window
}

object Wn {
  @scala.inline
  def apply(Wb: Workbook, Wn: Window): Wn = {
    val __obj = js.Dynamic.literal(Wb = Wb.asInstanceOf[js.Any], Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wn]
  }
}

