package typings.atom.autocompletePlusMod

import typings.atom.mod.Point
import typings.atom.mod.TextEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestionInsertedEvent extends js.Object {
  var editor: TextEditor = js.native
  var suggestion: TextSuggestion | SnippetSuggestion = js.native
  var triggerPosition: Point = js.native
}

object SuggestionInsertedEvent {
  @scala.inline
  def apply(editor: TextEditor, suggestion: TextSuggestion | SnippetSuggestion, triggerPosition: Point): SuggestionInsertedEvent = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], triggerPosition = triggerPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionInsertedEvent]
  }
  @scala.inline
  implicit class SuggestionInsertedEventOps[Self <: SuggestionInsertedEvent] (val x: Self) extends AnyVal {
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
    def setEditor(value: TextEditor): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestion(value: TextSuggestion | SnippetSuggestion): Self = this.set("suggestion", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerPosition(value: Point): Self = this.set("triggerPosition", value.asInstanceOf[js.Any])
  }
  
}

