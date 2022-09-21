package typings.antDesignProProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlyOneLineEditor extends StObject {
  
  var action: Add
  
  var onlyOneLineEditor: String
}
object OnlyOneLineEditor {
  
  inline def apply(action: Add, onlyOneLineEditor: String): OnlyOneLineEditor = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], onlyOneLineEditor = onlyOneLineEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlyOneLineEditor]
  }
  
  extension [Self <: OnlyOneLineEditor](x: Self) {
    
    inline def setAction(value: Add): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setOnlyOneLineEditor(value: String): Self = StObject.set(x, "onlyOneLineEditor", value.asInstanceOf[js.Any])
  }
}
