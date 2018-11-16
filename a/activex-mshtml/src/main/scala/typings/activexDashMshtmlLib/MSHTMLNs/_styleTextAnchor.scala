package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleTextAnchor extends js.Object

@JSGlobal("MSHTML._styleTextAnchor")
@js.native
object _styleTextAnchor extends js.Object {
  @js.native
  sealed trait styleTextAnchorEnd
    extends activexDashMshtmlLib.MSHTMLNs._styleTextAnchor
  
  @js.native
  sealed trait styleTextAnchorMiddle
    extends activexDashMshtmlLib.MSHTMLNs._styleTextAnchor
  
  @js.native
  sealed trait styleTextAnchorNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleTextAnchor
  
  @js.native
  sealed trait styleTextAnchorStart
    extends activexDashMshtmlLib.MSHTMLNs._styleTextAnchor
  
  @js.native
  sealed trait styleTextAnchor_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleTextAnchor
  
  /* 3 */ val styleTextAnchorEnd: styleTextAnchorEnd with scala.Double = js.native
  /* 2 */ val styleTextAnchorMiddle: styleTextAnchorMiddle with scala.Double = js.native
  /* 0 */ val styleTextAnchorNotSet: styleTextAnchorNotSet with scala.Double = js.native
  /* 1 */ val styleTextAnchorStart: styleTextAnchorStart with scala.Double = js.native
  /* 2147483647 */ val styleTextAnchor_Max: styleTextAnchor_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleTextAnchor with scala.Double] = js.native
}

