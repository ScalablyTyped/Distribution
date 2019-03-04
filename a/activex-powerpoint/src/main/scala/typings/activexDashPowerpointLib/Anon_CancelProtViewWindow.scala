package typings
package activexDashPowerpointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelProtViewWindow extends js.Object {
  var Cancel: scala.Boolean
  val ProtViewWindow: activexDashPowerpointLib.PowerPointNs.ProtectedViewWindow
  val ProtectedViewCloseReason: activexDashPowerpointLib.PowerPointNs.PpProtectedViewCloseReason
}

object Anon_CancelProtViewWindow {
  @scala.inline
  def apply(
    Cancel: scala.Boolean,
    ProtViewWindow: activexDashPowerpointLib.PowerPointNs.ProtectedViewWindow,
    ProtectedViewCloseReason: activexDashPowerpointLib.PowerPointNs.PpProtectedViewCloseReason
  ): Anon_CancelProtViewWindow = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, ProtViewWindow = ProtViewWindow, ProtectedViewCloseReason = ProtectedViewCloseReason)
  
    __obj.asInstanceOf[Anon_CancelProtViewWindow]
  }
}

