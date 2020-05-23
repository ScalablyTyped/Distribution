package typings.activexPowerpoint.anon

import typings.activexPowerpoint.PowerPoint.PpProtectedViewCloseReason
import typings.activexPowerpoint.PowerPoint.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtectedViewCloseReason extends js.Object {
  var Cancel: Boolean
  val ProtViewWindow: ProtectedViewWindow
  val ProtectedViewCloseReason: PpProtectedViewCloseReason
}

object ProtectedViewCloseReason {
  @scala.inline
  def apply(
    Cancel: Boolean,
    ProtViewWindow: ProtectedViewWindow,
    ProtectedViewCloseReason: PpProtectedViewCloseReason
  ): ProtectedViewCloseReason = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ProtViewWindow = ProtViewWindow.asInstanceOf[js.Any], ProtectedViewCloseReason = ProtectedViewCloseReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedViewCloseReason]
  }
}

