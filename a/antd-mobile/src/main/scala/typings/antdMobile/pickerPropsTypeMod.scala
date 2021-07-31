package typings.antdMobile

import typings.react.mod.ReactNode
import typings.rmcCascader.cascaderTypesMod.CascaderValue
import typings.rmcPicker.popupPickerTypesMod.IPopupPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerPropsTypeMod {
  
  trait PickerData extends StObject {
    
    var children: js.UndefOr[js.Array[PickerData]] = js.undefined
    
    var label: ReactNode
    
    var value: String | Double
  }
  object PickerData {
    
    @scala.inline
    def apply(value: String | Double): PickerData = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerData]
    }
    
    @scala.inline
    implicit class PickerDataMutableBuilder[Self <: PickerData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[PickerData]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: PickerData*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PickerPropsType
    extends StObject
       with IPopupPickerProps {
    
    var cascade: js.UndefOr[Boolean] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var data: js.Array[js.Array[PickerData] | PickerData]
    
    var extra: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[js.Function1[/* values */ js.Array[ReactNode], String | js.Array[ReactNode]]] = js.undefined
    
    var indicatorStyle: js.UndefOr[js.Any] = js.undefined
    
    var itemStyle: js.UndefOr[js.Any] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[CascaderValue], Unit]] = js.undefined
    
    var onPickerChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.undefined
    
    @JSName("value")
    var value_PickerPropsType: js.UndefOr[js.Array[String | Double]] = js.undefined
  }
  object PickerPropsType {
    
    @scala.inline
    def apply(data: js.Array[js.Array[PickerData] | PickerData]): PickerPropsType = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerPropsType]
    }
    
    @scala.inline
    implicit class PickerPropsTypeMutableBuilder[Self <: PickerPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[js.Array[PickerData] | PickerData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: (js.Array[PickerData] | PickerData)*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setExtra(value: String): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setFormat(value: /* values */ js.Array[ReactNode] => String | js.Array[ReactNode]): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIndicatorStyle(value: js.Any): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      @scala.inline
      def setItemStyle(value: js.Any): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* date */ js.UndefOr[CascaderValue] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnPickerChange(value: /* value */ CascaderValue => Unit): Self = StObject.set(x, "onPickerChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPickerChangeUndefined: Self = StObject.set(x, "onPickerChange", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[String | Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (String | Double)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
