package typings.activexDashWord

import typings.activexDashWord.WordNs.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelCloseReason extends js.Object {
  var Cancel: Boolean
  val CloseReason: Double
  val PvWindow: ProtectedViewWindow
}

object Anon_CancelCloseReason {
  @scala.inline
  def apply(Cancel: Boolean, CloseReason: Double, PvWindow: ProtectedViewWindow): Anon_CancelCloseReason = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, CloseReason = CloseReason, PvWindow = PvWindow)
  
    __obj.asInstanceOf[Anon_CancelCloseReason]
  }
}

