package typings
package angularDashLocalforageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValue extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var key: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var scopeKey: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DefaultValue {
  @scala.inline
  def apply(
    key: java.lang.String,
    defaultValue: js.Any = null,
    name: java.lang.String = null,
    scopeKey: java.lang.String = null
  ): Anon_DefaultValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (name != null) __obj.updateDynamic("name")(name)
    if (scopeKey != null) __obj.updateDynamic("scopeKey")(scopeKey)
    __obj.asInstanceOf[Anon_DefaultValue]
  }
}

