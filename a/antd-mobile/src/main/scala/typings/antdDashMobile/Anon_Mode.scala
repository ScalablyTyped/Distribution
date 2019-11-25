package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  var mode: String
  var prefixCls: String
  def onLeftClick(): Unit
}

object Anon_Mode {
  @scala.inline
  def apply(mode: String, onLeftClick: () => Unit, prefixCls: String): Anon_Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], onLeftClick = js.Any.fromFunction0(onLeftClick), prefixCls = prefixCls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Mode]
  }
}

