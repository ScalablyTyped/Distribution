package typings.atom

import typings.atom.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFile extends js.Object {
  /** The path to the file to which the message applies. */
  var file: String
  /** The range of the message in the editor. */
  var position: Range
}

object AnonFile {
  @scala.inline
  def apply(file: String, position: Range): AnonFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFile]
  }
}

