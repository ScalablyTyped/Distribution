package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewValueOldValueInvisibles extends js.Object {
  var newValue: atomLib.atomMod.Invisibles
  var oldValue: js.UndefOr[atomLib.atomMod.Invisibles] = js.undefined
}

object Anon_NewValueOldValueInvisibles {
  @scala.inline
  def apply(newValue: atomLib.atomMod.Invisibles, oldValue: atomLib.atomMod.Invisibles = null): Anon_NewValueOldValueInvisibles = {
    val __obj = js.Dynamic.literal(newValue = newValue)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[Anon_NewValueOldValueInvisibles]
  }
}

