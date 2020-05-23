package typings.activexWord.anon

import typings.activexWord.Word.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelPvWindow extends js.Object {
  var Cancel: Boolean
  val PvWindow: ProtectedViewWindow
}

object CancelPvWindow {
  @scala.inline
  def apply(Cancel: Boolean, PvWindow: ProtectedViewWindow): CancelPvWindow = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], PvWindow = PvWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelPvWindow]
  }
}

