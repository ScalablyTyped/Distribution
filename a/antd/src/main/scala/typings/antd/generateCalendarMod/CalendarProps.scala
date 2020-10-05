package typings.antd.generateCalendarMod

import typings.antd.anon.OnChange
import typings.antd.generatePickerMod.PickerLocale
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarProps[DateType] extends js.Object {
  var className: js.UndefOr[String] = js.native
  var dateCellRender: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.native
  var dateFullCellRender: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.native
  var defaultValue: js.UndefOr[DateType] = js.native
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
  var fullscreen: js.UndefOr[Boolean] = js.native
  var headerRender: js.UndefOr[HeaderRender[DateType]] = js.native
  var locale: js.UndefOr[PickerLocale] = js.native
  var mode: js.UndefOr[CalendarMode] = js.native
  var monthCellRender: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.native
  var monthFullCellRender: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.native
  var onChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.native
  var onPanelChange: js.UndefOr[js.Function2[/* date */ DateType, /* mode */ CalendarMode, Unit]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var validRange: js.UndefOr[js.Tuple2[DateType, DateType]] = js.native
  var value: js.UndefOr[DateType] = js.native
}

object CalendarProps {
  @scala.inline
  def apply[DateType](): CalendarProps[DateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarProps[DateType]]
  }
  @scala.inline
  implicit class CalendarPropsOps[Self <: CalendarProps[_], DateType] (val x: Self with CalendarProps[DateType]) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDateCellRender(value: /* date */ DateType => ReactNode): Self = this.set("dateCellRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDateCellRender: Self = this.set("dateCellRender", js.undefined)
    @scala.inline
    def setDateFullCellRender(value: /* date */ DateType => ReactNode): Self = this.set("dateFullCellRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDateFullCellRender: Self = this.set("dateFullCellRender", js.undefined)
    @scala.inline
    def setDefaultValue(value: DateType): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabledDate(value: /* date */ DateType => Boolean): Self = this.set("disabledDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisabledDate: Self = this.set("disabledDate", js.undefined)
    @scala.inline
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    @scala.inline
    def setHeaderRender(value: /* config */ OnChange[DateType] => ReactNode): Self = this.set("headerRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderRender: Self = this.set("headerRender", js.undefined)
    @scala.inline
    def setLocale(value: PickerLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMode(value: CalendarMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMonthCellRender(value: /* date */ DateType => ReactNode): Self = this.set("monthCellRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMonthCellRender: Self = this.set("monthCellRender", js.undefined)
    @scala.inline
    def setMonthFullCellRender(value: /* date */ DateType => ReactNode): Self = this.set("monthFullCellRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMonthFullCellRender: Self = this.set("monthFullCellRender", js.undefined)
    @scala.inline
    def setOnChange(value: /* date */ DateType => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnPanelChange(value: (/* date */ DateType, /* mode */ CalendarMode) => Unit): Self = this.set("onPanelChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPanelChange: Self = this.set("onPanelChange", js.undefined)
    @scala.inline
    def setOnSelect(value: /* date */ DateType => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setValidRange(value: js.Tuple2[DateType, DateType]): Self = this.set("validRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidRange: Self = this.set("validRange", js.undefined)
    @scala.inline
    def setValue(value: DateType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

