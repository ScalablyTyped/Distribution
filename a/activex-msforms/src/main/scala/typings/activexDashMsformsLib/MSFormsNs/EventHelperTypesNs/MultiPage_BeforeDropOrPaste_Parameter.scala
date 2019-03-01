package typings
package activexDashMsformsLib.MSFormsNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPage_BeforeDropOrPaste_Parameter extends js.Object {
  val Action: activexDashMsformsLib.MSFormsNs.fmAction
  val Cancel: activexDashMsformsLib.MSFormsNs.ReturnBoolean
  val Control: activexDashMsformsLib.MSFormsNs.Control
  val Data: activexDashMsformsLib.MSFormsNs.DataObject
  val Effect: activexDashMsformsLib.MSFormsNs.ReturnEffect
  val Index: scala.Double
  val Shift: scala.Double
  val X: scala.Double
  val Y: scala.Double
}

object MultiPage_BeforeDropOrPaste_Parameter {
  @scala.inline
  def apply(
    Action: activexDashMsformsLib.MSFormsNs.fmAction,
    Cancel: activexDashMsformsLib.MSFormsNs.ReturnBoolean,
    Control: activexDashMsformsLib.MSFormsNs.Control,
    Data: activexDashMsformsLib.MSFormsNs.DataObject,
    Effect: activexDashMsformsLib.MSFormsNs.ReturnEffect,
    Index: scala.Double,
    Shift: scala.Double,
    X: scala.Double,
    Y: scala.Double
  ): MultiPage_BeforeDropOrPaste_Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Action")(Action)
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("Control")(Control)
    __obj.updateDynamic("Data")(Data)
    __obj.updateDynamic("Effect")(Effect)
    __obj.updateDynamic("Index")(Index)
    __obj.updateDynamic("Shift")(Shift)
    __obj.updateDynamic("X")(X)
    __obj.updateDynamic("Y")(Y)
    __obj.asInstanceOf[MultiPage_BeforeDropOrPaste_Parameter]
  }
}

