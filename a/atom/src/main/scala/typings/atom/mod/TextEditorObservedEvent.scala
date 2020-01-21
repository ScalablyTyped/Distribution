package typings.atom.mod

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
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], textEditor = textEditor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextEditorObservedEvent]
  }
}

