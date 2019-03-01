package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInsertionOptions extends TextEditOptions {
  /**
    *  If true, decreases indent level appropriately (for example, when a closing
    *  bracket is inserted).
    */
  var autoDecreaseIndent: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, indents all inserted text appropriately. */
  var autoIndent: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, indent newline appropriately. */
  var autoIndentNewline: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  By default, when pasting multiple lines, Atom attempts to preserve the relative
    *  indent level between the first line and trailing lines, even if the indent
    *  level of the first line has changed from the copied text. If this option is
    *  true, this behavior is suppressed.
    */
  var preserveTrailingLineIndentation: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, selects the newly added text. */
  var select: js.UndefOr[scala.Boolean] = js.undefined
}

object TextInsertionOptions {
  @scala.inline
  def apply(
    autoDecreaseIndent: js.UndefOr[scala.Boolean] = js.undefined,
    autoIndent: js.UndefOr[scala.Boolean] = js.undefined,
    autoIndentNewline: js.UndefOr[scala.Boolean] = js.undefined,
    normalizeLineEndings: js.UndefOr[scala.Boolean] = js.undefined,
    preserveTrailingLineIndentation: js.UndefOr[scala.Boolean] = js.undefined,
    select: js.UndefOr[scala.Boolean] = js.undefined,
    undo: atomLib.atomLibStrings.skip = null
  ): TextInsertionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDecreaseIndent)) __obj.updateDynamic("autoDecreaseIndent")(autoDecreaseIndent)
    if (!js.isUndefined(autoIndent)) __obj.updateDynamic("autoIndent")(autoIndent)
    if (!js.isUndefined(autoIndentNewline)) __obj.updateDynamic("autoIndentNewline")(autoIndentNewline)
    if (!js.isUndefined(normalizeLineEndings)) __obj.updateDynamic("normalizeLineEndings")(normalizeLineEndings)
    if (!js.isUndefined(preserveTrailingLineIndentation)) __obj.updateDynamic("preserveTrailingLineIndentation")(preserveTrailingLineIndentation)
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select)
    if (undo != null) __obj.updateDynamic("undo")(undo)
    __obj.asInstanceOf[TextInsertionOptions]
  }
}

