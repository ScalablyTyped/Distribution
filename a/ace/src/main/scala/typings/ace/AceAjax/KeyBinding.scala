package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyBinding extends StObject {
  
  def addKeyboardHandler(kb: KeyboardHandler, pos: Double): Unit
  
  def getKeyboardHandler(): KeyboardHandler
  
  def onCommandKey(e: Any, hashId: Double, keyCode: Double): Boolean
  
  def onTextInput(text: String): Boolean
  
  def removeKeyboardHandler(kb: KeyboardHandler): Boolean
  
  def setDefaultHandler(kb: KeyboardHandler): Unit
  
  def setKeyboardHandler(kb: KeyboardHandler): Unit
}
object KeyBinding {
  
  inline def apply(
    addKeyboardHandler: (KeyboardHandler, Double) => Unit,
    getKeyboardHandler: () => KeyboardHandler,
    onCommandKey: (Any, Double, Double) => Boolean,
    onTextInput: String => Boolean,
    removeKeyboardHandler: KeyboardHandler => Boolean,
    setDefaultHandler: KeyboardHandler => Unit,
    setKeyboardHandler: KeyboardHandler => Unit
  ): KeyBinding = {
    val __obj = js.Dynamic.literal(addKeyboardHandler = js.Any.fromFunction2(addKeyboardHandler), getKeyboardHandler = js.Any.fromFunction0(getKeyboardHandler), onCommandKey = js.Any.fromFunction3(onCommandKey), onTextInput = js.Any.fromFunction1(onTextInput), removeKeyboardHandler = js.Any.fromFunction1(removeKeyboardHandler), setDefaultHandler = js.Any.fromFunction1(setDefaultHandler), setKeyboardHandler = js.Any.fromFunction1(setKeyboardHandler))
    __obj.asInstanceOf[KeyBinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyBinding] (val x: Self) extends AnyVal {
    
    inline def setAddKeyboardHandler(value: (KeyboardHandler, Double) => Unit): Self = StObject.set(x, "addKeyboardHandler", js.Any.fromFunction2(value))
    
    inline def setGetKeyboardHandler(value: () => KeyboardHandler): Self = StObject.set(x, "getKeyboardHandler", js.Any.fromFunction0(value))
    
    inline def setOnCommandKey(value: (Any, Double, Double) => Boolean): Self = StObject.set(x, "onCommandKey", js.Any.fromFunction3(value))
    
    inline def setOnTextInput(value: String => Boolean): Self = StObject.set(x, "onTextInput", js.Any.fromFunction1(value))
    
    inline def setRemoveKeyboardHandler(value: KeyboardHandler => Boolean): Self = StObject.set(x, "removeKeyboardHandler", js.Any.fromFunction1(value))
    
    inline def setSetDefaultHandler(value: KeyboardHandler => Unit): Self = StObject.set(x, "setDefaultHandler", js.Any.fromFunction1(value))
    
    inline def setSetKeyboardHandler(value: KeyboardHandler => Unit): Self = StObject.set(x, "setKeyboardHandler", js.Any.fromFunction1(value))
  }
}
