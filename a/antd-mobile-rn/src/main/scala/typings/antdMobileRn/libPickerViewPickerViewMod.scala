package typings.antdMobileRn

import typings.antdMobileRn.anon.Cols
import typings.antdMobileRn.libPickerPropsTypeMod.PickerData
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerViewPickerViewMod {
  
  @JSImport("antd-mobile-rn/lib/picker-view/PickerView", JSImport.Default)
  @js.native
  open class default () extends PickerView
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/picker-view/PickerView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/picker-view/PickerView", "default.defaultProps")
    @js.native
    def defaultProps: Cols = js.native
    inline def defaultProps_=(x: Cols): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IPickerView extends StObject {
    
    var cascade: js.UndefOr[Boolean] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[js.Array[js.Array[PickerData] | PickerData]] = js.undefined
    
    var indicatorStyle: js.UndefOr[Any] = js.undefined
    
    var itemStyle: js.UndefOr[Any] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
    
    var onScrollChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
    
    var pickerPrefixCls: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var styles: js.UndefOr[Any] = js.undefined
    
    var value: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object IPickerView {
    
    inline def apply(): IPickerView = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPickerView]
    }
    
    extension [Self <: IPickerView](x: Self) {
      
      inline def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      inline def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setData(value: js.Array[js.Array[PickerData] | PickerData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: (js.Array[PickerData] | PickerData)*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setIndicatorStyle(value: Any): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      inline def setItemStyle(value: Any): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setOnChange(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnScrollChange(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1(value))
      
      inline def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      inline def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setPickerPrefixClsUndefined: Self = StObject.set(x, "pickerPrefixCls", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  @js.native
  trait PickerView extends Component[IPickerView, Any, Any] {
    
    def getCol(): js.Array[Element] = js.native
  }
}
