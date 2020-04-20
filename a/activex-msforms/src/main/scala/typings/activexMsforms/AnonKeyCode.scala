package typings.activexMsforms

import typings.activexMsforms.MSForms.ReturnInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyCode extends js.Object {
  val KeyCode: ReturnInteger
  val Shift: Double
}

object AnonKeyCode {
  @scala.inline
  def apply(KeyCode: ReturnInteger, Shift: Double): AnonKeyCode = {
    val __obj = js.Dynamic.literal(KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyCode]
  }
}

