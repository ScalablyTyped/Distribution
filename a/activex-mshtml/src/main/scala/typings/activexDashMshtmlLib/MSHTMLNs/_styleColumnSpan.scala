package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleColumnSpan extends js.Object

@JSGlobal("MSHTML._styleColumnSpan")
@js.native
object _styleColumnSpan extends js.Object {
  @js.native
  sealed trait styleColumnSpanAll
    extends activexDashMshtmlLib.MSHTMLNs._styleColumnSpan
  
  @js.native
  sealed trait styleColumnSpanNone
    extends activexDashMshtmlLib.MSHTMLNs._styleColumnSpan
  
  @js.native
  sealed trait styleColumnSpanNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleColumnSpan
  
  @js.native
  sealed trait styleColumnSpanOne
    extends activexDashMshtmlLib.MSHTMLNs._styleColumnSpan
  
  @js.native
  sealed trait styleColumnSpan_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleColumnSpan
  
  /* 1 */ val styleColumnSpanAll: styleColumnSpanAll with scala.Double = js.native
  /* 0 */ val styleColumnSpanNone: styleColumnSpanNone with scala.Double = js.native
  /* 3 */ val styleColumnSpanNotSet: styleColumnSpanNotSet with scala.Double = js.native
  /* 2 */ val styleColumnSpanOne: styleColumnSpanOne with scala.Double = js.native
  /* 2147483647 */ val styleColumnSpan_Max: styleColumnSpan_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleColumnSpan with scala.Double] = js.native
}

