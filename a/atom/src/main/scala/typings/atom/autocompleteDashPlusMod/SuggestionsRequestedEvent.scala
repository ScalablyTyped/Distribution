package typings.atom.autocompleteDashPlusMod

import typings.atom.atomMod.Point
import typings.atom.atomMod.ScopeDescriptor
import typings.atom.atomMod.TextEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionsRequestedEvent extends js.Object {
  /** Whether the autocomplete request was initiated by the user. */
  var activatedManually: Boolean
  /** The position of the cursor. */
  var bufferPosition: Point
  /** The current TextEditor. */
  var editor: TextEditor
  /** The prefix for the word immediately preceding the current cursor position. */
  var prefix: String
  /** The scope descriptor for the current cursor position. */
  var scopeDescriptor: ScopeDescriptor
}

object SuggestionsRequestedEvent {
  @scala.inline
  def apply(
    activatedManually: Boolean,
    bufferPosition: Point,
    editor: TextEditor,
    prefix: String,
    scopeDescriptor: ScopeDescriptor
  ): SuggestionsRequestedEvent = {
    val __obj = js.Dynamic.literal(activatedManually = activatedManually.asInstanceOf[js.Any], bufferPosition = bufferPosition.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuggestionsRequestedEvent]
  }
}

