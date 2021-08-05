package typings.antDesignReactNative

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cascaderTypesMod {
  
  trait CascaderDataItem extends StObject {
    
    var children: js.UndefOr[js.Array[CascaderDataItem]] = js.undefined
    
    var label: ReactNode
    
    var value: CascaderOneValue
  }
  object CascaderDataItem {
    
    inline def apply(value: CascaderOneValue): CascaderDataItem = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CascaderDataItem]
    }
    
    extension [Self <: CascaderDataItem](x: Self) {
      
      inline def setChildren(value: js.Array[CascaderDataItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: CascaderDataItem*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: CascaderOneValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type CascaderOneValue = String | Double
  
  trait CascaderProps extends StObject {
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var data: js.Array[CascaderDataItem]
    
    var defaultValue: js.UndefOr[CascaderValue] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.undefined
    
    var onScrollChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.undefined
    
    var pickerItemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var rootNativeProps: js.UndefOr[js.Object] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var value: js.UndefOr[CascaderValue] = js.undefined
  }
  object CascaderProps {
    
    inline def apply(data: js.Array[CascaderDataItem]): CascaderProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[CascaderProps]
    }
    
    extension [Self <: CascaderProps](x: Self) {
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setData(value: js.Array[CascaderDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: CascaderDataItem*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setDefaultValue(value: CascaderValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: CascaderOneValue*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyleNull: Self = StObject.set(x, "indicatorStyle", null)
      
      inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      inline def setOnChange(value: /* value */ CascaderValue => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnScrollChange(value: /* value */ CascaderValue => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1(value))
      
      inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      inline def setPickerItemStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "pickerItemStyle", value.asInstanceOf[js.Any])
      
      inline def setPickerItemStyleNull: Self = StObject.set(x, "pickerItemStyle", null)
      
      inline def setPickerItemStyleUndefined: Self = StObject.set(x, "pickerItemStyle", js.undefined)
      
      inline def setRootNativeProps(value: js.Object): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
      
      inline def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: CascaderValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: CascaderOneValue*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type CascaderValue = js.Array[CascaderOneValue]
}
