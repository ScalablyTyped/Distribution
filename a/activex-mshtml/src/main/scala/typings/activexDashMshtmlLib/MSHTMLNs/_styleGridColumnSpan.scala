package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleGridColumnSpan extends js.Object

@JSGlobal("MSHTML._styleGridColumnSpan")
@js.native
object _styleGridColumnSpan extends js.Object {
  @js.native
  sealed trait styleGridColumnSpanNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleGridColumnSpan
  
  @js.native
  sealed trait styleGridColumnSpan_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleGridColumnSpan
  
  /* 0 */ val styleGridColumnSpanNotSet: styleGridColumnSpanNotSet with scala.Double = js.native
  /* 2147483647 */ val styleGridColumnSpan_Max: styleGridColumnSpan_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleGridColumnSpan with scala.Double] = js.native
}

