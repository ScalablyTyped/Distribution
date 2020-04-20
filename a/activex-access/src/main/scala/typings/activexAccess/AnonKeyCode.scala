package typings.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyCode extends js.Object {
  var KeyCode: Double
  var Shift: Double
}

object AnonKeyCode {
  @scala.inline
  def apply(KeyCode: Double, Shift: Double): AnonKeyCode = {
    val __obj = js.Dynamic.literal(KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyCode]
  }
}

