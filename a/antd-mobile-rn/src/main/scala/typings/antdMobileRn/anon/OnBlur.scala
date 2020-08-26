package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBlur extends js.Object {
  var disabled: Boolean = js.native
  var placeholder: String = js.native
  var prefixCls: String = js.native
  var showCancelButton: Boolean = js.native
  var styles: StringDictionary[RegisteredStyle[_]] = js.native
  def onBlur(): Unit = js.native
  def onChange(): Unit = js.native
  def onClear(): Unit = js.native
  def onFocus(): Unit = js.native
  def onSubmit(): Unit = js.native
}

object OnBlur {
  @scala.inline
  def apply(
    disabled: Boolean,
    onBlur: () => Unit,
    onChange: () => Unit,
    onClear: () => Unit,
    onFocus: () => Unit,
    onSubmit: () => Unit,
    placeholder: String,
    prefixCls: String,
    showCancelButton: Boolean,
    styles: StringDictionary[RegisteredStyle[_]]
  ): OnBlur = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onClear = js.Any.fromFunction0(onClear), onFocus = js.Any.fromFunction0(onFocus), onSubmit = js.Any.fromFunction0(onSubmit), placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], showCancelButton = showCancelButton.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBlur]
  }
  @scala.inline
  implicit class OnBlurOps[Self <: OnBlur] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def setOnClear(value: () => Unit): Self = this.set("onClear", js.Any.fromFunction0(value))
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def setOnSubmit(value: () => Unit): Self = this.set("onSubmit", js.Any.fromFunction0(value))
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowCancelButton(value: Boolean): Self = this.set("showCancelButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyles(value: StringDictionary[RegisteredStyle[_]]): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
  
}

