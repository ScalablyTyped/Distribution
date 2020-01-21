package typings.antd.interfaceMod

import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.moment.mod.Moment
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerProps extends js.Object {
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dateRender: js.UndefOr[js.Function2[/* current */ Moment, /* today */ Moment, ReactNode]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledDate: js.UndefOr[js.Function1[/* current */ Moment | Null, Boolean]] = js.undefined
  var dropdownClassName: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String | js.Array[String]] = js.undefined
  var getCalendarContainer: js.UndefOr[js.Function1[/* triggerNode */ Element, HTMLElement]] = js.undefined
  var id: js.UndefOr[Double | String] = js.undefined
  var inputPrefixCls: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event_], Unit]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[Element]] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* status */ Boolean, Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var pickerClass: js.UndefOr[String] = js.undefined
  var pickerInputClass: js.UndefOr[String] = js.undefined
  var popupStyle: js.UndefOr[CSSProperties] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[large | small | default] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suffixIcon: js.UndefOr[ReactNode] = js.undefined
}

object PickerProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    dateRender: (/* current */ Moment, /* today */ Moment) => ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledDate: /* current */ Moment | Null => Boolean = null,
    dropdownClassName: String = null,
    format: String | js.Array[String] = null,
    getCalendarContainer: /* triggerNode */ Element => HTMLElement = null,
    id: Double | String = null,
    inputPrefixCls: String = null,
    locale: js.Any = null,
    name: String = null,
    onBlur: /* e */ SyntheticEvent[Element, Event_] => Unit = null,
    onFocus: FocusEvent[Element] => Unit = null,
    onOpenChange: /* status */ Boolean => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    pickerClass: String = null,
    pickerInputClass: String = null,
    popupStyle: CSSProperties = null,
    prefixCls: String = null,
    size: large | small | default = null,
    style: CSSProperties = null,
    suffixIcon: ReactNode = null
  ): PickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (getCalendarContainer != null) __obj.updateDynamic("getCalendarContainer")(js.Any.fromFunction1(getCalendarContainer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputPrefixCls != null) __obj.updateDynamic("inputPrefixCls")(inputPrefixCls.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (pickerClass != null) __obj.updateDynamic("pickerClass")(pickerClass.asInstanceOf[js.Any])
    if (pickerInputClass != null) __obj.updateDynamic("pickerInputClass")(pickerInputClass.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps]
  }
}

