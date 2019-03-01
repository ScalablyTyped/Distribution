package typings
package activexDashMsformsLib.MSFormsNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error_Parameter extends js.Object {
  val CancelDisplay: activexDashMsformsLib.MSFormsNs.ReturnBoolean
  val Description: activexDashMsformsLib.MSFormsNs.ReturnString
  val HelpContext: scala.Double
  val HelpFile: java.lang.String
  val Number: scala.Double
  val SCode: scala.Double
  val Source: java.lang.String
}

object Error_Parameter {
  @scala.inline
  def apply(
    CancelDisplay: activexDashMsformsLib.MSFormsNs.ReturnBoolean,
    Description: activexDashMsformsLib.MSFormsNs.ReturnString,
    HelpContext: scala.Double,
    HelpFile: java.lang.String,
    Number: scala.Double,
    SCode: scala.Double,
    Source: java.lang.String
  ): Error_Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CancelDisplay")(CancelDisplay)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("HelpContext")(HelpContext)
    __obj.updateDynamic("HelpFile")(HelpFile)
    __obj.updateDynamic("Number")(Number)
    __obj.updateDynamic("SCode")(SCode)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[Error_Parameter]
  }
}

