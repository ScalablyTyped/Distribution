package typings.activexDashExcel

import typings.activexDashExcel.Excel.Chart
import typings.activexDashExcel.Excel.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ch extends js.Object {
  val Ch: Chart
  val Wb: Workbook
}

object Anon_Ch {
  @scala.inline
  def apply(Ch: Chart, Wb: Workbook): Anon_Ch = {
    val __obj = js.Dynamic.literal(Ch = Ch, Wb = Wb)
  
    __obj.asInstanceOf[Anon_Ch]
  }
}

