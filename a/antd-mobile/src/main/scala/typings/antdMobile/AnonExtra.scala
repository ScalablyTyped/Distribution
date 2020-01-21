package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtra extends js.Object {
  var extra: String
  var minuteStep: Double
  var mode: String
  var pickerPrefixCls: String
  var prefixCls: String
  var use12Hours: Boolean
}

object AnonExtra {
  @scala.inline
  def apply(
    extra: String,
    minuteStep: Double,
    mode: String,
    pickerPrefixCls: String,
    prefixCls: String,
    use12Hours: Boolean
  ): AnonExtra = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], minuteStep = minuteStep.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], pickerPrefixCls = pickerPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], use12Hours = use12Hours.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExtra]
  }
}

