package typings.antd

import typings.antd.libCheckboxCheckboxMod.AbstractCheckboxProps
import typings.antd.libCheckboxGroupMod.AbstractCheckboxGroupProps
import typings.antd.libConfigProviderDisabledContextMod.DisabledType
import typings.antd.libConfigProviderSizeContextMod.SizeType
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRadioInterfaceMod {
  
  trait RadioChangeEvent extends StObject {
    
    var nativeEvent: MouseEvent
    
    def preventDefault(): Unit
    
    def stopPropagation(): Unit
    
    var target: RadioChangeEventTarget
  }
  object RadioChangeEvent {
    
    inline def apply(
      nativeEvent: MouseEvent,
      preventDefault: () => Unit,
      stopPropagation: () => Unit,
      target: RadioChangeEventTarget
    ): RadioChangeEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioChangeEvent]
    }
    
    extension [Self <: RadioChangeEvent](x: Self) {
      
      inline def setNativeEvent(value: MouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: RadioChangeEventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadioChangeEventTarget
    extends StObject
       with AbstractCheckboxProps[RadioChangeEvent] {
    
    @JSName("checked")
    var checked_RadioChangeEventTarget: Boolean
  }
  object RadioChangeEventTarget {
    
    inline def apply(checked: Boolean): RadioChangeEventTarget = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioChangeEventTarget]
    }
    
    extension [Self <: RadioChangeEventTarget](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.outline
    - typings.antd.antdStrings.solid
  */
  trait RadioGroupButtonStyle extends StObject
  object RadioGroupButtonStyle {
    
    inline def outline: typings.antd.antdStrings.outline = "outline".asInstanceOf[typings.antd.antdStrings.outline]
    
    inline def solid: typings.antd.antdStrings.solid = "solid".asInstanceOf[typings.antd.antdStrings.solid]
  }
  
  trait RadioGroupContextProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    def onChange(e: RadioChangeEvent): Unit
    
    var value: Any
  }
  object RadioGroupContextProps {
    
    inline def apply(onChange: RadioChangeEvent => Unit, value: Any): RadioGroupContextProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioGroupContextProps]
    }
    
    extension [Self <: RadioGroupContextProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: RadioChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.default
    - typings.antd.antdStrings.button
  */
  trait RadioGroupOptionType extends StObject
  object RadioGroupOptionType {
    
    inline def default: typings.antd.antdStrings.default = "default".asInstanceOf[typings.antd.antdStrings.default]
    
    inline def button: typings.antd.antdStrings.button = "button".asInstanceOf[typings.antd.antdStrings.button]
  }
  
  trait RadioGroupProps
    extends StObject
       with AbstractCheckboxGroupProps {
    
    var buttonStyle: js.UndefOr[RadioGroupButtonStyle] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    @JSName("disabled")
    var disabled_RadioGroupProps: js.UndefOr[DisabledType] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ RadioChangeEvent, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var optionType: js.UndefOr[RadioGroupOptionType] = js.undefined
    
    var size: js.UndefOr[SizeType] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object RadioGroupProps {
    
    inline def apply(): RadioGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioGroupProps]
    }
    
    extension [Self <: RadioGroupProps](x: Self) {
      
      inline def setButtonStyle(value: RadioGroupButtonStyle): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: DisabledType): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLDivElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ RadioChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLDivElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnMouseEnter(value: typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOptionType(value: RadioGroupOptionType): Self = StObject.set(x, "optionType", value.asInstanceOf[js.Any])
      
      inline def setOptionTypeUndefined: Self = StObject.set(x, "optionType", js.undefined)
      
      inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type RadioOptionTypeContextProps = RadioGroupOptionType
  
  type RadioProps = AbstractCheckboxProps[RadioChangeEvent]
}
