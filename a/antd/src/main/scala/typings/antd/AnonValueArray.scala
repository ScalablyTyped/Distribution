package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueArray extends js.Object {
  var value: js.UndefOr[String | Double | js.Array[String]] = js.undefined
}

object AnonValueArray {
  @scala.inline
  def apply(value: String | Double | js.Array[String] = null): AnonValueArray = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValueArray]
  }
}

