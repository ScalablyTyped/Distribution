package typings.atom

import typings.atom.atomStrings.default
import typings.atom.atomStrings.srgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  var newValue: default | srgb
  var oldValue: js.UndefOr[default | srgb] = js.undefined
}

object AnonDefault {
  @scala.inline
  def apply(newValue: default | srgb, oldValue: default | srgb = null): AnonDefault = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefault]
  }
}

