package typings.atom.anon

import typings.atom.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /** The path to the file to which the message applies. */
  var file: String
  /** The range of the message in the editor. */
  var position: Range
}

object File {
  @scala.inline
  def apply(file: String, position: Range): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

