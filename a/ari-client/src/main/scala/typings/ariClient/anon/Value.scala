package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var value: js.UndefOr[String] = js.undefined
  var variable: String
}

object Value {
  @scala.inline
  def apply(variable: String, value: String = null): Value = {
    val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

