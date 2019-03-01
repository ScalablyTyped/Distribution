package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShTarget extends js.Object {
  val Sh: activexDashExcelLib.ExcelNs.Worksheet
  val Target: activexDashExcelLib.ExcelNs.Hyperlink
}

object Anon_ShTarget {
  @scala.inline
  def apply(Sh: activexDashExcelLib.ExcelNs.Worksheet, Target: activexDashExcelLib.ExcelNs.Hyperlink): Anon_ShTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Sh")(Sh)
    __obj.updateDynamic("Target")(Target)
    __obj.asInstanceOf[Anon_ShTarget]
  }
}

