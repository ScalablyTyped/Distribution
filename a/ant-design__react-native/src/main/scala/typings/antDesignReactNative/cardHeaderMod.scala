package typings.antDesignReactNative

import typings.antDesignReactNative.anon.PickCardStyleheaderConten
import typings.antDesignReactNative.anon.ThumbStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardHeaderMod {
  
  @JSImport("@ant-design/react-native/lib/card/CardHeader", JSImport.Default)
  @js.native
  class default () extends CardHeader
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/card/CardHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/card/CardHeader", "default.defaultProps")
    @js.native
    def defaultProps: ThumbStyle = js.native
    @scala.inline
    def defaultProps_=(x: ThumbStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CardHeader
    extends Component[CardHeaderProps, js.Any, js.Any]
  
  trait CardHeaderProps
    extends StObject
       with CardHeaderPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var thumbStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  }
  object CardHeaderProps {
    
    @scala.inline
    def apply(): CardHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardHeaderProps]
    }
    
    @scala.inline
    implicit class CardHeaderPropsMutableBuilder[Self <: CardHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setThumbStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbStyleNull: Self = StObject.set(x, "thumbStyle", null)
      
      @scala.inline
      def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
    }
  }
  
  trait CardHeaderPropsType
    extends StObject
       with WithThemeStyles[PickCardStyleheaderConten] {
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    /** need url of img, if this is string. */
    var thumb: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object CardHeaderPropsType {
    
    @scala.inline
    def apply(): CardHeaderPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardHeaderPropsType]
    }
    
    @scala.inline
    implicit class CardHeaderPropsTypeMutableBuilder[Self <: CardHeaderPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setThumb(value: ReactNode): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
