package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ValueRadioValue
import typings.antDesignReactNative.checkboxPropsTypeMod.CheckboxForwardedRef
import typings.antDesignReactNative.checkboxPropsTypeMod.CheckboxItemPropsType
import typings.antDesignReactNative.checkboxPropsTypeMod.CheckboxPropsType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioPropsTypeMod {
  
  trait OnGroupChangeParams extends StObject {
    
    var target: ValueRadioValue
  }
  object OnGroupChangeParams {
    
    inline def apply(target: ValueRadioValue): OnGroupChangeParams = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnGroupChangeParams]
    }
    
    extension [Self <: OnGroupChangeParams](x: Self) {
      
      inline def setTarget(value: ValueRadioValue): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type RadioForwardedRef = CheckboxForwardedRef
  
  trait RadioGroupContextProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    def onChange(_e: OnGroupChangeParams): Unit
    
    var value: js.UndefOr[RadioValue] = js.undefined
  }
  object RadioGroupContextProps {
    
    inline def apply(onChange: OnGroupChangeParams => Unit): RadioGroupContextProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[RadioGroupContextProps]
    }
    
    extension [Self <: RadioGroupContextProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnChange(value: OnGroupChangeParams => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setValue(value: RadioValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RadioGroupPropsType extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var defaultValue: js.UndefOr[RadioValue] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* _e */ OnGroupChangeParams, Unit]] = js.undefined
    
    var options: js.UndefOr[js.Array[RadioOptionType | RadioValue]] = js.undefined
    
    var value: js.UndefOr[RadioValue] = js.undefined
  }
  object RadioGroupPropsType {
    
    inline def apply(): RadioGroupPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioGroupPropsType]
    }
    
    extension [Self <: RadioGroupPropsType](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultValue(value: RadioValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnChange(value: /* _e */ OnGroupChangeParams => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOptions(value: js.Array[RadioOptionType | RadioValue]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: (RadioOptionType | RadioValue)*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setValue(value: RadioValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.antDesignReactNative.checkboxPropsTypeMod.CheckboxPropsType because Already inherited
  - typings.antDesignReactNative.radioPropsTypeMod.RadioPropsType because var conflicts: checked, children, defaultChecked, disabled, indeterminate, onChange, prefixCls. Inlined value */ trait RadioItemPropsType
    extends StObject
       with CheckboxItemPropsType {
    
    var value: js.UndefOr[RadioValue] = js.undefined
  }
  object RadioItemPropsType {
    
    inline def apply(): RadioItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioItemPropsType]
    }
    
    extension [Self <: RadioItemPropsType](x: Self) {
      
      inline def setValue(value: RadioValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RadioOptionType extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: ReactNode
    
    var value: RadioValue
  }
  object RadioOptionType {
    
    inline def apply(): RadioOptionType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioOptionType]
    }
    
    extension [Self <: RadioOptionType](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: RadioValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RadioPropsType
    extends StObject
       with CheckboxPropsType {
    
    var value: js.UndefOr[RadioValue] = js.undefined
  }
  object RadioPropsType {
    
    inline def apply(): RadioPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioPropsType]
    }
    
    extension [Self <: RadioPropsType](x: Self) {
      
      inline def setValue(value: RadioValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type RadioValue = js.UndefOr[String | Double]
}
