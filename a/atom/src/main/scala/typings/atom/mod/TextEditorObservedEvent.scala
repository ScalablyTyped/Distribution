package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditorObservedEvent extends js.Object {
  var index: Double = js.native
  var pane: Pane = js.native
  var textEditor: TextEditor = js.native
}

object TextEditorObservedEvent {
  @scala.inline
  def apply(index: Double, pane: Pane, textEditor: TextEditor): TextEditorObservedEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], textEditor = textEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorObservedEvent]
  }
  @scala.inline
  implicit class TextEditorObservedEventOps[Self <: TextEditorObservedEvent] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setPane(value: Pane): Self = this.set("pane", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextEditor(value: TextEditor): Self = this.set("textEditor", value.asInstanceOf[js.Any])
  }
  
}

