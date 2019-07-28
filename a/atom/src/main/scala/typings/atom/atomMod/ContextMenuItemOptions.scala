package typings.atom.atomMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuItemOptions extends ContextMenuOptions {
  /** Place this menu item after the menu items representing the given commands. */
  var after: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Place this menu item's group after the containing group of the menu items
    * representing the given commands.
    */
  var afterGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
  /** Place this menu item before the menu items representing the given commands. */
  var before: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Place this menu item's group before the containing group of the menu items
    * representing the given commands.
    */
  var beforeGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
  /**
    *  The command to invoke on the target of the right click that invoked the
    *  context menu.
    */
  var command: js.UndefOr[String] = js.undefined
  /**
    *  A function that is called on the item each time a context menu is created
    *  via a right click.
    */
  var created: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  /**
    *  Whether the menu item should be clickable. Disabled menu items typically
    *  appear grayed out. Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** The menu item's label. */
  var label: js.UndefOr[String] = js.undefined
  /**
    *  A function that is called to determine whether to display this item on a
    *  given context menu deployment.
    */
  var shouldDisplay: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  /** An array of additional items. */
  var submenu: js.UndefOr[js.Array[ContextMenuOptions]] = js.undefined
  /** Whether the menu item should appear in the menu. Defaults to true. */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ContextMenuItemOptions {
  @scala.inline
  def apply(
    after: js.Array[String] = null,
    afterGroupContaining: js.Array[String] = null,
    before: js.Array[String] = null,
    beforeGroupContaining: js.Array[String] = null,
    command: String = null,
    created: /* event */ Event => Unit = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    shouldDisplay: /* event */ Event => Unit = null,
    submenu: js.Array[ContextMenuOptions] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ContextMenuItemOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (afterGroupContaining != null) __obj.updateDynamic("afterGroupContaining")(afterGroupContaining)
    if (before != null) __obj.updateDynamic("before")(before)
    if (beforeGroupContaining != null) __obj.updateDynamic("beforeGroupContaining")(beforeGroupContaining)
    if (command != null) __obj.updateDynamic("command")(command)
    if (created != null) __obj.updateDynamic("created")(js.Any.fromFunction1(created))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (label != null) __obj.updateDynamic("label")(label)
    if (shouldDisplay != null) __obj.updateDynamic("shouldDisplay")(js.Any.fromFunction1(shouldDisplay))
    if (submenu != null) __obj.updateDynamic("submenu")(submenu)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ContextMenuItemOptions]
  }
}

