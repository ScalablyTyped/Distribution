package typings.antd

import typings.antd.antdStrings.input
import typings.antd.antdStrings.text_
import typings.antd.configProviderContextMod.DirectionType
import typings.antd.configProviderSizeContextMod.SizeType
import typings.antd.formContextMod.FormItemStatusContextProps
import typings.antd.statusUtilsMod.InputStatus
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clearableLabeledInputMod {
  
  @JSImport("antd/lib/input/ClearableLabeledInput", JSImport.Default)
  @js.native
  open class default () extends ClearableLabeledInput
  
  /** This basic props required for input and textarea. */
  trait BasicProps extends StObject {
    
    var allowClear: js.UndefOr[Boolean] = js.undefined
    
    var bordered: Boolean
    
    var className: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[DirectionType] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var element: ReactElement
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    def handleReset(event: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var inputType: text_ | input
    
    var prefixCls: String
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object BasicProps {
    
    inline def apply(
      bordered: Boolean,
      element: ReactElement,
      handleReset: typings.react.mod.MouseEvent[HTMLElement, MouseEvent] => Unit,
      inputType: text_ | input,
      prefixCls: String
    ): BasicProps = {
      val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1(handleReset), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicProps]
    }
    
    extension [Self <: BasicProps](x: Self) {
      
      inline def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      inline def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setElement(value: ReactElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setHandleReset(value: typings.react.mod.MouseEvent[HTMLElement, MouseEvent] => Unit): Self = StObject.set(x, "handleReset", js.Any.fromFunction1(value))
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setInputType(value: text_ | input): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ClearableInputProps
    extends StObject
       with BasicProps {
    
    var addonAfter: js.UndefOr[ReactNode] = js.undefined
    
    var addonBefore: js.UndefOr[ReactNode] = js.undefined
    
    var prefix: js.UndefOr[ReactNode] = js.undefined
    
    var size: js.UndefOr[SizeType] = js.undefined
    
    var status: js.UndefOr[InputStatus] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
    
    var triggerFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ClearableInputProps {
    
    inline def apply(
      bordered: Boolean,
      element: ReactElement,
      handleReset: typings.react.mod.MouseEvent[HTMLElement, MouseEvent] => Unit,
      inputType: text_ | input,
      prefixCls: String
    ): ClearableInputProps = {
      val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1(handleReset), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearableInputProps]
    }
    
    extension [Self <: ClearableInputProps](x: Self) {
      
      inline def setAddonAfter(value: ReactNode): Self = StObject.set(x, "addonAfter", value.asInstanceOf[js.Any])
      
      inline def setAddonAfterUndefined: Self = StObject.set(x, "addonAfter", js.undefined)
      
      inline def setAddonBefore(value: ReactNode): Self = StObject.set(x, "addonBefore", value.asInstanceOf[js.Any])
      
      inline def setAddonBeforeUndefined: Self = StObject.set(x, "addonBefore", js.undefined)
      
      inline def setPrefix(value: ReactNode): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setTriggerFocus(value: () => Unit): Self = StObject.set(x, "triggerFocus", js.Any.fromFunction0(value))
      
      inline def setTriggerFocusUndefined: Self = StObject.set(x, "triggerFocus", js.undefined)
    }
  }
  
  @js.native
  trait ClearableLabeledInput
    extends Component[ClearableInputProps, js.Object, Any] {
    
    def renderClearIcon(prefixCls: String): Element = js.native
    
    def renderTextAreaWithClearIcon(prefixCls: String, element: ReactElement, statusContext: FormItemStatusContextProps): Element = js.native
  }
}
