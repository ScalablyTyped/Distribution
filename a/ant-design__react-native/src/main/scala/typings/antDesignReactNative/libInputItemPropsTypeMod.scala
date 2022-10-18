package typings.antDesignReactNative

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputItemPropsTypeMod {
  
  type InputEventHandler = js.Function1[/* value */ js.UndefOr[String], Unit]
  
  trait InputItemPropsType extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
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
    
    var textAlign: js.UndefOr[left | center | right] = js.undefined
    
    var `type`: js.UndefOr[text | bankCard | phone | password | number | digit | KeyboardTypeOptions] = js.undefined
    
    var updatePlaceholder: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object InputItemPropsType {
    
    inline def apply(): InputItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputItemPropsType]
    }
    
    extension [Self <: InputItemPropsType](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setLabelNumber(value: Double): Self = StObject.set(x, "labelNumber", value.asInstanceOf[js.Any])
      
      inline def setLabelNumberUndefined: Self = StObject.set(x, "labelNumber", js.undefined)
      
      inline def setLabelPosition(value: left | top): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLocale(value: js.Object): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnVirtualKeyboardConfirm(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onVirtualKeyboardConfirm", js.Any.fromFunction1(value))
      
      inline def setOnVirtualKeyboardConfirmUndefined: Self = StObject.set(x, "onVirtualKeyboardConfirm", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setTextAlign(value: left | center | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setType(value: text | bankCard | phone | password | number | digit | KeyboardTypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUpdatePlaceholder(value: Boolean): Self = StObject.set(x, "updatePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setUpdatePlaceholderUndefined: Self = StObject.set(x, "updatePlaceholder", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
