package typings.atom.autocompleteDashPlusMod

import typings.atom.atomMod.Point
import typings.atom.atomMod.TextEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionInsertedEvent extends js.Object {
  var editor: TextEditor
  var suggestion: TextSuggestion | SnippetSuggestion
  var triggerPosition: Point
}

object SuggestionInsertedEvent {
  @scala.inline
  def apply(editor: TextEditor, suggestion: TextSuggestion | SnippetSuggestion, triggerPosition: Point): SuggestionInsertedEvent = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], triggerPosition = triggerPosition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuggestionInsertedEvent]
  }
}

