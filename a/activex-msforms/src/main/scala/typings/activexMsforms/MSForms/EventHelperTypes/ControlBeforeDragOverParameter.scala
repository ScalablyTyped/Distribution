package typings.activexMsforms.MSForms.EventHelperTypes

import typings.activexMsforms.MSForms.DataObject
import typings.activexMsforms.MSForms.ReturnBoolean
import typings.activexMsforms.MSForms.ReturnEffect
import typings.activexMsforms.MSForms.fmDragState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlBeforeDragOverParameter extends js.Object {
  val Cancel: ReturnBoolean = js.native
  val Data: DataObject = js.native
  val DragState: fmDragState = js.native
  val Effect: ReturnEffect = js.native
  val Shift: Double = js.native
  val X: Double = js.native
  val Y: Double = js.native
}

object ControlBeforeDragOverParameter {
  @scala.inline
  def apply(
    Cancel: ReturnBoolean,
    Data: DataObject,
    DragState: fmDragState,
    Effect: ReturnEffect,
    Shift: Double,
    X: Double,
    Y: Double
  ): ControlBeforeDragOverParameter = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], DragState = DragState.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlBeforeDragOverParameter]
  }
  @scala.inline
  implicit class ControlBeforeDragOverParameterOps[Self <: ControlBeforeDragOverParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: ReturnBoolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: DataObject): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragState(value: fmDragState): Self = this.set("DragState", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffect(value: ReturnEffect): Self = this.set("Effect", value.asInstanceOf[js.Any])
    @scala.inline
    def setShift(value: Double): Self = this.set("Shift", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("X", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("Y", value.asInstanceOf[js.Any])
  }
  
}

