package typings.antdMobileRn.pickerPropsTypeMod

import typings.rmcCascader.cascaderTypesMod.CascaderValue
import typings.rmcPicker.popupPickerTypesMod.IPopupPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerPropsType extends IPopupPickerProps {
  var cascade: js.UndefOr[Boolean] = js.native
  var cols: js.UndefOr[Double] = js.native
  var data: js.Array[js.Array[PickerData] | PickerData] = js.native
  var extra: js.UndefOr[String] = js.native
  var format: js.UndefOr[js.Function1[/* values */ js.Array[String], String]] = js.native
  var indicatorStyle: js.UndefOr[js.Any] = js.native
  var itemStyle: js.UndefOr[js.Any] = js.native
  var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[CascaderValue], Unit]] = js.native
  var onPickerChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.native
  @JSName("value")
  var value_PickerPropsType: js.UndefOr[js.Array[String | Double]] = js.native
}

object PickerPropsType {
  @scala.inline
  def apply(data: js.Array[js.Array[PickerData] | PickerData]): PickerPropsType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerPropsType]
  }
  @scala.inline
  implicit class PickerPropsTypeOps[Self <: PickerPropsType] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: (js.Array[PickerData] | PickerData)*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Array[PickerData] | PickerData]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setCascade(value: Boolean): Self = this.set("cascade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    @scala.inline
    def setExtra(value: String): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setFormat(value: /* values */ js.Array[String] => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setIndicatorStyle(value: js.Any): Self = this.set("indicatorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorStyle: Self = this.set("indicatorStyle", js.undefined)
    @scala.inline
    def setItemStyle(value: js.Any): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setOnChange(value: /* date */ js.UndefOr[CascaderValue] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnPickerChange(value: /* value */ CascaderValue => Unit): Self = this.set("onPickerChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPickerChange: Self = this.set("onPickerChange", js.undefined)
    @scala.inline
    def setValueVarargs(value: (String | Double)*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[String | Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

