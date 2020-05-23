package typings.activexExcel.anon

import typings.activexExcel.Excel.Hyperlink
import typings.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShWorksheet extends js.Object {
  val Sh: Worksheet
  val Target: Hyperlink
}

object ShWorksheet {
  @scala.inline
  def apply(Sh: Worksheet, Target: Hyperlink): ShWorksheet = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShWorksheet]
  }
}

