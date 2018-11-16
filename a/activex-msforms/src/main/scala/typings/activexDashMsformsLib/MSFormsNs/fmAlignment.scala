package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmAlignment extends js.Object

@JSGlobal("MSForms.fmAlignment")
@js.native
object fmAlignment extends js.Object {
  @js.native
  sealed trait fmAlignmentLeft
    extends activexDashMsformsLib.MSFormsNs.fmAlignment
  
  @js.native
  sealed trait fmAlignmentRight
    extends activexDashMsformsLib.MSFormsNs.fmAlignment
  
  /* 0 */ val fmAlignmentLeft: fmAlignmentLeft with scala.Double = js.native
  /* 1 */ val fmAlignmentRight: fmAlignmentRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmAlignment with scala.Double] = js.native
}

