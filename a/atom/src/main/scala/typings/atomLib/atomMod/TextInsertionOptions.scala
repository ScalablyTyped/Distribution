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

