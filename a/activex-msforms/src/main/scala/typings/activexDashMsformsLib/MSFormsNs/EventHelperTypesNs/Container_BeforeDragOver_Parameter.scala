package typings
package activexDashMsformsLib.MSFormsNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container_BeforeDragOver_Parameter extends js.Object {
  val Cancel: activexDashMsformsLib.MSFormsNs.ReturnBoolean
  val Control: activexDashMsformsLib.MSFormsNs.Control
  val Data: activexDashMsformsLib.MSFormsNs.DataObject
  val Effect: activexDashMsformsLib.MSFormsNs.ReturnEffect
  val Shift: scala.Double
  val State: activexDashMsformsLib.MSFormsNs.fmDragState
  val X: scala.Double
  val Y: scala.Double
}

object Container_BeforeDragOver_Parameter {
  @scala.inline
  def apply(
    Cancel: activexDashMsformsLib.MSFormsNs.ReturnBoolean,
    Control: activexDashMsformsLib.MSFormsNs.Control,
    Data: activexDashMsformsLib.MSFormsNs.DataObject,
    Effect: activexDashMsformsLib.MSFormsNs.ReturnEffect,
    Shift: scala.Double,
    State: activexDashMsformsLib.MSFormsNs.fmDragState,
    X: scala.Double,
    Y: scala.Double
  ): Container_BeforeDragOver_Parameter = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Control = Control, Data = Data, Effect = Effect, Shift = Shift, State = State, X = X, Y = Y)
  
    __obj.asInstanceOf[Container_BeforeDragOver_Parameter]
  }
}

