package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleGridRowSpan extends js.Object

@JSGlobal("MSHTML._styleGridRowSpan")
@js.native
object _styleGridRowSpan extends js.Object {
  @js.native
  sealed trait styleGridRowSpanNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleGridRowSpan
  
  @js.native
  sealed trait styleGridRowSpan_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleGridRowSpan
  
  /* 0 */ val styleGridRowSpanNotSet: styleGridRowSpanNotSet with scala.Double = js.native
  /* 2147483647 */ val styleGridRowSpan_Max: styleGridRowSpan_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleGridRowSpan with scala.Double] = js.native
}

