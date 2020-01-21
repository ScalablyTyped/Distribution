package typings.activexExcel

import typings.activexExcel.Excel.Chart
import typings.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSh extends js.Object {
  val Sh: Chart | Worksheet
}

object AnonSh {
  @scala.inline
  def apply(Sh: Chart | Worksheet): AnonSh = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSh]
  }
}

