package typings.antDesignReactNative

import typings.antDesignReactNative.anon.AfterClose
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.libTagPropsTypeMod.TagPropsType
import typings.antDesignReactNative.libTagStyleMod.TagStyle
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTagMod {
  
  @JSImport("@ant-design/react-native/lib/tag", JSImport.Default)
  @js.native
  open class default protected () extends Tag {
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
    inline def defaultProps_=(x: AfterClose): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Tag extends Component[TagNativeProps, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MTag(nextProps: TagNativeProps): Unit = js.native
    
    def handleLongPress(): Unit = js.native
    
    def onPress(): Unit = js.native
    
    def onTagClose(): Unit = js.native
  }
  
  trait TagNativeProps
    extends StObject
       with TagPropsType
       with WithThemeStyles[TagStyle] {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object TagNativeProps {
    
    inline def apply(): TagNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagNativeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TagNativeProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
