package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlLoop extends js.Object

@JSGlobal("MSHTML._htmlLoop")
@js.native
object _htmlLoop extends js.Object {
  @js.native
  sealed trait htmlLoopLoopInfinite
    extends activexDashMshtmlLib.MSHTMLNs._htmlLoop
  
  @js.native
  sealed trait htmlLoop_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlLoop
  
  /* -1 */ val htmlLoopLoopInfinite: htmlLoopLoopInfinite with scala.Double = js.native
  /* 2147483647 */ val htmlLoop_Max: htmlLoop_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlLoop with scala.Double] = js.native
}

