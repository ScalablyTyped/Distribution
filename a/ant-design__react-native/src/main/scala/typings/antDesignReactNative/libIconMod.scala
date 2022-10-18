package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Size
import typings.antDesignReactNative.antDesignReactNativeStrings.lg
import typings.antDesignReactNative.antDesignReactNativeStrings.md
import typings.antDesignReactNative.antDesignReactNativeStrings.sm
import typings.antDesignReactNative.antDesignReactNativeStrings.xs
import typings.antDesignReactNative.antDesignReactNativeStrings.xxs
import typings.react.mod.Component
import typings.reactNative.mod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconMod {
  
  @JSImport("@ant-design/react-native/lib/icon", JSImport.Default)
  @js.native
  open class default () extends Icon
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/icon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/icon", "default.defaultProps")
    @js.native
    def defaultProps: Size = js.native
    inline def defaultProps_=(x: Size): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/icon", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Icon extends Component[IconProps, Any, Any]
  
  type IconNames = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OutlineGlyphMapType */ Any
  
  trait IconProps
    extends StObject
       with TextProps {
    
    var color: js.UndefOr[String] = js.undefined
    
    var name: IconNames
    
    var size: js.UndefOr[xxs | xs | sm | md | lg | Double] = js.undefined
  }
  object IconProps {
    
    inline def apply(name: IconNames): IconProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setName(value: IconNames): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: xxs | xs | sm | md | lg | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
