package typings
package activexDashMsformsLib.MSFormsNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStrip_BeforeDragOver_Parameter extends js.Object {
  val Cancel: activexDashMsformsLib.MSFormsNs.ReturnBoolean
  val Data: activexDashMsformsLib.MSFormsNs.DataObject
  val DragState: activexDashMsformsLib.MSFormsNs.fmDragState
  val Effect: activexDashMsformsLib.MSFormsNs.ReturnEffect
  val Index: scala.Double
  val Shift: scala.Double
  val X: scala.Double
  val Y: scala.Double
}

object TabStrip_BeforeDragOver_Parameter {
  @scala.inline
  def apply(
    Cancel: activexDashMsformsLib.MSFormsNs.ReturnBoolean,
    Data: activexDashMsformsLib.MSFormsNs.DataObject,
    DragState: activexDashMsformsLib.MSFormsNs.fmDragState,
    Effect: activexDashMsformsLib.MSFormsNs.ReturnEffect,
    Index: scala.Double,
    Shift: scala.Double,
    X: scala.Double,
    Y: scala.Double
  ): TabStrip_BeforeDragOver_Parameter = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Data = Data, DragState = DragState, Effect = Effect, Index = Index, Shift = Shift, X = X, Y = Y)
  
    __obj.asInstanceOf[TabStrip_BeforeDragOver_Parameter]
  }
}

