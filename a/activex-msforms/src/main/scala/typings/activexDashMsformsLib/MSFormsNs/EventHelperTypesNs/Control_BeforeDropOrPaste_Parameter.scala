package typings
package activexDashMsformsLib.MSFormsNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Control_BeforeDropOrPaste_Parameter extends js.Object {
  val Action: activexDashMsformsLib.MSFormsNs.fmAction
  val Cancel: activexDashMsformsLib.MSFormsNs.ReturnBoolean
  val Data: activexDashMsformsLib.MSFormsNs.DataObject
  val Effect: activexDashMsformsLib.MSFormsNs.ReturnEffect
  val Shift: scala.Double
  val X: scala.Double
  val Y: scala.Double
}

object Control_BeforeDropOrPaste_Parameter {
  @scala.inline
  def apply(
    Action: activexDashMsformsLib.MSFormsNs.fmAction,
    Cancel: activexDashMsformsLib.MSFormsNs.ReturnBoolean,
    Data: activexDashMsformsLib.MSFormsNs.DataObject,
    Effect: activexDashMsformsLib.MSFormsNs.ReturnEffect,
    Shift: scala.Double,
    X: scala.Double,
    Y: scala.Double
  ): Control_BeforeDropOrPaste_Parameter = {
    val __obj = js.Dynamic.literal(Action = Action, Cancel = Cancel, Data = Data, Effect = Effect, Shift = Shift, X = X, Y = Y)
  
    __obj.asInstanceOf[Control_BeforeDropOrPaste_Parameter]
  }
}

