package typings.antdMobile

import typings.antdMobile.antdMobileStrings.left
import typings.antdMobile.antdMobileStrings.right
import typings.antdMobile.inputItemPropsTypeMod.InputEventHandler
import typings.antdMobile.inputItemPropsTypeMod.InputKey
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customInputMod {
  
  @JSImport("antd-mobile/lib/input-item/CustomInput", JSImport.Default)
  @js.native
  class default protected () extends NumberInput {
    def this(props: NumberInputProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps.autoAdjustHeight")
      @js.native
      def autoAdjustHeight: Boolean = js.native
      inline def autoAdjustHeight_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps.editable")
      @js.native
      def editable: Boolean = js.native
      inline def editable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editable")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps.keyboardPrefixCls")
      @js.native
      def keyboardPrefixCls: String = js.native
      inline def keyboardPrefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyboardPrefixCls")(x.asInstanceOf[js.Any])
      
      inline def onBlur(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBlur")().asInstanceOf[Unit]
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      inline def onFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFocus")().asInstanceOf[Unit]
      
      inline def onVirtualKeyboardConfirm(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onVirtualKeyboardConfirm")().asInstanceOf[Unit]
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps.placeholder")
      @js.native
      def placeholder: String = js.native
      inline def placeholder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NumberInput
    extends Component[NumberInputProps, js.Any, js.Any] {
    
    def addBlurListener(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MNumberInput(nextProps: NumberInputProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MNumberInput(): Unit = js.native
    
    var container: HTMLDivElement = js.native
    
    def doBlur(ev: MouseEvent): Unit = js.native
    
    def focus(): Unit = js.native
    
    def getComponent(): Element = js.native
    
    def getContainer(): HTMLDivElement = js.native
    
    var inputRef: HTMLDivElement | Null = js.native
    
    var keyBoard: ReactNode | Null = js.native
    
    def onChange(value: js.Any): Unit = js.native
    
    def onConfirm(value: js.Any): Unit = js.native
    
    def onFakeInputClick(): Unit = js.native
    
    def onInputBlur(value: String): Unit = js.native
    
    def onInputFocus(): Unit = js.native
    
    def onKeyboardClick(KeyboardItemValue: String): Unit = js.native
    
    def removeBlurListener(): Unit = js.native
    
    def renderCustomKeyboard(): Unit = js.native
    
    def renderPortal(): js.UndefOr[js.Object | Null] = js.native
    
    def saveRef(): Unit = js.native
    def saveRef(el: typings.antdMobile.customKeyboardMod.default): Unit = js.native
    
    def unLinkInput(): Unit = js.native
  }
  
  trait NumberInputProps extends StObject {
    
    var autoAdjustHeight: js.UndefOr[Boolean] = js.undefined
    
    var backspaceLabel: js.Any
    
    var cancelKeyboardLabel: js.Any
    
    var confirmLabel: js.Any
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledKeys: js.UndefOr[js.Array[InputKey] | Null] = js.undefined
    
    var editable: js.UndefOr[Boolean] = js.undefined
    
    var keyboardPrefixCls: js.UndefOr[String] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var moneyKeyboardAlign: js.UndefOr[left | right | String] = js.undefined
    
    var moneyKeyboardHeader: js.UndefOr[ReactNode] = js.undefined
    
    var moneyKeyboardWrapProps: js.UndefOr[js.Object] = js.undefined
    
    var onBlur: js.UndefOr[InputEventHandler] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Unit]] = js.undefined
    
    var onFocus: js.UndefOr[InputEventHandler] = js.undefined
    
    var onVirtualKeyboardConfirm: js.UndefOr[InputEventHandler] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object NumberInputProps {
    
    inline def apply(backspaceLabel: js.Any, cancelKeyboardLabel: js.Any, confirmLabel: js.Any): NumberInputProps = {
      val __obj = js.Dynamic.literal(backspaceLabel = backspaceLabel.asInstanceOf[js.Any], cancelKeyboardLabel = cancelKeyboardLabel.asInstanceOf[js.Any], confirmLabel = confirmLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberInputProps]
    }
    
    extension [Self <: NumberInputProps](x: Self) {
      
      inline def setAutoAdjustHeight(value: Boolean): Self = StObject.set(x, "autoAdjustHeight", value.asInstanceOf[js.Any])
      
      inline def setAutoAdjustHeightUndefined: Self = StObject.set(x, "autoAdjustHeight", js.undefined)
      
      inline def setBackspaceLabel(value: js.Any): Self = StObject.set(x, "backspaceLabel", value.asInstanceOf[js.Any])
      
      inline def setCancelKeyboardLabel(value: js.Any): Self = StObject.set(x, "cancelKeyboardLabel", value.asInstanceOf[js.Any])
      
      inline def setConfirmLabel(value: js.Any): Self = StObject.set(x, "confirmLabel", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledKeys(value: js.Array[InputKey]): Self = StObject.set(x, "disabledKeys", value.asInstanceOf[js.Any])
      
      inline def setDisabledKeysNull: Self = StObject.set(x, "disabledKeys", null)
      
      inline def setDisabledKeysUndefined: Self = StObject.set(x, "disabledKeys", js.undefined)
      
      inline def setDisabledKeysVarargs(value: InputKey*): Self = StObject.set(x, "disabledKeys", js.Array(value :_*))
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setKeyboardPrefixCls(value: String): Self = StObject.set(x, "keyboardPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setKeyboardPrefixClsUndefined: Self = StObject.set(x, "keyboardPrefixCls", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMoneyKeyboardAlign(value: left | right | String): Self = StObject.set(x, "moneyKeyboardAlign", value.asInstanceOf[js.Any])
      
      inline def setMoneyKeyboardAlignUndefined: Self = StObject.set(x, "moneyKeyboardAlign", js.undefined)
      
      inline def setMoneyKeyboardHeader(value: ReactNode): Self = StObject.set(x, "moneyKeyboardHeader", value.asInstanceOf[js.Any])
      
      inline def setMoneyKeyboardHeaderUndefined: Self = StObject.set(x, "moneyKeyboardHeader", js.undefined)
      
      inline def setMoneyKeyboardWrapProps(value: js.Object): Self = StObject.set(x, "moneyKeyboardWrapProps", value.asInstanceOf[js.Any])
      
      inline def setMoneyKeyboardWrapPropsUndefined: Self = StObject.set(x, "moneyKeyboardWrapProps", js.undefined)
      
      inline def setOnBlur(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnVirtualKeyboardConfirm(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onVirtualKeyboardConfirm", js.Any.fromFunction1(value))
      
      inline def setOnVirtualKeyboardConfirmUndefined: Self = StObject.set(x, "onVirtualKeyboardConfirm", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
