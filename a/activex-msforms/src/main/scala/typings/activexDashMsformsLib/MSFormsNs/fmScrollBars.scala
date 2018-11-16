package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmScrollBars extends js.Object

@JSGlobal("MSForms.fmScrollBars")
@js.native
object fmScrollBars extends js.Object {
  @js.native
  sealed trait fmScrollBarsBoth
    extends activexDashMsformsLib.MSFormsNs.fmScrollBars
  
  @js.native
  sealed trait fmScrollBarsHorizontal
    extends activexDashMsformsLib.MSFormsNs.fmScrollBars
  
  @js.native
  sealed trait fmScrollBarsNone
    extends activexDashMsformsLib.MSFormsNs.fmScrollBars
  
  @js.native
  sealed trait fmScrollBarsVertical
    extends activexDashMsformsLib.MSFormsNs.fmScrollBars
  
  /* 3 */ val fmScrollBarsBoth: fmScrollBarsBoth with scala.Double = js.native
  /* 1 */ val fmScrollBarsHorizontal: fmScrollBarsHorizontal with scala.Double = js.native
  /* 0 */ val fmScrollBarsNone: fmScrollBarsNone with scala.Double = js.native
  /* 2 */ val fmScrollBarsVertical: fmScrollBarsVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmScrollBars with scala.Double] = js.native
}

