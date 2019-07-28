package typings.activexDashPowerpoint

import typings.activexDashPowerpoint.PowerPointNs.PpProtectedViewCloseReason
import typings.activexDashPowerpoint.PowerPointNs.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelProtViewWindow extends js.Object {
  var Cancel: Boolean
  val ProtViewWindow: ProtectedViewWindow
  val ProtectedViewCloseReason: PpProtectedViewCloseReason
}

object Anon_CancelProtViewWindow {
  @scala.inline
  def apply(
    Cancel: Boolean,
    ProtViewWindow: ProtectedViewWindow,
    ProtectedViewCloseReason: PpProtectedViewCloseReason
  ): Anon_CancelProtViewWindow = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, ProtViewWindow = ProtViewWindow, ProtectedViewCloseReason = ProtectedViewCloseReason)
  
    __obj.asInstanceOf[Anon_CancelProtViewWindow]
  }
}

