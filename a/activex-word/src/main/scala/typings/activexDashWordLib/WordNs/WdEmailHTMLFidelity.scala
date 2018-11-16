package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdEmailHTMLFidelity extends js.Object

@JSGlobal("Word.WdEmailHTMLFidelity")
@js.native
object WdEmailHTMLFidelity extends js.Object {
  @js.native
  sealed trait wdEmailHTMLFidelityHigh
    extends activexDashWordLib.WordNs.WdEmailHTMLFidelity
  
  @js.native
  sealed trait wdEmailHTMLFidelityLow
    extends activexDashWordLib.WordNs.WdEmailHTMLFidelity
  
  @js.native
  sealed trait wdEmailHTMLFidelityMedium
    extends activexDashWordLib.WordNs.WdEmailHTMLFidelity
  
  /* 3 */ val wdEmailHTMLFidelityHigh: wdEmailHTMLFidelityHigh with scala.Double = js.native
  /* 1 */ val wdEmailHTMLFidelityLow: wdEmailHTMLFidelityLow with scala.Double = js.native
  /* 2 */ val wdEmailHTMLFidelityMedium: wdEmailHTMLFidelityMedium with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdEmailHTMLFidelity with scala.Double] = js.native
}

