package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterClose extends js.Object {
  var closable: Boolean = js.native
  var disabled: Boolean = js.native
  var prefixCls: String = js.native
  var selected: Boolean = js.native
  var small: Boolean = js.native
  def afterClose(): Unit = js.native
  def onChange(): Unit = js.native
  def onClose(): Unit = js.native
}

object AfterClose {
  @scala.inline
  def apply(
    afterClose: () => Unit,
    closable: Boolean,
    disabled: Boolean,
    onChange: () => Unit,
    onClose: () => Unit,
    prefixCls: String,
    selected: Boolean,
    small: Boolean
  ): AfterClose = {
    val __obj = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), closable = closable.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onClose = js.Any.fromFunction0(onClose), prefixCls = prefixCls.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterClose]
  }
  @scala.inline
  implicit class AfterCloseOps[Self <: AfterClose] (val x: Self) extends AnyVal {
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
    def setAfterClose(value: () => Unit): Self = this.set("afterClose", js.Any.fromFunction0(value))
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmall(value: Boolean): Self = this.set("small", value.asInstanceOf[js.Any])
  }
  
}

