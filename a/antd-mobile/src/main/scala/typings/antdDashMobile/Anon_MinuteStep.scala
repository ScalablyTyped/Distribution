package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MinuteStep extends js.Object {
  var minuteStep: Double
  var mode: String
  var pickerPrefixCls: String
  var popupPrefixCls: String
  var prefixCls: String
  var use12Hours: Boolean
}

object Anon_MinuteStep {
  @scala.inline
  def apply(
    minuteStep: Double,
    mode: String,
    pickerPrefixCls: String,
    popupPrefixCls: String,
    prefixCls: String,
    use12Hours: Boolean
  ): Anon_MinuteStep = {
    val __obj = js.Dynamic.literal(minuteStep = minuteStep, mode = mode, pickerPrefixCls = pickerPrefixCls, popupPrefixCls = popupPrefixCls, prefixCls = prefixCls, use12Hours = use12Hours)
  
    __obj.asInstanceOf[Anon_MinuteStep]
  }
}

