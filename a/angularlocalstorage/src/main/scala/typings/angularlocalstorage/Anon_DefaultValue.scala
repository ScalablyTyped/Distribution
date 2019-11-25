package typings.angularlocalstorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValue extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var storeName: js.UndefOr[String] = js.undefined
}

object Anon_DefaultValue {
  @scala.inline
  def apply(defaultValue: js.Any = null, storeName: String = null): Anon_DefaultValue = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (storeName != null) __obj.updateDynamic("storeName")(storeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultValue]
  }
}

