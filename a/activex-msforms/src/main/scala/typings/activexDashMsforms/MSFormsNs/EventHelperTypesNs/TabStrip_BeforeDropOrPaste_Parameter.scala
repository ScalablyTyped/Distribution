package typings.activexDashMsforms.MSFormsNs.EventHelperTypesNs

import typings.activexDashMsforms.MSFormsNs.DataObject
import typings.activexDashMsforms.MSFormsNs.ReturnBoolean
import typings.activexDashMsforms.MSFormsNs.ReturnEffect
import typings.activexDashMsforms.MSFormsNs.fmAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStrip_BeforeDropOrPaste_Parameter extends js.Object {
  val Action: fmAction
  val Cancel: ReturnBoolean
  val Data: DataObject
  val Effect: ReturnEffect
  val Index: Double
  val Shift: Double
  val X: Double
  val Y: Double
}

object TabStrip_BeforeDropOrPaste_Parameter {
  @scala.inline
  def apply(
    Action: fmAction,
    Cancel: ReturnBoolean,
    Data: DataObject,
    Effect: ReturnEffect,
    Index: Double,
    Shift: Double,
    X: Double,
    Y: Double
  ): TabStrip_BeforeDropOrPaste_Parameter = {
    val __obj = js.Dynamic.literal(Action = Action, Cancel = Cancel, Data = Data, Effect = Effect, Index = Index, Shift = Shift, X = X, Y = Y)
  
    __obj.asInstanceOf[TabStrip_BeforeDropOrPaste_Parameter]
  }
}

