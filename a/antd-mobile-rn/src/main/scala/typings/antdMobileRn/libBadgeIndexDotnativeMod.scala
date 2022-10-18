package typings.antdMobileRn

import typings.antdMobileRn.anon.Corner
import typings.antdMobileRn.libBadgePropsTypeMod.BadgePropsTypes
import typings.antdMobileRn.libBadgeStyleIndexDotnativeMod.IBadgeStyle
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBadgeIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/badge/index.native", JSImport.Default)
  @js.native
  open class default () extends Badge
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/badge/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/badge/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Corner = js.native
    inline def defaultProps_=(x: Corner): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Badge extends Component[BadgeNativeProps, Any, Any]
  
  trait BadgeNativeProps
    extends StObject
       with BadgePropsTypes {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[IBadgeStyle] = js.undefined
  }
  object BadgeNativeProps {
    
    inline def apply(): BadgeNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeNativeProps]
    }
    
    extension [Self <: BadgeNativeProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: IBadgeStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
