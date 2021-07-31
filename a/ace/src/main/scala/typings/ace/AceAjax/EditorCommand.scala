package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorCommand extends StObject {
  
  var bindKey: js.Any
  
  var exec: js.Function
  
  var name: String
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
}
object EditorCommand {
  
  @scala.inline
  def apply(bindKey: js.Any, exec: js.Function, name: String): EditorCommand = {
    val __obj = js.Dynamic.literal(bindKey = bindKey.asInstanceOf[js.Any], exec = exec.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorCommand]
  }
  
  @scala.inline
  implicit class EditorCommandMutableBuilder[Self <: EditorCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindKey(value: js.Any): Self = StObject.set(x, "bindKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExec(value: js.Function): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
