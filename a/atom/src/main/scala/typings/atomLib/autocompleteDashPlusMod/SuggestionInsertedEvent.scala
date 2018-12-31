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

