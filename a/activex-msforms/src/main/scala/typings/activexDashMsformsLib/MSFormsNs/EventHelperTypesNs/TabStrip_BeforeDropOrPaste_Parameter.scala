package typings
package activexDashMsformsLib.MSFormsNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStrip_BeforeDropOrPaste_Parameter extends js.Object {
  val Action: activexDashMsformsLib.MSFormsNs.fmAction
  val Cancel: activexDashMsformsLib.MSFormsNs.ReturnBoolean
  val Data: activexDashMsformsLib.MSFormsNs.DataObject
  val Effect: activexDashMsformsLib.MSFormsNs.ReturnEffect
  val Index: scala.Double
  val Shift: scala.Double
  val X: scala.Double
  val Y: scala.Double
}

object TabStrip_BeforeDropOrPaste_Parameter {
  @scala.inline
  def apply(
    Action: activexDashMsformsLib.MSFormsNs.fmAction,
    Cancel: activexDashMsformsLib.MSFormsNs.ReturnBoolean,
    Data: activexDashMsformsLib.MSFormsNs.DataObject,
    Effect: activexDashMsformsLib.MSFormsNs.ReturnEffect,
    Index: scala.Double,
    Shift: scala.Double,
    X: scala.Double,
    Y: scala.Double
  ): TabStrip_BeforeDropOrPaste_Parameter = {
    val __obj = js.Dynamic.literal(Action = Action, Cancel = Cancel, Data = Data, Effect = Effect, Index = Index, Shift = Shift, X = X, Y = Y)
  
    __obj.asInstanceOf[TabStrip_BeforeDropOrPaste_Parameter]
  }
}

