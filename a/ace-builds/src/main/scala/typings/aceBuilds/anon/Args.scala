package typings.aceBuilds.anon

import typings.aceBuilds.mod.Ace.Editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args extends StObject {
  
  var args: js.Array[Any]
  
  var command: typings.aceBuilds.mod.Ace.Command
  
  var editor: Editor
}
object Args {
  
  inline def apply(args: js.Array[Any], command: typings.aceBuilds.mod.Ace.Command, editor: Editor): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  extension [Self <: Args](x: Self) {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setCommand(value: typings.aceBuilds.mod.Ace.Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setEditor(value: Editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
  }
}
