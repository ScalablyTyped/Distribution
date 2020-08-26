package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mode extends js.Object {
  var mode: String = js.native
  var prefixCls: String = js.native
  def onLeftClick(): Unit = js.native
}

object Mode {
  @scala.inline
  def apply(mode: String, onLeftClick: () => Unit, prefixCls: String): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], onLeftClick = js.Any.fromFunction0(onLeftClick), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  @scala.inline
  implicit class ModeOps[Self <: Mode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnLeftClick(value: () => Unit): Self = this.set("onLeftClick", js.Any.fromFunction0(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
  }
  
}

