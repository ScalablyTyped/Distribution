package typings.angularTouchspin

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-touchspin", JSImport.Default)
  @js.native
  val default: String = js.native
  
  object angularTouchspin {
    
    @js.native
    sealed trait StepDivisibilityType extends StObject
    @JSImport("angular-touchspin", "angularTouchspin.StepDivisibilityType")
    @js.native
    object StepDivisibilityType extends StObject {
      
      @js.native
      sealed trait ceil extends StepDivisibilityType
      
      @js.native
      sealed trait floor extends StepDivisibilityType
      
      @js.native
      sealed trait none extends StepDivisibilityType
      
      @js.native
      sealed trait round extends StepDivisibilityType
    }
    
    type ITouchSpinConfig = typings.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions
    
    @js.native
    trait ITouchSpinConfigProvider extends StObject {
      
      def defaults(touchSpinOptions: typings.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions): Unit = js.native
    }
    object ITouchSpinConfigProvider {
      
      @scala.inline
      def apply(defaults: typings.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions => Unit): typings.angularTouchspin.mod.angularTouchspin.ITouchSpinConfigProvider = {
        val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
        __obj.asInstanceOf[typings.angularTouchspin.mod.angularTouchspin.ITouchSpinConfigProvider]
      }
      
      @scala.inline
      implicit class ITouchSpinConfigProviderMutableBuilder[Self <: typings.angularTouchspin.mod.angularTouchspin.ITouchSpinConfigProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefaults(value: typings.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions => Unit): Self = StObject.set(x, "defaults", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait ITouchSpinOptions extends StObject {
      
      var buttonDownClass: js.UndefOr[String] = js.native
      
      var buttonDownShow: js.UndefOr[Boolean] = js.native
      
      var buttonDownTxt: js.UndefOr[String] = js.native
      
      var buttonUpClass: js.UndefOr[String] = js.native
      
      var buttonUpShow: js.UndefOr[Boolean] = js.native
      
      var buttonUpTxt: js.UndefOr[String] = js.native
      
      var decimals: js.UndefOr[Double] = js.native
      
      var decimalsDelimiter: js.UndefOr[String] = js.native
      
      var forceStepDivisibility: js.UndefOr[StepDivisibilityType] = js.native
      
      // default is 'round' ('none' | 'floor' | 'round' | 'ceil') 
      var inputReadOnly: js.UndefOr[Boolean] = js.native
      
      var max: js.UndefOr[Double] = js.native
      
      var min: js.UndefOr[Double] = js.native
      
      var mousewheel: js.UndefOr[Boolean] = js.native
      
      var postfix: js.UndefOr[String] = js.native
      
      var postfixExtraClass: js.UndefOr[String] = js.native
      
      var prefix: js.UndefOr[String] = js.native
      
      var prefixExtraClass: js.UndefOr[String] = js.native
      
      var step: js.UndefOr[Double] = js.native
      
      var stepInterval: js.UndefOr[Double] = js.native
      
      var stepIntervalDelay: js.UndefOr[Double] = js.native
      
      var verticalButtons: js.UndefOr[Boolean] = js.native
      
      var verticalDownClass: js.UndefOr[String] = js.native
      
      var verticalUpClass: js.UndefOr[String] = js.native
    }
    object ITouchSpinOptions {
      
      @scala.inline
      def apply(): typings.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions]
      }
      
      @scala.inline
      implicit class ITouchSpinOptionsMutableBuilder[Self <: typings.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setButtonDownClass(value: String): Self = StObject.set(x, "buttonDownClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonDownClassUndefined: Self = StObject.set(x, "buttonDownClass", js.undefined)
        
        @scala.inline
        def setButtonDownShow(value: Boolean): Self = StObject.set(x, "buttonDownShow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonDownShowUndefined: Self = StObject.set(x, "buttonDownShow", js.undefined)
        
        @scala.inline
        def setButtonDownTxt(value: String): Self = StObject.set(x, "buttonDownTxt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonDownTxtUndefined: Self = StObject.set(x, "buttonDownTxt", js.undefined)
        
        @scala.inline
        def setButtonUpClass(value: String): Self = StObject.set(x, "buttonUpClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonUpClassUndefined: Self = StObject.set(x, "buttonUpClass", js.undefined)
        
        @scala.inline
        def setButtonUpShow(value: Boolean): Self = StObject.set(x, "buttonUpShow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonUpShowUndefined: Self = StObject.set(x, "buttonUpShow", js.undefined)
        
        @scala.inline
        def setButtonUpTxt(value: String): Self = StObject.set(x, "buttonUpTxt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonUpTxtUndefined: Self = StObject.set(x, "buttonUpTxt", js.undefined)
        
        @scala.inline
        def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDecimalsDelimiter(value: String): Self = StObject.set(x, "decimalsDelimiter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDecimalsDelimiterUndefined: Self = StObject.set(x, "decimalsDelimiter", js.undefined)
        
        @scala.inline
        def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
        
        @scala.inline
        def setForceStepDivisibility(value: StepDivisibilityType): Self = StObject.set(x, "forceStepDivisibility", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceStepDivisibilityUndefined: Self = StObject.set(x, "forceStepDivisibility", js.undefined)
        
        @scala.inline
        def setInputReadOnly(value: Boolean): Self = StObject.set(x, "inputReadOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInputReadOnlyUndefined: Self = StObject.set(x, "inputReadOnly", js.undefined)
        
        @scala.inline
        def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        @scala.inline
        def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        @scala.inline
        def setMousewheel(value: Boolean): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
        
        @scala.inline
        def setPostfix(value: String): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostfixExtraClass(value: String): Self = StObject.set(x, "postfixExtraClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostfixExtraClassUndefined: Self = StObject.set(x, "postfixExtraClass", js.undefined)
        
        @scala.inline
        def setPostfixUndefined: Self = StObject.set(x, "postfix", js.undefined)
        
        @scala.inline
        def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixExtraClass(value: String): Self = StObject.set(x, "prefixExtraClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixExtraClassUndefined: Self = StObject.set(x, "prefixExtraClass", js.undefined)
        
        @scala.inline
        def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
        
        @scala.inline
        def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStepInterval(value: Double): Self = StObject.set(x, "stepInterval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStepIntervalDelay(value: Double): Self = StObject.set(x, "stepIntervalDelay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStepIntervalDelayUndefined: Self = StObject.set(x, "stepIntervalDelay", js.undefined)
        
        @scala.inline
        def setStepIntervalUndefined: Self = StObject.set(x, "stepInterval", js.undefined)
        
        @scala.inline
        def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
        
        @scala.inline
        def setVerticalButtons(value: Boolean): Self = StObject.set(x, "verticalButtons", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerticalButtonsUndefined: Self = StObject.set(x, "verticalButtons", js.undefined)
        
        @scala.inline
        def setVerticalDownClass(value: String): Self = StObject.set(x, "verticalDownClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerticalDownClassUndefined: Self = StObject.set(x, "verticalDownClass", js.undefined)
        
        @scala.inline
        def setVerticalUpClass(value: String): Self = StObject.set(x, "verticalUpClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerticalUpClassUndefined: Self = StObject.set(x, "verticalUpClass", js.undefined)
      }
    }
  }
  
  type ITouchSpinConfig = typings.angularTouchspin.mod.angularTouchspin.ITouchSpinConfig
  
  type ITouchSpinConfigProvider = typings.angularTouchspin.mod.angularTouchspin.ITouchSpinConfigProvider
  
  type ITouchSpinOptions = typings.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions
  
  type _To = String
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: String = default
}
