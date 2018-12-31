package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuItemOptions extends js.Object {
  /** Place this menu item after the menu items representing the given commands. */
  var after: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Place this menu item's group after the containing group of the menu items
    * representing the given commands.
    */
  var afterGroupContaining: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Place this menu item before the menu items representing the given commands. */
  var before: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Place this menu item's group before the containing group of the menu items
    * representing the given commands.
    */
  var beforeGroupContaining: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    *  The command to invoke on the target of the right click that invoked the
    *  context menu.
    */
  var command: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  A function that is called on the item each time a context menu is created
    *  via a right click.
    */
  var created: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /**
    *  Whether the menu item should be clickable. Disabled menu items typically
    *  appear grayed out. Defaults to true.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** The menu item's label. */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  A function that is called to determine whether to display this item on a
    *  given context menu deployment.
    */
  var shouldDisplay: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  /** An array of additional items. */
  var submenu: js.UndefOr[js.Array[ContextMenuOptions]] = js.undefined
  /** Whether the menu item should appear in the menu. Defaults to true. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

