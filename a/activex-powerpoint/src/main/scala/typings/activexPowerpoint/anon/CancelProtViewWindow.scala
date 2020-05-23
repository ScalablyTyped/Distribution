package typings.activexPowerpoint.anon

import typings.activexPowerpoint.PowerPoint.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelProtViewWindow extends js.Object {
  var Cancel: Boolean
  val ProtViewWindow: ProtectedViewWindow
}

object CancelProtViewWindow {
  @scala.inline
  def apply(Cancel: Boolean, ProtViewWindow: ProtectedViewWindow): CancelProtViewWindow = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ProtViewWindow = ProtViewWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelProtViewWindow]
  }
}

