package typings.antdMobileRn

import typings.antdMobileRn.antdMobileRnStrings.bankCard
import typings.antdMobileRn.antdMobileRnStrings.center
import typings.antdMobileRn.antdMobileRnStrings.digit
import typings.antdMobileRn.antdMobileRnStrings.left
import typings.antdMobileRn.antdMobileRnStrings.number
import typings.antdMobileRn.antdMobileRnStrings.password
import typings.antdMobileRn.antdMobileRnStrings.phone
import typings.antdMobileRn.antdMobileRnStrings.text
import typings.antdMobileRn.antdMobileRnStrings.top
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputItemPropsTypeMod {
  
  type InputEventHandler = js.Function1[/* value */ js.UndefOr[String], Unit]
  
  trait InputItemPropsType extends StObject {
    
    var clear: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var editable: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var labelNumber: js.UndefOr[Double] = js.undefined
    
    var labelPosition: js.UndefOr[left | top] = js.undefined
    
    var locale: js.UndefOr[js.Object] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[InputEventHandler] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[InputEventHandler] = js.undefined
    
    var onVirtualKeyboardConfirm: js.UndefOr[InputEventHandler] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var styles: js.UndefOr[js.Any] = js.undefined
    
    var textAlign: js.UndefOr[left | center] = js.undefined
    
    var `type`: js.UndefOr[text | bankCard | phone | password | number | digit] = js.undefined
    
    var updatePlaceholder: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object InputItemPropsType {
    
    @scala.inline
    def apply(): InputItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputItemPropsType]
    }
    
    @scala.inline
    implicit class InputItemPropsTypeMutableBuilder[Self <: InputItemPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setLabelNumber(value: Double): Self = StObject.set(x, "labelNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelNumberUndefined: Self = StObject.set(x, "labelNumber", js.undefined)
      
      @scala.inline
      def setLabelPosition(value: left | top): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setLocale(value: js.Object): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnVirtualKeyboardConfirm(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onVirtualKeyboardConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVirtualKeyboardConfirmUndefined: Self = StObject.set(x, "onVirtualKeyboardConfirm", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTextAlign(value: left | center): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setType(value: text | bankCard | phone | password | number | digit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUpdatePlaceholder(value: Boolean): Self = StObject.set(x, "updatePlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatePlaceholderUndefined: Self = StObject.set(x, "updatePlaceholder", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
