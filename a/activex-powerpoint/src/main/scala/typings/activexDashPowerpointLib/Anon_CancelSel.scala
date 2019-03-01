package typings
package activexDashPowerpointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelSel extends js.Object {
  var Cancel: scala.Boolean
  val Sel: activexDashPowerpointLib.PowerPointNs.Selection
}

object Anon_CancelSel {
  @scala.inline
  def apply(Cancel: scala.Boolean, Sel: activexDashPowerpointLib.PowerPointNs.Selection): Anon_CancelSel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("Sel")(Sel)
    __obj.asInstanceOf[Anon_CancelSel]
  }
}

