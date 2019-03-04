package typings
package activexDashWordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelCloseReason extends js.Object {
  var Cancel: scala.Boolean
  val CloseReason: scala.Double
  val PvWindow: activexDashWordLib.WordNs.ProtectedViewWindow
}

object Anon_CancelCloseReason {
  @scala.inline
  def apply(
    Cancel: scala.Boolean,
    CloseReason: scala.Double,
    PvWindow: activexDashWordLib.WordNs.ProtectedViewWindow
  ): Anon_CancelCloseReason = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, CloseReason = CloseReason, PvWindow = PvWindow)
  
    __obj.asInstanceOf[Anon_CancelCloseReason]
  }
}

