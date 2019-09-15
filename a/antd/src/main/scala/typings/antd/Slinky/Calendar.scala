package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esCalendarHeaderMod.RenderHeader
import typings.antd.esCalendarMod.CalendarMode
import typings.antd.esCalendarMod.CalendarProps
import typings.antd.esCalendarMod.default
import typings.moment.momentMod.Moment
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Calendar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esCalendarMod.default].asInstanceOf[String | js.Object]
  def apply(
    dateCellRender: /* date */ Moment => TagMod[Any] = null,
    dateFullCellRender: /* date */ Moment => TagMod[Any] = null,
    defaultValue: Moment = null,
    disabledDate: /* current */ Moment => Boolean = null,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    headerRender: /* headerRender */ RenderHeader => ReactNode = null,
    locale: js.Any = null,
    mode: CalendarMode = null,
    monthCellRender: /* date */ Moment => TagMod[Any] = null,
    monthFullCellRender: /* date */ Moment => TagMod[Any] = null,
    onChange: /* date */ js.UndefOr[Moment] => Unit = null,
    onPanelChange: (/* date */ js.UndefOr[Moment], /* mode */ js.UndefOr[CalendarMode]) => Unit = null,
    onSelect: /* date */ js.UndefOr[Moment] => Unit = null,
    prefixCls: String = null,
    validRange: js.Tuple2[Moment, Moment] = null,
    value: Moment = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (dateCellRender != null) __obj.updateDynamic("dateCellRender")(js.Any.fromFunction1(dateCellRender))
    if (dateFullCellRender != null) __obj.updateDynamic("dateFullCellRender")(js.Any.fromFunction1(dateFullCellRender))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (headerRender != null) __obj.updateDynamic("headerRender")(js.Any.fromFunction1(headerRender))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction1(monthCellRender))
    if (monthFullCellRender != null) __obj.updateDynamic("monthFullCellRender")(js.Any.fromFunction1(monthFullCellRender))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2(onPanelChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (validRange != null) __obj.updateDynamic("validRange")(validRange)
    if (value != null) __obj.updateDynamic("value")(value)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CalendarProps
}

