package typings.angularlocalstorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultValue extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var storeName: js.UndefOr[String] = js.undefined
}

object DefaultValue {
  @scala.inline
  def apply(defaultValue: js.Any = null, storeName: String = null): DefaultValue = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (storeName != null) __obj.updateDynamic("storeName")(storeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
}

