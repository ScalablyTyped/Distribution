package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _DISPLAY_GRAVITY extends js.Object

@JSGlobal("MSHTML._DISPLAY_GRAVITY")
@js.native
object _DISPLAY_GRAVITY extends js.Object {
  @js.native
  sealed trait DISPLAY_GRAVITY_Max
    extends activexDashMshtmlLib.MSHTMLNs._DISPLAY_GRAVITY
  
  @js.native
  sealed trait DISPLAY_GRAVITY_NextLine
    extends activexDashMshtmlLib.MSHTMLNs._DISPLAY_GRAVITY
  
  @js.native
  sealed trait DISPLAY_GRAVITY_PreviousLine
    extends activexDashMshtmlLib.MSHTMLNs._DISPLAY_GRAVITY
  
  /* 2147483647 */ val DISPLAY_GRAVITY_Max: DISPLAY_GRAVITY_Max with scala.Double = js.native
  /* 2 */ val DISPLAY_GRAVITY_NextLine: DISPLAY_GRAVITY_NextLine with scala.Double = js.native
  /* 1 */ val DISPLAY_GRAVITY_PreviousLine: DISPLAY_GRAVITY_PreviousLine with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._DISPLAY_GRAVITY with scala.Double] = js.native
}

