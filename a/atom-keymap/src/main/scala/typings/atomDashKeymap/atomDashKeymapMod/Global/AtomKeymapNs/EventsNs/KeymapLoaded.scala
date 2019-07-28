package typings.atomDashKeymap.atomDashKeymapMod.Global.AtomKeymapNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeymapLoaded extends js.Object {
  /** The path of the keymap file. */
  var path: String
}

object KeymapLoaded {
  @scala.inline
  def apply(path: String): KeymapLoaded = {
    val __obj = js.Dynamic.literal(path = path)
  
    __obj.asInstanceOf[KeymapLoaded]
  }
}

