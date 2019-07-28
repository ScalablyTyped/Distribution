package typings.ace.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandManager extends js.Object {
  var byName: js.Any
  var commands: js.Any
  var platform: String
  def addCommand(command: EditorCommand): Unit
  def addCommands(commands: js.Array[EditorCommand]): Unit
  def exec(name: String, editor: Editor, args: js.Any): Unit
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
    val __obj = js.Dynamic.literal(addCommand = js.Any.fromFunction1(addCommand), addCommands = js.Any.fromFunction1(addCommands), byName = byName, commands = commands, exec = js.Any.fromFunction3(exec), platform = platform)
  
    __obj.asInstanceOf[CommandManager]
  }
}

