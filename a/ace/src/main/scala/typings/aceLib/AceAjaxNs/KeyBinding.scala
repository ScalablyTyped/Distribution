package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyBinding extends js.Object {
  def addKeyboardHandler(kb: js.Any, pos: js.Any): scala.Unit
  def getKeyboardHandler(): js.Any
  def onCommandKey(e: js.Any, hashId: js.Any, keyCode: js.Any): scala.Unit
  def onTextInput(text: js.Any): scala.Unit
  def removeKeyboardHandler(kb: js.Any): scala.Boolean
  def setDefaultHandler(kb: js.Any): scala.Unit
  def setKeyboardHandler(kb: js.Any): scala.Unit
}

object KeyBinding {
  @scala.inline
  def apply(
    addKeyboardHandler: (js.Any, js.Any) => scala.Unit,
    getKeyboardHandler: () => js.Any,
    onCommandKey: (js.Any, js.Any, js.Any) => scala.Unit,
    onTextInput: js.Any => scala.Unit,
    removeKeyboardHandler: js.Any => scala.Boolean,
    setDefaultHandler: js.Any => scala.Unit,
    setKeyboardHandler: js.Any => scala.Unit
  ): KeyBinding = {
    val __obj = js.Dynamic.literal(addKeyboardHandler = js.Any.fromFunction2(addKeyboardHandler), getKeyboardHandler = js.Any.fromFunction0(getKeyboardHandler), onCommandKey = js.Any.fromFunction3(onCommandKey), onTextInput = js.Any.fromFunction1(onTextInput), removeKeyboardHandler = js.Any.fromFunction1(removeKeyboardHandler), setDefaultHandler = js.Any.fromFunction1(setDefaultHandler), setKeyboardHandler = js.Any.fromFunction1(setKeyboardHandler))
  
    __obj.asInstanceOf[KeyBinding]
  }
}

