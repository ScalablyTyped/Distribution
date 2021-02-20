package typings.antDesignReactNative

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperPropsTypeMod {
  
  @js.native
  trait StepPropsType extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[Double] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var downStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var step: js.UndefOr[Double | String] = js.native
    
    var upStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object StepPropsType {
    
    @scala.inline
    def apply(): StepPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepPropsType]
    }
    
    @scala.inline
    implicit class StepPropsTypeMutableBuilder[Self <: StepPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDownStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "downStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownStyleNull: Self = StObject.set(x, "downStyle", null)
      
      @scala.inline
      def setDownStyleUndefined: Self = StObject.set(x, "downStyle", js.undefined)
      
      @scala.inline
      def setInputStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputStyleNull: Self = StObject.set(x, "inputStyle", null)
      
      @scala.inline
      def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setUpStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "upStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpStyleNull: Self = StObject.set(x, "upStyle", null)
      
      @scala.inline
      def setUpStyleUndefined: Self = StObject.set(x, "upStyle", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
