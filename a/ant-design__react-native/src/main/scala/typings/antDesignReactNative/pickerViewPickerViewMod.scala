package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Cascade
import typings.antDesignReactNative.pickerPropsTypeMod.PickerData
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerViewPickerViewMod {
  
  @JSImport("@ant-design/react-native/lib/picker-view/PickerView", JSImport.Default)
  @js.native
  class default () extends PickerView
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/picker-view/PickerView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/picker-view/PickerView", "default.defaultProps")
    @js.native
    def defaultProps: Cascade = js.native
    @scala.inline
    def defaultProps_=(x: Cascade): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PickerView
    extends Component[PickerViewProps, js.Any, js.Any] {
    
    def getCol(): js.Array[Element] = js.native
  }
  
  @js.native
  trait PickerViewProps extends StObject {
    
    var cascade: js.UndefOr[Boolean] = js.native
    
    var cols: js.UndefOr[Double] = js.native
    
    var data: js.UndefOr[js.Array[js.Array[PickerData] | PickerData]] = js.native
    
    var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
    
    var onScrollChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
    
    var styles: js.UndefOr[js.Any] = js.native
    
    var value: js.UndefOr[js.Array[_]] = js.native
  }
  object PickerViewProps {
    
    @scala.inline
    def apply(): PickerViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerViewProps]
    }
    
    @scala.inline
    implicit class PickerViewPropsMutableBuilder[Self <: PickerViewProps] (val x: Self) extends AnyVal {
      
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
      def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorStyleNull: Self = StObject.set(x, "indicatorStyle", null)
      
      @scala.inline
      def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      @scala.inline
      def setItemStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
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
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
