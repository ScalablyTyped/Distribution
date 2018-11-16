package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _DOM_EVENT_PHASE extends js.Object

@JSGlobal("MSHTML._DOM_EVENT_PHASE")
@js.native
object _DOM_EVENT_PHASE extends js.Object {
  @js.native
  sealed trait DEP_AT_TARGET
    extends activexDashMshtmlLib.MSHTMLNs._DOM_EVENT_PHASE
  
  @js.native
  sealed trait DEP_BUBBLING_PHASE
    extends activexDashMshtmlLib.MSHTMLNs._DOM_EVENT_PHASE
  
  @js.native
  sealed trait DEP_CAPTURING_PHASE
    extends activexDashMshtmlLib.MSHTMLNs._DOM_EVENT_PHASE
  
  @js.native
  sealed trait DOM_EVENT_PHASE_Max
    extends activexDashMshtmlLib.MSHTMLNs._DOM_EVENT_PHASE
  
  /* 2 */ val DEP_AT_TARGET: DEP_AT_TARGET with scala.Double = js.native
  /* 3 */ val DEP_BUBBLING_PHASE: DEP_BUBBLING_PHASE with scala.Double = js.native
  /* 1 */ val DEP_CAPTURING_PHASE: DEP_CAPTURING_PHASE with scala.Double = js.native
  /* 2147483647 */ val DOM_EVENT_PHASE_Max: DOM_EVENT_PHASE_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._DOM_EVENT_PHASE with scala.Double] = js.native
}

