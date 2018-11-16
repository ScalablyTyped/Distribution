package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmBackStyle extends js.Object

@JSGlobal("MSForms.fmBackStyle")
@js.native
object fmBackStyle extends js.Object {
  @js.native
  sealed trait fmBackStyleOpaque
    extends activexDashMsformsLib.MSFormsNs.fmBackStyle
  
  @js.native
  sealed trait fmBackStyleTransparent
    extends activexDashMsformsLib.MSFormsNs.fmBackStyle
  
  /* 1 */ val fmBackStyleOpaque: fmBackStyleOpaque with scala.Double = js.native
  /* 0 */ val fmBackStyleTransparent: fmBackStyleTransparent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmBackStyle with scala.Double] = js.native
}

