package typings.antdMobileRn

import typings.antdMobileRn.anon.Cols
import typings.antdMobileRn.pickerPropsTypeMod.PickerData
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerViewMod {
  
  @JSImport("antd-mobile-rn/lib/picker-view/PickerView", JSImport.Default)
  @js.native
  class default () extends PickerView
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/picker-view/PickerView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/picker-view/PickerView", "default.defaultProps")
    @js.native
    def defaultProps: Cols = js.native
    @scala.inline
    def defaultProps_=(x: Cols): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IPickerView extends StObject {
    
    var cascade: js.UndefOr[Boolean] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[js.Array[js.Array[PickerData] | PickerData]] = js.undefined
    
    var indicatorStyle: js.UndefOr[js.Any] = js.undefined
    
    var itemStyle: js.UndefOr[js.Any] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    var onScrollChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    var pickerPrefixCls: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var styles: js.UndefOr[js.Any] = js.undefined
    
    var value: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object IPickerView {
    
    @scala.inline
    def apply(): IPickerView = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPickerView]
    }
    
    @scala.inline
    implicit class IPickerViewMutableBuilder[Self <: IPickerView] (val x: Self) extends AnyVal {
      
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
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: (js.Array[PickerData] | PickerData)*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setIndicatorStyle(value: js.Any): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      @scala.inline
      def setItemStyle(value: js.Any): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnScrollChange(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      @scala.inline
      def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickerPrefixClsUndefined: Self = StObject.set(x, "pickerPrefixCls", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PickerView
    extends Component[IPickerView, js.Any, js.Any] {
    
    def getCol(): js.Array[Element] = js.native
  }
}
