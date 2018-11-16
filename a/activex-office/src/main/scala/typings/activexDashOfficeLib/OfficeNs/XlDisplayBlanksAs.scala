package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDisplayBlanksAs extends js.Object

@JSGlobal("Office.XlDisplayBlanksAs")
@js.native
object XlDisplayBlanksAs extends js.Object {
  @js.native
  sealed trait xlInterpolated
    extends activexDashOfficeLib.OfficeNs.XlDisplayBlanksAs
  
  @js.native
  sealed trait xlNotPlotted
    extends activexDashOfficeLib.OfficeNs.XlDisplayBlanksAs
  
  @js.native
  sealed trait xlZero
    extends activexDashOfficeLib.OfficeNs.XlDisplayBlanksAs
  
  /* 3 */ val xlInterpolated: xlInterpolated with scala.Double = js.native
  /* 1 */ val xlNotPlotted: xlNotPlotted with scala.Double = js.native
  /* 2 */ val xlZero: xlZero with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlDisplayBlanksAs with scala.Double] = js.native
}

