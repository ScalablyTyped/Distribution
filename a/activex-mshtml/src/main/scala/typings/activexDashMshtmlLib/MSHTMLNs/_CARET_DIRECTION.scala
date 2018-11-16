package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _CARET_DIRECTION extends js.Object

@JSGlobal("MSHTML._CARET_DIRECTION")
@js.native
object _CARET_DIRECTION extends js.Object {
  @js.native
  sealed trait CARET_DIRECTION_BACKWARD
    extends activexDashMshtmlLib.MSHTMLNs._CARET_DIRECTION
  
  @js.native
  sealed trait CARET_DIRECTION_FORWARD
    extends activexDashMshtmlLib.MSHTMLNs._CARET_DIRECTION
  
  @js.native
  sealed trait CARET_DIRECTION_INDETERMINATE
    extends activexDashMshtmlLib.MSHTMLNs._CARET_DIRECTION
  
  @js.native
  sealed trait CARET_DIRECTION_Max
    extends activexDashMshtmlLib.MSHTMLNs._CARET_DIRECTION
  
  @js.native
  sealed trait CARET_DIRECTION_SAME
    extends activexDashMshtmlLib.MSHTMLNs._CARET_DIRECTION
  
  /* 2 */ val CARET_DIRECTION_BACKWARD: CARET_DIRECTION_BACKWARD with scala.Double = js.native
  /* 3 */ val CARET_DIRECTION_FORWARD: CARET_DIRECTION_FORWARD with scala.Double = js.native
  /* 0 */ val CARET_DIRECTION_INDETERMINATE: CARET_DIRECTION_INDETERMINATE with scala.Double = js.native
  /* 2147483647 */ val CARET_DIRECTION_Max: CARET_DIRECTION_Max with scala.Double = js.native
  /* 1 */ val CARET_DIRECTION_SAME: CARET_DIRECTION_SAME with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._CARET_DIRECTION with scala.Double] = js.native
}

