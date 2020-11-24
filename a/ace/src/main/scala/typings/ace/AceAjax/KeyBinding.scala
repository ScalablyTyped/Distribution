package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyBinding extends js.Object {
  
  def addKeyboardHandler(kb: js.Any, pos: js.Any): Unit = js.native
  
  def getKeyboardHandler(): js.Any = js.native
  
  def onCommandKey(e: js.Any, hashId: js.Any, keyCode: js.Any): Unit = js.native
  
  def onTextInput(text: js.Any): Unit = js.native
  
  def removeKeyboardHandler(kb: js.Any): Boolean = js.native
  
  def setDefaultHandler(kb: js.Any): Unit = js.native
  
  def setKeyboardHandler(kb: js.Any): Unit = js.native
}
object KeyBinding {
  
  @scala.inline
  def apply(
    addKeyboardHandler: (js.Any, js.Any) => Unit,
    getKeyboardHandler: () => js.Any,
    onCommandKey: (js.Any, js.Any, js.Any) => Unit,
    onTextInput: js.Any => Unit,
    removeKeyboardHandler: js.Any => Boolean,
    setDefaultHandler: js.Any => Unit,
    setKeyboardHandler: js.Any => Unit
  ): KeyBinding = {
    val __obj = js.Dynamic.literal(addKeyboardHandler = js.Any.fromFunction2(addKeyboardHandler), getKeyboardHandler = js.Any.fromFunction0(getKeyboardHandler), onCommandKey = js.Any.fromFunction3(onCommandKey), onTextInput = js.Any.fromFunction1(onTextInput), removeKeyboardHandler = js.Any.fromFunction1(removeKeyboardHandler), setDefaultHandler = js.Any.fromFunction1(setDefaultHandler), setKeyboardHandler = js.Any.fromFunction1(setKeyboardHandler))
    __obj.asInstanceOf[KeyBinding]
  }
  
  @scala.inline
  implicit class KeyBindingOps[Self <: KeyBinding] (val x: Self) extends AnyVal {
    
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
    def setAddKeyboardHandler(value: (js.Any, js.Any) => Unit): Self = this.set("addKeyboardHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetKeyboardHandler(value: () => js.Any): Self = this.set("getKeyboardHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCommandKey(value: (js.Any, js.Any, js.Any) => Unit): Self = this.set("onCommandKey", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnTextInput(value: js.Any => Unit): Self = this.set("onTextInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveKeyboardHandler(value: js.Any => Boolean): Self = this.set("removeKeyboardHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultHandler(value: js.Any => Unit): Self = this.set("setDefaultHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetKeyboardHandler(value: js.Any => Unit): Self = this.set("setKeyboardHandler", js.Any.fromFunction1(value))
  }
}
