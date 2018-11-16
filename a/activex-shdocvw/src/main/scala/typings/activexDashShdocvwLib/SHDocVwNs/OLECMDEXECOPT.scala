package typings
package activexDashShdocvwLib.SHDocVwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OLECMDEXECOPT extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("SHDocVw.OLECMDEXECOPT")
@js.native
object OLECMDEXECOPT extends js.Object {
  @js.native
  sealed trait OLECMDEXECOPT_DODEFAULT
    extends activexDashShdocvwLib.SHDocVwNs.OLECMDEXECOPT
  
  @js.native
  sealed trait OLECMDEXECOPT_DONTPROMPTUSER
    extends activexDashShdocvwLib.SHDocVwNs.OLECMDEXECOPT
  
  @js.native
  sealed trait OLECMDEXECOPT_PROMPTUSER
    extends activexDashShdocvwLib.SHDocVwNs.OLECMDEXECOPT
  
  @js.native
  sealed trait OLECMDEXECOPT_SHOWHELP
    extends activexDashShdocvwLib.SHDocVwNs.OLECMDEXECOPT
  
  /* 0 */ val OLECMDEXECOPT_DODEFAULT: OLECMDEXECOPT_DODEFAULT with scala.Double = js.native
  /* 2 */ val OLECMDEXECOPT_DONTPROMPTUSER: OLECMDEXECOPT_DONTPROMPTUSER with scala.Double = js.native
  /* 1 */ val OLECMDEXECOPT_PROMPTUSER: OLECMDEXECOPT_PROMPTUSER with scala.Double = js.native
  /* 3 */ val OLECMDEXECOPT_SHOWHELP: OLECMDEXECOPT_SHOWHELP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShdocvwLib.SHDocVwNs.OLECMDEXECOPT with scala.Double] = js.native
}

