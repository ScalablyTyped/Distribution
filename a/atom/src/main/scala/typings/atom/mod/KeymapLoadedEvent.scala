package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeymapLoadedEvent extends js.Object {
  /** The path of the keymap file. */
  var path: String
}

object KeymapLoadedEvent {
  @scala.inline
  def apply(path: String): KeymapLoadedEvent = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeymapLoadedEvent]
  }
}

