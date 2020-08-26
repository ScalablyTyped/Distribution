package typings.antDesignReactNative.cascaderTypesMod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CascaderProps extends js.Object {
  var cols: js.UndefOr[Double] = js.native
  var data: js.Array[CascaderDataItem] = js.native
  var defaultValue: js.UndefOr[CascaderValue] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.native
  var onScrollChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.native
  var pickerItemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var rootNativeProps: js.UndefOr[js.Object] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var value: js.UndefOr[CascaderValue] = js.native
}

object CascaderProps {
  @scala.inline
  def apply(data: js.Array[CascaderDataItem]): CascaderProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderProps]
  }
  @scala.inline
  implicit class CascaderPropsOps[Self <: CascaderProps] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: CascaderDataItem*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[CascaderDataItem]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: CascaderOneValue*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: CascaderValue): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = this.set("indicatorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorStyle: Self = this.set("indicatorStyle", js.undefined)
    @scala.inline
    def setIndicatorStyleNull: Self = this.set("indicatorStyle", null)
    @scala.inline
    def setOnChange(value: /* value */ CascaderValue => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnScrollChange(value: /* value */ CascaderValue => Unit): Self = this.set("onScrollChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScrollChange: Self = this.set("onScrollChange", js.undefined)
    @scala.inline
    def setPickerItemStyle(value: StyleProp[ViewStyle]): Self = this.set("pickerItemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickerItemStyle: Self = this.set("pickerItemStyle", js.undefined)
    @scala.inline
    def setPickerItemStyleNull: Self = this.set("pickerItemStyle", null)
    @scala.inline
    def setRootNativeProps(value: js.Object): Self = this.set("rootNativeProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootNativeProps: Self = this.set("rootNativeProps", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setValueVarargs(value: CascaderOneValue*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: CascaderValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

