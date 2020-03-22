package typings.activexPowerpoint

import typings.activexPowerpoint.PowerPoint.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelProtViewWindow extends js.Object {
  var Cancel: Boolean
  val ProtViewWindow: ProtectedViewWindow
}

object AnonCancelProtViewWindow {
  @scala.inline
  def apply(Cancel: Boolean, ProtViewWindow: ProtectedViewWindow): AnonCancelProtViewWindow = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ProtViewWindow = ProtViewWindow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelProtViewWindow]
  }
}

