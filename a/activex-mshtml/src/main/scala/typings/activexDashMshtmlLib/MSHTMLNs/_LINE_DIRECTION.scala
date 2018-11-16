package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _LINE_DIRECTION extends js.Object

@JSGlobal("MSHTML._LINE_DIRECTION")
@js.native
object _LINE_DIRECTION extends js.Object {
  @js.native
  sealed trait LINE_DIRECTION_LeftToRight
    extends activexDashMshtmlLib.MSHTMLNs._LINE_DIRECTION
  
  @js.native
  sealed trait LINE_DIRECTION_Max
    extends activexDashMshtmlLib.MSHTMLNs._LINE_DIRECTION
  
  @js.native
  sealed trait LINE_DIRECTION_RightToLeft
    extends activexDashMshtmlLib.MSHTMLNs._LINE_DIRECTION
  
  /* 2 */ val LINE_DIRECTION_LeftToRight: LINE_DIRECTION_LeftToRight with scala.Double = js.native
  /* 2147483647 */ val LINE_DIRECTION_Max: LINE_DIRECTION_Max with scala.Double = js.native
  /* 1 */ val LINE_DIRECTION_RightToLeft: LINE_DIRECTION_RightToLeft with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._LINE_DIRECTION with scala.Double] = js.native
}

