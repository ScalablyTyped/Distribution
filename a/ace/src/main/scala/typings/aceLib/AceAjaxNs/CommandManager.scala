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
    addCommand: EditorCommand => scala.Unit,
    addCommands: js.Array[EditorCommand] => scala.Unit,
    byName: js.Any,
    commands: js.Any,
    exec: (java.lang.String, Editor, js.Any) => scala.Unit,
    platform: java.lang.String
  ): CommandManager = {
    val __obj = js.Dynamic.literal(addCommand = js.Any.fromFunction1(addCommand), addCommands = js.Any.fromFunction1(addCommands), byName = byName, commands = commands, exec = js.Any.fromFunction3(exec), platform = platform)
  
    __obj.asInstanceOf[CommandManager]
  }
}

