package typings.antd.libDateDashPickerInterfaceMod

import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.moment.momentMod.Moment
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthPickerProps
  extends PickerProps
     with SinglePickerProps

object MonthPickerProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    dateRender: (/* current */ Moment, /* today */ Moment) => ReactNode = null,
    defaultPickerValue: Moment = null,
    defaultValue: Moment = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledDate: /* current */ js.UndefOr[Moment] => Boolean = null,
    dropdownClassName: String = null,
    format: String | js.Array[String] = null,
    getCalendarContainer: /* triggerNode */ Element => HTMLElement = null,
    id: Double | String = null,
    inputPrefixCls: String = null,
    locale: js.Any = null,
    name: String = null,
    onChange: (/* date */ Moment, /* dateString */ String) => Unit = null,
    onOpenChange: /* status */ Boolean => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    popupStyle: CSSProperties = null,
    prefixCls: String = null,
    renderExtraFooter: /* mode */ DatePickerMode => ReactNode = null,
    size: large | small | default = null,
    style: CSSProperties = null,
    suffixIcon: ReactNode = null,
    value: Moment = null
  ): MonthPickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (className != null) __obj.updateDynamic("className")(className)
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (getCalendarContainer != null) __obj.updateDynamic("getCalendarContainer")(js.Any.fromFunction1(getCalendarContainer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputPrefixCls != null) __obj.updateDynamic("inputPrefixCls")(inputPrefixCls)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(js.Any.fromFunction1(renderExtraFooter))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MonthPickerProps]
  }
}

