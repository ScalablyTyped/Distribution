package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleTextOverflow extends js.Object

@JSGlobal("MSHTML._styleTextOverflow")
@js.native
object _styleTextOverflow extends js.Object {
  @js.native
  sealed trait styleTextOverflowClip
    extends activexDashMshtmlLib.MSHTMLNs._styleTextOverflow
  
  @js.native
  sealed trait styleTextOverflowEllipsis
    extends activexDashMshtmlLib.MSHTMLNs._styleTextOverflow
  
  @js.native
  sealed trait styleTextOverflowNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleTextOverflow
  
  @js.native
  sealed trait styleTextOverflow_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleTextOverflow
  
  /* 0 */ val styleTextOverflowClip: styleTextOverflowClip with scala.Double = js.native
  /* 1 */ val styleTextOverflowEllipsis: styleTextOverflowEllipsis with scala.Double = js.native
  /* 2 */ val styleTextOverflowNotSet: styleTextOverflowNotSet with scala.Double = js.native
  /* 2147483647 */ val styleTextOverflow_Max: styleTextOverflow_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleTextOverflow with scala.Double] = js.native
}

