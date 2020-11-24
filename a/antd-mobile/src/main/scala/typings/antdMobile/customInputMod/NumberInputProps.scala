package typings.antdMobile.customInputMod

import typings.antdMobile.antdMobileStrings.left
import typings.antdMobile.antdMobileStrings.right
import typings.antdMobile.inputItemPropsTypeMod.InputEventHandler
import typings.antdMobile.inputItemPropsTypeMod.InputKey
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberInputProps extends js.Object {
  
  var autoAdjustHeight: js.UndefOr[Boolean] = js.native
  
  var backspaceLabel: js.Any = js.native
  
  var cancelKeyboardLabel: js.Any = js.native
  
  var confirmLabel: js.Any = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var disabledKeys: js.UndefOr[js.Array[InputKey] | Null] = js.native
  
  var editable: js.UndefOr[Boolean] = js.native
  
  var keyboardPrefixCls: js.UndefOr[String] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var moneyKeyboardAlign: js.UndefOr[left | right | String] = js.native
  
  var moneyKeyboardHeader: js.UndefOr[ReactNode] = js.native
  
  var moneyKeyboardWrapProps: js.UndefOr[js.Object] = js.native
  
  var onBlur: js.UndefOr[InputEventHandler] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Unit]] = js.native
  
  var onFocus: js.UndefOr[InputEventHandler] = js.native
  
  var onVirtualKeyboardConfirm: js.UndefOr[InputEventHandler] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object NumberInputProps {
  
  @scala.inline
  def apply(backspaceLabel: js.Any, cancelKeyboardLabel: js.Any, confirmLabel: js.Any): NumberInputProps = {
    val __obj = js.Dynamic.literal(backspaceLabel = backspaceLabel.asInstanceOf[js.Any], cancelKeyboardLabel = cancelKeyboardLabel.asInstanceOf[js.Any], confirmLabel = confirmLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberInputProps]
  }
  
  @scala.inline
  implicit class NumberInputPropsOps[Self <: NumberInputProps] (val x: Self) extends AnyVal {
    
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
    def setBackspaceLabel(value: js.Any): Self = this.set("backspaceLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelKeyboardLabel(value: js.Any): Self = this.set("cancelKeyboardLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmLabel(value: js.Any): Self = this.set("confirmLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAdjustHeight(value: Boolean): Self = this.set("autoAdjustHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAdjustHeight: Self = this.set("autoAdjustHeight", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledKeysVarargs(value: InputKey*): Self = this.set("disabledKeys", js.Array(value :_*))
    
    @scala.inline
    def setDisabledKeys(value: js.Array[InputKey]): Self = this.set("disabledKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledKeys: Self = this.set("disabledKeys", js.undefined)
    
    @scala.inline
    def setDisabledKeysNull: Self = this.set("disabledKeys", null)
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setKeyboardPrefixCls(value: String): Self = this.set("keyboardPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardPrefixCls: Self = this.set("keyboardPrefixCls", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMoneyKeyboardAlign(value: left | right | String): Self = this.set("moneyKeyboardAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoneyKeyboardAlign: Self = this.set("moneyKeyboardAlign", js.undefined)
    
    @scala.inline
    def setMoneyKeyboardHeader(value: ReactNode): Self = this.set("moneyKeyboardHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoneyKeyboardHeader: Self = this.set("moneyKeyboardHeader", js.undefined)
    
    @scala.inline
    def setMoneyKeyboardWrapProps(value: js.Object): Self = this.set("moneyKeyboardWrapProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoneyKeyboardWrapProps: Self = this.set("moneyKeyboardWrapProps", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* value */ js.UndefOr[String] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* e */ ChangeEvent[HTMLInputElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* value */ js.UndefOr[String] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnVirtualKeyboardConfirm(value: /* value */ js.UndefOr[String] => Unit): Self = this.set("onVirtualKeyboardConfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnVirtualKeyboardConfirm: Self = this.set("onVirtualKeyboardConfirm", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
