package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extra extends js.Object {
  var extra: String
  var minuteStep: Double
  var mode: String
  var pickerPrefixCls: String
  var prefixCls: String
  var use12Hours: Boolean
}

object Anon_Extra {
  @scala.inline
  def apply(
    extra: String,
    minuteStep: Double,
    mode: String,
    pickerPrefixCls: String,
    prefixCls: String,
    use12Hours: Boolean
  ): Anon_Extra = {
    val __obj = js.Dynamic.literal(extra = extra, minuteStep = minuteStep, mode = mode, pickerPrefixCls = pickerPrefixCls, prefixCls = prefixCls, use12Hours = use12Hours)
  
    __obj.asInstanceOf[Anon_Extra]
  }
}

