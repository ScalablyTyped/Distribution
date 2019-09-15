package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.antdStrings.AM
import typings.antd.antdStrings.PM
import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.esTimeDashPickerMod.TimePickerLocale
import typings.antd.esTimeDashPickerMod.TimePickerProps
import typings.moment.momentMod.Moment
import typings.react.reactMod.CSSProperties
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, placeholder, open, className, disabled, defaultValue */
object TimePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.antd.esMod.TimePicker] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esMod.TimePicker].asInstanceOf[String | js.Object]
  def apply(
    addon: js.Function = null,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    clearIcon: TagMod[Any] = null,
    clearText: String = null,
    defaultOpenValue: Moment = null,
    disabledHours: () => js.Array[Double] = null,
    disabledMinutes: /* selectedHour */ Double => js.Array[Double] = null,
    disabledSeconds: (/* selectedHour */ Double, /* selectedMinute */ Double) => js.Array[Double] = null,
    focusOnOpen: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    hideDisabledOptions: js.UndefOr[Boolean] = js.undefined,
    hourStep: Int | Double = null,
    inputReadOnly: js.UndefOr[Boolean] = js.undefined,
    locale: TimePickerLocale = null,
    minuteStep: Int | Double = null,
    onAmPmChange: /* ampm */ AM | PM => Unit = null,
    onChange: (/* time */ Moment, /* timeString */ String) => Unit = null,
    onOpenChange: /* open */ Boolean => Unit = null,
    popupClassName: String = null,
    popupStyle: CSSProperties = null,
    prefixCls: String = null,
    secondStep: Int | Double = null,
    size: large | default | small = null,
    suffixIcon: TagMod[Any] = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: Moment = null
  ): BuildingComponent[tag.type, typings.antd.esMod.TimePicker] = {
    val __obj = js.Dynamic.literal()
    if (addon != null) __obj.updateDynamic("addon")(addon)
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon)
    if (clearText != null) __obj.updateDynamic("clearText")(clearText)
    if (defaultOpenValue != null) __obj.updateDynamic("defaultOpenValue")(defaultOpenValue)
    if (disabledHours != null) __obj.updateDynamic("disabledHours")(js.Any.fromFunction0(disabledHours))
    if (disabledMinutes != null) __obj.updateDynamic("disabledMinutes")(js.Any.fromFunction1(disabledMinutes))
    if (disabledSeconds != null) __obj.updateDynamic("disabledSeconds")(js.Any.fromFunction2(disabledSeconds))
    if (!js.isUndefined(focusOnOpen)) __obj.updateDynamic("focusOnOpen")(focusOnOpen)
    if (format != null) __obj.updateDynamic("format")(format)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (!js.isUndefined(hideDisabledOptions)) __obj.updateDynamic("hideDisabledOptions")(hideDisabledOptions)
    if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (!js.isUndefined(inputReadOnly)) __obj.updateDynamic("inputReadOnly")(inputReadOnly)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (onAmPmChange != null) __obj.updateDynamic("onAmPmChange")(js.Any.fromFunction1(onAmPmChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName)
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (secondStep != null) __obj.updateDynamic("secondStep")(secondStep.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon)
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours)
    if (value != null) __obj.updateDynamic("value")(value)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TimePickerProps
}

