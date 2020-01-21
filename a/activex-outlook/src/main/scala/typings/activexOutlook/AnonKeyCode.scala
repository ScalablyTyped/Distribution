package typings.activexOutlook

import typings.activexOutlook.Outlook.OlShiftState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyCode extends js.Object {
  val KeyCode: Double
  val Shift: OlShiftState
}

object AnonKeyCode {
  @scala.inline
  def apply(KeyCode: Double, Shift: OlShiftState): AnonKeyCode = {
    val __obj = js.Dynamic.literal(KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeyCode]
  }
}

