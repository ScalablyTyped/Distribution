package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _POINTER_GRAVITY extends js.Object

@JSGlobal("MSHTML._POINTER_GRAVITY")
@js.native
object _POINTER_GRAVITY extends js.Object {
  @js.native
  sealed trait POINTER_GRAVITY_Left
    extends activexDashMshtmlLib.MSHTMLNs._POINTER_GRAVITY
  
  @js.native
  sealed trait POINTER_GRAVITY_Max
    extends activexDashMshtmlLib.MSHTMLNs._POINTER_GRAVITY
  
  @js.native
  sealed trait POINTER_GRAVITY_Right
    extends activexDashMshtmlLib.MSHTMLNs._POINTER_GRAVITY
  
  /* 0 */ val POINTER_GRAVITY_Left: POINTER_GRAVITY_Left with scala.Double = js.native
  /* 2147483647 */ val POINTER_GRAVITY_Max: POINTER_GRAVITY_Max with scala.Double = js.native
  /* 1 */ val POINTER_GRAVITY_Right: POINTER_GRAVITY_Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._POINTER_GRAVITY with scala.Double] = js.native
}

