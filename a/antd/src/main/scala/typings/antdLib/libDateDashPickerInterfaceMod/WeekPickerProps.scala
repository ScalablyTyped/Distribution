package typings
package antdLib.libDateDashPickerInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeekPickerProps
  extends PickerProps
     with SinglePickerProps

object WeekPickerProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[scala.Boolean] = js.undefined,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    dateRender: (/* current */ momentLib.momentMod.Moment, /* today */ momentLib.momentMod.Moment) => reactLib.reactMod.ReactNode = null,
    defaultPickerValue: momentLib.momentMod.Moment = null,
    defaultValue: momentLib.momentMod.Moment = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledDate: /* current */ js.UndefOr[momentLib.momentMod.Moment] => scala.Boolean = null,
    dropdownClassName: java.lang.String = null,
    format: java.lang.String | js.Array[java.lang.String] = null,
    getCalendarContainer: /* triggerNode */ stdLib.Element => stdLib.HTMLElement = null,
    id: scala.Double | java.lang.String = null,
    inputPrefixCls: java.lang.String = null,
    locale: js.Any = null,
    name: java.lang.String = null,
    onChange: (/* date */ momentLib.momentMod.Moment, /* dateString */ java.lang.String) => scala.Unit = null,
    onOpenChange: /* status */ scala.Boolean => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: java.lang.String = null,
    popupStyle: reactLib.reactMod.CSSProperties = null,
    prefixCls: java.lang.String = null,
    renderExtraFooter: /* mode */ DatePickerMode => reactLib.reactMod.ReactNode = null,
    size: antdLib.antdLibStrings.large | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default = null,
    style: reactLib.reactMod.CSSProperties = null,
    suffixIcon: reactLib.reactMod.ReactNode = null,
    value: momentLib.momentMod.Moment = null
  ): WeekPickerProps = {
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
    __obj.asInstanceOf[WeekPickerProps]
  }
}

