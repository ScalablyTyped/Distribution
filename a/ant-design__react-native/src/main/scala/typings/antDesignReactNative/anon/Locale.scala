package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var disabled: Boolean
  var locale: Day
  var minuteStep: Double
  var mode: String
  var pickerPrefixCls: String
  var prefixCls: String
  var use12Hours: Boolean
  def onDateChange(): Unit
}

object Locale {
  @scala.inline
  def apply(
    disabled: Boolean,
    locale: Day,
    minuteStep: Double,
    mode: String,
    onDateChange: () => Unit,
    pickerPrefixCls: String,
    prefixCls: String,
    use12Hours: Boolean
  ): Locale = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minuteStep = minuteStep.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onDateChange = js.Any.fromFunction0(onDateChange), pickerPrefixCls = pickerPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], use12Hours = use12Hours.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

