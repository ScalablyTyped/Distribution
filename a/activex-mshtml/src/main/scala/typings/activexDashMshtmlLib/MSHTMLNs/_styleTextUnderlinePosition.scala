package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleTextUnderlinePosition extends js.Object

@JSGlobal("MSHTML._styleTextUnderlinePosition")
@js.native
object _styleTextUnderlinePosition extends js.Object {
  @js.native
  sealed trait styleTextUnderlinePositionAbove
    extends activexDashMshtmlLib.MSHTMLNs._styleTextUnderlinePosition
  
  @js.native
  sealed trait styleTextUnderlinePositionAuto
    extends activexDashMshtmlLib.MSHTMLNs._styleTextUnderlinePosition
  
  @js.native
  sealed trait styleTextUnderlinePositionBelow
    extends activexDashMshtmlLib.MSHTMLNs._styleTextUnderlinePosition
  
  @js.native
  sealed trait styleTextUnderlinePositionNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleTextUnderlinePosition
  
  @js.native
  sealed trait styleTextUnderlinePosition_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleTextUnderlinePosition
  
  /* 1 */ val styleTextUnderlinePositionAbove: styleTextUnderlinePositionAbove with scala.Double = js.native
  /* 2 */ val styleTextUnderlinePositionAuto: styleTextUnderlinePositionAuto with scala.Double = js.native
  /* 0 */ val styleTextUnderlinePositionBelow: styleTextUnderlinePositionBelow with scala.Double = js.native
  /* 3 */ val styleTextUnderlinePositionNotSet: styleTextUnderlinePositionNotSet with scala.Double = js.native
  /* 2147483647 */ val styleTextUnderlinePosition_Max: styleTextUnderlinePosition_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleTextUnderlinePosition with scala.Double] = js.native
}

