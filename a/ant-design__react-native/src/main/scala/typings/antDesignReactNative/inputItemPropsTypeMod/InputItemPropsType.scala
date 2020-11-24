package typings.antDesignReactNative.inputItemPropsTypeMod

import typings.antDesignReactNative.antDesignReactNativeStrings.bankCard
import typings.antDesignReactNative.antDesignReactNativeStrings.center
import typings.antDesignReactNative.antDesignReactNativeStrings.digit
import typings.antDesignReactNative.antDesignReactNativeStrings.left
import typings.antDesignReactNative.antDesignReactNativeStrings.number
import typings.antDesignReactNative.antDesignReactNativeStrings.password
import typings.antDesignReactNative.antDesignReactNativeStrings.phone
import typings.antDesignReactNative.antDesignReactNativeStrings.right
import typings.antDesignReactNative.antDesignReactNativeStrings.text
import typings.antDesignReactNative.antDesignReactNativeStrings.top
import typings.react.mod.ReactNode
import typings.reactNative.mod.KeyboardTypeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputItemPropsType extends js.Object {
  
  var clear: js.UndefOr[Boolean] = js.native
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var editable: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[Boolean] = js.native
  
  var extra: js.UndefOr[ReactNode] = js.native
  
  var labelNumber: js.UndefOr[Double] = js.native
  
  var labelPosition: js.UndefOr[left | top] = js.native
  
  var locale: js.UndefOr[js.Object] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onBlur: js.UndefOr[InputEventHandler] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  
  var onFocus: js.UndefOr[InputEventHandler] = js.native
  
  var onVirtualKeyboardConfirm: js.UndefOr[InputEventHandler] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var textAlign: js.UndefOr[left | center | right] = js.native
  
  var `type`: js.UndefOr[text | bankCard | phone | password | number | digit | KeyboardTypeOptions] = js.native
  
  var updatePlaceholder: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object InputItemPropsType {
  
  @scala.inline
  def apply(): InputItemPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputItemPropsType]
  }
  
  @scala.inline
  implicit class InputItemPropsTypeOps[Self <: InputItemPropsType] (val x: Self) extends AnyVal {
    
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
    def deleteClear: Self = this.set("clear", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExtra(value: ReactNode): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setLabelNumber(value: Double): Self = this.set("labelNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelNumber: Self = this.set("labelNumber", js.undefined)
    
    @scala.inline
    def setLabelPosition(value: left | top): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Object): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* value */ js.UndefOr[String] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
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
    def setTextAlign(value: left | center | right): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setType(value: text | bankCard | phone | password | number | digit | KeyboardTypeOptions): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpdatePlaceholder(value: Boolean): Self = this.set("updatePlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatePlaceholder: Self = this.set("updatePlaceholder", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
