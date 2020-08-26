package typings.antdMobileRn.abstractPickerMod

import typings.antdMobileRn.pickerPropsTypeMod.PickerData
import typings.antdMobileRn.pickerPropsTypeMod.PickerPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractPickerProps extends PickerPropsType {
  var pickerPrefixCls: js.UndefOr[String] = js.native
  var popupPrefixCls: js.UndefOr[String] = js.native
}

object AbstractPickerProps {
  @scala.inline
  def apply(data: js.Array[js.Array[PickerData] | PickerData]): AbstractPickerProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractPickerProps]
  }
  @scala.inline
  implicit class AbstractPickerPropsOps[Self <: AbstractPickerProps] (val x: Self) extends AnyVal {
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
    def setPickerPrefixCls(value: String): Self = this.set("pickerPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickerPrefixCls: Self = this.set("pickerPrefixCls", js.undefined)
    @scala.inline
    def setPopupPrefixCls(value: String): Self = this.set("popupPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupPrefixCls: Self = this.set("popupPrefixCls", js.undefined)
  }
  
}

