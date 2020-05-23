package typings.activexExcel.anon

import typings.activexExcel.Excel.Chart
import typings.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ch extends js.Object {
  val Ch: Chart
  val Wb: Workbook
}

object Ch {
  @scala.inline
  def apply(Ch: Chart, Wb: Workbook): Ch = {
    val __obj = js.Dynamic.literal(Ch = Ch.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ch]
  }
}

