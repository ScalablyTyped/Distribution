package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandManager extends js.Object {
  var byName: js.Any = js.native
  var commands: js.Any = js.native
  var platform: String = js.native
  def addCommand(command: EditorCommand): Unit = js.native
  def addCommands(commands: js.Array[EditorCommand]): Unit = js.native
  def exec(name: String, editor: Editor, args: js.Any): Unit = js.native
}

object CommandManager {
  @scala.inline
  def apply(
    addCommand: EditorCommand => Unit,
    addCommands: js.Array[EditorCommand] => Unit,
    byName: js.Any,
    commands: js.Any,
    exec: (String, Editor, js.Any) => Unit,
    platform: String
  ): CommandManager = {
    val __obj = js.Dynamic.literal(addCommand = js.Any.fromFunction1(addCommand), addCommands = js.Any.fromFunction1(addCommands), byName = byName.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], exec = js.Any.fromFunction3(exec), platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandManager]
  }
  @scala.inline
  implicit class CommandManagerOps[Self <: CommandManager] (val x: Self) extends AnyVal {
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
    def setAddCommand(value: EditorCommand => Unit): Self = this.set("addCommand", js.Any.fromFunction1(value))
    @scala.inline
    def setAddCommands(value: js.Array[EditorCommand] => Unit): Self = this.set("addCommands", js.Any.fromFunction1(value))
    @scala.inline
    def setByName(value: js.Any): Self = this.set("byName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommands(value: js.Any): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def setExec(value: (String, Editor, js.Any) => Unit): Self = this.set("exec", js.Any.fromFunction3(value))
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
  }
  
}

