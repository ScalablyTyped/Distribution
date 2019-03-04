package typings
package atomLib.autocompleteDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionsRequestedEvent extends js.Object {
  /** Whether the autocomplete request was initiated by the user. */
  var activatedManually: scala.Boolean
  /** The position of the cursor. */
  var bufferPosition: atomLib.atomMod.Point
  /** The current TextEditor. */
  var editor: atomLib.atomMod.TextEditor
  /** The prefix for the word immediately preceding the current cursor position. */
  var prefix: java.lang.String
  /** The scope descriptor for the current cursor position. */
  var scopeDescriptor: atomLib.atomMod.ScopeDescriptor
}

object SuggestionsRequestedEvent {
  @scala.inline
  def apply(
    activatedManually: scala.Boolean,
    bufferPosition: atomLib.atomMod.Point,
    editor: atomLib.atomMod.TextEditor,
    prefix: java.lang.String,
    scopeDescriptor: atomLib.atomMod.ScopeDescriptor
  ): SuggestionsRequestedEvent = {
    val __obj = js.Dynamic.literal(activatedManually = activatedManually, bufferPosition = bufferPosition, editor = editor, prefix = prefix, scopeDescriptor = scopeDescriptor)
  
    __obj.asInstanceOf[SuggestionsRequestedEvent]
  }
}

