package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardHandler extends StObject {
  
  var handleKeyboard: js.Function
}
object KeyboardHandler {
  
  inline def apply(handleKeyboard: js.Function): KeyboardHandler = {
    val __obj = js.Dynamic.literal(handleKeyboard = handleKeyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardHandler]
  }
  
  extension [Self <: KeyboardHandler](x: Self) {
    
    inline def setHandleKeyboard(value: js.Function): Self = StObject.set(x, "handleKeyboard", value.asInstanceOf[js.Any])
  }
}
