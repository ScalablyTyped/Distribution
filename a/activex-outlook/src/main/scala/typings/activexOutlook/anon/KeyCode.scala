package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OlShiftState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyCode extends js.Object {
  val KeyCode: Double = js.native
  val Shift: OlShiftState = js.native
}

object KeyCode {
  @scala.inline
  def apply(KeyCode: Double, Shift: OlShiftState): KeyCode = {
    val __obj = js.Dynamic.literal(KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCode]
  }
  @scala.inline
  implicit class KeyCodeOps[Self <: KeyCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeyCode(value: Double): Self = this.set("KeyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setShift(value: OlShiftState): Self = this.set("Shift", value.asInstanceOf[js.Any])
  }
  
}

