package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyBinding extends StObject {
  
  def addKeyboardHandler(handler: KeyboardHandler, pos: Double): Unit
  
  def getKeyboardHandler(): KeyboardHandler
  
  def getStatusText(): String
  
  def removeKeyboardHandler(handler: KeyboardHandler): Boolean
  
  def setDefaultHandler(handler: KeyboardHandler): Unit
  
  def setKeyboardHandler(handler: KeyboardHandler): Unit
}
object KeyBinding {
  
  @scala.inline
  def apply(
    addKeyboardHandler: (KeyboardHandler, Double) => Unit,
    getKeyboardHandler: () => KeyboardHandler,
    getStatusText: () => String,
    removeKeyboardHandler: KeyboardHandler => Boolean,
    setDefaultHandler: KeyboardHandler => Unit,
    setKeyboardHandler: KeyboardHandler => Unit
  ): KeyBinding = {
    val __obj = js.Dynamic.literal(addKeyboardHandler = js.Any.fromFunction2(addKeyboardHandler), getKeyboardHandler = js.Any.fromFunction0(getKeyboardHandler), getStatusText = js.Any.fromFunction0(getStatusText), removeKeyboardHandler = js.Any.fromFunction1(removeKeyboardHandler), setDefaultHandler = js.Any.fromFunction1(setDefaultHandler), setKeyboardHandler = js.Any.fromFunction1(setKeyboardHandler))
    __obj.asInstanceOf[KeyBinding]
  }
  
  @scala.inline
  implicit class KeyBindingMutableBuilder[Self <: KeyBinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddKeyboardHandler(value: (KeyboardHandler, Double) => Unit): Self = StObject.set(x, "addKeyboardHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetKeyboardHandler(value: () => KeyboardHandler): Self = StObject.set(x, "getKeyboardHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStatusText(value: () => String): Self = StObject.set(x, "getStatusText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveKeyboardHandler(value: KeyboardHandler => Boolean): Self = StObject.set(x, "removeKeyboardHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultHandler(value: KeyboardHandler => Unit): Self = StObject.set(x, "setDefaultHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetKeyboardHandler(value: KeyboardHandler => Unit): Self = StObject.set(x, "setKeyboardHandler", js.Any.fromFunction1(value))
  }
}
