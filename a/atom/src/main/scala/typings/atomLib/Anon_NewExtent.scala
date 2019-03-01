package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewExtent extends js.Object {
  /** A Point representing the replacement extent. */
  var newExtent: atomLib.atomMod.Point
  /** A String representing the replacement text. */
  var newText: java.lang.String
  /** A Point representing the replaced extent. */
  var oldExtent: atomLib.atomMod.Point
  /** A Point representing where the change started. */
  var start: atomLib.atomMod.Point
}

object Anon_NewExtent {
  @scala.inline
  def apply(
    newExtent: atomLib.atomMod.Point,
    newText: java.lang.String,
    oldExtent: atomLib.atomMod.Point,
    start: atomLib.atomMod.Point
  ): Anon_NewExtent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newExtent")(newExtent)
    __obj.updateDynamic("newText")(newText)
    __obj.updateDynamic("oldExtent")(oldExtent)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_NewExtent]
  }
}

