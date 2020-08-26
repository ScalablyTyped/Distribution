package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandAny extends js.Object {
  val Command: js.Any = js.native
}

object CommandAny {
  @scala.inline
  def apply(Command: js.Any): CommandAny = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandAny]
  }
  @scala.inline
  implicit class CommandAnyOps[Self <: CommandAny] (val x: Self) extends AnyVal {
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
    def setCommand(value: js.Any): Self = this.set("Command", value.asInstanceOf[js.Any])
  }
  
}

