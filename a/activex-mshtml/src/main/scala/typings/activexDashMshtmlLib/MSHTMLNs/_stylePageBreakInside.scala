package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _stylePageBreakInside extends js.Object

@JSGlobal("MSHTML._stylePageBreakInside")
@js.native
object _stylePageBreakInside extends js.Object {
  @js.native
  sealed trait stylePageBreakInsideAuto
    extends activexDashMshtmlLib.MSHTMLNs._stylePageBreakInside
  
  @js.native
  sealed trait stylePageBreakInsideAvoid
    extends activexDashMshtmlLib.MSHTMLNs._stylePageBreakInside
  
  @js.native
  sealed trait stylePageBreakInsideNotSet
    extends activexDashMshtmlLib.MSHTMLNs._stylePageBreakInside
  
  @js.native
  sealed trait stylePageBreakInside_Max
    extends activexDashMshtmlLib.MSHTMLNs._stylePageBreakInside
  
  /* 1 */ val stylePageBreakInsideAuto: stylePageBreakInsideAuto with scala.Double = js.native
  /* 2 */ val stylePageBreakInsideAvoid: stylePageBreakInsideAvoid with scala.Double = js.native
  /* 0 */ val stylePageBreakInsideNotSet: stylePageBreakInsideNotSet with scala.Double = js.native
  /* 2147483647 */ val stylePageBreakInside_Max: stylePageBreakInside_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._stylePageBreakInside with scala.Double] = js.native
}

