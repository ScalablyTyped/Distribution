package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnValueChange extends js.Object {
  var prefixCls: String
  def onValueChange(): Unit
}

object AnonOnValueChange {
  @scala.inline
  def apply(onValueChange: () => Unit, prefixCls: String): AnonOnValueChange = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction0(onValueChange), prefixCls = prefixCls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOnValueChange]
  }
}

