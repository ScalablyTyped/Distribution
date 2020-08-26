package typings.antdMobileRn.pickerIndexNativeMod

import typings.antdMobileRn.pickerPropsTypeMod.PickerData
import typings.antdMobileRn.pickerPropsTypeMod.PickerPropsType
import typings.antdMobileRn.pickerStyleIndexNativeMod.IPickerStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerNativeProps extends PickerPropsType {
  @JSName("styles")
  var styles_PickerNativeProps: js.UndefOr[IPickerStyle] = js.native
}

object PickerNativeProps {
  @scala.inline
  def apply(data: js.Array[js.Array[PickerData] | PickerData]): PickerNativeProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerNativeProps]
  }
  @scala.inline
  implicit class PickerNativePropsOps[Self <: PickerNativeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStyles(value: IPickerStyle): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

