package typings.atom.anon

import typings.atom.mod.Invisibles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewValueInvisibles extends js.Object {
  var newValue: Invisibles
  var oldValue: js.UndefOr[Invisibles] = js.undefined
}

object NewValueInvisibles {
  @scala.inline
  def apply(newValue: Invisibles, oldValue: Invisibles = null): NewValueInvisibles = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueInvisibles]
  }
}

