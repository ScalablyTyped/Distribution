package typings.antDesignReactNative

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerTypesMod {
  
  trait PickerProps extends StObject {
    
    var defaultSelectedValue: js.UndefOr[js.Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var indicatorClassName: js.UndefOr[String] = js.undefined
    
    var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var noAnimate: js.UndefOr[Boolean] = js.undefined
    
    var onScrollChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
    
    var onValueChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
    
    var selectedValue: js.UndefOr[js.Any] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object PickerProps {
    
    @scala.inline
    def apply(): PickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerProps]
    }
    
    @scala.inline
    implicit class PickerPropsMutableBuilder[Self <: PickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultSelectedValue(value: js.Any): Self = StObject.set(x, "defaultSelectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedValueUndefined: Self = StObject.set(x, "defaultSelectedValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIndicatorClassName(value: String): Self = StObject.set(x, "indicatorClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorClassNameUndefined: Self = StObject.set(x, "indicatorClassName", js.undefined)
      
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
      def setNoAnimate(value: Boolean): Self = StObject.set(x, "noAnimate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAnimateUndefined: Self = StObject.set(x, "noAnimate", js.undefined)
      
      @scala.inline
      def setOnScrollChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onScrollChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollChangeUndefined: Self = StObject.set(x, "onScrollChange", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setSelectedValue(value: js.Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
