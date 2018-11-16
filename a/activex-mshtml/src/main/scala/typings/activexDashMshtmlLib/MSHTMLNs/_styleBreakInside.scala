package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleBreakInside extends js.Object

@JSGlobal("MSHTML._styleBreakInside")
@js.native
object _styleBreakInside extends js.Object {
  @js.native
  sealed trait styleBreakInsideAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleBreakInside
  
  @js.native
  sealed trait styleBreakInsideAvoid
    extends activexDashMshtmlLib.MSHTMLNs._styleBreakInside
  
  @js.native
  sealed trait styleBreakInsideAvoidColumn
    extends activexDashMshtmlLib.MSHTMLNs._styleBreakInside
  
  @js.native
  sealed trait styleBreakInsideAvoidPage
    extends activexDashMshtmlLib.MSHTMLNs._styleBreakInside
  
  @js.native
  sealed trait styleBreakInsideNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleBreakInside
  
  @js.native
  sealed trait styleBreakInside_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleBreakInside
  
  /* 1 */ val styleBreakInsideAuto: styleBreakInsideAuto with scala.Double = js.native
  /* 2 */ val styleBreakInsideAvoid: styleBreakInsideAvoid with scala.Double = js.native
  /* 4 */ val styleBreakInsideAvoidColumn: styleBreakInsideAvoidColumn with scala.Double = js.native
  /* 3 */ val styleBreakInsideAvoidPage: styleBreakInsideAvoidPage with scala.Double = js.native
  /* 0 */ val styleBreakInsideNotSet: styleBreakInsideNotSet with scala.Double = js.native
  /* 2147483647 */ val styleBreakInside_Max: styleBreakInside_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleBreakInside with scala.Double] = js.native
}

