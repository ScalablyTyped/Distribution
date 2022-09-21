package typings.antDesignReactNative

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.TouchableNativeFeedbackProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonWaveMod {
  
  @JSImport("@ant-design/react-native/lib/button/ButtonWave", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ButtonWaveProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ButtonWaveProps
    extends StObject
       with TouchableNativeFeedbackProps {
    
    var Color: js.UndefOr[ColorValue] = js.undefined
    
    @JSName("children")
    var children_ButtonWaveProps: ReactNode
  }
  object ButtonWaveProps {
    
    inline def apply(): ButtonWaveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonWaveProps]
    }
    
    extension [Self <: ButtonWaveProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: ColorValue): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
    }
  }
}
