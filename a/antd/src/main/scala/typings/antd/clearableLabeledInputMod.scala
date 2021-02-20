package typings.antd

import typings.antd.antdStrings.input
import typings.antd.antdStrings.text_
import typings.antd.configProviderContextMod.DirectionType
import typings.antd.configProviderSizeContextMod.SizeType
import typings.antd.inputInputMod.InputProps
import typings.react.mod.Component
import typings.react.mod.MouseEventHandler
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clearableLabeledInputMod {
  
  @JSImport("antd/lib/input/ClearableLabeledInput", JSImport.Default)
  @js.native
  class default () extends ClearableLabeledInput
  
  @JSImport("antd/lib/input/ClearableLabeledInput", "hasPrefixSuffix")
  @js.native
  def hasPrefixSuffix(props: ClearableInputProps): Boolean = js.native
  @JSImport("antd/lib/input/ClearableLabeledInput", "hasPrefixSuffix")
  @js.native
  def hasPrefixSuffix(props: InputProps): Boolean = js.native
  
  /**
    * This basic props required for input and textarea.
    */
  @js.native
  trait BasicProps extends StObject {
    
    var allowClear: js.UndefOr[Boolean] = js.native
    
    var bordered: Boolean = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var element: ReactElement = js.native
    
    var focused: js.UndefOr[Boolean] = js.native
    
    def handleReset(event: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
    
    var inputType: text_ | input = js.native
    
    var prefixCls: String = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object BasicProps {
    
    @scala.inline
    def apply(
      bordered: Boolean,
      element: ReactElement,
      handleReset: typings.react.mod.MouseEvent[HTMLElement, MouseEvent] => Unit,
      inputType: text_ | input,
      prefixCls: String
    ): BasicProps = {
      val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1(handleReset), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicProps]
    }
    
    @scala.inline
    implicit class BasicPropsMutableBuilder[Self <: BasicProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setElement(value: ReactElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setHandleReset(value: typings.react.mod.MouseEvent[HTMLElement, MouseEvent] => Unit): Self = StObject.set(x, "handleReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputType(value: text_ | input): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /**
    * This props only for input.
    */
  @js.native
  trait ClearableInputProps extends BasicProps {
    
    var addonAfter: js.UndefOr[ReactNode] = js.native
    
    var addonBefore: js.UndefOr[ReactNode] = js.native
    
    var prefix: js.UndefOr[ReactNode] = js.native
    
    var size: js.UndefOr[SizeType] = js.native
    
    var suffix: js.UndefOr[ReactNode] = js.native
    
    var triggerFocus: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object ClearableInputProps {
    
    @scala.inline
    def apply(
      bordered: Boolean,
      element: ReactElement,
      handleReset: typings.react.mod.MouseEvent[HTMLElement, MouseEvent] => Unit,
      inputType: text_ | input,
      prefixCls: String
    ): ClearableInputProps = {
      val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1(handleReset), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearableInputProps]
    }
    
    @scala.inline
    implicit class ClearableInputPropsMutableBuilder[Self <: ClearableInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddonAfter(value: ReactNode): Self = StObject.set(x, "addonAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonAfterUndefined: Self = StObject.set(x, "addonAfter", js.undefined)
      
      @scala.inline
      def setAddonBefore(value: ReactNode): Self = StObject.set(x, "addonBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonBeforeUndefined: Self = StObject.set(x, "addonBefore", js.undefined)
      
      @scala.inline
      def setPrefix(value: ReactNode): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setTriggerFocus(value: () => Unit): Self = StObject.set(x, "triggerFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTriggerFocusUndefined: Self = StObject.set(x, "triggerFocus", js.undefined)
    }
  }
  
  @js.native
  trait ClearableLabeledInput
    extends Component[ClearableInputProps, js.Object, js.Any] {
    
    /** @private Do not use out of this class. We do not promise this is always keep. */
    var containerRef: js.Any = js.native
    
    var onInputMouseUp: MouseEventHandler[Element] = js.native
    
    def renderClearIcon(prefixCls: String): typings.react.mod.global.JSX.Element | Null = js.native
    
    def renderInputWithLabel(prefixCls: String, labeledElement: ReactElement): typings.react.mod.global.JSX.Element = js.native
    
    def renderLabeledIcon(prefixCls: String, element: ReactElement): typings.react.mod.global.JSX.Element = js.native
    
    def renderSuffix(prefixCls: String): typings.react.mod.global.JSX.Element | Null = js.native
    
    def renderTextAreaWithClearIcon(prefixCls: String, element: ReactElement): typings.react.mod.global.JSX.Element = js.native
  }
}
