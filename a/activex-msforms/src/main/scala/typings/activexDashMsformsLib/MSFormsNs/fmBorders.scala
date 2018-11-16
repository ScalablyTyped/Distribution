package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmBorders extends js.Object

@JSGlobal("MSForms.fmBorders")
@js.native
object fmBorders extends js.Object {
  @js.native
  sealed trait fmBordersBox
    extends activexDashMsformsLib.MSFormsNs.fmBorders
  
  @js.native
  sealed trait fmBordersLeft
    extends activexDashMsformsLib.MSFormsNs.fmBorders
  
  @js.native
  sealed trait fmBordersNone
    extends activexDashMsformsLib.MSFormsNs.fmBorders
  
  @js.native
  sealed trait fmBordersTop
    extends activexDashMsformsLib.MSFormsNs.fmBorders
  
  /* 1 */ val fmBordersBox: fmBordersBox with scala.Double = js.native
  /* 2 */ val fmBordersLeft: fmBordersLeft with scala.Double = js.native
  /* 0 */ val fmBordersNone: fmBordersNone with scala.Double = js.native
  /* 3 */ val fmBordersTop: fmBordersTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmBorders with scala.Double] = js.native
}

