package typings.angularLocalforage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultValue extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var key: String
  var name: js.UndefOr[String] = js.undefined
  var scopeKey: js.UndefOr[String] = js.undefined
}

object AnonDefaultValue {
  @scala.inline
  def apply(key: String, defaultValue: js.Any = null, name: String = null, scopeKey: String = null): AnonDefaultValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scopeKey != null) __obj.updateDynamic("scopeKey")(scopeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultValue]
  }
}

