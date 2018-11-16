package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmDragState extends js.Object

@JSGlobal("MSForms.fmDragState")
@js.native
object fmDragState extends js.Object {
  @js.native
  sealed trait fmDragStateEnter
    extends activexDashMsformsLib.MSFormsNs.fmDragState
  
  @js.native
  sealed trait fmDragStateLeave
    extends activexDashMsformsLib.MSFormsNs.fmDragState
  
  @js.native
  sealed trait fmDragStateOver
    extends activexDashMsformsLib.MSFormsNs.fmDragState
  
  /* 0 */ val fmDragStateEnter: fmDragStateEnter with scala.Double = js.native
  /* 1 */ val fmDragStateLeave: fmDragStateLeave with scala.Double = js.native
  /* 2 */ val fmDragStateOver: fmDragStateOver with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmDragState with scala.Double] = js.native
}

