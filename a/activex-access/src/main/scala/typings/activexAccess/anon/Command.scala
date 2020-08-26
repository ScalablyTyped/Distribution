package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
  val Cancel: js.Any = js.native
  val Command: js.Any = js.native
}

object Command {
  @scala.inline
  def apply(Cancel: js.Any, Command: js.Any): Command = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
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
    def setCancel(value: js.Any): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: js.Any): Self = this.set("Command", value.asInstanceOf[js.Any])
  }
  
}

