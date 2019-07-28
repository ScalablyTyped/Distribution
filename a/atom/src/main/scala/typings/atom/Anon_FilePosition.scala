package typings.atom

import typings.atom.atomMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilePosition extends js.Object {
  /** The path to the file being referenced. */
  var file: String
  /** The point being referenced in that file. */
  var position: js.UndefOr[Point] = js.undefined
}

object Anon_FilePosition {
  @scala.inline
  def apply(file: String, position: Point = null): Anon_FilePosition = {
    val __obj = js.Dynamic.literal(file = file)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_FilePosition]
  }
}

