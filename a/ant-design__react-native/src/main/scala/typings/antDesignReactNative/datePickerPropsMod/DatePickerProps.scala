package typings.antDesignReactNative.datePickerPropsMod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePickerProps extends js.Object {
  var date: js.UndefOr[js.Any] = js.native
  var defaultDate: js.UndefOr[js.Any] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var formatDay: js.UndefOr[js.Function2[/* day */ Double, /* date */ js.UndefOr[js.Any], _]] = js.native
  var formatMonth: js.UndefOr[js.Function2[/* month */ Double, /* date */ js.UndefOr[js.Any], _]] = js.native
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var locale: js.UndefOr[js.Any] = js.native
  var maxDate: js.UndefOr[js.Any] = js.native
  var minDate: js.UndefOr[js.Any] = js.native
  var minuteStep: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[String] = js.native
  var onDateChange: js.UndefOr[js.Function1[/* date */ js.Any, Unit]] = js.native
  var onScrollChange: js.UndefOr[js.Function3[/* date */ js.Any, /* vals */ js.Any, /* index */ Double, Unit]] = js.native
  var onValueChange: js.UndefOr[js.Function2[/* vals */ js.Any, /* index */ Double, Unit]] = js.native
  var rootNativeProps: js.UndefOr[js.Object] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var use12Hours: js.UndefOr[Boolean] = js.native
}

object DatePickerProps {
  @scala.inline
  def apply(): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerProps]
  }
  @scala.inline
  implicit class DatePickerPropsOps[Self <: DatePickerProps] (val x: Self) extends AnyVal {
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
    def setDate(value: js.Any): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDefaultDate(value: js.Any): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFormatDay(value: (/* day */ Double, /* date */ js.UndefOr[js.Any]) => _): Self = this.set("formatDay", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormatDay: Self = this.set("formatDay", js.undefined)
    @scala.inline
    def setFormatMonth(value: (/* month */ Double, /* date */ js.UndefOr[js.Any]) => _): Self = this.set("formatMonth", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormatMonth: Self = this.set("formatMonth", js.undefined)
    @scala.inline
    def setItemStyle(value: StyleProp[ViewStyle]): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setItemStyleNull: Self = this.set("itemStyle", null)
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxDate(value: js.Any): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: js.Any): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setMinuteStep(value: Double): Self = this.set("minuteStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteStep: Self = this.set("minuteStep", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnDateChange(value: /* date */ js.Any => Unit): Self = this.set("onDateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDateChange: Self = this.set("onDateChange", js.undefined)
    @scala.inline
    def setOnScrollChange(value: (/* date */ js.Any, /* vals */ js.Any, /* index */ Double) => Unit): Self = this.set("onScrollChange", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnScrollChange: Self = this.set("onScrollChange", js.undefined)
    @scala.inline
    def setOnValueChange(value: (/* vals */ js.Any, /* index */ Double) => Unit): Self = this.set("onValueChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
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
    def setUse12Hours(value: Boolean): Self = this.set("use12Hours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse12Hours: Self = this.set("use12Hours", js.undefined)
  }
  
}

