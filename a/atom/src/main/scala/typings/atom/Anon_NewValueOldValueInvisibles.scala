package typings.atom

import typings.atom.atomMod.Invisibles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewValueOldValueInvisibles extends js.Object {
  var newValue: Invisibles
  var oldValue: js.UndefOr[Invisibles] = js.undefined
}

object Anon_NewValueOldValueInvisibles {
  @scala.inline
  def apply(newValue: Invisibles, oldValue: Invisibles = null): Anon_NewValueOldValueInvisibles = {
    val __obj = js.Dynamic.literal(newValue = newValue)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    __obj.asInstanceOf[Anon_NewValueOldValueInvisibles]
  }
}

