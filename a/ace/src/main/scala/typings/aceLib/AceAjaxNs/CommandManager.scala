package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandManager extends js.Object {
  var byName: js.Any
  var commands: js.Any
  var platform: java.lang.String
  def addCommand(command: EditorCommand): scala.Unit
  def addCommands(commands: js.Array[EditorCommand]): scala.Unit
  def exec(name: java.lang.String, editor: Editor, args: js.Any): scala.Unit
}

object CommandManager {
  @scala.inline
  def apply(
    addCommand: js.Function1[EditorCommand, scala.Unit],
    addCommands: js.Function1[js.Array[EditorCommand], scala.Unit],
    byName: js.Any,
    commands: js.Any,
    exec: js.Function3[java.lang.String, Editor, js.Any, scala.Unit],
    platform: java.lang.String
  ): CommandManager = {
    val __obj = js.Dynamic.literal(addCommand = addCommand, addCommands = addCommands, byName = byName, commands = commands, exec = exec, platform = platform)
  
    __obj.asInstanceOf[CommandManager]
  }
}

