package typings.activexMsforms.MSForms.EventHelperTypes

import typings.activexMsforms.MSForms.Control
import typings.activexMsforms.MSForms.DataObject
import typings.activexMsforms.MSForms.ReturnBoolean
import typings.activexMsforms.MSForms.ReturnEffect
import typings.activexMsforms.MSForms.fmDragState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerBeforeDragOverParameter extends js.Object {
  val Cancel: ReturnBoolean
  val Control: typings.activexMsforms.MSForms.Control
  val Data: DataObject
  val Effect: ReturnEffect
  val Shift: Double
  val State: fmDragState
  val X: Double
  val Y: Double
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
}

