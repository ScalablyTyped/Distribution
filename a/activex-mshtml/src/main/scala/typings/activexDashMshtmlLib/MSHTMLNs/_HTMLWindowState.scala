package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _HTMLWindowState extends js.Object

@JSGlobal("MSHTML._HTMLWindowState")
@js.native
object _HTMLWindowState extends js.Object {
  @js.native
  sealed trait HTMLWindowStateMaximize
    extends activexDashMshtmlLib.MSHTMLNs._HTMLWindowState
  
  @js.native
  sealed trait HTMLWindowStateMinimize
    extends activexDashMshtmlLib.MSHTMLNs._HTMLWindowState
  
  @js.native
  sealed trait HTMLWindowStateNormal
    extends activexDashMshtmlLib.MSHTMLNs._HTMLWindowState
  
  @js.native
  sealed trait HTMLWindowState_Max
    extends activexDashMshtmlLib.MSHTMLNs._HTMLWindowState
  
  /* 3 */ val HTMLWindowStateMaximize: HTMLWindowStateMaximize with scala.Double = js.native
  /* 6 */ val HTMLWindowStateMinimize: HTMLWindowStateMinimize with scala.Double = js.native
  /* 1 */ val HTMLWindowStateNormal: HTMLWindowStateNormal with scala.Double = js.native
  /* 2147483647 */ val HTMLWindowState_Max: HTMLWindowState_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._HTMLWindowState with scala.Double] = js.native
}

