package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardHandler extends StObject {
  
  var handleKeyboard: js.Function = js.native
}
object KeyboardHandler {
  
  @scala.inline
  def apply(handleKeyboard: js.Function): KeyboardHandler = {
    val __obj = js.Dynamic.literal(handleKeyboard = handleKeyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardHandler]
  }
  
  @scala.inline
  implicit class KeyboardHandlerMutableBuilder[Self <: KeyboardHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleKeyboard(value: js.Function): Self = StObject.set(x, "handleKeyboard", value.asInstanceOf[js.Any])
  }
}
