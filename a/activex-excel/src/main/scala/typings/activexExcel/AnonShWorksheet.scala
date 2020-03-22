package typings.activexExcel

import typings.activexExcel.Excel.Hyperlink
import typings.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShWorksheet extends js.Object {
  val Sh: Worksheet
  val Target: Hyperlink
}

object AnonShWorksheet {
  @scala.inline
  def apply(Sh: Worksheet, Target: Hyperlink): AnonShWorksheet = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonShWorksheet]
  }
}

