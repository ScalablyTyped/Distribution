package typings.activexDashExcel

import typings.activexDashExcel.ExcelNs.Chart
import typings.activexDashExcel.ExcelNs.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sh extends js.Object {
  val Sh: Chart | Worksheet
}

object Anon_Sh {
  @scala.inline
  def apply(Sh: Chart | Worksheet): Anon_Sh = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Sh]
  }
}

