package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.stepperPropsTypeMod.StepPropsType
import typings.antDesignReactNative.stepperStyleMod.StepperStyle
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepperMod {
  
  @JSImport("@ant-design/react-native/lib/stepper", JSImport.Default)
  @js.native
  class default () extends Stepper
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/stepper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/stepper", "default.defaultProps")
    @js.native
    def defaultProps: StepProps = js.native
    inline def defaultProps_=(x: StepProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait StepProps
    extends StObject
       with StepPropsType
       with WithThemeStyles[StepperStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
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
    }
  }
  
  @js.native
  trait Stepper
    extends Component[StepProps, js.Any, js.Any]
}
