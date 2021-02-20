package typings.antdMobileRn

import typings.rmcCascader.cascaderTypesMod.CascaderValue
import typings.rmcPicker.popupPickerTypesMod.IPopupPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerPropsTypeMod {
  
  @js.native
  trait PickerData extends StObject {
    
    var children: js.UndefOr[js.Array[PickerData]] = js.native
    
    var label: String = js.native
    
    var value: String | Double = js.native
  }
  object PickerData {
    
    @scala.inline
    def apply(label: String, value: String | Double): PickerData = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PickerPropsType extends IPopupPickerProps {
    
    var cascade: js.UndefOr[Boolean] = js.native
    
    var cols: js.UndefOr[Double] = js.native
    
    var data: js.Array[js.Array[PickerData] | PickerData] = js.native
    
    var extra: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[js.Function1[/* values */ js.Array[String], String]] = js.native
    
    var indicatorStyle: js.UndefOr[js.Any] = js.native
    
    var itemStyle: js.UndefOr[js.Any] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[CascaderValue], Unit]] = js.native
    
    var onPickerChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.native
    
    @JSName("value")
    var value_PickerPropsType: js.UndefOr[js.Array[String | Double]] = js.native
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
      def setFormat(value: /* values */ js.Array[String] => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
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
