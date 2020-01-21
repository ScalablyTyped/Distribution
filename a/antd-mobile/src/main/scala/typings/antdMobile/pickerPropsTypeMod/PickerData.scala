package typings.antdMobile.pickerPropsTypeMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerData extends js.Object {
  var children: js.UndefOr[js.Array[PickerData]] = js.undefined
  var label: ReactNode
  var value: String | Double
}

object PickerData {
  @scala.inline
  def apply(value: String | Double, children: js.Array[PickerData] = null, label: ReactNode = null): PickerData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerData]
  }
}

