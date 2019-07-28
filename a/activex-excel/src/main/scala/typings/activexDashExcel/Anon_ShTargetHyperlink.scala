package typings.activexDashExcel

import typings.activexDashExcel.ExcelNs.Hyperlink
import typings.activexDashExcel.ExcelNs.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShTargetHyperlink extends js.Object {
  val Sh: Worksheet
  val Target: Hyperlink
}

object Anon_ShTargetHyperlink {
  @scala.inline
  def apply(Sh: Worksheet, Target: Hyperlink): Anon_ShTargetHyperlink = {
    val __obj = js.Dynamic.literal(Sh = Sh, Target = Target)
  
    __obj.asInstanceOf[Anon_ShTargetHyperlink]
  }
}

