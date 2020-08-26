package typings.activexMsforms.MSForms.EventHelperTypes

import typings.activexMsforms.MSForms.Control
import typings.activexMsforms.MSForms.DataObject
import typings.activexMsforms.MSForms.ReturnBoolean
import typings.activexMsforms.MSForms.ReturnEffect
import typings.activexMsforms.MSForms.fmDragState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerBeforeDragOverParameter extends js.Object {
  val Cancel: ReturnBoolean = js.native
  val Control: typings.activexMsforms.MSForms.Control = js.native
  val Data: DataObject = js.native
  val Effect: ReturnEffect = js.native
  val Shift: Double = js.native
  val State: fmDragState = js.native
  val X: Double = js.native
  val Y: Double = js.native
}

object ContainerBeforeDragOverParameter {
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
  ): ContainerBeforeDragOverParameter = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Control = Control.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerBeforeDragOverParameter]
  }
  @scala.inline
  implicit class ContainerBeforeDragOverParameterOps[Self <: ContainerBeforeDragOverParameter] (val x: Self) extends AnyVal {
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
    def setControl(value: Control): Self = this.set("Control", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: DataObject): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffect(value: ReturnEffect): Self = this.set("Effect", value.asInstanceOf[js.Any])
    @scala.inline
    def setShift(value: Double): Self = this.set("Shift", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: fmDragState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("X", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("Y", value.asInstanceOf[js.Any])
  }
  
}

