package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `6` extends js.Object {
  var newValue: String | Double
  var oldValue: js.UndefOr[String | Double] = js.undefined
}

object `6` {
  @scala.inline
  def apply(newValue: String | Double, oldValue: String | Double = null): `6` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
}

