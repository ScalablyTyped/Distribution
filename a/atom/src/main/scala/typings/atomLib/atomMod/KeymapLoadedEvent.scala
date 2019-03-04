package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeymapLoadedEvent extends js.Object {
  /** The path of the keymap file. */
  var path: java.lang.String
}

object KeymapLoadedEvent {
  @scala.inline
  def apply(path: java.lang.String): KeymapLoadedEvent = {
    val __obj = js.Dynamic.literal(path = path)
  
    __obj.asInstanceOf[KeymapLoadedEvent]
  }
}

