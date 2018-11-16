package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleHyphenateLimitLines extends js.Object

@JSGlobal("MSHTML._styleHyphenateLimitLines")
@js.native
object _styleHyphenateLimitLines extends js.Object {
  @js.native
  sealed trait styleHyphenateLimitLinesNoLimit
    extends activexDashMshtmlLib.MSHTMLNs._styleHyphenateLimitLines
  
  @js.native
  sealed trait styleHyphenateLimitLines_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleHyphenateLimitLines
  
  /* 0 */ val styleHyphenateLimitLinesNoLimit: styleHyphenateLimitLinesNoLimit with scala.Double = js.native
  /* 2147483647 */ val styleHyphenateLimitLines_Max: styleHyphenateLimitLines_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleHyphenateLimitLines with scala.Double] = js.native
}

