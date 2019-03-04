package typings
package atomLib.autocompleteDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionInsertedEvent extends js.Object {
  var editor: atomLib.atomMod.TextEditor
  var suggestion: TextSuggestion | SnippetSuggestion
  var triggerPosition: atomLib.atomMod.Point
}

object SuggestionInsertedEvent {
  @scala.inline
  def apply(
    editor: atomLib.atomMod.TextEditor,
    suggestion: TextSuggestion | SnippetSuggestion,
    triggerPosition: atomLib.atomMod.Point
  ): SuggestionInsertedEvent = {
    val __obj = js.Dynamic.literal(editor = editor, suggestion = suggestion.asInstanceOf[js.Any], triggerPosition = triggerPosition)
  
    __obj.asInstanceOf[SuggestionInsertedEvent]
  }
}

