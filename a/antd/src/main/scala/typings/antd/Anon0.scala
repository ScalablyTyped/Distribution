package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var value: js.UndefOr[String | Double | js.Array[String]] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply(value: String | Double | js.Array[String] = null): Anon0 = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

