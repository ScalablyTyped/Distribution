package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSavedEvent extends js.Object {
  /** The path to which the buffer was saved. */
  var path: String
}

object FileSavedEvent {
  @scala.inline
  def apply(path: String): FileSavedEvent = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSavedEvent]
  }
}

