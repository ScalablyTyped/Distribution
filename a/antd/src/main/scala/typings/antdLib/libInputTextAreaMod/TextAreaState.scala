package typings
package antdLib.libInputTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaState extends js.Object {
  var textareaStyles: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object TextAreaState {
  @scala.inline
  def apply(textareaStyles: reactLib.reactMod.ReactNs.CSSProperties = null): TextAreaState = {
    val __obj = js.Dynamic.literal()
    if (textareaStyles != null) __obj.updateDynamic("textareaStyles")(textareaStyles)
    __obj.asInstanceOf[TextAreaState]
  }
}

