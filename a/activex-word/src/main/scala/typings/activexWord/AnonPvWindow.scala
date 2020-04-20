package typings.activexWord

import typings.activexWord.Word.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPvWindow extends js.Object {
  val PvWindow: ProtectedViewWindow
}

object AnonPvWindow {
  @scala.inline
  def apply(PvWindow: ProtectedViewWindow): AnonPvWindow = {
    val __obj = js.Dynamic.literal(PvWindow = PvWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPvWindow]
  }
}

