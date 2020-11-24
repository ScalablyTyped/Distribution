package typings.antd.generateCalendarMod

import typings.antd.antdStrings.large
import typings.antd.antdStrings.ltr
import typings.antd.antdStrings.rtl
import typings.antd.antdStrings.small
import typings.antd.antdStrings.time
import typings.antd.generatePickerMod.PickerLocale
import typings.rcPicker.dateBodyMod.DateRender
import typings.rcPicker.interfaceMod.Components
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.OnPanelChange
import typings.rcPicker.interfaceMod.PanelMode
import typings.rcPicker.monthBodyMod.MonthCellRender
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/lib/calendar/generateCalendar.InjectDefaultProps<rc-picker.rc-picker/es/PickerPanel.PickerPanelTimeProps<DateType>> */
@js.native
trait PickerPanelTimeProps[DateType] extends PickerProps[DateType] {
  
  var className: js.UndefOr[String] = js.native
  
  var components: js.UndefOr[Components] = js.native
  
  var dateRender: js.UndefOr[DateRender[DateType]] = js.native
  
  var defaultPickerValue: js.UndefOr[DateType] = js.native
  
  var defaultValue: js.UndefOr[DateType] = js.native
  
  var direction: js.UndefOr[ltr | rtl] = js.native
  
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
  
  var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.native
  
  var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.native
  
  var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var hideDisabledOptions: js.UndefOr[Boolean] = js.native
  
  var hideHeader: js.UndefOr[Boolean] = js.native
  
  var hourStep: js.UndefOr[Double] = js.native
  
  var locale: js.UndefOr[PickerLocale] = js.native
  
  var minuteStep: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[PanelMode] = js.native
  
  var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.native
  
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onOk: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.native
  
  var onPanelChange: js.UndefOr[OnPanelChange[DateType]] = js.native
  
  var onPickerValueChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.native
  
  var onSelect: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.native
  
  var picker: time = js.native
  
  var pickerValue: js.UndefOr[DateType] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, ReactNode]] = js.native
  
  var secondStep: js.UndefOr[Double] = js.native
  
  var showHour: js.UndefOr[Boolean] = js.native
  
  var showMinute: js.UndefOr[Boolean] = js.native
  
  var showNow: js.UndefOr[Boolean] = js.native
  
  var showSecond: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[large | typings.antd.antdStrings.default | small] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var use12Hours: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[DateType | Null] = js.native
}
object PickerPanelTimeProps {
  
  @scala.inline
  def apply[DateType](picker: time): PickerPanelTimeProps[DateType] = {
    val __obj = js.Dynamic.literal(picker = picker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerPanelTimeProps[DateType]]
  }
  
  @scala.inline
  implicit class PickerPanelTimePropsOps[Self <: PickerPanelTimeProps[_], DateType] (val x: Self with PickerPanelTimeProps[DateType]) extends AnyVal {
    
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
    def setPicker(value: time): Self = this.set("picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setComponents(value: Components): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setDateRender(value: (DateType, DateType) => ReactNode): Self = this.set("dateRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDateRender: Self = this.set("dateRender", js.undefined)
    
    @scala.inline
    def setDefaultPickerValue(value: DateType): Self = this.set("defaultPickerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPickerValue: Self = this.set("defaultPickerValue", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: DateType): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisabledDate(value: /* date */ DateType => Boolean): Self = this.set("disabledDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDisabledDate: Self = this.set("disabledDate", js.undefined)
    
    @scala.inline
    def setDisabledHours(value: () => js.Array[Double]): Self = this.set("disabledHours", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisabledHours: Self = this.set("disabledHours", js.undefined)
    
    @scala.inline
    def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = this.set("disabledMinutes", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDisabledMinutes: Self = this.set("disabledMinutes", js.undefined)
    
    @scala.inline
    def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = this.set("disabledSeconds", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDisabledSeconds: Self = this.set("disabledSeconds", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHideDisabledOptions(value: Boolean): Self = this.set("hideDisabledOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideDisabledOptions: Self = this.set("hideDisabledOptions", js.undefined)
    
    @scala.inline
    def setHideHeader(value: Boolean): Self = this.set("hideHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideHeader: Self = this.set("hideHeader", js.undefined)
    
    @scala.inline
    def setHourStep(value: Double): Self = this.set("hourStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourStep: Self = this.set("hourStep", js.undefined)
    
    @scala.inline
    def setLocale(value: PickerLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMinuteStep(value: Double): Self = this.set("minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteStep: Self = this.set("minuteStep", js.undefined)
    
    @scala.inline
    def setMode(value: PanelMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMonthCellRender(value: (DateType, /* locale */ Locale) => ReactNode): Self = this.set("monthCellRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMonthCellRender: Self = this.set("monthCellRender", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ DateType => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnOk(value: /* date */ DateType => Unit): Self = this.set("onOk", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOk: Self = this.set("onOk", js.undefined)
    
    @scala.inline
    def setOnPanelChange(value: (DateType, /* mode */ PanelMode) => Unit): Self = this.set("onPanelChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPanelChange: Self = this.set("onPanelChange", js.undefined)
    
    @scala.inline
    def setOnPickerValueChange(value: /* date */ DateType => Unit): Self = this.set("onPickerValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPickerValueChange: Self = this.set("onPickerValueChange", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* value */ DateType => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setPickerValue(value: DateType): Self = this.set("pickerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerValue: Self = this.set("pickerValue", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRenderExtraFooter(value: /* mode */ PanelMode => ReactNode): Self = this.set("renderExtraFooter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderExtraFooter: Self = this.set("renderExtraFooter", js.undefined)
    
    @scala.inline
    def setSecondStep(value: Double): Self = this.set("secondStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondStep: Self = this.set("secondStep", js.undefined)
    
    @scala.inline
    def setShowHour(value: Boolean): Self = this.set("showHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHour: Self = this.set("showHour", js.undefined)
    
    @scala.inline
    def setShowMinute(value: Boolean): Self = this.set("showMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMinute: Self = this.set("showMinute", js.undefined)
    
    @scala.inline
    def setShowNow(value: Boolean): Self = this.set("showNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNow: Self = this.set("showNow", js.undefined)
    
    @scala.inline
    def setShowSecond(value: Boolean): Self = this.set("showSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSecond: Self = this.set("showSecond", js.undefined)
    
    @scala.inline
    def setSize(value: large | typings.antd.antdStrings.default | small): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setUse12Hours(value: Boolean): Self = this.set("use12Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse12Hours: Self = this.set("use12Hours", js.undefined)
    
    @scala.inline
    def setValue(value: DateType): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
