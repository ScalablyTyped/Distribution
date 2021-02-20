package typings.antdMobileRn

import typings.antdMobileRn.wingBlankPropsTypeMod.WingBlankPropsType
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wingBlankIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/wing-blank/index.native", JSImport.Default)
  @js.native
  class default () extends WingBlank
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd-mobile-rn/lib/wing-blank/index.native", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd-mobile-rn/lib/wing-blank/index.native", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      @scala.inline
      def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WingBlank
    extends Component[WingBlankProps, js.Any, js.Any]
  
  @js.native
  trait WingBlankProps extends WingBlankPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object WingBlankProps {
    
    @scala.inline
    def apply(): WingBlankProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WingBlankProps]
    }
    
    @scala.inline
    implicit class WingBlankPropsMutableBuilder[Self <: WingBlankProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
