package typings.antDesignReactNative

import org.scalablytyped.runtime.Instantiable0
import typings.antDesignReactNative.anon.Direction
import typings.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typings.antDesignReactNative.antDesignReactNativeStrings.vertical
import typings.antDesignReactNative.libStepsStyleMod.StepsStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactNative.mod.LayoutChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepsMod {
  
  @JSImport("@ant-design/react-native/lib/steps", JSImport.Default)
  @js.native
  open class default protected () extends Steps {
    def this(props: StepsProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/steps", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/steps", "default.Step")
    @js.native
    def Step: Instantiable0[typings.antDesignReactNative.libStepsStepsItemMod.default] = js.native
    inline def Step_=(x: Instantiable0[typings.antDesignReactNative.libStepsStepsItemMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Step")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/steps", "default.defaultProps")
    @js.native
    def defaultProps: Direction = js.native
    inline def defaultProps_=(x: Direction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Steps extends Component[StepsProps, Any, Any] {
    
    def onLayout(e: LayoutChangeEvent): Unit = js.native
  }
  
  trait StepsProps
    extends StObject
       with WithThemeStyles[StepsStyle] {
    
    var children: js.Array[ReactElement]
    
    var current: js.UndefOr[Double] = js.undefined
    
    var direction: js.UndefOr[vertical | horizontal] = js.undefined
    
    var finishIcon: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
  }
  object StepsProps {
    
    inline def apply(children: js.Array[ReactElement]): StepsProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepsProps]
    }
    
    extension [Self <: StepsProps](x: Self) {
      
      inline def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setDirection(value: vertical | horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFinishIcon(value: String): Self = StObject.set(x, "finishIcon", value.asInstanceOf[js.Any])
      
      inline def setFinishIconUndefined: Self = StObject.set(x, "finishIcon", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
