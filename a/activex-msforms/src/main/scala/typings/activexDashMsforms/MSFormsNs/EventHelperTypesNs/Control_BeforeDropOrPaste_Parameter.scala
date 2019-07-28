package typings.activexDashMsforms.MSFormsNs.EventHelperTypesNs

import typings.activexDashMsforms.MSFormsNs.DataObject
import typings.activexDashMsforms.MSFormsNs.ReturnBoolean
import typings.activexDashMsforms.MSFormsNs.ReturnEffect
import typings.activexDashMsforms.MSFormsNs.fmAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Control_BeforeDropOrPaste_Parameter extends js.Object {
  val Action: fmAction
  val Cancel: ReturnBoolean
  val Data: DataObject
  val Effect: ReturnEffect
  val Shift: Double
  val X: Double
  val Y: Double
}

object Control_BeforeDropOrPaste_Parameter {
  @scala.inline
  def apply(
    Action: fmAction,
    Cancel: ReturnBoolean,
    Data: DataObject,
    Effect: ReturnEffect,
    Shift: Double,
    X: Double,
    Y: Double
  ): Control_BeforeDropOrPaste_Parameter = {
    val __obj = js.Dynamic.literal(Action = Action, Cancel = Cancel, Data = Data, Effect = Effect, Shift = Shift, X = X, Y = Y)
  
    __obj.asInstanceOf[Control_BeforeDropOrPaste_Parameter]
  }
}

