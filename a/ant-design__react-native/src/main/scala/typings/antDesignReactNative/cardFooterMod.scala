package typings.antDesignReactNative

import typings.antDesignReactNative.anon.PickCardStylefooterConten
import typings.antDesignReactNative.anon.Style
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardFooterMod {
  
  @JSImport("@ant-design/react-native/lib/card/CardFooter", JSImport.Default)
  @js.native
  class default () extends CardFooter
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/card/CardFooter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/card/CardFooter", "default.defaultProps")
    @js.native
    def defaultProps: Style = js.native
    @scala.inline
    def defaultProps_=(x: Style): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CardFooter
    extends Component[CardFooterProps, js.Any, js.Any]
  
  @js.native
  trait CardFooterProps
    extends CardFooterPropsType
       with WithThemeStyles[PickCardStylefooterConten] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object CardFooterProps {
    
    @scala.inline
    def apply(): CardFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardFooterProps]
    }
    
    @scala.inline
    implicit class CardFooterPropsMutableBuilder[Self <: CardFooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait CardFooterPropsType extends StObject {
    
    var content: js.UndefOr[ReactNode] = js.native
    
    var extra: js.UndefOr[ReactNode] = js.native
  }
  object CardFooterPropsType {
    
    @scala.inline
    def apply(): CardFooterPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardFooterPropsType]
    }
    
    @scala.inline
    implicit class CardFooterPropsTypeMutableBuilder[Self <: CardFooterPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    }
  }
}
