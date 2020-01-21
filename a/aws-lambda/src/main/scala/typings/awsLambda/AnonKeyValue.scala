package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyValue extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var value: String
}

object AnonKeyValue {
  @scala.inline
  def apply(value: String, key: String = null): AnonKeyValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyValue]
  }
}

