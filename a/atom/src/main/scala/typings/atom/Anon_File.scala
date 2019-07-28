package typings.atom

import typings.atom.atomMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  /** The path to the file to which the message applies. */
  var file: String
  /** The range of the message in the editor. */
  var position: Range
}

object Anon_File {
  @scala.inline
  def apply(file: String, position: Range): Anon_File = {
    val __obj = js.Dynamic.literal(file = file, position = position)
  
    __obj.asInstanceOf[Anon_File]
  }
}

