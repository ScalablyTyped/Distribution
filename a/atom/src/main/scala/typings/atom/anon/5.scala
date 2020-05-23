package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `5` extends js.Object {
  var newValue: String | Null
  var oldValue: js.UndefOr[String | Null] = js.undefined
}

object `5` {
  @scala.inline
  def apply(newValue: String = null, oldValue: js.UndefOr[Null | String] = js.undefined): `5` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (!js.isUndefined(oldValue)) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
}

