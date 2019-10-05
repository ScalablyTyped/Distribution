package typings.activexDashMsforms.MSForms.EventHelperTypes

import typings.activexDashMsforms.MSForms.DataObject
import typings.activexDashMsforms.MSForms.ReturnBoolean
import typings.activexDashMsforms.MSForms.ReturnEffect
import typings.activexDashMsforms.MSForms.fmDragState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Control_BeforeDragOver_Parameter extends js.Object {
  val Cancel: ReturnBoolean
  val Data: DataObject
  val DragState: fmDragState
  val Effect: ReturnEffect
  val Shift: Double
  val X: Double
  val Y: Double
}

object Control_BeforeDragOver_Parameter {
  @scala.inline
  def apply(
    Cancel: ReturnBoolean,
    Data: DataObject,
    DragState: fmDragState,
    Effect: ReturnEffect,
    Shift: Double,
    X: Double,
    Y: Double
  ): Control_BeforeDragOver_Parameter = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Data = Data, DragState = DragState, Effect = Effect, Shift = Shift, X = X, Y = Y)
  
    __obj.asInstanceOf[Control_BeforeDragOver_Parameter]
  }
}

