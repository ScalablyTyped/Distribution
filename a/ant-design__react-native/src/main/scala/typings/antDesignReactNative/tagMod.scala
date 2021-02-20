package typings.antDesignReactNative

import typings.antDesignReactNative.anon.AfterClose
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.tagPropsTypeMod.TagPropsType
import typings.antDesignReactNative.tagStyleMod.TagStyle
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.View
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  @JSImport("@ant-design/react-native/lib/tag", JSImport.Default)
  @js.native
  class default protected () extends Tag {
    def this(props: TagNativeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/tag", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/tag", "default.defaultProps")
    @js.native
    def defaultProps: AfterClose = js.native
    @scala.inline
    def defaultProps_=(x: AfterClose): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Tag
    extends Component[TagNativeProps, js.Any, js.Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MTag(nextProps: TagNativeProps): Unit = js.native
    
    var closeDom: View | Null = js.native
    
    def handleLongPress(): Unit = js.native
    
    def onPress(): Unit = js.native
    
    def onPressIn(styles: TagStyle): js.Function0[Unit] = js.native
    
    def onPressOut(styles: TagStyle): js.Function0[Unit] = js.native
    
    def onTagClose(): Unit = js.native
  }
  
  @js.native
  trait TagNativeProps
    extends TagPropsType
       with WithThemeStyles[TagStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object TagNativeProps {
    
    @scala.inline
    def apply(): TagNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagNativeProps]
    }
    
    @scala.inline
    implicit class TagNativePropsMutableBuilder[Self <: TagNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
