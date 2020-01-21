package typings.activexWord

import typings.activexWord.Word.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelPvWindow extends js.Object {
  var Cancel: Boolean
  val PvWindow: ProtectedViewWindow
}

object AnonCancelPvWindow {
  @scala.inline
  def apply(Cancel: Boolean, PvWindow: ProtectedViewWindow): AnonCancelPvWindow = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], PvWindow = PvWindow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelPvWindow]
  }
}

