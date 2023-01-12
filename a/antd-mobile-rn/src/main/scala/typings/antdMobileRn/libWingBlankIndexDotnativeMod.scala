package typings.antdMobileRn

import typings.antdMobileRn.libWingBlankPropsTypeMod.WingBlankPropsType
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWingBlankIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/wing-blank/index.native", JSImport.Default)
  @js.native
  open class default () extends WingBlank
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd-mobile-rn/lib/wing-blank/index.native", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd-mobile-rn/lib/wing-blank/index.native", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WingBlank extends Component[WingBlankProps, Any, Any]
  
  trait WingBlankProps
    extends StObject
       with WingBlankPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object WingBlankProps {
    
    inline def apply(): WingBlankProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WingBlankProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WingBlankProps] (val x: Self) extends AnyVal {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
