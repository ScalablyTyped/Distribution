package typings
package atomDashKeymapLib.atomDashKeymapMod.Global.AtomKeymapNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeymapLoaded extends js.Object {
  /** The path of the keymap file. */
  var path: java.lang.String
}

object KeymapLoaded {
  @scala.inline
  def apply(path: java.lang.String): KeymapLoaded = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[KeymapLoaded]
  }
}

