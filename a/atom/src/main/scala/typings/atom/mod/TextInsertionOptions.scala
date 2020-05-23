package typings.atom.mod

import typings.atom.atomStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInsertionOptions extends TextEditOptions {
  /**
    *  If true, decreases indent level appropriately (for example, when a closing
    *  bracket is inserted).
    */
  var autoDecreaseIndent: js.UndefOr[Boolean] = js.undefined
  /** If true, indents all inserted text appropriately. */
  var autoIndent: js.UndefOr[Boolean] = js.undefined
  /** If true, indent newline appropriately. */
  var autoIndentNewline: js.UndefOr[Boolean] = js.undefined
  /**
    *  By default, when pasting multiple lines, Atom attempts to preserve the relative
    *  indent level between the first line and trailing lines, even if the indent
    *  level of the first line has changed from the copied text. If this option is
    *  true, this behavior is suppressed.
    */
  var preserveTrailingLineIndentation: js.UndefOr[Boolean] = js.undefined
  /** If true, selects the newly added text. */
  var select: js.UndefOr[Boolean] = js.undefined
}

object TextInsertionOptions {
  @scala.inline
  def apply(
    autoDecreaseIndent: js.UndefOr[Boolean] = js.undefined,
    autoIndent: js.UndefOr[Boolean] = js.undefined,
    autoIndentNewline: js.UndefOr[Boolean] = js.undefined,
    normalizeLineEndings: js.UndefOr[Boolean] = js.undefined,
    preserveTrailingLineIndentation: js.UndefOr[Boolean] = js.undefined,
    select: js.UndefOr[Boolean] = js.undefined,
    undo: skip = null
  ): TextInsertionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDecreaseIndent)) __obj.updateDynamic("autoDecreaseIndent")(autoDecreaseIndent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoIndent)) __obj.updateDynamic("autoIndent")(autoIndent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoIndentNewline)) __obj.updateDynamic("autoIndentNewline")(autoIndentNewline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeLineEndings)) __obj.updateDynamic("normalizeLineEndings")(normalizeLineEndings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveTrailingLineIndentation)) __obj.updateDynamic("preserveTrailingLineIndentation")(preserveTrailingLineIndentation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select.get.asInstanceOf[js.Any])
    if (undo != null) __obj.updateDynamic("undo")(undo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInsertionOptions]
  }
}

