package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditorObservedEvent extends js.Object {
  var index: scala.Double
  var pane: Pane
  var textEditor: TextEditor
}

object TextEditorObservedEvent {
  @scala.inline
  def apply(index: scala.Double, pane: Pane, textEditor: TextEditor): TextEditorObservedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("pane")(pane)
    __obj.updateDynamic("textEditor")(textEditor)
    __obj.asInstanceOf[TextEditorObservedEvent]
  }
}

