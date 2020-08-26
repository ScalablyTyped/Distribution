package typings.antd.headerMod

import typings.antd.generateCalendarMod.CalendarMode
import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarHeaderProps[DateType] extends js.Object {
  var fullscreen: Boolean = js.native
  var generateConfig: GenerateConfig[DateType] = js.native
  var locale: Locale = js.native
  var mode: CalendarMode = js.native
  var prefixCls: String = js.native
  var validRange: js.UndefOr[js.Tuple2[DateType, DateType]] = js.native
  var value: DateType = js.native
  def onChange(date: DateType): Unit = js.native
  def onModeChange(mode: CalendarMode): Unit = js.native
}

object CalendarHeaderProps {
  @scala.inline
  def apply[DateType](
    fullscreen: Boolean,
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    mode: CalendarMode,
    onChange: DateType => Unit,
    onModeChange: CalendarMode => Unit,
    prefixCls: String,
    value: DateType
  ): CalendarHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onModeChange = js.Any.fromFunction1(onModeChange), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarHeaderProps[DateType]]
  }
  @scala.inline
  implicit class CalendarHeaderPropsOps[Self <: CalendarHeaderProps[_], DateType] (val x: Self with CalendarHeaderProps[DateType]) extends AnyVal {
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
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerateConfig(value: GenerateConfig[DateType]): Self = this.set("generateConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: CalendarMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: DateType => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setOnModeChange(value: CalendarMode => Unit): Self = this.set("onModeChange", js.Any.fromFunction1(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: DateType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidRange(value: js.Tuple2[DateType, DateType]): Self = this.set("validRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidRange: Self = this.set("validRange", js.undefined)
  }
  
}

