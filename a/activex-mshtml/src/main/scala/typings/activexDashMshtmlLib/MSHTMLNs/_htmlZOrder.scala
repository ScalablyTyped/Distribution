package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlZOrder extends js.Object

@JSGlobal("MSHTML._htmlZOrder")
@js.native
object _htmlZOrder extends js.Object {
  @js.native
  sealed trait htmlZOrderBack
    extends activexDashMshtmlLib.MSHTMLNs._htmlZOrder
  
  @js.native
  sealed trait htmlZOrderFront
    extends activexDashMshtmlLib.MSHTMLNs._htmlZOrder
  
  @js.native
  sealed trait htmlZOrder_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlZOrder
  
  /* 1 */ val htmlZOrderBack: htmlZOrderBack with scala.Double = js.native
  /* 0 */ val htmlZOrderFront: htmlZOrderFront with scala.Double = js.native
  /* 2147483647 */ val htmlZOrder_Max: htmlZOrder_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlZOrder with scala.Double] = js.native
}

