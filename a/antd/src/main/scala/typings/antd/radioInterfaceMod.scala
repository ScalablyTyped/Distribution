package typings.antd

import typings.antd.checkboxCheckboxMod.AbstractCheckboxProps
import typings.antd.checkboxGroupMod.AbstractCheckboxGroupProps
import typings.antd.configProviderSizeContextMod.SizeType
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioInterfaceMod {
  
  @js.native
  trait RadioChangeEvent extends StObject {
    
    var nativeEvent: MouseEvent = js.native
    
    def preventDefault(): Unit = js.native
    
    def stopPropagation(): Unit = js.native
    
    var target: RadioChangeEventTarget = js.native
  }
  object RadioChangeEvent {
    
    @scala.inline
    def apply(
      nativeEvent: MouseEvent,
      preventDefault: () => Unit,
      stopPropagation: () => Unit,
      target: RadioChangeEventTarget
    ): RadioChangeEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioChangeEvent]
    }
    
    @scala.inline
    implicit class RadioChangeEventMutableBuilder[Self <: RadioChangeEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNativeEvent(value: MouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTarget(value: RadioChangeEventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RadioChangeEventTarget extends AbstractCheckboxProps[RadioChangeEvent] {
    
    @JSName("checked")
    var checked_RadioChangeEventTarget: Boolean = js.native
  }
  object RadioChangeEventTarget {
    
    @scala.inline
    def apply(checked: Boolean): RadioChangeEventTarget = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioChangeEventTarget]
    }
    
    @scala.inline
    implicit class RadioChangeEventTargetMutableBuilder[Self <: RadioChangeEventTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.outline
    - typings.antd.antdStrings.solid
  */
  trait RadioGroupButtonStyle extends StObject
  object RadioGroupButtonStyle {
    
    @scala.inline
    def outline: typings.antd.antdStrings.outline = "outline".asInstanceOf[typings.antd.antdStrings.outline]
    
    @scala.inline
    def solid: typings.antd.antdStrings.solid = "solid".asInstanceOf[typings.antd.antdStrings.solid]
  }
  
  @js.native
  trait RadioGroupContextProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    def onChange(e: RadioChangeEvent): Unit = js.native
    
    var value: js.Any = js.native
  }
  object RadioGroupContextProps {
    
    @scala.inline
    def apply(onChange: RadioChangeEvent => Unit, value: js.Any): RadioGroupContextProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioGroupContextProps]
    }
    
    @scala.inline
    implicit class RadioGroupContextPropsMutableBuilder[Self <: RadioGroupContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: RadioChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.default
    - typings.antd.antdStrings.button
  */
  trait RadioGroupOptionType extends StObject
  object RadioGroupOptionType {
    
    @scala.inline
    def default: typings.antd.antdStrings.default = "default".asInstanceOf[typings.antd.antdStrings.default]
    
    @scala.inline
    def button: typings.antd.antdStrings.button = "button".asInstanceOf[typings.antd.antdStrings.button]
  }
  
  @js.native
  trait RadioGroupProps extends AbstractCheckboxGroupProps {
    
    var buttonStyle: js.UndefOr[RadioGroupButtonStyle] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var defaultValue: js.UndefOr[js.Any] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ RadioChangeEvent, Unit]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var optionType: js.UndefOr[RadioGroupOptionType] = js.native
    
    var size: js.UndefOr[SizeType] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object RadioGroupProps {
    
    @scala.inline
    def apply(): RadioGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioGroupProps]
    }
    
    @scala.inline
    implicit class RadioGroupPropsMutableBuilder[Self <: RadioGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonStyle(value: RadioGroupButtonStyle): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ RadioChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOptionType(value: RadioGroupOptionType): Self = StObject.set(x, "optionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionTypeUndefined: Self = StObject.set(x, "optionType", js.undefined)
      
      @scala.inline
      def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type RadioProps = AbstractCheckboxProps[RadioChangeEvent]
}
