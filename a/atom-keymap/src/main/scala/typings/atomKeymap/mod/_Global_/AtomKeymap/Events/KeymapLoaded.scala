package typings.atomKeymap.mod._Global_.AtomKeymap.Events

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
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeymapLoaded]
  }
}

