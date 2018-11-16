package typings
package activexDashShdocvwLib.SHDocVwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NewProcessCauseConstants extends js.Object

/** Constants for WebBrowser NewProcess notification */
// tslint:disable-next-line no-const-enum
@JSGlobal("SHDocVw.NewProcessCauseConstants")
@js.native
object NewProcessCauseConstants extends js.Object {
  @js.native
  sealed trait ProtectedModeRedirect
    extends activexDashShdocvwLib.SHDocVwNs.NewProcessCauseConstants
  
  /* 1 */ val ProtectedModeRedirect: ProtectedModeRedirect with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShdocvwLib.SHDocVwNs.NewProcessCauseConstants with scala.Double] = js.native
}

