package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  var mode: java.lang.String
  var prefixCls: java.lang.String
  def onLeftClick(): scala.Unit
}

object Anon_Mode {
  @scala.inline
  def apply(mode: java.lang.String, onLeftClick: () => scala.Unit, prefixCls: java.lang.String): Anon_Mode = {
    val __obj = js.Dynamic.literal(mode = mode, onLeftClick = js.Any.fromFunction0(onLeftClick), prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_Mode]
  }
}

