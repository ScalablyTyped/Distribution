package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OlMouseButton
import typings.activexOutlook.Outlook.OlShiftState
import typings.activexStdole.stdole.OLE_XPOS_CONTAINER
import typings.activexStdole.stdole.OLE_YPOS_CONTAINER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  val Button: OlMouseButton
  val Shift: OlShiftState
  val X: OLE_XPOS_CONTAINER
  val Y: OLE_YPOS_CONTAINER
}

object Button {
  @scala.inline
  def apply(Button: OlMouseButton, Shift: OlShiftState, X: OLE_XPOS_CONTAINER, Y: OLE_YPOS_CONTAINER): Button = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
}

