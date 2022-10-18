package typings.antdMobileRn

import typings.antdMobileRn.anon.Typeofstyles
import typings.antdMobileRn.libStepperPropsTypeMod.StepPropsType
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepperIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/stepper/index.native", JSImport.Default)
  @js.native
  open class default () extends Stepper
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/stepper/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/stepper/index.native", "default.defaultProps")
    @js.native
    def defaultProps: StepProps = js.native
    inline def defaultProps_=(x: StepProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait StepProps
    extends StObject
       with StepPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[Typeofstyles] = js.undefined
  }
  object StepProps {
    
    inline def apply(): StepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepProps]
    }
    
    extension [Self <: StepProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: Typeofstyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait Stepper extends Component[StepProps, Any, Any]
}
