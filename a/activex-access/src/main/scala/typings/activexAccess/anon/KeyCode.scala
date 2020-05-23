package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyCode extends js.Object {
  var KeyCode: Double
  var Shift: Double
}

object KeyCode {
  @scala.inline
  def apply(KeyCode: Double, Shift: Double): KeyCode = {
    val __obj = js.Dynamic.literal(KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCode]
  }
}

