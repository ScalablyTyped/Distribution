package typings
package activexDashShdocvwLib.SHDocVwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait tagREADYSTATE extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("SHDocVw.tagREADYSTATE")
@js.native
object tagREADYSTATE extends js.Object {
  @js.native
  sealed trait READYSTATE_COMPLETE
    extends activexDashShdocvwLib.SHDocVwNs.tagREADYSTATE
  
  @js.native
  sealed trait READYSTATE_INTERACTIVE
    extends activexDashShdocvwLib.SHDocVwNs.tagREADYSTATE
  
  @js.native
  sealed trait READYSTATE_LOADED
    extends activexDashShdocvwLib.SHDocVwNs.tagREADYSTATE
  
  @js.native
  sealed trait READYSTATE_LOADING
    extends activexDashShdocvwLib.SHDocVwNs.tagREADYSTATE
  
  @js.native
  sealed trait READYSTATE_UNINITIALIZED
    extends activexDashShdocvwLib.SHDocVwNs.tagREADYSTATE
  
  /* 4 */ val READYSTATE_COMPLETE: READYSTATE_COMPLETE with scala.Double = js.native
  /* 3 */ val READYSTATE_INTERACTIVE: READYSTATE_INTERACTIVE with scala.Double = js.native
  /* 2 */ val READYSTATE_LOADED: READYSTATE_LOADED with scala.Double = js.native
  /* 1 */ val READYSTATE_LOADING: READYSTATE_LOADING with scala.Double = js.native
  /* 0 */ val READYSTATE_UNINITIALIZED: READYSTATE_UNINITIALIZED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShdocvwLib.SHDocVwNs.tagREADYSTATE with scala.Double] = js.native
}

