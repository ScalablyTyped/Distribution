package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleBackgroundClip extends js.Object

@JSGlobal("MSHTML._styleBackgroundClip")
@js.native
object _styleBackgroundClip extends js.Object {
  @js.native
  sealed trait styleBackgroundClipBorderBox
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundClip
  
  @js.native
  sealed trait styleBackgroundClipContentBox
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundClip
  
  @js.native
  sealed trait styleBackgroundClipNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundClip
  
  @js.native
  sealed trait styleBackgroundClipPaddingBox
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundClip
  
  @js.native
  sealed trait styleBackgroundClip_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleBackgroundClip
  
  /* 0 */ val styleBackgroundClipBorderBox: styleBackgroundClipBorderBox with scala.Double = js.native
  /* 2 */ val styleBackgroundClipContentBox: styleBackgroundClipContentBox with scala.Double = js.native
  /* 3 */ val styleBackgroundClipNotSet: styleBackgroundClipNotSet with scala.Double = js.native
  /* 1 */ val styleBackgroundClipPaddingBox: styleBackgroundClipPaddingBox with scala.Double = js.native
  /* 2147483647 */ val styleBackgroundClip_Max: styleBackgroundClip_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleBackgroundClip with scala.Double] = js.native
}

