package typings.atom.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditorObservedEvent extends js.Object {
  var index: Double
  var pane: Pane
  var textEditor: TextEditor
}

object TextEditorObservedEvent {
  @scala.inline
  def apply(index: Double, pane: Pane, textEditor: TextEditor): TextEditorObservedEvent = {
    val __obj = js.Dynamic.literal(index = index, pane = pane, textEditor = textEditor)
  
    __obj.asInstanceOf[TextEditorObservedEvent]
  }
}

