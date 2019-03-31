package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: scala.Double
  var mode: java.lang.String
  var prefixCls: java.lang.String
  var simple: scala.Boolean
  var total: scala.Double
  def onChange(): scala.Unit
}

object Anon_Current {
  @scala.inline
  def apply(
    current: scala.Double,
    mode: java.lang.String,
    onChange: () => scala.Unit,
    prefixCls: java.lang.String,
    simple: scala.Boolean,
    total: scala.Double
  ): Anon_Current = {
    val __obj = js.Dynamic.literal(current = current, mode = mode, onChange = js.Any.fromFunction0(onChange), prefixCls = prefixCls, simple = simple, total = total)
  
    __obj.asInstanceOf[Anon_Current]
  }
}

