package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _HTML_PAINT_DRAW_INFO_FLAGS extends js.Object

@JSGlobal("MSHTML._HTML_PAINT_DRAW_INFO_FLAGS")
@js.native
object _HTML_PAINT_DRAW_INFO_FLAGS extends js.Object {
  @js.native
  sealed trait HTMLPAINT_DRAWINFO_UPDATEREGION
    extends activexDashMshtmlLib.MSHTMLNs._HTML_PAINT_DRAW_INFO_FLAGS
  
  @js.native
  sealed trait HTMLPAINT_DRAWINFO_VIEWPORT
    extends activexDashMshtmlLib.MSHTMLNs._HTML_PAINT_DRAW_INFO_FLAGS
  
  @js.native
  sealed trait HTMLPAINT_DRAWINFO_XFORM
    extends activexDashMshtmlLib.MSHTMLNs._HTML_PAINT_DRAW_INFO_FLAGS
  
  @js.native
  sealed trait HTML_PAINT_DRAW_INFO_FLAGS_Max
    extends activexDashMshtmlLib.MSHTMLNs._HTML_PAINT_DRAW_INFO_FLAGS
  
  /* 2 */ val HTMLPAINT_DRAWINFO_UPDATEREGION: HTMLPAINT_DRAWINFO_UPDATEREGION with scala.Double = js.native
  /* 1 */ val HTMLPAINT_DRAWINFO_VIEWPORT: HTMLPAINT_DRAWINFO_VIEWPORT with scala.Double = js.native
  /* 4 */ val HTMLPAINT_DRAWINFO_XFORM: HTMLPAINT_DRAWINFO_XFORM with scala.Double = js.native
  /* 2147483647 */ val HTML_PAINT_DRAW_INFO_FLAGS_Max: HTML_PAINT_DRAW_INFO_FLAGS_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._HTML_PAINT_DRAW_INFO_FLAGS with scala.Double] = js.native
}

