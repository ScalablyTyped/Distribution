package typings.activexExcel

import typings.activexExcel.Excel.Hyperlink
import typings.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShTargetHyperlink extends js.Object {
  val Sh: Worksheet
  val Target: Hyperlink
}

object AnonShTargetHyperlink {
  @scala.inline
  def apply(Sh: Worksheet, Target: Hyperlink): AnonShTargetHyperlink = {
    val __obj = js.Dynamic.literal(Sh = Sh.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonShTargetHyperlink]
  }
}

