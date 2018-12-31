package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceOpenOptions extends js.Object {
  /**
    *  A boolean indicating whether to call Pane::activateItem on containing pane.
    *  Defaults to true.
    */
  var activateItem: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  A boolean indicating whether to call Pane::activate on containing pane.
    *  Defaults to true.
    */
  var activatePane: js.UndefOr[scala.Boolean] = js.undefined
  /** A number indicating which column to move the cursor to initially. Defaults to 0. */
  var initialColumn: js.UndefOr[scala.Double] = js.undefined
  /** A number indicating which row to move the cursor to initially. Defaults to 0. */
  var initialLine: js.UndefOr[scala.Double] = js.undefined
  /**
    *  A String containing the name of the location in which this item should be opened.
    *  If omitted, Atom will fall back to the last location in which a user has placed
    *  an item with the same URI or, if this is a new URI, the default location specified
    *  by the item.
    *  NOTE: This option should almost always be omitted to honor user preference.
    */
  var location: js.UndefOr[
    atomLib.atomLibStrings.left | atomLib.atomLibStrings.right | atomLib.atomLibStrings.bottom | atomLib.atomLibStrings.center
  ] = js.undefined
  /**
    *  A Boolean indicating whether or not the item should be opened in a pending state.
    *  Existing pending items in a pane are replaced with new pending items when they
    *  are opened.
    */
  var pending: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  A boolean. If true, the workspace will attempt to activate an existing item for
    *  the given URI on any pane. If false, only the active pane will be searched for
    *  an existing item for the same URI. Defaults to false.
    */
  var searchAllPanes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  Either 'left', 'right', 'up' or 'down'. If 'left', the item will be opened in
    *  leftmost pane of the current active pane's row. If 'right', the item will be
    *  opened in the rightmost pane of the current active pane's row. If only one pane
    *  exists in the row, a new pane will be created. If 'up', the item will be opened
    *  in topmost pane of the current active pane's column. If 'down', the item will be
    *  opened in the bottommost pane of the current active pane's column. If only one pane
    *  exists in the column, a new pane will be created.
    */
  var split: js.UndefOr[
    atomLib.atomLibStrings.left | atomLib.atomLibStrings.right | atomLib.atomLibStrings.up | atomLib.atomLibStrings.down
  ] = js.undefined
}

