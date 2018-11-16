package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _BEHAVIOR_EVENT_FLAGS extends js.Object

@JSGlobal("MSHTML._BEHAVIOR_EVENT_FLAGS")
@js.native
object _BEHAVIOR_EVENT_FLAGS extends js.Object {
  @js.native
  sealed trait BEHAVIOREVENTFLAGS_BUBBLE
    extends activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_EVENT_FLAGS
  
  @js.native
  sealed trait BEHAVIOREVENTFLAGS_STANDARDADDITIVE
    extends activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_EVENT_FLAGS
  
  @js.native
  sealed trait BEHAVIOR_EVENT_FLAGS_Max
    extends activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_EVENT_FLAGS
  
  /* 1 */ val BEHAVIOREVENTFLAGS_BUBBLE: BEHAVIOREVENTFLAGS_BUBBLE with scala.Double = js.native
  /* 2 */ val BEHAVIOREVENTFLAGS_STANDARDADDITIVE: BEHAVIOREVENTFLAGS_STANDARDADDITIVE with scala.Double = js.native
  /* 2147483647 */ val BEHAVIOR_EVENT_FLAGS_Max: BEHAVIOR_EVENT_FLAGS_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._BEHAVIOR_EVENT_FLAGS with scala.Double] = js.native
}

