package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
  val Command: Double = js.native
  val Enable: Boolean = js.native
}

object Command {
  @scala.inline
  def apply(Command: Double, Enable: Boolean): Command = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Enable = Enable.asInstanceOf[js.Any])
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
    def setCommand(value: Double): Self = this.set("Command", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("Enable", value.asInstanceOf[js.Any])
  }
  
}

