package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MinuteStep extends js.Object {
  var minuteStep: scala.Double
  var mode: java.lang.String
  var pickerPrefixCls: java.lang.String
  var popupPrefixCls: java.lang.String
  var prefixCls: java.lang.String
  var use12Hours: scala.Boolean
}

object Anon_MinuteStep {
  @scala.inline
  def apply(
    minuteStep: scala.Double,
    mode: java.lang.String,
    pickerPrefixCls: java.lang.String,
    popupPrefixCls: java.lang.String,
    prefixCls: java.lang.String,
    use12Hours: scala.Boolean
  ): Anon_MinuteStep = {
    val __obj = js.Dynamic.literal(minuteStep = minuteStep, mode = mode, pickerPrefixCls = pickerPrefixCls, popupPrefixCls = popupPrefixCls, prefixCls = prefixCls, use12Hours = use12Hours)
  
    __obj.asInstanceOf[Anon_MinuteStep]
  }
}

