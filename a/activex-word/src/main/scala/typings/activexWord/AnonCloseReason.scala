package typings.activexWord

import typings.activexWord.Word.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloseReason extends js.Object {
  var Cancel: Boolean
  val CloseReason: Double
  val PvWindow: ProtectedViewWindow
}

object AnonCloseReason {
  @scala.inline
  def apply(Cancel: Boolean, CloseReason: Double, PvWindow: ProtectedViewWindow): AnonCloseReason = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], CloseReason = CloseReason.asInstanceOf[js.Any], PvWindow = PvWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloseReason]
  }
}

