package typings.antd.generateCalendarMod

import typings.antd.anon.OnChange
import typings.antd.generatePickerMod.PickerLocale
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps[DateType] extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var dateCellRender: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.undefined
  var dateFullCellRender: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.undefined
  var defaultValue: js.UndefOr[DateType] = js.undefined
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var headerRender: js.UndefOr[HeaderRender[DateType]] = js.undefined
  var locale: js.UndefOr[PickerLocale] = js.undefined
  var mode: js.UndefOr[CalendarMode] = js.undefined
  var monthCellRender: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.undefined
  var monthFullCellRender: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
  var onPanelChange: js.UndefOr[js.Function2[/* date */ DateType, /* mode */ CalendarMode, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var validRange: js.UndefOr[js.Tuple2[DateType, DateType]] = js.undefined
  var value: js.UndefOr[DateType] = js.undefined
}

object CalendarProps {
  @scala.inline
  def apply[DateType](
    className: String = null,
    dateCellRender: /* date */ DateType => ReactNode = null,
    dateFullCellRender: /* date */ DateType => ReactNode = null,
    defaultValue: DateType = null,
    disabledDate: /* date */ DateType => Boolean = null,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    headerRender: /* config */ OnChange[DateType] => ReactNode = null,
    locale: PickerLocale = null,
    mode: CalendarMode = null,
    monthCellRender: /* date */ DateType => ReactNode = null,
    monthFullCellRender: /* date */ DateType => ReactNode = null,
    onChange: /* date */ DateType => Unit = null,
    onPanelChange: (/* date */ DateType, /* mode */ CalendarMode) => Unit = null,
    onSelect: /* date */ DateType => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    validRange: js.Tuple2[DateType, DateType] = null,
    value: DateType = null
  ): CalendarProps[DateType] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dateCellRender != null) __obj.updateDynamic("dateCellRender")(js.Any.fromFunction1(dateCellRender))
    if (dateFullCellRender != null) __obj.updateDynamic("dateFullCellRender")(js.Any.fromFunction1(dateFullCellRender))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.get.asInstanceOf[js.Any])
    if (headerRender != null) __obj.updateDynamic("headerRender")(js.Any.fromFunction1(headerRender))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction1(monthCellRender))
    if (monthFullCellRender != null) __obj.updateDynamic("monthFullCellRender")(js.Any.fromFunction1(monthFullCellRender))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2(onPanelChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (validRange != null) __obj.updateDynamic("validRange")(validRange.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps[DateType]]
  }
}

