package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _htmlWrap extends js.Object

@JSGlobal("MSHTML._htmlWrap")
@js.native
object _htmlWrap extends js.Object {
  @js.native
  sealed trait htmlWrapHard
    extends activexDashMshtmlLib.MSHTMLNs._htmlWrap
  
  @js.native
  sealed trait htmlWrapOff
    extends activexDashMshtmlLib.MSHTMLNs._htmlWrap
  
  @js.native
  sealed trait htmlWrapSoft
    extends activexDashMshtmlLib.MSHTMLNs._htmlWrap
  
  @js.native
  sealed trait htmlWrap_Max
    extends activexDashMshtmlLib.MSHTMLNs._htmlWrap
  
  /* 3 */ val htmlWrapHard: htmlWrapHard with scala.Double = js.native
  /* 1 */ val htmlWrapOff: htmlWrapOff with scala.Double = js.native
  /* 2 */ val htmlWrapSoft: htmlWrapSoft with scala.Double = js.native
  /* 2147483647 */ val htmlWrap_Max: htmlWrap_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._htmlWrap with scala.Double] = js.native
}

