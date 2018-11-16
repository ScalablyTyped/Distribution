package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmDropButtonStyle extends js.Object

@JSGlobal("MSForms.fmDropButtonStyle")
@js.native
object fmDropButtonStyle extends js.Object {
  @js.native
  sealed trait fmDropButtonStyleArrow
    extends activexDashMsformsLib.MSFormsNs.fmDropButtonStyle
  
  @js.native
  sealed trait fmDropButtonStyleEllipsis
    extends activexDashMsformsLib.MSFormsNs.fmDropButtonStyle
  
  @js.native
  sealed trait fmDropButtonStylePlain
    extends activexDashMsformsLib.MSFormsNs.fmDropButtonStyle
  
  @js.native
  sealed trait fmDropButtonStyleReduce
    extends activexDashMsformsLib.MSFormsNs.fmDropButtonStyle
  
  /* 1 */ val fmDropButtonStyleArrow: fmDropButtonStyleArrow with scala.Double = js.native
  /* 2 */ val fmDropButtonStyleEllipsis: fmDropButtonStyleEllipsis with scala.Double = js.native
  /* 0 */ val fmDropButtonStylePlain: fmDropButtonStylePlain with scala.Double = js.native
  /* 3 */ val fmDropButtonStyleReduce: fmDropButtonStyleReduce with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmDropButtonStyle with scala.Double] = js.native
}

