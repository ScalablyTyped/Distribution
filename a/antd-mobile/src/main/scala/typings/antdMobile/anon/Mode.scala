package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  var mode: String
  var prefixCls: String
  def onLeftClick(): Unit
}

object Mode {
  @scala.inline
  def apply(mode: String, onLeftClick: () => Unit, prefixCls: String): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], onLeftClick = js.Any.fromFunction0(onLeftClick), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

