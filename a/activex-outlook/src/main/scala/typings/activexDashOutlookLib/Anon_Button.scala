package typings
package activexDashOutlookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Button extends js.Object {
  val Button: activexDashOutlookLib.OutlookNs.OlMouseButton
  val Shift: activexDashOutlookLib.OutlookNs.OlShiftState
  val X: activexDashStdoleLib.stdoleNs.OLE_XPOS_CONTAINER
  val Y: activexDashStdoleLib.stdoleNs.OLE_YPOS_CONTAINER
}

object Anon_Button {
  @scala.inline
  def apply(
    Button: activexDashOutlookLib.OutlookNs.OlMouseButton,
    Shift: activexDashOutlookLib.OutlookNs.OlShiftState,
    X: activexDashStdoleLib.stdoleNs.OLE_XPOS_CONTAINER,
    Y: activexDashStdoleLib.stdoleNs.OLE_YPOS_CONTAINER
  ): Anon_Button = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Button")(Button)
    __obj.updateDynamic("Shift")(Shift)
    __obj.updateDynamic("X")(X)
    __obj.updateDynamic("Y")(Y)
    __obj.asInstanceOf[Anon_Button]
  }
}

