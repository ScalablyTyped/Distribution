package typings.activexExcel

import typings.activexExcel.Excel.Chart
import typings.activexExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCh extends js.Object {
  val Ch: Chart
  val Wb: Workbook
}

object AnonCh {
  @scala.inline
  def apply(Ch: Chart, Wb: Workbook): AnonCh = {
    val __obj = js.Dynamic.literal(Ch = Ch.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCh]
  }
}

