package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSavedEvent extends js.Object {
  /** The path to which the buffer was saved. */
  var path: java.lang.String
}

object FileSavedEvent {
  @scala.inline
  def apply(path: java.lang.String): FileSavedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[FileSavedEvent]
  }
}

