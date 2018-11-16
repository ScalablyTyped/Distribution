package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleLayoutGridLine extends js.Object

@JSGlobal("MSHTML._styleLayoutGridLine")
@js.native
object _styleLayoutGridLine extends js.Object {
  @js.native
  sealed trait styleLayoutGridLineAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridLine
  
  @js.native
  sealed trait styleLayoutGridLineNone
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridLine
  
  @js.native
  sealed trait styleLayoutGridLineNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridLine
  
  @js.native
  sealed trait styleLayoutGridLine_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleLayoutGridLine
  
  /* 1 */ val styleLayoutGridLineAuto: styleLayoutGridLineAuto with scala.Double = js.native
  /* 2 */ val styleLayoutGridLineNone: styleLayoutGridLineNone with scala.Double = js.native
  /* 0 */ val styleLayoutGridLineNotSet: styleLayoutGridLineNotSet with scala.Double = js.native
  /* 2147483647 */ val styleLayoutGridLine_Max: styleLayoutGridLine_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleLayoutGridLine with scala.Double] = js.native
}

