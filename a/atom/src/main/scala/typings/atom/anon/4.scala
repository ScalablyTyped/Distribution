package typings.atom.anon

import typings.atom.atomStrings.default
import typings.atom.atomStrings.srgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `4` extends js.Object {
  var newValue: default | srgb
  var oldValue: js.UndefOr[default | srgb] = js.undefined
}

object `4` {
  @scala.inline
  def apply(newValue: default | srgb, oldValue: default | srgb = null): `4` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
}

