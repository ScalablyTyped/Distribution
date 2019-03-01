package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilePosition extends js.Object {
  /** The path to the file being referenced. */
  var file: java.lang.String
  /** The point being referenced in that file. */
  var position: js.UndefOr[atomLib.atomMod.Point] = js.undefined
}

object Anon_FilePosition {
  @scala.inline
  def apply(file: java.lang.String, position: atomLib.atomMod.Point = null): Anon_FilePosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_FilePosition]
  }
}

