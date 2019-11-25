package typings.activexDashPowerpoint

import typings.activexDashPowerpoint.PowerPoint.PpProtectedViewCloseReason
import typings.activexDashPowerpoint.PowerPoint.ProtectedViewWindow
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
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ProtViewWindow = ProtViewWindow.asInstanceOf[js.Any], ProtectedViewCloseReason = ProtectedViewCloseReason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CancelProtViewWindow]
  }
}

