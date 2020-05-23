package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OlShiftState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyCode extends js.Object {
  val KeyCode: Double
  val Shift: OlShiftState
}

object KeyCode {
  @scala.inline
  def apply(KeyCode: Double, Shift: OlShiftState): KeyCode = {
    val __obj = js.Dynamic.literal(KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCode]
  }
}

