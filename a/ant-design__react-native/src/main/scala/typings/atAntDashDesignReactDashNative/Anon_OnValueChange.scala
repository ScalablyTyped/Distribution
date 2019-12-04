package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnValueChange extends js.Object {
  var prefixCls: String
  def onValueChange(): Unit
}

object Anon_OnValueChange {
  @scala.inline
  def apply(onValueChange: () => Unit, prefixCls: String): Anon_OnValueChange = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction0(onValueChange), prefixCls = prefixCls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_OnValueChange]
  }
}

