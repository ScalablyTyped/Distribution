package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _HTML_PAINT_EVENT_FLAGS extends js.Object

@JSGlobal("MSHTML._HTML_PAINT_EVENT_FLAGS")
@js.native
object _HTML_PAINT_EVENT_FLAGS extends js.Object {
  @js.native
  sealed trait HTMLPAINT_EVENT_SETCURSOR
    extends activexDashMshtmlLib.MSHTMLNs._HTML_PAINT_EVENT_FLAGS
  
  @js.native
  sealed trait HTMLPAINT_EVENT_TARGET
    extends activexDashMshtmlLib.MSHTMLNs._HTML_PAINT_EVENT_FLAGS
  
  @js.native
  sealed trait HTML_PAINT_EVENT_FLAGS_Max
    extends activexDashMshtmlLib.MSHTMLNs._HTML_PAINT_EVENT_FLAGS
  
  /* 2 */ val HTMLPAINT_EVENT_SETCURSOR: HTMLPAINT_EVENT_SETCURSOR with scala.Double = js.native
  /* 1 */ val HTMLPAINT_EVENT_TARGET: HTMLPAINT_EVENT_TARGET with scala.Double = js.native
  /* 2147483647 */ val HTML_PAINT_EVENT_FLAGS_Max: HTML_PAINT_EVENT_FLAGS_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._HTML_PAINT_EVENT_FLAGS with scala.Double] = js.native
}

