package typings.antDesignReactNative

import typings.antDesignReactNative.anon.PickCardStylebody
import typings.antDesignReactNative.anon.Style
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardBodyMod {
  
  @JSImport("@ant-design/react-native/lib/card/CardBody", JSImport.Default)
  @js.native
  class default () extends CardBody
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/card/CardBody", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/card/CardBody", "default.defaultProps")
    @js.native
    def defaultProps: Style = js.native
    @scala.inline
    def defaultProps_=(x: Style): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CardBody
    extends Component[CardBodyProps, js.Any, js.Any]
  
  trait CardBodyProps
    extends StObject
       with WithThemeStyles[PickCardStylebody] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object CardBodyProps {
    
    @scala.inline
    def apply(): CardBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardBodyProps]
    }
    
    @scala.inline
    implicit class CardBodyPropsMutableBuilder[Self <: CardBodyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
