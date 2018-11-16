package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlApplyLocation extends js.Object

@JSGlobal("MSHTML._htmlApplyLocation")
@js.native
object _htmlApplyLocation extends js.Object {
  @js.native
  sealed trait htmlApplyLocationInside
    extends activexDashMshtmlLib.MSHTMLNs._htmlApplyLocation
  
  @js.native
  sealed trait htmlApplyLocationOutside
    extends activexDashMshtmlLib.MSHTMLNs._htmlApplyLocation
  
  @js.native
  sealed trait htmlApplyLocation_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlApplyLocation
  
  /* 0 */ val htmlApplyLocationInside: htmlApplyLocationInside with scala.Double = js.native
  /* 1 */ val htmlApplyLocationOutside: htmlApplyLocationOutside with scala.Double = js.native
  /* 2147483647 */ val htmlApplyLocation_Max: htmlApplyLocation_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlApplyLocation with scala.Double] = js.native
}

