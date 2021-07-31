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
    
    @scala.inline
    def apply(value: CascaderOneValue): CascaderDataItem = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CascaderDataItem]
    }
    
    @scala.inline
    implicit class CascaderDataItemMutableBuilder[Self <: CascaderDataItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[CascaderDataItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: CascaderDataItem*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: CascaderOneValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(data: js.Array[CascaderDataItem]): CascaderProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[CascaderProps]
    }
    
    @scala.inline
    implicit class CascaderPropsMutableBuilder[Self <: CascaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[CascaderDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: CascaderDataItem*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDefaultValue(value: CascaderValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: CascaderOneValue*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorStyleNull: Self = StObject.set(x, "indicatorStyle", null)
      
      @scala.inline
      def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ CascaderValue => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnScrollChange(value: /* value */ CascaderValue => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      @scala.inline
      def setPickerItemStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "pickerItemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerItemStyleNull: Self = StObject.set(x, "pickerItemStyle", null)
      
      @scala.inline
      def setPickerItemStyleUndefined: Self = StObject.set(x, "pickerItemStyle", js.undefined)
      
      @scala.inline
      def setRootNativeProps(value: js.Object): Self = StObject.set(x, "rootNativeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNativePropsUndefined: Self = StObject.set(x, "rootNativeProps", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: CascaderValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: CascaderOneValue*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type CascaderValue = js.Array[CascaderOneValue]
}
