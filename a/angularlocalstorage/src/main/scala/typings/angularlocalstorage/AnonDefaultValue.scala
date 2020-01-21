package typings.angularlocalstorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultValue extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var storeName: js.UndefOr[String] = js.undefined
}

object AnonDefaultValue {
  @scala.inline
  def apply(defaultValue: js.Any = null, storeName: String = null): AnonDefaultValue = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (storeName != null) __obj.updateDynamic("storeName")(storeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultValue]
  }
}

