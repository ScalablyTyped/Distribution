package typings.atom.anon

import typings.atom.atomStrings.limited
import typings.atom.atomStrings.no
import typings.atom.atomStrings.undecided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2` extends js.Object {
  var newValue: limited | no | undecided
  var oldValue: js.UndefOr[limited | no | undecided] = js.undefined
}

object `2` {
  @scala.inline
  def apply(newValue: limited | no | undecided, oldValue: limited | no | undecided = null): `2` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
}

