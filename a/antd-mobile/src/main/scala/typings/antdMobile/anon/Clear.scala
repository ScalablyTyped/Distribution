package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clear extends js.Object {
  
  var clear: Boolean = js.native
  
  var disabled: Boolean = js.native
  
  var disabledKeys: Null = js.native
  
  var editable: Boolean = js.native
  
  var error: Boolean = js.native
  
  var extra: String = js.native
  
  var labelNumber: Double = js.native
  
  var moneyKeyboardAlign: String = js.native
  
  var moneyKeyboardHeader: Null = js.native
  
  var onBlur: js.Function0[Unit] = js.native
  
  var onChange: js.Function0[Unit] = js.native
  
  var onErrorClick: js.Function0[Unit] = js.native
  
  var onExtraClick: js.Function0[Unit] = js.native
  
  var onFocus: js.Function0[Unit] = js.native
  
  var onVirtualKeyboardConfirm: js.Function0[Unit] = js.native
  
  var placeholder: String = js.native
  
  var prefixCls: String = js.native
  
  var prefixListCls: String = js.native
  
  var `type`: String = js.native
  
  var updatePlaceholder: Boolean = js.native
}
object Clear {
  
  @scala.inline
  def apply(
    clear: Boolean,
    disabled: Boolean,
    disabledKeys: Null,
    editable: Boolean,
    error: Boolean,
    extra: String,
    labelNumber: Double,
    moneyKeyboardAlign: String,
    moneyKeyboardHeader: Null,
    onBlur: () => Unit,
    onChange: () => Unit,
    onErrorClick: () => Unit,
    onExtraClick: () => Unit,
    onFocus: () => Unit,
    onVirtualKeyboardConfirm: () => Unit,
    placeholder: String,
    prefixCls: String,
    prefixListCls: String,
    `type`: String,
    updatePlaceholder: Boolean
  ): Clear = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledKeys = disabledKeys.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], labelNumber = labelNumber.asInstanceOf[js.Any], moneyKeyboardAlign = moneyKeyboardAlign.asInstanceOf[js.Any], moneyKeyboardHeader = moneyKeyboardHeader.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onErrorClick = js.Any.fromFunction0(onErrorClick), onExtraClick = js.Any.fromFunction0(onExtraClick), onFocus = js.Any.fromFunction0(onFocus), onVirtualKeyboardConfirm = js.Any.fromFunction0(onVirtualKeyboardConfirm), placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], prefixListCls = prefixListCls.asInstanceOf[js.Any], updatePlaceholder = updatePlaceholder.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clear]
  }
  
  @scala.inline
  implicit class ClearOps[Self <: Clear] (val x: Self) extends AnyVal {
    
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
    def setClear(value: Boolean): Self = this.set("clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledKeys(value: Null): Self = this.set("disabledKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra(value: String): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNumber(value: Double): Self = this.set("labelNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoneyKeyboardAlign(value: String): Self = this.set("moneyKeyboardAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoneyKeyboardHeader(value: Null): Self = this.set("moneyKeyboardHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnErrorClick(value: () => Unit): Self = this.set("onErrorClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnExtraClick(value: () => Unit): Self = this.set("onExtraClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnVirtualKeyboardConfirm(value: () => Unit): Self = this.set("onVirtualKeyboardConfirm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListCls(value: String): Self = this.set("prefixListCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatePlaceholder(value: Boolean): Self = this.set("updatePlaceholder", value.asInstanceOf[js.Any])
  }
}
