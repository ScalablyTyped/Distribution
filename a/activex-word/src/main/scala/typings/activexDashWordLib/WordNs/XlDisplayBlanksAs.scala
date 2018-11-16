package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDisplayBlanksAs extends js.Object

@JSGlobal("Word.XlDisplayBlanksAs")
@js.native
object XlDisplayBlanksAs extends js.Object {
  @js.native
  sealed trait xlInterpolated
    extends activexDashWordLib.WordNs.XlDisplayBlanksAs
  
  @js.native
  sealed trait xlNotPlotted
    extends activexDashWordLib.WordNs.XlDisplayBlanksAs
  
  @js.native
  sealed trait xlZero
    extends activexDashWordLib.WordNs.XlDisplayBlanksAs
  
  /* 3 */ val xlInterpolated: xlInterpolated with scala.Double = js.native
  /* 1 */ val xlNotPlotted: xlNotPlotted with scala.Double = js.native
  /* 2 */ val xlZero: xlZero with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlDisplayBlanksAs with scala.Double] = js.native
}

