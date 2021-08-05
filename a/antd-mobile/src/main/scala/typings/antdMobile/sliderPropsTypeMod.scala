package typings.antdMobile

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderPropsTypeMod {
  
  trait SliderPropsType extends StObject {
    
    var defaultValue: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var handle: js.UndefOr[js.Any] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var onAfterChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var tipFormatter: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], ReactNode]] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object SliderPropsType {
    
    inline def apply(): SliderPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderPropsType]
    }
    
    extension [Self <: SliderPropsType](x: Self) {
      
      inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHandle(value: js.Any): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnAfterChange(value: /* value */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction1(value))
      
      inline def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      inline def setOnChange(value: /* value */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTipFormatter(value: /* value */ js.UndefOr[String] => ReactNode): Self = StObject.set(x, "tipFormatter", js.Any.fromFunction1(value))
      
      inline def setTipFormatterUndefined: Self = StObject.set(x, "tipFormatter", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
