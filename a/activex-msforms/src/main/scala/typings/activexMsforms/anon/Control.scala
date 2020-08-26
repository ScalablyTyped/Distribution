package typings.activexMsforms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Control extends js.Object {
  val Control: typings.activexMsforms.MSForms.Control = js.native
}

object Control {
  @scala.inline
  def apply(Control: typings.activexMsforms.MSForms.Control): Control = {
    val __obj = js.Dynamic.literal(Control = Control.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
  @scala.inline
  implicit class ControlOps[Self <: Control] (val x: Self) extends AnyVal {
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
    def setControl(value: typings.activexMsforms.MSForms.Control): Self = this.set("Control", value.asInstanceOf[js.Any])
  }
  
}

