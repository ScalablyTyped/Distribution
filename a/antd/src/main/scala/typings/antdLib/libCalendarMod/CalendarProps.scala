package typings
package antdLib.libCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dateCellRender: js.UndefOr[
    js.Function1[
      /* date */ momentLib.momentMod.momentNs.Moment, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var dateFullCellRender: js.UndefOr[
    js.Function1[
      /* date */ momentLib.momentMod.momentNs.Moment, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var defaultValue: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var disabledDate: js.UndefOr[js.Function1[/* current */ momentLib.momentMod.momentNs.Moment, scala.Boolean]] = js.undefined
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[js.Any] = js.undefined
  var mode: js.UndefOr[CalendarMode] = js.undefined
  var monthCellRender: js.UndefOr[
    js.Function1[
      /* date */ momentLib.momentMod.momentNs.Moment, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var monthFullCellRender: js.UndefOr[
    js.Function1[
      /* date */ momentLib.momentMod.momentNs.Moment, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[/* date */ js.UndefOr[momentLib.momentMod.momentNs.Moment], scala.Unit]
  ] = js.undefined
  var onPanelChange: js.UndefOr[
    js.Function2[
      /* date */ js.UndefOr[momentLib.momentMod.momentNs.Moment], 
      /* mode */ js.UndefOr[CalendarMode], 
      scala.Unit
    ]
  ] = js.undefined
  var onSelect: js.UndefOr[
    js.Function1[/* date */ js.UndefOr[momentLib.momentMod.momentNs.Moment], scala.Unit]
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var validRange: js.UndefOr[
    js.Tuple2[momentLib.momentMod.momentNs.Moment, momentLib.momentMod.momentNs.Moment]
  ] = js.undefined
  var value: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
}

object CalendarProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    dateCellRender: /* date */ momentLib.momentMod.momentNs.Moment => reactLib.reactMod.ReactNs.ReactNode = null,
    dateFullCellRender: /* date */ momentLib.momentMod.momentNs.Moment => reactLib.reactMod.ReactNs.ReactNode = null,
    defaultValue: momentLib.momentMod.momentNs.Moment = null,
    disabledDate: /* current */ momentLib.momentMod.momentNs.Moment => scala.Boolean = null,
    fullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    locale: js.Any = null,
    mode: CalendarMode = null,
    monthCellRender: /* date */ momentLib.momentMod.momentNs.Moment => reactLib.reactMod.ReactNs.ReactNode = null,
    monthFullCellRender: /* date */ momentLib.momentMod.momentNs.Moment => reactLib.reactMod.ReactNs.ReactNode = null,
    onChange: /* date */ js.UndefOr[momentLib.momentMod.momentNs.Moment] => scala.Unit = null,
    onPanelChange: (/* date */ js.UndefOr[momentLib.momentMod.momentNs.Moment], /* mode */ js.UndefOr[CalendarMode]) => scala.Unit = null,
    onSelect: /* date */ js.UndefOr[momentLib.momentMod.momentNs.Moment] => scala.Unit = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    validRange: js.Tuple2[momentLib.momentMod.momentNs.Moment, momentLib.momentMod.momentNs.Moment] = null,
    value: momentLib.momentMod.momentNs.Moment = null
  ): CalendarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (dateCellRender != null) __obj.updateDynamic("dateCellRender")(js.Any.fromFunction1(dateCellRender))
    if (dateFullCellRender != null) __obj.updateDynamic("dateFullCellRender")(js.Any.fromFunction1(dateFullCellRender))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction1(monthCellRender))
    if (monthFullCellRender != null) __obj.updateDynamic("monthFullCellRender")(js.Any.fromFunction1(monthFullCellRender))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2(onPanelChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (validRange != null) __obj.updateDynamic("validRange")(validRange)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CalendarProps]
  }
}

