package typings
package activexDashShdocvwLib.SHDocVwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommandStateChangeConstants extends js.Object

/** Constants for WebBrowser CommandStateChange */
// tslint:disable-next-line no-const-enum
@JSGlobal("SHDocVw.CommandStateChangeConstants")
@js.native
object CommandStateChangeConstants extends js.Object {
  @js.native
  sealed trait CSC_NAVIGATEBACK
    extends activexDashShdocvwLib.SHDocVwNs.CommandStateChangeConstants
  
  @js.native
  sealed trait CSC_NAVIGATEFORWARD
    extends activexDashShdocvwLib.SHDocVwNs.CommandStateChangeConstants
  
  @js.native
  sealed trait CSC_UPDATECOMMANDS
    extends activexDashShdocvwLib.SHDocVwNs.CommandStateChangeConstants
  
  /* 2 */ val CSC_NAVIGATEBACK: CSC_NAVIGATEBACK with scala.Double = js.native
  /* 1 */ val CSC_NAVIGATEFORWARD: CSC_NAVIGATEFORWARD with scala.Double = js.native
  /* -1 */ val CSC_UPDATECOMMANDS: CSC_UPDATECOMMANDS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShdocvwLib.SHDocVwNs.CommandStateChangeConstants with scala.Double] = js.native
}

