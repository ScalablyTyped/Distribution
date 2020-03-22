package typings.antd.headerMod

import typings.antd.generateCalendarMod.CalendarMode
import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarHeaderProps[DateType] extends js.Object {
  var fullscreen: Boolean
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  var mode: CalendarMode
  var prefixCls: String
  var validRange: js.UndefOr[js.Tuple2[DateType, DateType]] = js.undefined
  var value: DateType
  def onChange(date: DateType): Unit
  def onModeChange(mode: CalendarMode): Unit
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
    value: DateType,
    validRange: js.Tuple2[DateType, DateType] = null
  ): CalendarHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onModeChange = js.Any.fromFunction1(onModeChange), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (validRange != null) __obj.updateDynamic("validRange")(validRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarHeaderProps[DateType]]
  }
}

