package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnValueChange extends js.Object {
  var prefixCls: String
  def onValueChange(): Unit
}

object OnValueChange {
  @scala.inline
  def apply(onValueChange: () => Unit, prefixCls: String): OnValueChange = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction0(onValueChange), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnValueChange]
  }
}

