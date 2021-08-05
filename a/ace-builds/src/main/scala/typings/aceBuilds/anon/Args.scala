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
  
  inline def apply(args: js.Array[js.Any], command: Command, editor: Editor): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  extension [Self <: Args](x: Self) {
    
    inline def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setEditor(value: Editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
  }
}
