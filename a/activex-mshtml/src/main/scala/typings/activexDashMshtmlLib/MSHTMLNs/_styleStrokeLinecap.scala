package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleStrokeLinecap extends js.Object

@JSGlobal("MSHTML._styleStrokeLinecap")
@js.native
object _styleStrokeLinecap extends js.Object {
  @js.native
  sealed trait styleStrokeLinecapButt
    extends activexDashMshtmlLib.MSHTMLNs._styleStrokeLinecap
  
  @js.native
  sealed trait styleStrokeLinecapNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleStrokeLinecap
  
  @js.native
  sealed trait styleStrokeLinecapRound
    extends activexDashMshtmlLib.MSHTMLNs._styleStrokeLinecap
  
  @js.native
  sealed trait styleStrokeLinecapSquare
    extends activexDashMshtmlLib.MSHTMLNs._styleStrokeLinecap
  
  @js.native
  sealed trait styleStrokeLinecap_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleStrokeLinecap
  
  /* 1 */ val styleStrokeLinecapButt: styleStrokeLinecapButt with scala.Double = js.native
  /* 0 */ val styleStrokeLinecapNotSet: styleStrokeLinecapNotSet with scala.Double = js.native
  /* 2 */ val styleStrokeLinecapRound: styleStrokeLinecapRound with scala.Double = js.native
  /* 3 */ val styleStrokeLinecapSquare: styleStrokeLinecapSquare with scala.Double = js.native
  /* 2147483647 */ val styleStrokeLinecap_Max: styleStrokeLinecap_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleStrokeLinecap with scala.Double] = js.native
}

