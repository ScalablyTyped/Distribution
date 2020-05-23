package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var value: js.UndefOr[String | Double | js.Array[String]] = js.undefined
}

object `0` {
  @scala.inline
  def apply(value: String | Double | js.Array[String] = null): `0` = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

