package typings.activexDashOutlook

import typings.activexDashOutlook.OutlookNs.OlMouseButton
import typings.activexDashOutlook.OutlookNs.OlShiftState
import typings.activexDashStdole.stdoleNs.OLE_XPOS_CONTAINER
import typings.activexDashStdole.stdoleNs.OLE_YPOS_CONTAINER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Button extends js.Object {
  val Button: OlMouseButton
  val Shift: OlShiftState
  val X: OLE_XPOS_CONTAINER
  val Y: OLE_YPOS_CONTAINER
}

object Anon_Button {
  @scala.inline
  def apply(Button: OlMouseButton, Shift: OlShiftState, X: OLE_XPOS_CONTAINER, Y: OLE_YPOS_CONTAINER): Anon_Button = {
    val __obj = js.Dynamic.literal(Button = Button, Shift = Shift, X = X, Y = Y)
  
    __obj.asInstanceOf[Anon_Button]
  }
}

