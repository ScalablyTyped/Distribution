package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardHandler extends js.Object {
  
  var handleKeyboard: js.Function = js.native
}
object KeyboardHandler {
  
  @scala.inline
  def apply(handleKeyboard: js.Function): KeyboardHandler = {
    val __obj = js.Dynamic.literal(handleKeyboard = handleKeyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardHandler]
  }
  
  @scala.inline
  implicit class KeyboardHandlerOps[Self <: KeyboardHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHandleKeyboard(value: js.Function): Self = this.set("handleKeyboard", value.asInstanceOf[js.Any])
  }
}
