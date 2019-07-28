package typings.activexDashMsforms.MSFormsNs.EventHelperTypesNs

import typings.activexDashMsforms.MSFormsNs.Control
import typings.activexDashMsforms.MSFormsNs.DataObject
import typings.activexDashMsforms.MSFormsNs.ReturnBoolean
import typings.activexDashMsforms.MSFormsNs.ReturnEffect
import typings.activexDashMsforms.MSFormsNs.fmDragState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container_BeforeDragOver_Parameter extends js.Object {
  val Cancel: ReturnBoolean
  val Control: typings.activexDashMsforms.MSFormsNs.Control
  val Data: DataObject
  val Effect: ReturnEffect
  val Shift: Double
  val State: fmDragState
  val X: Double
  val Y: Double
}

object Container_BeforeDragOver_Parameter {
  @scala.inline
  def apply(
    Cancel: ReturnBoolean,
    Control: Control,
    Data: DataObject,
    Effect: ReturnEffect,
    Shift: Double,
    State: fmDragState,
    X: Double,
    Y: Double
  ): Container_BeforeDragOver_Parameter = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Control = Control, Data = Data, Effect = Effect, Shift = Shift, State = State, X = X, Y = Y)
  
    __obj.asInstanceOf[Container_BeforeDragOver_Parameter]
  }
}

