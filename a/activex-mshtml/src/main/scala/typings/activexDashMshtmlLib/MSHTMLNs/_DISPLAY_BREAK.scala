package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _DISPLAY_BREAK extends js.Object

@JSGlobal("MSHTML._DISPLAY_BREAK")
@js.native
object _DISPLAY_BREAK extends js.Object {
  @js.native
  sealed trait DISPLAY_BREAK_Block
    extends activexDashMshtmlLib.MSHTMLNs._DISPLAY_BREAK
  
  @js.native
  sealed trait DISPLAY_BREAK_Break
    extends activexDashMshtmlLib.MSHTMLNs._DISPLAY_BREAK
  
  @js.native
  sealed trait DISPLAY_BREAK_Max
    extends activexDashMshtmlLib.MSHTMLNs._DISPLAY_BREAK
  
  @js.native
  sealed trait DISPLAY_BREAK_None
    extends activexDashMshtmlLib.MSHTMLNs._DISPLAY_BREAK
  
  /* 1 */ val DISPLAY_BREAK_Block: DISPLAY_BREAK_Block with scala.Double = js.native
  /* 2 */ val DISPLAY_BREAK_Break: DISPLAY_BREAK_Break with scala.Double = js.native
  /* 2147483647 */ val DISPLAY_BREAK_Max: DISPLAY_BREAK_Max with scala.Double = js.native
  /* 0 */ val DISPLAY_BREAK_None: DISPLAY_BREAK_None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._DISPLAY_BREAK with scala.Double] = js.native
}

