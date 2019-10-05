package typings.activexDashMsforms.MSForms.EventHelperTypes

import typings.activexDashMsforms.MSForms.Control
import typings.activexDashMsforms.MSForms.DataObject
import typings.activexDashMsforms.MSForms.ReturnBoolean
import typings.activexDashMsforms.MSForms.ReturnEffect
import typings.activexDashMsforms.MSForms.fmDragState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container_BeforeDragOver_Parameter extends js.Object {
  val Cancel: ReturnBoolean
  val Control: typings.activexDashMsforms.MSForms.Control
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

