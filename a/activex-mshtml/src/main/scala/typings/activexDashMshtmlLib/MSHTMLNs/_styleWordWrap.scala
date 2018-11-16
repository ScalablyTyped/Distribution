package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleWordWrap extends js.Object

@JSGlobal("MSHTML._styleWordWrap")
@js.native
object _styleWordWrap extends js.Object {
  @js.native
  sealed trait styleWordWrapNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleWordWrap
  
  @js.native
  sealed trait styleWordWrapOff
    extends activexDashMshtmlLib.MSHTMLNs._styleWordWrap
  
  @js.native
  sealed trait styleWordWrapOn
    extends activexDashMshtmlLib.MSHTMLNs._styleWordWrap
  
  @js.native
  sealed trait styleWordWrap_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleWordWrap
  
  /* 0 */ val styleWordWrapNotSet: styleWordWrapNotSet with scala.Double = js.native
  /* 1 */ val styleWordWrapOff: styleWordWrapOff with scala.Double = js.native
  /* 2 */ val styleWordWrapOn: styleWordWrapOn with scala.Double = js.native
  /* 2147483647 */ val styleWordWrap_Max: styleWordWrap_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleWordWrap with scala.Double] = js.native
}

