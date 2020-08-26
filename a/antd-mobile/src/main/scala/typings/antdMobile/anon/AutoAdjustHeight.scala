package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoAdjustHeight extends js.Object {
  var autoAdjustHeight: Boolean = js.native
  var disabled: Boolean = js.native
  var editable: Boolean = js.native
  var keyboardPrefixCls: String = js.native
  var placeholder: String = js.native
  var prefixCls: String = js.native
  def onBlur(): Unit = js.native
  def onChange(): Unit = js.native
  def onFocus(): Unit = js.native
  def onVirtualKeyboardConfirm(): Unit = js.native
}

object AutoAdjustHeight {
  @scala.inline
  def apply(
    autoAdjustHeight: Boolean,
    disabled: Boolean,
    editable: Boolean,
    keyboardPrefixCls: String,
    onBlur: () => Unit,
    onChange: () => Unit,
    onFocus: () => Unit,
    onVirtualKeyboardConfirm: () => Unit,
    placeholder: String,
    prefixCls: String
  ): AutoAdjustHeight = {
    val __obj = js.Dynamic.literal(autoAdjustHeight = autoAdjustHeight.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], keyboardPrefixCls = keyboardPrefixCls.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), onVirtualKeyboardConfirm = js.Any.fromFunction0(onVirtualKeyboardConfirm), placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoAdjustHeight]
  }
  @scala.inline
  implicit class AutoAdjustHeightOps[Self <: AutoAdjustHeight] (val x: Self) extends AnyVal {
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
    def setAutoAdjustHeight(value: Boolean): Self = this.set("autoAdjustHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyboardPrefixCls(value: String): Self = this.set("keyboardPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def setOnVirtualKeyboardConfirm(value: () => Unit): Self = this.set("onVirtualKeyboardConfirm", js.Any.fromFunction0(value))
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
  }
  
}

