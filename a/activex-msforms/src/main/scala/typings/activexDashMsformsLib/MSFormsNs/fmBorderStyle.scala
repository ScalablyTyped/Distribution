package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmBorderStyle extends js.Object

@JSGlobal("MSForms.fmBorderStyle")
@js.native
object fmBorderStyle extends js.Object {
  @js.native
  sealed trait fmBorderStyleNone
    extends activexDashMsformsLib.MSFormsNs.fmBorderStyle
  
  @js.native
  sealed trait fmBorderStyleSingle
    extends activexDashMsformsLib.MSFormsNs.fmBorderStyle
  
  /* 0 */ val fmBorderStyleNone: fmBorderStyleNone with scala.Double = js.native
  /* 1 */ val fmBorderStyleSingle: fmBorderStyleSingle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmBorderStyle with scala.Double] = js.native
}

