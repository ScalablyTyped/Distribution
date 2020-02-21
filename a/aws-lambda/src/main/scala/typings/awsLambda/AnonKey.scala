package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var value: String
}

object AnonKey {
  @scala.inline
  def apply(value: String, key: String = null): AnonKey = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

