package typings.antDesignReactNative

import typings.antDesignReactNative.libActionSheetStyleMod.ActionSheetStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.PureComponent
import typings.reactNative.mod.ActionSheetIOSOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libActionSheetAndroidContainerMod {
  
  @JSImport("@ant-design/react-native/lib/action-sheet/AndroidContainer", JSImport.Default)
  @js.native
  open class default protected () extends ActionSheetAndroid {
    def this(props: ActionSheetNativeProps) = this()
  }
  
  @js.native
  trait ActionSheetAndroid extends PureComponent[ActionSheetNativeProps, Any, Any] {
    
    def close(): Unit = js.native
    
    def confirm(index: Double): Unit = js.native
  }
  
  trait ActionSheetNativeProps
    extends StObject
       with WithThemeStyles[ActionSheetStyle] {
    
    var callback: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var config: ActionSheetIOSOptions
    
    var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ActionSheetNativeProps {
    
    inline def apply(config: ActionSheetIOSOptions): ActionSheetNativeProps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionSheetNativeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionSheetNativeProps] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: /* index */ Double => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setConfig(value: ActionSheetIOSOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
