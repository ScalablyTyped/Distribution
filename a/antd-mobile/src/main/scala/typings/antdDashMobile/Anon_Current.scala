package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: Double
  var mode: String
  var prefixCls: String
  var simple: Boolean
  var total: Double
  def onChange(): Unit
}

object Anon_Current {
  @scala.inline
  def apply(
    current: Double,
    mode: String,
    onChange: () => Unit,
    prefixCls: String,
    simple: Boolean,
    total: Double
  ): Anon_Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), prefixCls = prefixCls.asInstanceOf[js.Any], simple = simple.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Current]
  }
}

