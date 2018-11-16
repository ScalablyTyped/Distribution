package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleLayoutFlow extends js.Object

@JSGlobal("MSHTML._styleLayoutFlow")
@js.native
object _styleLayoutFlow extends js.Object {
  @js.native
  sealed trait styleLayoutFlowHorizontal
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutFlow
  
  @js.native
  sealed trait styleLayoutFlowNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutFlow
  
  @js.native
  sealed trait styleLayoutFlowVerticalIdeographic
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutFlow
  
  @js.native
  sealed trait styleLayoutFlow_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutFlow
  
  /* 0 */ val styleLayoutFlowHorizontal: styleLayoutFlowHorizontal with scala.Double = js.native
  /* 2 */ val styleLayoutFlowNotSet: styleLayoutFlowNotSet with scala.Double = js.native
  /* 1 */ val styleLayoutFlowVerticalIdeographic: styleLayoutFlowVerticalIdeographic with scala.Double = js.native
  /* 2147483647 */ val styleLayoutFlow_Max: styleLayoutFlow_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleLayoutFlow with scala.Double] = js.native
}

