package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _stylePageBreak extends js.Object

@JSGlobal("MSHTML._stylePageBreak")
@js.native
object _stylePageBreak extends js.Object {
  @js.native
  sealed trait stylePageBreakAlways
    extends activexDashMshtmlLib.MSHTMLNs._stylePageBreak
  
  @js.native
  sealed trait stylePageBreakAuto
    extends activexDashMshtmlLib.MSHTMLNs._stylePageBreak
  
  @js.native
  sealed trait stylePageBreakAvoid
    extends activexDashMshtmlLib.MSHTMLNs._stylePageBreak
  
  @js.native
  sealed trait stylePageBreakLeft
    extends activexDashMshtmlLib.MSHTMLNs._stylePageBreak
  
  @js.native
  sealed trait stylePageBreakNotSet
    extends activexDashMshtmlLib.MSHTMLNs._stylePageBreak
  
  @js.native
  sealed trait stylePageBreakRight
    extends activexDashMshtmlLib.MSHTMLNs._stylePageBreak
  
  @js.native
  sealed trait stylePageBreak_Max
    extends activexDashMshtmlLib.MSHTMLNs._stylePageBreak
  
  /* 2 */ val stylePageBreakAlways: stylePageBreakAlways with scala.Double = js.native
  /* 1 */ val stylePageBreakAuto: stylePageBreakAuto with scala.Double = js.native
  /* 5 */ val stylePageBreakAvoid: stylePageBreakAvoid with scala.Double = js.native
  /* 3 */ val stylePageBreakLeft: stylePageBreakLeft with scala.Double = js.native
  /* 0 */ val stylePageBreakNotSet: stylePageBreakNotSet with scala.Double = js.native
  /* 4 */ val stylePageBreakRight: stylePageBreakRight with scala.Double = js.native
  /* 2147483647 */ val stylePageBreak_Max: stylePageBreak_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._stylePageBreak with scala.Double] = js.native
}

