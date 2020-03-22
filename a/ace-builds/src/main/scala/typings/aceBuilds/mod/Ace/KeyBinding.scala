package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyBinding extends js.Object {
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
}

