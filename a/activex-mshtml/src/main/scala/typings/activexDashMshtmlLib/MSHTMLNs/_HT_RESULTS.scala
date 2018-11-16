package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _HT_RESULTS extends js.Object

@JSGlobal("MSHTML._HT_RESULTS")
@js.native
object _HT_RESULTS extends js.Object {
  @js.native
  sealed trait HT_RESULTS_Glyph
    extends activexDashMshtmlLib.MSHTMLNs._HT_RESULTS
  
  @js.native
  sealed trait HT_RESULTS_Max
    extends activexDashMshtmlLib.MSHTMLNs._HT_RESULTS
  
  /* 1 */ val HT_RESULTS_Glyph: HT_RESULTS_Glyph with scala.Double = js.native
  /* 2147483647 */ val HT_RESULTS_Max: HT_RESULTS_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._HT_RESULTS with scala.Double] = js.native
}

