package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extra extends js.Object {
  var extra: java.lang.String
  var minuteStep: scala.Double
  var mode: java.lang.String
  var pickerPrefixCls: java.lang.String
  var prefixCls: java.lang.String
  var use12Hours: scala.Boolean
}

object Anon_Extra {
  @scala.inline
  def apply(
    extra: java.lang.String,
    minuteStep: scala.Double,
    mode: java.lang.String,
    pickerPrefixCls: java.lang.String,
    prefixCls: java.lang.String,
    use12Hours: scala.Boolean
  ): Anon_Extra = {
    val __obj = js.Dynamic.literal(extra = extra, minuteStep = minuteStep, mode = mode, pickerPrefixCls = pickerPrefixCls, prefixCls = prefixCls, use12Hours = use12Hours)
  
    __obj.asInstanceOf[Anon_Extra]
  }
}

