package typings.antdMobile

import typings.antdMobile.antdMobileStrings.bankCard
import typings.antdMobile.antdMobileStrings.center
import typings.antdMobile.antdMobileStrings.digit
import typings.antdMobile.antdMobileStrings.left
import typings.antdMobile.antdMobileStrings.money
import typings.antdMobile.antdMobileStrings.number
import typings.antdMobile.antdMobileStrings.password
import typings.antdMobile.antdMobileStrings.phone
import typings.antdMobile.antdMobileStrings.text
import typings.antdMobile.antdMobileStrings.top
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputItemPropsTypeMod {
  
  type InputEventHandler = js.Function1[/* value */ js.UndefOr[String], Unit]
  
  @js.native
  trait InputItemPropsType extends StObject {
    
    var clear: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var disabledKeys: js.UndefOr[js.Array[InputKey] | Null] = js.native
    
    var editable: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var extra: js.UndefOr[ReactNode] = js.native
    
    var labelNumber: js.UndefOr[Double] = js.native
    
    var labelPosition: js.UndefOr[left | top] = js.native
    
    var locale: js.UndefOr[js.Object] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var moneyKeyboardAlign: js.UndefOr[String] = js.native
    
    var moneyKeyboardHeader: js.UndefOr[ReactNode] = js.native
    
    var moneyKeyboardWrapProps: js.UndefOr[js.Object] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onBlur: js.UndefOr[InputEventHandler] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var onFocus: js.UndefOr[InputEventHandler] = js.native
    
    var onVirtualKeyboardConfirm: js.UndefOr[InputEventHandler] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var textAlign: js.UndefOr[left | center] = js.native
    
    var `type`: js.UndefOr[text | bankCard | phone | password | number | digit | money] = js.native
    
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
      def setDisabledKeys(value: js.Array[InputKey]): Self = StObject.set(x, "disabledKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledKeysNull: Self = StObject.set(x, "disabledKeys", null)
      
      @scala.inline
      def setDisabledKeysUndefined: Self = StObject.set(x, "disabledKeys", js.undefined)
      
      @scala.inline
      def setDisabledKeysVarargs(value: InputKey*): Self = StObject.set(x, "disabledKeys", js.Array(value :_*))
      
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
      def setMoneyKeyboardAlign(value: String): Self = StObject.set(x, "moneyKeyboardAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoneyKeyboardAlignUndefined: Self = StObject.set(x, "moneyKeyboardAlign", js.undefined)
      
      @scala.inline
      def setMoneyKeyboardHeader(value: ReactNode): Self = StObject.set(x, "moneyKeyboardHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoneyKeyboardHeaderUndefined: Self = StObject.set(x, "moneyKeyboardHeader", js.undefined)
      
      @scala.inline
      def setMoneyKeyboardWrapProps(value: js.Object): Self = StObject.set(x, "moneyKeyboardWrapProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoneyKeyboardWrapPropsUndefined: Self = StObject.set(x, "moneyKeyboardWrapProps", js.undefined)
      
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
      def setTextAlign(value: left | center): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setType(value: text | bankCard | phone | password | number | digit | money): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.antdMobile.antdMobileStrings.`0`
    - typings.antdMobile.antdMobileStrings.`1`
    - typings.antdMobile.antdMobileStrings.`2`
    - typings.antdMobile.antdMobileStrings.`3`
    - typings.antdMobile.antdMobileStrings.`4`
    - typings.antdMobile.antdMobileStrings.`5`
    - typings.antdMobile.antdMobileStrings.`6`
    - typings.antdMobile.antdMobileStrings.`7`
    - typings.antdMobile.antdMobileStrings.`8`
    - typings.antdMobile.antdMobileStrings.`9`
    - typings.antdMobile.antdMobileStrings.Dot
  */
  trait InputKey extends StObject
  object InputKey {
    
    @scala.inline
    def `0`: typings.antdMobile.antdMobileStrings.`0` = "0".asInstanceOf[typings.antdMobile.antdMobileStrings.`0`]
    
    @scala.inline
    def `1`: typings.antdMobile.antdMobileStrings.`1` = "1".asInstanceOf[typings.antdMobile.antdMobileStrings.`1`]
    
    @scala.inline
    def `2`: typings.antdMobile.antdMobileStrings.`2` = "2".asInstanceOf[typings.antdMobile.antdMobileStrings.`2`]
    
    @scala.inline
    def `3`: typings.antdMobile.antdMobileStrings.`3` = "3".asInstanceOf[typings.antdMobile.antdMobileStrings.`3`]
    
    @scala.inline
    def `4`: typings.antdMobile.antdMobileStrings.`4` = "4".asInstanceOf[typings.antdMobile.antdMobileStrings.`4`]
    
    @scala.inline
    def `5`: typings.antdMobile.antdMobileStrings.`5` = "5".asInstanceOf[typings.antdMobile.antdMobileStrings.`5`]
    
    @scala.inline
    def `6`: typings.antdMobile.antdMobileStrings.`6` = "6".asInstanceOf[typings.antdMobile.antdMobileStrings.`6`]
    
    @scala.inline
    def `7`: typings.antdMobile.antdMobileStrings.`7` = "7".asInstanceOf[typings.antdMobile.antdMobileStrings.`7`]
    
    @scala.inline
    def `8`: typings.antdMobile.antdMobileStrings.`8` = "8".asInstanceOf[typings.antdMobile.antdMobileStrings.`8`]
    
    @scala.inline
    def `9`: typings.antdMobile.antdMobileStrings.`9` = "9".asInstanceOf[typings.antdMobile.antdMobileStrings.`9`]
    
    @scala.inline
    def Dot: typings.antdMobile.antdMobileStrings.Dot = ".".asInstanceOf[typings.antdMobile.antdMobileStrings.Dot]
  }
}
