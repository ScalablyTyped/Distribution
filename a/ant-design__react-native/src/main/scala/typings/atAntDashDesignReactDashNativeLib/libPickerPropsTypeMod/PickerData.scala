package typings
package atAntDashDesignReactDashNativeLib.libPickerPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerData extends js.Object {
  var children: js.UndefOr[js.Array[PickerData]] = js.undefined
  var label: java.lang.String
  var value: java.lang.String | scala.Double
}

object PickerData {
  @scala.inline
  def apply(
    label: java.lang.String,
    value: java.lang.String | scala.Double,
    children: js.Array[PickerData] = null
  ): PickerData = {
    val __obj = js.Dynamic.literal(label = label, value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[PickerData]
  }
}

