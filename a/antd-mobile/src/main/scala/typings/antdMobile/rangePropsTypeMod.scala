package typings.antdMobile

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangePropsTypeMod {
  
  trait RangePropsType extends StObject {
    
    var defaultValue: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var onAfterChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var tipFormatter: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], ReactNode]] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object RangePropsType {
    
    @scala.inline
    def apply(): RangePropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangePropsType]
    }
    
    @scala.inline
    implicit class RangePropsTypeMutableBuilder[Self <: RangePropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnAfterChange(value: /* value */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setTipFormatter(value: /* value */ js.UndefOr[Double] => ReactNode): Self = StObject.set(x, "tipFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTipFormatterUndefined: Self = StObject.set(x, "tipFormatter", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
