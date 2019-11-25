package typings.atom.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuOptions extends js.Object {
  /** The command to trigger when the item is clicked. */
  var command: js.UndefOr[String] = js.undefined
  /** The menu itme's label. */
  var label: String
  /** An array of sub menus. */
  var submenu: js.UndefOr[js.Array[MenuOptions]] = js.undefined
}

object MenuOptions {
  @scala.inline
  def apply(label: String, command: String = null, submenu: js.Array[MenuOptions] = null): MenuOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (submenu != null) __obj.updateDynamic("submenu")(submenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuOptions]
  }
}

