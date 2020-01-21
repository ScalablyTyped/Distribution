package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMinuteStep extends js.Object {
  var minuteStep: Double
  var mode: String
  var pickerPrefixCls: String
  var popupPrefixCls: String
  var prefixCls: String
  var use12Hours: Boolean
}

object AnonMinuteStep {
  @scala.inline
  def apply(
    minuteStep: Double,
    mode: String,
    pickerPrefixCls: String,
    popupPrefixCls: String,
    prefixCls: String,
    use12Hours: Boolean
  ): AnonMinuteStep = {
    val __obj = js.Dynamic.literal(minuteStep = minuteStep.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], pickerPrefixCls = pickerPrefixCls.asInstanceOf[js.Any], popupPrefixCls = popupPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], use12Hours = use12Hours.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMinuteStep]
  }
}

