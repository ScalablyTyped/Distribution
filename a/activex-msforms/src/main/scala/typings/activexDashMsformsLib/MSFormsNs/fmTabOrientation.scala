package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmTabOrientation extends js.Object

@JSGlobal("MSForms.fmTabOrientation")
@js.native
object fmTabOrientation extends js.Object {
  @js.native
  sealed trait fmTabOrientationBottom
    extends activexDashMsformsLib.MSFormsNs.fmTabOrientation
  
  @js.native
  sealed trait fmTabOrientationLeft
    extends activexDashMsformsLib.MSFormsNs.fmTabOrientation
  
  @js.native
  sealed trait fmTabOrientationRight
    extends activexDashMsformsLib.MSFormsNs.fmTabOrientation
  
  @js.native
  sealed trait fmTabOrientationTop
    extends activexDashMsformsLib.MSFormsNs.fmTabOrientation
  
  /* 1 */ val fmTabOrientationBottom: fmTabOrientationBottom with scala.Double = js.native
  /* 2 */ val fmTabOrientationLeft: fmTabOrientationLeft with scala.Double = js.native
  /* 3 */ val fmTabOrientationRight: fmTabOrientationRight with scala.Double = js.native
  /* 0 */ val fmTabOrientationTop: fmTabOrientationTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmTabOrientation with scala.Double] = js.native
}

