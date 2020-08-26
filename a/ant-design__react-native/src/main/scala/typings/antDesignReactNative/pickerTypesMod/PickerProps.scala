package typings.antDesignReactNative.pickerTypesMod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerProps extends js.Object {
  var defaultSelectedValue: js.UndefOr[js.Any] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var indicatorClassName: js.UndefOr[String] = js.native
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var noAnimate: js.UndefOr[Boolean] = js.native
  var onScrollChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  var onValueChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  var selectedValue: js.UndefOr[js.Any] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object PickerProps {
  @scala.inline
  def apply(): PickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerProps]
  }
  @scala.inline
  implicit class PickerPropsOps[Self <: PickerProps] (val x: Self) extends AnyVal {
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
    def setDefaultSelectedValue(value: js.Any): Self = this.set("defaultSelectedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSelectedValue: Self = this.set("defaultSelectedValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIndicatorClassName(value: String): Self = this.set("indicatorClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorClassName: Self = this.set("indicatorClassName", js.undefined)
    @scala.inline
    def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = this.set("indicatorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorStyle: Self = this.set("indicatorStyle", js.undefined)
    @scala.inline
    def setIndicatorStyleNull: Self = this.set("indicatorStyle", null)
    @scala.inline
    def setItemStyle(value: StyleProp[ViewStyle]): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setItemStyleNull: Self = this.set("itemStyle", null)
    @scala.inline
    def setNoAnimate(value: Boolean): Self = this.set("noAnimate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoAnimate: Self = this.set("noAnimate", js.undefined)
    @scala.inline
    def setOnScrollChange(value: /* value */ js.Any => Unit): Self = this.set("onScrollChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScrollChange: Self = this.set("onScrollChange", js.undefined)
    @scala.inline
    def setOnValueChange(value: /* value */ js.Any => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    @scala.inline
    def setSelectedValue(value: js.Any): Self = this.set("selectedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedValue: Self = this.set("selectedValue", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

