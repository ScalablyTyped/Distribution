package typings.antDesignReactNative

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepperPropsTypeMod {
  
  trait StepPropsType extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var downStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[Double | String] = js.undefined
    
    var upStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object StepPropsType {
    
    inline def apply(): StepPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepPropsType]
    }
    
    extension [Self <: StepPropsType](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDownStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "downStyle", value.asInstanceOf[js.Any])
      
      inline def setDownStyleNull: Self = StObject.set(x, "downStyle", null)
      
      inline def setDownStyleUndefined: Self = StObject.set(x, "downStyle", js.undefined)
      
      inline def setInputStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleNull: Self = StObject.set(x, "inputStyle", null)
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* value */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setUpStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "upStyle", value.asInstanceOf[js.Any])
      
      inline def setUpStyleNull: Self = StObject.set(x, "upStyle", null)
      
      inline def setUpStyleUndefined: Self = StObject.set(x, "upStyle", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
