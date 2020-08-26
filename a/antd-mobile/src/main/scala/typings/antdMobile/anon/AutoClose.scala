package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoClose extends js.Object {
  var autoClose: Boolean = js.native
  var disabled: Boolean = js.native
  var left: js.Array[scala.Nothing] = js.native
  var prefixCls: String = js.native
  var right: js.Array[scala.Nothing] = js.native
  def onClose(): Unit = js.native
  def onOpen(): Unit = js.native
}

object AutoClose {
  @scala.inline
  def apply(
    autoClose: Boolean,
    disabled: Boolean,
    left: js.Array[scala.Nothing],
    onClose: () => Unit,
    onOpen: () => Unit,
    prefixCls: String,
    right: js.Array[scala.Nothing]
  ): AutoClose = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onOpen = js.Any.fromFunction0(onOpen), prefixCls = prefixCls.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoClose]
  }
  @scala.inline
  implicit class AutoCloseOps[Self <: AutoClose] (val x: Self) extends AnyVal {
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
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftVarargs(value: scala.Nothing*): Self = this.set("left", js.Array(value :_*))
    @scala.inline
    def setLeft(value: js.Array[scala.Nothing]): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def setOnOpen(value: () => Unit): Self = this.set("onOpen", js.Any.fromFunction0(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightVarargs(value: scala.Nothing*): Self = this.set("right", js.Array(value :_*))
    @scala.inline
    def setRight(value: js.Array[scala.Nothing]): Self = this.set("right", value.asInstanceOf[js.Any])
  }
  
}

