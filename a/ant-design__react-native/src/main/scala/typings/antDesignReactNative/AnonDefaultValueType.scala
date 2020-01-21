package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultValueType extends js.Object {
  var defaultValue: String
  var `type`: String
}

object AnonDefaultValueType {
  @scala.inline
  def apply(defaultValue: String, `type`: String): AnonDefaultValueType = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultValueType]
  }
}

