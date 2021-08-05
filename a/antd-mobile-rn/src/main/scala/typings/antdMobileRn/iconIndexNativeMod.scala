package typings.antdMobileRn

import typings.antdMobileRn.anon.Size
import typings.antdMobileRn.antdMobileRnStrings.lg
import typings.antdMobileRn.antdMobileRnStrings.md
import typings.antdMobileRn.antdMobileRnStrings.sm
import typings.antdMobileRn.antdMobileRnStrings.xs
import typings.antdMobileRn.antdMobileRnStrings.xxs
import typings.antdMobileRn.iconPropsTypeMod.IconPropsType
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/icon/index.native", JSImport.Default)
  @js.native
  class default () extends Icon
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/icon/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/icon/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Size = js.native
    inline def defaultProps_=(x: Size): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Icon
    extends Component[IconProps, js.Any, js.Any]
  
  trait IconProps
    extends StObject
       with IconPropsType {
    
    var size: js.UndefOr[xxs | xs | sm | md | lg | Double] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object IconProps {
    
    inline def apply(`type`: String): IconProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setSize(value: xxs | xs | sm | md | lg | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
