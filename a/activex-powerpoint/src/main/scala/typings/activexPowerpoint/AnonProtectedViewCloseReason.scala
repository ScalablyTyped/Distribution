package typings.activexPowerpoint

import typings.activexPowerpoint.PowerPoint.PpProtectedViewCloseReason
import typings.activexPowerpoint.PowerPoint.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProtectedViewCloseReason extends js.Object {
  var Cancel: Boolean
  val ProtViewWindow: ProtectedViewWindow
  val ProtectedViewCloseReason: PpProtectedViewCloseReason
}

object AnonProtectedViewCloseReason {
  @scala.inline
  def apply(
    Cancel: Boolean,
    ProtViewWindow: ProtectedViewWindow,
    ProtectedViewCloseReason: PpProtectedViewCloseReason
  ): AnonProtectedViewCloseReason = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ProtViewWindow = ProtViewWindow.asInstanceOf[js.Any], ProtectedViewCloseReason = ProtectedViewCloseReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProtectedViewCloseReason]
  }
}

