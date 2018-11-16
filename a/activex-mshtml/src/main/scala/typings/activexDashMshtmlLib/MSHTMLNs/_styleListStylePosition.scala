package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleListStylePosition extends js.Object

@JSGlobal("MSHTML._styleListStylePosition")
@js.native
object _styleListStylePosition extends js.Object {
  @js.native
  sealed trait styleListStylePositionInside
    extends activexDashMshtmlLib.MSHTMLNs._styleListStylePosition
  
  @js.native
  sealed trait styleListStylePositionNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleListStylePosition
  
  @js.native
  sealed trait styleListStylePositionOutSide
    extends activexDashMshtmlLib.MSHTMLNs._styleListStylePosition
  
  @js.native
  sealed trait styleListStylePosition_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleListStylePosition
  
  /* 1 */ val styleListStylePositionInside: styleListStylePositionInside with scala.Double = js.native
  /* 0 */ val styleListStylePositionNotSet: styleListStylePositionNotSet with scala.Double = js.native
  /* 2 */ val styleListStylePositionOutSide: styleListStylePositionOutSide with scala.Double = js.native
  /* 2147483647 */ val styleListStylePosition_Max: styleListStylePosition_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleListStylePosition with scala.Double] = js.native
}

