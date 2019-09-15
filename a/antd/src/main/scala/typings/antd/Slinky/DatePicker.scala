package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.Anon_DisabledHours
import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.esDateDashPickerInterfaceMod.DatePickerMode
import typings.antd.esDateDashPickerInterfaceMod.DatePickerProps
import typings.antd.esTimeDashPickerMod.TimePickerProps
import typings.moment.momentMod.Moment
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: format, name, style, open, autoFocus, className, disabled, placeholder */
object DatePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.antd.esMod.DatePicker] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esMod.DatePicker].asInstanceOf[String | js.Object]
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    dateRender: (/* current */ Moment, /* today */ Moment) => ReactNode = null,
    defaultPickerValue: Moment = null,
    defaultValue: Moment = null,
    disabledDate: /* current */ js.UndefOr[Moment] => Boolean = null,
    disabledTime: /* current */ js.UndefOr[Moment] => Anon_DisabledHours = null,
    dropdownClassName: String = null,
    getCalendarContainer: /* triggerNode */ typings.std.Element => HTMLElement = null,
    id: Double | String = null,
    inputPrefixCls: String = null,
    locale: js.Any = null,
    mode: DatePickerMode = null,
    onChange: (/* date */ Moment | Null, /* dateString */ String) => Unit = null,
    onOk: /* selectedTime */ Moment => Unit = null,
    onOpenChange: /* status */ Boolean => Unit = null,
    onPanelChange: (/* value */ js.UndefOr[Moment], /* mode */ DatePickerMode) => Unit = null,
    popupStyle: CSSProperties = null,
    prefixCls: String = null,
    renderExtraFooter: /* mode */ DatePickerMode => ReactNode = null,
    showTime: TimePickerProps | Boolean = null,
    showToday: js.UndefOr[Boolean] = js.undefined,
    size: large | small | default = null,
    suffixIcon: ReactNode = null,
    value: Moment = null
  ): BuildingComponent[tag.type, typings.antd.esMod.DatePicker] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction1(disabledTime))
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName)
    if (getCalendarContainer != null) __obj.updateDynamic("getCalendarContainer")(js.Any.fromFunction1(getCalendarContainer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputPrefixCls != null) __obj.updateDynamic("inputPrefixCls")(inputPrefixCls)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2(onPanelChange))
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(js.Any.fromFunction1(renderExtraFooter))
    if (showTime != null) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showToday)) __obj.updateDynamic("showToday")(showToday)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DatePickerProps
}

