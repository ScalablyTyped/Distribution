package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _SCRIPT_TIMER_TYPE extends js.Object

@JSGlobal("MSHTML._SCRIPT_TIMER_TYPE")
@js.native
object _SCRIPT_TIMER_TYPE extends js.Object {
  @js.native
  sealed trait SCRIPT_TIMER_TYPE_Max
    extends activexDashMshtmlLib.MSHTMLNs._SCRIPT_TIMER_TYPE
  
  @js.native
  sealed trait STT_ANIMATION_FRAME
    extends activexDashMshtmlLib.MSHTMLNs._SCRIPT_TIMER_TYPE
  
  @js.native
  sealed trait STT_IMMEDIATE
    extends activexDashMshtmlLib.MSHTMLNs._SCRIPT_TIMER_TYPE
  
  @js.native
  sealed trait STT_INTERVAL
    extends activexDashMshtmlLib.MSHTMLNs._SCRIPT_TIMER_TYPE
  
  @js.native
  sealed trait STT_TIMEOUT
    extends activexDashMshtmlLib.MSHTMLNs._SCRIPT_TIMER_TYPE
  
  /* 2147483647 */ val SCRIPT_TIMER_TYPE_Max: SCRIPT_TIMER_TYPE_Max with scala.Double = js.native
  /* 3 */ val STT_ANIMATION_FRAME: STT_ANIMATION_FRAME with scala.Double = js.native
  /* 2 */ val STT_IMMEDIATE: STT_IMMEDIATE with scala.Double = js.native
  /* 1 */ val STT_INTERVAL: STT_INTERVAL with scala.Double = js.native
  /* 0 */ val STT_TIMEOUT: STT_TIMEOUT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._SCRIPT_TIMER_TYPE with scala.Double] = js.native
}

