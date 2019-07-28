package typings.activexDashWord

import typings.activexDashWord.WordNs.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelPvWindow extends js.Object {
  var Cancel: Boolean
  val PvWindow: ProtectedViewWindow
}

object Anon_CancelPvWindow {
  @scala.inline
  def apply(Cancel: Boolean, PvWindow: ProtectedViewWindow): Anon_CancelPvWindow = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, PvWindow = PvWindow)
  
    __obj.asInstanceOf[Anon_CancelPvWindow]
  }
}

