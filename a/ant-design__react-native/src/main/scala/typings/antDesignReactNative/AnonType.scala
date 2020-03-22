package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var defaultValue: String
  var `type`: String
}

object AnonType {
  @scala.inline
  def apply(defaultValue: String, `type`: String): AnonType = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

