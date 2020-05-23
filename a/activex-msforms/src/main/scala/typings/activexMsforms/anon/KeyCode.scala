package typings.activexMsforms.anon

import typings.activexMsforms.MSForms.ReturnInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyCode extends js.Object {
  val KeyCode: ReturnInteger
  val Shift: Double
}

object KeyCode {
  @scala.inline
  def apply(KeyCode: ReturnInteger, Shift: Double): KeyCode = {
    val __obj = js.Dynamic.literal(KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCode]
  }
}

