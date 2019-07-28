package typings.atom.atomMod

import typings.atom.atomStrings.bottom
import typings.atom.atomStrings.center
import typings.atom.atomStrings.down
import typings.atom.atomStrings.left
import typings.atom.atomStrings.right
import typings.atom.atomStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceOpenOptions extends js.Object {
  /**
    *  A boolean indicating whether to call Pane::activateItem on containing pane.
    *  Defaults to true.
    */
  var activateItem: js.UndefOr[Boolean] = js.undefined
  /**
    *  A boolean indicating whether to call Pane::activate on containing pane.
    *  Defaults to true.
    */
  var activatePane: js.UndefOr[Boolean] = js.undefined
  /** A number indicating which column to move the cursor to initially. Defaults to 0. */
  var initialColumn: js.UndefOr[Double] = js.undefined
  /** A number indicating which row to move the cursor to initially. Defaults to 0. */
  var initialLine: js.UndefOr[Double] = js.undefined
  /**
    *  A String containing the name of the location in which this item should be opened.
    *  If omitted, Atom will fall back to the last location in which a user has placed
    *  an item with the same URI or, if this is a new URI, the default location specified
    *  by the item.
    *  NOTE: This option should almost always be omitted to honor user preference.
    */
  var location: js.UndefOr[left | right | bottom | center] = js.undefined
  /**
    *  A Boolean indicating whether or not the item should be opened in a pending state.
    *  Existing pending items in a pane are replaced with new pending items when they
    *  are opened.
    */
  var pending: js.UndefOr[Boolean] = js.undefined
  /**
    *  A boolean. If true, the workspace will attempt to activate an existing item for
    *  the given URI on any pane. If false, only the active pane will be searched for
    *  an existing item for the same URI. Defaults to false.
    */
  var searchAllPanes: js.UndefOr[Boolean] = js.undefined
  /**
    *  Either 'left', 'right', 'up' or 'down'. If 'left', the item will be opened in
    *  leftmost pane of the current active pane's row. If 'right', the item will be
    *  opened in the rightmost pane of the current active pane's row. If only one pane
    *  exists in the row, a new pane will be created. If 'up', the item will be opened
    *  in topmost pane of the current active pane's column. If 'down', the item will be
    *  opened in the bottommost pane of the current active pane's column. If only one pane
    *  exists in the column, a new pane will be created.
    */
  var split: js.UndefOr[left | right | up | down] = js.undefined
}

object WorkspaceOpenOptions {
  @scala.inline
  def apply(
    activateItem: js.UndefOr[Boolean] = js.undefined,
    activatePane: js.UndefOr[Boolean] = js.undefined,
    initialColumn: Int | Double = null,
    initialLine: Int | Double = null,
    location: left | right | bottom | center = null,
    pending: js.UndefOr[Boolean] = js.undefined,
    searchAllPanes: js.UndefOr[Boolean] = js.undefined,
    split: left | right | up | down = null
  ): WorkspaceOpenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activateItem)) __obj.updateDynamic("activateItem")(activateItem)
    if (!js.isUndefined(activatePane)) __obj.updateDynamic("activatePane")(activatePane)
    if (initialColumn != null) __obj.updateDynamic("initialColumn")(initialColumn.asInstanceOf[js.Any])
    if (initialLine != null) __obj.updateDynamic("initialLine")(initialLine.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending)
    if (!js.isUndefined(searchAllPanes)) __obj.updateDynamic("searchAllPanes")(searchAllPanes)
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceOpenOptions]
  }
}

