package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmOrientation extends js.Object

@JSGlobal("MSForms.fmOrientation")
@js.native
object fmOrientation extends js.Object {
  @js.native
  sealed trait fmOrientationAuto
    extends activexDashMsformsLib.MSFormsNs.fmOrientation
  
  @js.native
  sealed trait fmOrientationHorizontal
    extends activexDashMsformsLib.MSFormsNs.fmOrientation
  
  @js.native
  sealed trait fmOrientationVertical
    extends activexDashMsformsLib.MSFormsNs.fmOrientation
  
  /* -1 */ val fmOrientationAuto: fmOrientationAuto with scala.Double = js.native
  /* 1 */ val fmOrientationHorizontal: fmOrientationHorizontal with scala.Double = js.native
  /* 0 */ val fmOrientationVertical: fmOrientationVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmOrientation with scala.Double] = js.native
}

