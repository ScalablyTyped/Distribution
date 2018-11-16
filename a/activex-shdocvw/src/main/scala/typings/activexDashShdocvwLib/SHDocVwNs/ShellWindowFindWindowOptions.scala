package typings
package activexDashShdocvwLib.SHDocVwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShellWindowFindWindowOptions extends js.Object

/** Options for ShellWindows FindWindow */
// tslint:disable-next-line no-const-enum
@JSGlobal("SHDocVw.ShellWindowFindWindowOptions")
@js.native
object ShellWindowFindWindowOptions extends js.Object {
  @js.native
  sealed trait SWFO_COOKIEPASSED
    extends activexDashShdocvwLib.SHDocVwNs.ShellWindowFindWindowOptions
  
  @js.native
  sealed trait SWFO_INCLUDEPENDING
    extends activexDashShdocvwLib.SHDocVwNs.ShellWindowFindWindowOptions
  
  @js.native
  sealed trait SWFO_NEEDDISPATCH
    extends activexDashShdocvwLib.SHDocVwNs.ShellWindowFindWindowOptions
  
  /* 4 */ val SWFO_COOKIEPASSED: SWFO_COOKIEPASSED with scala.Double = js.native
  /* 2 */ val SWFO_INCLUDEPENDING: SWFO_INCLUDEPENDING with scala.Double = js.native
  /* 1 */ val SWFO_NEEDDISPATCH: SWFO_NEEDDISPATCH with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShdocvwLib.SHDocVwNs.ShellWindowFindWindowOptions with scala.Double] = js.native
}

