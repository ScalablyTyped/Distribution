package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _SECUREURLHOSTVALIDATE_FLAGS extends js.Object

@JSGlobal("MSHTML._SECUREURLHOSTVALIDATE_FLAGS")
@js.native
object _SECUREURLHOSTVALIDATE_FLAGS extends js.Object {
  @js.native
  sealed trait SECUREURLHOSTVALIDATE_FLAGS_Max
    extends activexDashMshtmlLib.MSHTMLNs._SECUREURLHOSTVALIDATE_FLAGS
  
  @js.native
  sealed trait SUHV_PROMPTBEFORENO
    extends activexDashMshtmlLib.MSHTMLNs._SECUREURLHOSTVALIDATE_FLAGS
  
  @js.native
  sealed trait SUHV_SILENTYES
    extends activexDashMshtmlLib.MSHTMLNs._SECUREURLHOSTVALIDATE_FLAGS
  
  @js.native
  sealed trait SUHV_UNSECURESOURCE
    extends activexDashMshtmlLib.MSHTMLNs._SECUREURLHOSTVALIDATE_FLAGS
  
  /* 2147483647 */ val SECUREURLHOSTVALIDATE_FLAGS_Max: SECUREURLHOSTVALIDATE_FLAGS_Max with scala.Double = js.native
  /* 1 */ val SUHV_PROMPTBEFORENO: SUHV_PROMPTBEFORENO with scala.Double = js.native
  /* 2 */ val SUHV_SILENTYES: SUHV_SILENTYES with scala.Double = js.native
  /* 4 */ val SUHV_UNSECURESOURCE: SUHV_UNSECURESOURCE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._SECUREURLHOSTVALIDATE_FLAGS with scala.Double] = js.native
}

