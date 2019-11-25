package typings.activexDashOutlook

import typings.activexDashOutlook.Outlook.OlMouseButton
import typings.activexDashOutlook.Outlook.OlShiftState
import typings.activexDashStdole.stdole.OLE_XPOS_CONTAINER
import typings.activexDashStdole.stdole.OLE_YPOS_CONTAINER
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
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Button]
  }
}

