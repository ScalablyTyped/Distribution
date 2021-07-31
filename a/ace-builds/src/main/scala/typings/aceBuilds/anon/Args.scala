package typings.aceBuilds.anon

import typings.aceBuilds.mod.Ace.Command
import typings.aceBuilds.mod.Ace.Editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args extends StObject {
  
  var args: js.Array[js.Any]
  
  var command: Command
  
  var editor: Editor
}
object Args {
  
  @scala.inline
  def apply(args: js.Array[js.Any], command: Command, editor: Editor): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  @scala.inline
  implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: Editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
  }
}
