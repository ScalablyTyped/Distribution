package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandManager extends StObject {
  
  def addCommand(command: EditorCommand): Unit = js.native
  
  def addCommands(commands: js.Array[EditorCommand]): Unit = js.native
  
  var byName: js.Any = js.native
  
  var commands: js.Any = js.native
  
  def exec(name: String, editor: Editor, args: js.Any): Unit = js.native
  
  var platform: String = js.native
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
  implicit class CommandManagerMutableBuilder[Self <: CommandManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCommand(value: EditorCommand => Unit): Self = StObject.set(x, "addCommand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddCommands(value: js.Array[EditorCommand] => Unit): Self = StObject.set(x, "addCommands", js.Any.fromFunction1(value))
    
    @scala.inline
    def setByName(value: js.Any): Self = StObject.set(x, "byName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommands(value: js.Any): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExec(value: (String, Editor, js.Any) => Unit): Self = StObject.set(x, "exec", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
  }
}
