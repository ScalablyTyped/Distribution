package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyBinding extends js.Object {
  def addKeyboardHandler(handler: KeyboardHandler, pos: Double): Unit = js.native
  def getKeyboardHandler(): KeyboardHandler = js.native
  def getStatusText(): String = js.native
  def removeKeyboardHandler(handler: KeyboardHandler): Boolean = js.native
  def setDefaultHandler(handler: KeyboardHandler): Unit = js.native
  def setKeyboardHandler(handler: KeyboardHandler): Unit = js.native
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
    def setAddKeyboardHandler(value: (KeyboardHandler, Double) => Unit): Self = this.set("addKeyboardHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setGetKeyboardHandler(value: () => KeyboardHandler): Self = this.set("getKeyboardHandler", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStatusText(value: () => String): Self = this.set("getStatusText", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveKeyboardHandler(value: KeyboardHandler => Boolean): Self = this.set("removeKeyboardHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDefaultHandler(value: KeyboardHandler => Unit): Self = this.set("setDefaultHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setSetKeyboardHandler(value: KeyboardHandler => Unit): Self = this.set("setKeyboardHandler", js.Any.fromFunction1(value))
  }
  
}

