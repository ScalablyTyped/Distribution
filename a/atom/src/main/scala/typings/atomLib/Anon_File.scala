package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  /** The path to the file to which the message applies. */
  var file: java.lang.String
  /** The range of the message in the editor. */
  var position: atomLib.atomMod.Range
}

object Anon_File {
  @scala.inline
  def apply(file: java.lang.String, position: atomLib.atomMod.Range): Anon_File = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_File]
  }
}

