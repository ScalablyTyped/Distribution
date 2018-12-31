package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuOptions extends js.Object {
  /** The command to trigger when the item is clicked. */
  var command: js.UndefOr[java.lang.String] = js.undefined
  /** The menu itme's label. */
  var label: java.lang.String
  /** An array of sub menus. */
  var submenu: js.UndefOr[js.Array[MenuOptions]] = js.undefined
}

