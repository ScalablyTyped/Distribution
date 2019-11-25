package typings.antdDashMobileDashRn.libPickerPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerData extends js.Object {
  var children: js.UndefOr[js.Array[PickerData]] = js.undefined
  var label: String
  var value: String | Double
}

object PickerData {
  @scala.inline
  def apply(label: String, value: String | Double, children: js.Array[PickerData] = null): PickerData = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerData]
  }
}

