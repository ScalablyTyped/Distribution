package typings
package angularlocalstorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValue extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var storeName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DefaultValue {
  @scala.inline
  def apply(defaultValue: js.Any = null, storeName: java.lang.String = null): Anon_DefaultValue = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (storeName != null) __obj.updateDynamic("storeName")(storeName)
    __obj.asInstanceOf[Anon_DefaultValue]
  }
}

