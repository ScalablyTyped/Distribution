package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinuteStep extends js.Object {
  var minuteStep: Double
  var mode: String
  var pickerPrefixCls: String
  var popupPrefixCls: String
  var prefixCls: String
  var use12Hours: Boolean
}

object MinuteStep {
  @scala.inline
  def apply(
    minuteStep: Double,
    mode: String,
    pickerPrefixCls: String,
    popupPrefixCls: String,
    prefixCls: String,
    use12Hours: Boolean
  ): MinuteStep = {
    val __obj = js.Dynamic.literal(minuteStep = minuteStep.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], pickerPrefixCls = pickerPrefixCls.asInstanceOf[js.Any], popupPrefixCls = popupPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], use12Hours = use12Hours.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinuteStep]
  }
}

