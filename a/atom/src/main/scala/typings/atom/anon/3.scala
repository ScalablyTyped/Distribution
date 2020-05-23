package typings.atom.anon

import typings.atom.atomStrings.atom
import typings.atom.atomStrings.experimental
import typings.atom.atomStrings.native
import typings.atom.atomStrings.poll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `3` extends js.Object {
  var newValue: native | experimental | poll | atom
  var oldValue: js.UndefOr[native | experimental | poll | atom] = js.undefined
}

object `3` {
  @scala.inline
  def apply(
    newValue: native | experimental | poll | atom,
    oldValue: native | experimental | poll | atom = null
  ): `3` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
}

