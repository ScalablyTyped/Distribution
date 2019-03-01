package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditOptions extends js.Object {
  /** If true, all line endings will be normalized to match the editor's current mode. */
  var normalizeLineEndings: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If skip, skips the undo stack for this operation.
    * @deprecated Call groupLastChanges() on the TextBuffer afterward instead.
    */
  var undo: js.UndefOr[atomLib.atomLibStrings.skip] = js.undefined
}

object TextEditOptions {
  @scala.inline
  def apply(
    normalizeLineEndings: js.UndefOr[scala.Boolean] = js.undefined,
    undo: atomLib.atomLibStrings.skip = null
  ): TextEditOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(normalizeLineEndings)) __obj.updateDynamic("normalizeLineEndings")(normalizeLineEndings)
    if (undo != null) __obj.updateDynamic("undo")(undo)
    __obj.asInstanceOf[TextEditOptions]
  }
}

