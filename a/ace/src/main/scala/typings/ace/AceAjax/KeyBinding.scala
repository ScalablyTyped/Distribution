package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyBinding extends StObject {
  
  def addKeyboardHandler(kb: js.Any, pos: js.Any): Unit
  
  def getKeyboardHandler(): js.Any
  
  def onCommandKey(e: js.Any, hashId: js.Any, keyCode: js.Any): Unit
  
  def onTextInput(text: js.Any): Unit
  
  def removeKeyboardHandler(kb: js.Any): Boolean
  
  def setDefaultHandler(kb: js.Any): Unit
  
  def setKeyboardHandler(kb: js.Any): Unit
}
object KeyBinding {
  
  inline def apply(
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
  
  extension [Self <: KeyBinding](x: Self) {
    
    inline def setAddKeyboardHandler(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "addKeyboardHandler", js.Any.fromFunction2(value))
    
    inline def setGetKeyboardHandler(value: () => js.Any): Self = StObject.set(x, "getKeyboardHandler", js.Any.fromFunction0(value))
    
    inline def setOnCommandKey(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "onCommandKey", js.Any.fromFunction3(value))
    
    inline def setOnTextInput(value: js.Any => Unit): Self = StObject.set(x, "onTextInput", js.Any.fromFunction1(value))
    
    inline def setRemoveKeyboardHandler(value: js.Any => Boolean): Self = StObject.set(x, "removeKeyboardHandler", js.Any.fromFunction1(value))
    
    inline def setSetDefaultHandler(value: js.Any => Unit): Self = StObject.set(x, "setDefaultHandler", js.Any.fromFunction1(value))
    
    inline def setSetKeyboardHandler(value: js.Any => Unit): Self = StObject.set(x, "setKeyboardHandler", js.Any.fromFunction1(value))
  }
}
